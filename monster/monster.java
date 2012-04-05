import processing.core.*; 
import processing.xml.*; 

import java.applet.*; 
import java.awt.Dimension; 
import java.awt.Frame; 
import java.awt.event.MouseEvent; 
import java.awt.event.KeyEvent; 
import java.awt.event.FocusEvent; 
import java.awt.Image; 
import java.io.*; 
import java.net.*; 
import java.text.*; 
import java.util.*; 
import java.util.zip.*; 
import java.util.regex.*; 

public class monster extends PApplet {

public void setup() {
  size (900, 700);
  smooth();
}

float eyex, eyey, eyew, eyeh;
float mouseDist = 0;
float r = 155;

public void draw () {
  background(0, 0, 0);

  //body
  stroke(0xff00FF00);
  strokeWeight(2);
  fill(0xff00FF00);
  rect( 83, 180, 750, 420);

  //eyes  
  eyew = 200;
  eyeh = min(368, max(274, mouseY));

  eye(260, 380);
  eye(650, 380);


  //ears
  stroke(0xff0000FF);
  strokeWeight(2);
  fill(0xffFFFF00);
  triangle( 704, 180, 779, 33, 834, 180 );
  triangle( 83, 180, 210, 20, 253, 180 );

  //arms
  stroke(0xffCD00CD);
  strokeWeight(7);
  line(835, 347, 886, 399);
  line(82, 347, 24, 399);

  //nose
  strokeWeight(4);
  fill(0xff0000FF);
  triangle(467,344,439,382,485,381);
  
  //mouth 
  noStroke();
  fill(0xff000000);
  ellipse(467,499, 50, min(150, max(50, mouseY)));
  
  //zzzz
  mouseDist = dist(width/2, height/2, mouseX, mouseY);

  if (mouseDist < r){
    
    stroke(0xffCD00CD);
    strokeWeight(7);
    line(835, 347, 886, 290);
    line(82, 347, 24, 290);
    
    stroke(0xff000000);
    strokeWeight(7);
    line(835, 347, 886, 399);
    line(82, 347, 24, 399);
  }

  else {
    stroke(0xffCD00CD);
    strokeWeight(7);
    line(835, 347, 886, 399);
    line(82, 347, 24, 399);
  }
}

public void mousePressed() {
  println (mouseX+ " " + mouseY);
  
}
/*void arm(  float eyex, float eyey) {

  
  stroke(#CD00CD);
  strokeWeight(7);
  line(835, 347, 886, 399);
  line(82, 347, 24, 399);

  if (mousePressed) {
    
    stroke(#CD00CD);
    strokeWeight(7);
    line(835, 347, 886, 290);
    line(82, 347, 24, 290);

    //laser
    strokeWeight(4);
    stroke( random(255), random(255), random(255) );
    line(eyex, eyey, mouseX, mouseY);
    
  }

  else {
  
    line(835, 347, 886, 399);
    line(82, 347, 24, 399);
    
}*/


public void eye(  float eyex, float eyey) {

  noStroke();
  fill(0xffFF0000);
  ellipse(eyex, eyey, eyew, eyeh);

  if (mousePressed) {
    
    noStroke();
    
    //eyes get bigger
    
    fill(255);
    ellipse(eyex, eyey, eyew - 100, eyeh - 100);

    fill(0);
    ellipse(eyex, eyey, 10, 60);
    
    //laser
    strokeWeight(4);
    stroke( random(255), random(255), random(255) );
    line(eyex, eyey, mouseX, mouseY);
    
  }

  else {

    noStroke();

    fill(255);
    ellipse(eyex, eyey, eyew - 100, eyeh - 100);

    fill(0);
    ellipse(eyex, eyey, 10, 60);
  }
}

  static public void main(String args[]) {
    PApplet.main(new String[] { "--bgcolor=#FFFFFF", "monster" });
  }
}
