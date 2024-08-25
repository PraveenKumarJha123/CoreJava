class Test14{
public static void main(String str[]){
 new Student();
new Student();
System.out.println("Main");
}
}
class Student{
static{
System.out.println("Block");
}
}