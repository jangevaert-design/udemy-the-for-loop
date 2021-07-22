package edu.cnm.deepdive;

public class TheForLoop {

  public static void main(String[] args) {

    for (int i = 0; i < 10; i++) {
      System.out.print(i + " ");
    }
//if you want to be able to access the variable after the for loop, declare it outside of the for loop

    int a;
    for (a = 0; a < 10; a++) {
      System.out.print("\n" + a + " ");
    }
    System.out.println("\nafter the for loop a = " + a);//we can access a because it was declared
    //outside of the for loop. a is now 10 because that is what a was on the moment the for loop ended
    //(a < 10)

//    for(;;) { this is a never ending for loop
//      System.out.println("Hello");
//    }
    
    int x = 0;
    for (int y = 0, z = 4; x < 5 && y < 10 ; x++, y++) {//totally legal.
      System.out.println("y = " + y);
    }
    System.out.println("x = " + x);
    
//    int d = 10;
//    for (int e = 0, d = 0; e < 10 || d < 10 ; e++, d--) {does not compile because d was already
    //declared in line 30.
//
//    }

//    for (long z = 0, int d = 4; z < 10 ; z++ d++) { does not compile. Incompatible types.
//
//    }

  }

}
