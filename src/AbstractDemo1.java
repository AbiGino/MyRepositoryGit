abstract class AbstractDemo1 {
    abstract void message();
}
class AbstractDemo2 extends AbstractDemo1{
    void message(){
        System.out.println("we can achieve partial abstraction using abstract class");
    }
    public static void main(String[] args){
        AbstractDemo1 a=new AbstractDemo2();
        a.message();
    }
}
