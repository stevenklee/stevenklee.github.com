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

public class flower extends PApplet {

float Frames = 1;
public void setup() {

  size(500, 500);
}

public void draw() {
  
  //background(0);

  float rad = dist(100, 100, width/2, height/2);
  float colR = 0, colG = 0, colB = 0;
  colR += sin(frameCount / 50.0f) * 205;
  colG += sin( frameCount / 60.0f) * 255;
  colB += cos(frameCount/ 80.0f) * 205;
 
  float dx = width/7 + rad * cos(PI * Frames);
  float dy = height/5 + rad * sin(PI/2 * Frames);
  
  
  pushMatrix();
  translate(width/ 2, height/ 2);
  fill(0xffFFFF00);
  
  pushMatrix();
  rotate(frameCount/ 55.0f);
  ellipse(1, 1, 20,20);
 
  fill(colR, colG, colB);
   
  pushMatrix();
  translate(130, 80);
  rotate(frameCount/35.0f);
  ellipse(0, 0, dx, dy);
  
  popMatrix();
  popMatrix();
  popMatrix();
  
  Frames += 0.25f/8;
}


public void keyPressed() {
  if (key == ' ') {
    saveFrame("myframe-####.png");
  }
}

  static public void main(String args[]) {
    PApplet.main(new String[] { "--bgcolor=#FFFFFF", "flower" });
  }
}
