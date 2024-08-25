public class Test4{
public static void main(String [] str ){
System.out.println("main");
Hello h= new Hello();
 System.out.println(h.show());
}
}
class Hello{
String show(){
 return "show";
}
}