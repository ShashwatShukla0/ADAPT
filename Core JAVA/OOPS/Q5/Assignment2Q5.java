package assignment.five;

import java.io.*;
public class Assignment2Q5 {

public static void main(String args[]){
Shape line=new line();
Shape rectangle=new rectangle();
Shape cube=new cube();
System.out.println(line.draw());
System.out.println(rectangle.draw());
System.out.println(cube.draw());
}
}
abstract class Shape{
 public  abstract String draw();
}
class line extends Shape{
@Override
public String draw(){
return new String("drawing line");
}
}

class rectangle extends Shape{
@Override
public String draw(){
return new String("drawing rectangle");
}
}
class cube extends Shape{
@Override
public String draw(){
return new String("drawing cube");
}
}