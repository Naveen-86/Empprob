public class Empprob{


 public static void main(String[] args){
    // Constants
     int IS_FULL_TIME = 1;
     int IS_PART_TIME = 2;
     int ERPH = 20;

    // Variables
     int emphrs = 0;
     int empwage = 0;

    //Computation
     double empCheck = Math.floor(Math.random() * 10) % 3;
     if (empCheck == IS_FULL_TIME)
         emphrs = 8;
     else if (empCheck == IS_PART_TIME)
        emphrs = 4;
     else
        emphrs = 0;
     empwage = ERPH * emphrs;
     System.out.println("Employee wage: " + empwage);
  }
}


