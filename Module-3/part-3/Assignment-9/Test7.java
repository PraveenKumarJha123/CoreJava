public class Test7{
public static void main(String [] str ){
if (Hello.process(0))
System.out.println("IF");
else
System.out.println("ELSE");
}
}

class Hello{
static boolean process(int x){

if(x >= 0)
return true;
else
return false;
}
}
