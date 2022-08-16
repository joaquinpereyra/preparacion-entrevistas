package Patrones.PatronesEstructurales.Brigde;

public abstract class Shape {
    protected DrawApi drawAPI;
    
    protected Shape(DrawApi drawAPI){
       this.drawAPI = drawAPI;
    }
    public abstract void draw();	
 }
