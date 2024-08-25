class Test12{
public static void main(String str[]){
Hello h= new Hello(12);
 
}
}

class Hello{
Hello(){

System.out.println("Hello 1");
}
 
Hello(int a){
 Hello();

System.out.println("Hello 2");

}
}

/*
Test12.java:15: error: cannot find symbol
 Hello();
 ^
  symbol:   method Hello()
  location: class Hello
*/