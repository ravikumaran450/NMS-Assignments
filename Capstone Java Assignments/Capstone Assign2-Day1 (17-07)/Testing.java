import java.lang.*;
import java.util.Scanner;
interface Shape
{
//int dim1,dim2,dim3;
void volume();
}
class Cuboid implements Shape
{
int d1,d2,d3;
Cuboid(int d1, int d2, int d3) {this.d1=d1;this.d2=d2;this.d3=d3;}
public void volume(){System.out.println("Volume:"+(d1*d2*d3));}
}
class Cube implements Shape
{
int d;
Cube(int d) {this.d=d;}
public void volume(){System.out.println("Volume:"+(d*d*d));}
}
class Sphere implements Shape
{
int d;
Sphere(int d) {this.d=d;}
public void volume(){System.out.println("Volume:"+(4/3)*3.14*(d*d*d));}
}
abstract class Testing
{
public static void main(String []a1)
{
Shape ref ;
Cuboid r = new Cuboid(5,4,3);
ref = r;
ref.volume();
Cube c = new Cube(5);
ref = c;
ref.volume();
Sphere s = new Sphere(4);
ref = s;
ref.volume();
}
} 