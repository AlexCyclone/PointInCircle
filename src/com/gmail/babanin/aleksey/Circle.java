package com.gmail.babanin.aleksey;

public class Circle {

    private double centreCoordinateX;
    private double centreCoordinateY;

    private double radius;

    public Circle(double centreCoordinateX, double centreCoordinateY, double radius) {
        this.centreCoordinateX = centreCoordinateX;
        this.centreCoordinateY = centreCoordinateY;

        if (radius < 0) {
            throw new IllegalArgumentException("radius must be positive");
        }
        
        this.radius = radius;
    }

    public boolean pointInside(double pointCoordinateX, double pointCoordinateY) {
        double distanceToCenter;

        distanceToCenter = Math.sqrt(Math.pow((pointCoordinateX - this.centreCoordinateX), 2)
                                     + Math.pow((pointCoordinateY - this.centreCoordinateY), 2));

        if (distanceToCenter < this.radius) {
            return true;
        }
        return false;
    }
}