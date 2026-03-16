area.java
package Graphics;
interface inter_graph{
public int rect(int l,int w);
public double tria(double b,double h);
public float squ(int a);
public double cir(double r);
}
public class area implements inter_graph{
public int rect(int l,int w){
return l*w;
}
40public double tria(double b,double h){
return 0.5*b*h;
}
public float squ(int a){
return a*a;
}
public double cir(double r){
return Math.PI*r*r;
}
}
TestGra.java
import Graphics.area;
public class TestGra{
public static void main(String[] args){
area g =new area();
System.out.println("area of rectangle:"+g.rect(4,5));
System.out.println("area of triangle:"+g.tria(3,4.5));
System.out.println("area of Square:"+g.squ(5));
System.out.println("area of circle:"+g.cir(4.5));
}
}
