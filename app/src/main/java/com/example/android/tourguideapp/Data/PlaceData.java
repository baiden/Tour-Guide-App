package com.example.android.tourguideapp.Data;

public class PlaceData {
    private String nameOfPlace; //Stores the name of the place
    private int imageOfPlaceResourceID; // Stores the side attraction's image ID

    /**
     * Creates a constructor of the Tour Places Data Class
     * @param inputNameOfPlace is the name of the side attraction
     * @param inputImageOfPlace is the ID of the side attraction's image
     */
    public PlaceData(String inputNameOfPlace, int inputImageOfPlace){
        nameOfPlace = inputNameOfPlace;
        imageOfPlaceResourceID = inputImageOfPlace;
    }

    public String getNameOfPlace() {
        return nameOfPlace;
    }

    public int getImageOfPlaceResourceID() {
        return imageOfPlaceResourceID;
    }

}
