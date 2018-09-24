package com.example.android.tourguideapp.Data;

public class PlaceData {
    private int nameOfPlace; //Stores the name of the place's string ID
    private int imageOfPlaceResourceID; // Stores the side attraction's image ID

    /**
     * Creates a constructor of the Tour Places Data Class
     * @param inputNameOfPlace is the string ID of the name of the side attraction
     * @param inputImageOfPlace is the ID of the side attraction's image
     */
    public PlaceData(int inputNameOfPlace, int inputImageOfPlace){
        nameOfPlace = inputNameOfPlace;
        imageOfPlaceResourceID = inputImageOfPlace;
    }

    /**
     * Gets the name of the place
     * @return the name of the place
     */
    public int getNameOfPlace() {
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
