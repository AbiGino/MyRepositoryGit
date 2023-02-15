interface Drawable
{
    void draw();
}
public class FunctionalInterface{
    public static void main(String[] args){
        int width=10;
        Drawable d=()->{
            System.out.println("width: " +width);
        };
        d.draw();
    }
}
