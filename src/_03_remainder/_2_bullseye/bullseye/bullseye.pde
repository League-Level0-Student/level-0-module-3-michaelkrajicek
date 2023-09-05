
void setup() {
 
  // set the size of your sketch
  size(800, 800);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for (int i = 0; i < 8; i ++)
  {
      //fill(#FF1717);
  ellipse(400, 400, 400-(i*50), 400-(i*50));
 

  //Use an if statement and remainder to alternate the color of your rings.
if( i % 2 ==0 ){
    fill(#050505);
  } else {fill (#FF1717);}
}
}
