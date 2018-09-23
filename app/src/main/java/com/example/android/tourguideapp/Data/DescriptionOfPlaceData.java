package com.example.android.tourguideapp.Data;

public class DescriptionOfPlaceData {
    private int descriptionOfThePlaceImageResourceID; // Stores the side attraction's image ID

    /**
     * Creates a constructor of the Tour Places Data Class
     * @param InputDescriptionOfThePlaceImageResourceID is the ID of the play audio image description of the place
     */
    public DescriptionOfPlaceData(int InputDescriptionOfThePlaceImageResourceID){
        descriptionOfThePlaceImageResourceID = InputDescriptionOfThePlaceImageResourceID;
    }

    /**
     *  * Get the image resource ID
     * @return the image resource ID
     */
    public int getImageOfPlaceResourceID() {
        return descriptionOfThePlaceImageResourceID;
    }

}