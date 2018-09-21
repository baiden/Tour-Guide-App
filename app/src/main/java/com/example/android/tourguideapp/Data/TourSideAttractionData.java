package com.example.android.tourguideapp.Data;

public class TourSideAttractionData {
    private String typeOfSideAttraction; //Stores the name of the place
    private int sideAttractionImageResourceID; // Stores the side attraction's image ID

    /**
     * Creates a constructor of the Tour Places Data Class
     * @param typeOfSideAttractionInput is the name of the side attraction
     * @param sideAttractionImageResourceIDInput is the ID of the side attraction's image
     */
    public TourSideAttractionData(String typeOfSideAttractionInput, int sideAttractionImageResourceIDInput){
        typeOfSideAttraction = typeOfSideAttractionInput;
        sideAttractionImageResourceID = sideAttractionImageResourceIDInput;
    }

    public String getTypeOfSideAttraction() {
        return typeOfSideAttraction;
    }

    public int getSideAttractionImageResourceID() {
        return sideAttractionImageResourceID;
    }
}
