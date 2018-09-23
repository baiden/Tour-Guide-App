package com.example.android.tourguideapp.Activities;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.transition.Transition;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.android.tourguideapp.R;
import com.example.android.tourguideapp.utils.DecodeBitmapTask;

public class IntroSliderDetailsActivity extends AppCompatActivity implements DecodeBitmapTask.Listener {

    static final String BUNDLE_IMAGE_ID = "BUNDLE_IMAGE_ID";

    private ImageView imageView;
    private DecodeBitmapTask decodeBitmapTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Sets the view to fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_details);

        final int smallResId = getIntent().getIntExtra(BUNDLE_IMAGE_ID, -1);
        if (smallResId == -1) {
            finish();
            return;
        }

        imageView = (ImageView) findViewById(R.id.image);
        imageView.setImageResource(smallResId);

        //Creates a click listener on the images
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IntroSliderDetailsActivity.super.onBackPressed();
            }
        });

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            loadFullSizeBitmap(smallResId);
        } else {

            //Adds a small transition effect to the card views
            getWindow().getSharedElementEnterTransition().addListener(new Transition.TransitionListener() {

                private boolean isClosing = false;

                @Override
                public void onTransitionPause(Transition transition) {
                }

                @Override
                public void onTransitionResume(Transition transition) {
                }

                @Override
                public void onTransitionCancel(Transition transition) {
                }

                @Override
                public void onTransitionStart(Transition transition) {
                    if (isClosing) {
                        addCardCorners();
                    }
                }

                @Override
                public void onTransitionEnd(Transition transition) {
                    if (!isClosing) {
                        isClosing = true;

                        removeCardCorners();
                        loadFullSizeBitmap(smallResId);
                    }
                }
            });
        }
    }

    @Override
    protected void onPause() {
        super.onPause();

        if (isFinishing() && decodeBitmapTask != null) {
            decodeBitmapTask.cancel(true);
        }
    }

    private void addCardCorners() {
        final CardView cardView = (CardView) findViewById(R.id.card);
        cardView.setRadius(25f);
    }

    private void removeCardCorners() {
        final CardView cardView = (CardView) findViewById(R.id.card);
        ObjectAnimator.ofFloat(cardView, "radius", 0f).setDuration(50).start();
    }

    /**
     * Zooms the images of the activate cardview to fill the screen when clicked
     * @param smallResId is the ID of the unzoomed image or the smaller size of the image
     */
    private void loadFullSizeBitmap(int smallResId) {
        int bigResId;
        switch (smallResId) {
            case R.drawable.kakum:
                bigResId = R.drawable.kakum;
                break;
            case R.drawable.kwame_nkrumah:
                bigResId = R.drawable.kwame_nkrumah;
                break;
            case R.drawable.elmina_castle:
                bigResId = R.drawable.elmina_castle;
                break;
            case R.drawable.mole_national_park:
                bigResId = R.drawable.mole_national_park;
                break;
            case R.drawable.cape_coast_castle:
                bigResId = R.drawable.cape_coast_castle;
                break;
            default:
                bigResId = R.drawable.kakum;
        }

        final DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getRealMetrics(metrics);

        final int w = metrics.widthPixels;
        final int h = metrics.heightPixels;

        decodeBitmapTask = new DecodeBitmapTask(getResources(), bigResId, w, h, this);
        decodeBitmapTask.execute();
    }

    @Override
    public void onPostExecuted(Bitmap bitmap) {
        imageView.setImageBitmap(bitmap);
    }

}
