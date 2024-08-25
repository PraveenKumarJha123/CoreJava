class Test5{
public static void main(String [] str){
 Hello h= new Hello(10);
System.out.println(h.a);

}
}
class Hello{
int a;
Hello(int a){
System.out.println("Hello Cons");
a= a;// no need to write here because this is not use
return;
}
}


