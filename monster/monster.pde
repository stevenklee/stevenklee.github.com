void setup() {
  size (900, 700);
  smooth();
}

float eyex, eyey, eyew, eyeh;
float mouseDist = 0;
float r = 155;

void draw () {
  background(0, 0, 0);

  //body
  stroke(#00FF00);
  strokeWeight(2);
  fill(#00FF00);
  rect( 83, 180, 750, 420);

  //eyes  
  eyew = 200;
  eyeh = min(368, max(274, mouseY));

  eye(260, 380);
  eye(650, 380);


  //ears
  stroke(#0000FF);
  strokeWeight(2);
  fill(#FFFF00);
  triangle( 704, 180, 779, 33, 834, 180 );
  triangle( 83, 180, 210, 20, 253, 180 );

  //arms
  stroke(#CD00CD);
  strokeWeight(7);
  line(835, 347, 886, 399);
  line(82, 347, 24, 399);

  //nose
  strokeWeight(4);
  fill(#0000FF);
  triangle(467,344,439,382,485,381);
  
  //mouth 
  noStroke();
  fill(#000000);
  ellipse(467,499, 50, min(150, max(50, mouseY)));
  
  //zzzz
  mouseDist = dist(width/2, height/2, mouseX, mouseY);

  if (mouseDist < r){
    
    stroke(#CD00CD);
    strokeWeight(7);
    line(835, 347, 886, 290);
    line(82, 347, 24, 290);
    
    stroke(#000000);
    strokeWeight(7);
    line(835, 347, 886, 399);
    line(82, 347, 24, 399);
  }

  else {
    stroke(#CD00CD);
    strokeWeight(7);
    line(835, 347, 886, 399);
    line(82, 347, 24, 399);
  }
}

void mousePressed() {
  println (mouseX+ " " + mouseY);
  
}
