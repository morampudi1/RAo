package com.example.welcome.rao;

/**
 * Created by Welcome on 5/17/2018.
 */

public class Flower {
    private String flowerName;
    private String flowerDescription;
    private int flowerImage;

    public Flower(String flowerName, String flowerDescription, int flowerImage) {
        this.flowerName = flowerName;
        this.flowerDescription = flowerDescription;
        this.flowerImage = flowerImage;
    }

    public String getFlowerName() {
            return flowerName;
        }

        public String getFlowerDescription() {
            return flowerDescription;
        }

        public int getFlowerImage() {
            return flowerImage;
        }
}