/***************************************************************
* file: Krishnan_Geometry.java
* author: Kimberlyn Krishnan
* class: CS 141 – Programming and Problem Solving
*
* assignment: program 2
* date last modified: 4/16/2016
*
* purpose: this program contains static methods which calculate
and returns the area of a circle, rectangle, and triangle
*
****************************************************************/
public class Krishnan_Geometry
{

private static double areac;
private static double arear;
private static double areat;

// method: circle
// purpose: to calculate the area of a circle
   public static double circle(double r)
{

   areac = Math.PI*r*r;
   return areac;
}
// method: rectangle
// purpose: to calculate the area of a rectangle
   public static double rectangle(double l, double w)
{

   arear = l*w;
   return arear;
}
// method: triangle
// purpose: to calculate the area of a triangle
   public static double triangle(double b, double h)
{

  areat = 0.5*b*h;
  return areat;
}
}
