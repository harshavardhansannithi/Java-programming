import java.io.*;
class GFG {
public static void main(String[] args)
{
double L = 20, B = 15, H = 10;
double SurfaceArea = 2 * (L * B + B * H + H * L);
double Volume = L * B * H;
System.out.println("The Surface area of cuboid is : "+ SurfaceArea);
System.out.println("The Volume of the cuboid is : "+ Volume);
	}
}
