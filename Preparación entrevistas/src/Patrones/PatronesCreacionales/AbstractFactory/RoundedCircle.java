package Patrones.PatronesCreacionales.AbstractFactory;

public class RoundedCircle implements Shape {

    @Override
    public void draw() {
       System.out.println("Inside RoundedCircle::draw() method.");
    }
 }