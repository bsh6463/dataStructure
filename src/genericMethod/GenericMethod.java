package genericMethod;

public class GenericMethod {

    public static  <T extends Number, V extends  Number> double makeRectangle(Point<T, V> p1, Point<T,V> p2){
        double left = ((Number) p1.getX()).doubleValue();
        double right = ((Number) p2.getX()).doubleValue();
        double top = ((Number) p1.getY()).doubleValue();
        double button = ((Number) p2.getY()).doubleValue();

        double width = Math.abs(right - left);
        double height = Math.abs(button - top);

        return width*height;
    }

}
