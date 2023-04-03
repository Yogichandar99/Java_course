package com.careerit.day17;

class Planet
{
    //Using final keyword with Instance variable
    //As G doesn't change we are directly assigning with final keyword.
    public static final double G = 6.67300E-11;
    private final double mass;
    private final double radius;

    public Planet(double mass, double radius)
    {
        //Assigning values
        this.mass = mass;
        this.radius = radius;
    }
    //Calculating Surface gravity of the planet
    double surfaceGravity()
    {
        return G * mass / (radius * radius);
    }
    //Calculating SurfaceWeight of planet

    double surfaceWeight(double otherMass)
    {
        return otherMass * surfaceGravity();
    }
}


public class PlanetExample
{
    public final static void main(final String[] args)
    {

        final Planet MERCURY = new Planet(3.303e+23, 2.4397e6);
        final Planet VENUS = new Planet(4.869e+24, 6.0518e6);
        final Planet EARTH = new Planet(5.976e+24, 6.37814e6);
        final Planet MARS = new Planet(6.421e+23, 3.3972e6);

        double weight = 60;
        double mass = weight/EARTH.surfaceGravity();
        System.out.println(MERCURY.surfaceWeight(mass));
        System.out.println(EARTH.surfaceWeight(mass));
        System.out.println(MARS.surfaceWeight(mass));
    }
}
