interface Addable{
    int add(int a,int b);
}

public class LambdaExpressionTwo {
    public static void main(String[] args){

        Addable a1=(a,b)->{
            return (a+b);
        };
        System.out.println(a1.add(10,20));


        Addable a2=(a,b)->(a+b);
        System.out.println(a2.add(100,200));
    }
}
