class Test11{

public static void main(String args[]){

D ref=new D();

System.out.println(ref.x); }}

class A{ int x=99; }

class B extends A{}

class C extends B{

String x="JLC";

}

class D extends B{}