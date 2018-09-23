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

    /**
     * Gets the name of the place
     * @return the name of the place
     */
    public String getNameOfPlace() {
        return nameOfPlace;
    }

    /**
     * Gets the image resource ID of the place
     * @return the image resource ID of the place
     */
    public int getImageOfPlaceResourceID() {
        return imageOfPlaceResourceID;
    }

}
