//code by Matthew del real

class Main {
  public static void main(String[] args) {

    //performing the loop fib sequence and then printing result in nano seconds
    int time = loopFib();
    System.out.println("Loop result: " + time);
    long recTime = System.nanoTime();
    int fib = recFib(10);
    System.out.println("Recursive Time(in nanoseconds): "+recTime);
    System.out.println("Recursive result: " +fib);
  }


  //wrote a really eh fib sequence 
  //not very intuitive
  public static int loopFib(){

    //create variables
    int sum = 0;
    int fib = 0;
    int fib1 = 1;
    int counter = 0;
    //records time
    long loopTime = System.nanoTime();
    while(counter < 10){
      sum = fib + fib1;
      fib1=fib;
      fib = sum;
      counter++;
      
    }
    System.out.println("Loop Time (in nanoseconds): "+ loopTime);
  
    return sum;
  }


  //recursive fib sequence
  //then printing results after
  public static int recFib(int num){
    if(num == 0)
      return 0;
    else if (num ==1)
      return 1;
    else 
      return recFib(num-1) + recFib(num-2);
    
  }
}