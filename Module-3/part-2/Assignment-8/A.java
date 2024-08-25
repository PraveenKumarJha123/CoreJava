class A{
public static void main(String [] str){
 System.out.println(Hello.a);
}
}
class Hello{
static int a=10;
static Hello h= new Hello();

static{
 System.out.println("This is SIB");
}

{
System.out.println("This is IIB");
}
Hello()
{
System.out.println("This is Hello constructor");
}

}

