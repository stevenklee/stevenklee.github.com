void eye(  float eyex, float eyey) {

  noStroke();
  fill(#FF0000);
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

