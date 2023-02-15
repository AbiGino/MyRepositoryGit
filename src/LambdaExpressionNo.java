interface Sayable{
     String say();
}
public class LambdaExpressionNo {
    public static void main(String[] args){

        Sayable s=()->{
            return "i have nothing";
        };
        System.out.println(s.say());
    }
}
