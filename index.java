
int y = 10;
int a = random(50, 250);
int b = random(50, 250);
int e = random(-100, 400);
 int x = random(-100, 400);
 int f = random(0, 255);
 int g = random(0, 255);
 int h = random(0, 255);
int A = 0;
int B = 50;
int C = 255;
int D = 400;
int E = 50;
int F = -50;
int G = 250;
Int H = -100;

void setup() {
	size(500, 500);
}


void draw() {
int c = mouseX + random(F, E);
int d = mouseY + random (F, E);

// Step 1: Write code that draws the following screenshots 
// with hard-coded values. (Feel free to use colors 
// instead of grayscale.)

// Step 2: Replace all of the hard-coded numbers with 
// variables.

// Step 3: Write assignment operations in draw() that 
// change the value of the variables.
// For example, “variable1 = variable1 + 2;”. 

// Step 4: Make it so when the program runs the ball slides off the screen exiting at the point (500, 500)

 
  fill(f, g, h);
    rect(e, x, a, b);

  fill( random(A, C), random(A, C), random(A, C));
  ellipse(c, d, y, y);
 

  

}
  void mousePressed(){
    stroke(0);
 noFill(0);
   background(C);
 a = random(E, G);
 b = random(E, G);
 e = random(H, D);
  x = random(H, D);
   f = random(A, C);
 g = random(A, C);
  h = random(A, C);



    







  }