package com.example.android.tourguideapp.Data;

public class DescriptionOfPlaceData {
    private String descriptionOfThePlace; //Store the description of the place
    private int descriptionOfThePlaceImageResourceID; // Stores the side attraction's image ID

    /**
     * Creates a constructor of the Tour Places Data Class
     * @param InputDescriptionOfThePlaceImageResourceID is the ID of the play audio image description of the place
     */
    public DescriptionOfPlaceData(int InputDescriptionOfThePlaceImageResourceID){
        descriptionOfThePlaceImageResourceID = InputDescriptionOfThePlaceImageResourceID;
    }

    public int getImageOfPlaceResourceID() {
        return descriptionOfThePlaceImageResourceID;
    }

}