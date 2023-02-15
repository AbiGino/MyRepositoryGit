interface Single{
    String say(String name);
}
public class LambdaExpressionSingle {
    public static void main(String[] args){
        Single s=(name)->{
            return name;
        };
        System.out.println(s.say("abi"));

        Single s2=name->{
            return "hello: "+name;
        };
        System.out.println(s2.say("berly"));
    }
}
