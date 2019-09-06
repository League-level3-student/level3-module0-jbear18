/* Copy the code into a new Processing sketch and complete then steps. */

//1. create an array of ints. don't initialize it yet.
int [] array;

void setup() {
  //2. set the size of your window
  size(600,600);

  //3. initialize your array with the built in width variable
array= new int [width];
  
  //4. initialize the ints in the array with random numbers
  //   from 0 to the built in height variable
  for(int i=0; i< array.length; i++){
    array [i]= (int)random (0,height);
  }

  //5. call the noStroke() method
  noStroke();
}

void draw() {
  //6. set the background color with background(r, g, b);
background (192, 224, 235);

  //7. set the color for your graph
fill (26, 102, 156);
  //8. draw a rectangle for each int in your array.
  for(int j=0; j< array.length; j++){
  //   the x value will be the index of the int
  int x= j;
  //   the y value will the height variable
 
  int y= height;
  //   the width is 1
 int w=1;
  //   the height is negative the value of the int at that element in the array
int h= -(array [j]);
  rect(x,y,w,h);
  }
  //9. call the stepSort method
  stepSort(array);

  //10. extract the code that randomizes the array into a method.
 if(mousePressed){
   arrayRandomizer();
 }
}
  //11. call the method you made in step 10 when the mouse is pressed
   void arrayRandomizer(){
  for(int i=0; i< array.length; i++){
    array [i]= (int)random (0,height);
  }
  

}

void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}
