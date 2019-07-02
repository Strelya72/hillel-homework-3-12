package main.java.lesson4.inhumans.furniture;

public class Chair extends Furniture {

    boolean haveBack;

    public Chair(int legs, int width, int height, String type, boolean haveBack) {
        super(legs, width, height, type);
        this.haveBack = haveBack;
    }
}
