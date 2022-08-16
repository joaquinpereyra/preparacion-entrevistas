package Patrones.PatronesCreacionales.AbstractFactory;

public class RoundedShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
         }		
         if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new RoundedCircle();
            
         } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectangle();
            
         } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new RoundedSquare();
         }
        return null;
    }
    
    
}
