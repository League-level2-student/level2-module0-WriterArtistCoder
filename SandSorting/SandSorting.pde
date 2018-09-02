/* Paste the code into a new Processing sketch and complete the steps. */

//1. create an array of ints. don't initialize it yet.
int[] myInts;
float xRoughness = 100;
float yRoughness = 1;
float jitter = 0.92; // Chance of random sorting

void setup() {
  //2. set the size of your window
  size(1000, 800);
  //  if you are using Processing 3, you cannot use variables
  //  because the developers don't know how programming is supposed to work.

  //3. initialize your array with the built in width variable
  myInts = new int[width];
  //4. initialize the ints in the array with random numbers
  //   from 0 to the built in height variable
    setArray(myInts);

  //5. call the noStroke() method
  noStroke();
}

void draw() {
  //6. set the background color with background(r, g, b);
  background(0);
  
  //7. set the color for your graph
  // See the line four lines below me!
  //8. draw a rectangle for each int in your array.
  for (int i = 0; i < myInts.length; i++) {
  //   the x value will be the current index in the array
    fill(lerpColor(color(0, 0, 255), color(255, 0, 0), (float) i/myInts.length));
    rect(floor(i/xRoughness)*xRoughness, height, xRoughness, floor(-myInts[i]/yRoughness)*yRoughness);
  //   the y value will the height variable
  //   the width is 1 (one)
  //   the height is negative the value of the element at the current index of the array
  }


  //9. call the stepSort method
  stepSort(myInts);
  //10. extract the code that randomizes the array into a method.
  
  //11. call the method you made in step 10 when the mouse is pressed
  if (mousePressed) {
    if (mouseButton == LEFT) {
      setArray(myInts);
    } else if (mouseButton == RIGHT) {
      for (int i = 0; i < myInts.length; i++) {
          //   from 0 to the built in height variable
          myInts[i] = constrain(myInts[i], 0, height-mouseY);
       }
    }
  }
}

void setArray(int[] arr) {
  for (int i = 0; i < arr.length; i++) {
  //   from 0 to the built in height variable
    arr[i] = int(random(height));
  }
}

void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i] || int(random(100)) < jitter*100) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}
