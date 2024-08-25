 class Test12{
public static void main(String [] str ){
if(m2() & m1())
System.out.println("IF");
else
System.out.println("ELSE");

}

static boolean m1(){
System.out.println("M1");
return true;
}
static boolean m2(){
System.out.println("M2");
return false;
}
}
