/***************************************************************
* file: Krishnan_Driver.java
* author: Kimberlyn Krishnan
* class: CS 141 – Programming and Problem Solving
*
* assignment: program 2
* date last modified: 4/16/2016
*
* purpose: this program calls upon the static methods of
Krishnan_Geometry to calculate the area of a circle, and/or
rectangle, and/or triangle from the dimensions given by user
input
*
****************************************************************/
import java.util.Scanner;

public class Krishnan_Driver {

private static double input;
private static double radius;
private static double circle;
private static double length;
private static double width;
private static double rectangle;
private static double base;
private static double height;
private static double triangle;

// method: main
// purpose: to display the areas which the user asks for
// that are called by the static methods of Krishnan_Geometry
public static void main (String[] args) {

do
{
System.out.println("");
System.out.println("\tGeometry Calculator");
System.out.println("\t1. Calculate the Area of a Circle");
System.out.println("\t2. Calculate the Area of a Rectangle");
System.out.println("\t3. Calculate the Area of a Triangle");
System.out.println("\t4. Quit");
System.out.println("");

Scanner kb = new Scanner(System.in);
System.out.print("\tEnter your choice (1-4): ");
input = kb.nextDouble();
System.out.println("");

if (input == 1)
{
System.out.print("\tEnter the radius of the circle: ");
radius = kb.nextDouble();
System.out.println("");
  if (radius < 0)
  {
  System.out.println("\tError, enter only positive numbers.");
  } else {
  circle = Krishnan_Geometry.circle(radius);
  System.out.format("\tThe area of the circle is: %.2f%n", circle);
  }
}


if (input == 2)
{
System.out.print("\tEnter the length of the rectangle: ");
length = kb.nextDouble();
System.out.println("");
System.out.print("\tEnter the width of the rectangle: ");
width = kb.nextDouble();
System.out.println("");
  if ((length < 0) || (width < 0))
  {
  System.out.println("\tError, enter only positive numbers.");
  } else {
  rectangle = Krishnan_Geometry.rectangle(length, width);
  System.out.format("\tThe area of the rectangle is: %.2f%n", rectangle);
  }
}


if (input == 3)
{
System.out.print("\tEnter the length of the triangle's base: ");
base = kb.nextDouble();
System.out.println("");
System.out.print("\tEnter the height of the triangle: ");
height = kb.nextDouble();
System.out.println("");
  if ((base < 0) || (height < 0))
  {
  System.out.println("\tError, enter only positive numbers.");
  } else {
  triangle = Krishnan_Geometry.triangle(base, height);
  System.out.format("\tThe area of the rectangle is: %.2f%n", triangle);
  }
}


if ((input > 4) || (input < 1))
{
System.out.println("\tError, enter a number from 1-4.");
}

} while (input != 4);


if (input == 4)
{
System.exit(0);
}


 }
}

