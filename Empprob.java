public class Empprob{


 public static void main(String[] args){
    // Constants
     int IS_FULL_TIME = 1;
     int ERPH = 20;

    // Variables
     int emphrs = 0;
     int empwage = 0;

    //Computation
     double empCheck = Math.floor(Math.random() * 10) % 2;
     if (empCheck == IS_FULL_TIME)
         emphrs = 8;
     else
        emphrs = 0;
     empwage = ERPH * emphrs;
     System.out.println("Employee wage: " + empwage);
  }
}


