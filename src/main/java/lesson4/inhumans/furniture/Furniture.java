package main.java.lesson4.inhumans.furniture;

public class Furniture {
    int legs;
    int width;
    int height;
    String type;

    public Furniture(int legs, int width, int height, String type) {
        this.legs = legs;
        this.width = width;
        this.height = height;
        this.type = type;
    }

    public int getLegs() {
        return legs;
    }
}
