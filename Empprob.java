public class Empprob{

  public static final int IS_FULL_TIME = 1;
  public static final int IS_PART_TIME = 2;
  public static final int ERPH = 20;

public static void main(String[] args){

    // Variables
     int emphrs = 0;
     int empwage = 0;

    //Computation
     int empCheck = (int) Math.floor(Math.random() * 10) % 3;
     switch (empCheck){
        case IS_FULL_TIME:
              emphrs = 8;
              break;
       case  IS_PART_TIME:
              emphrs = 4;
              break;
       default:
              emphrs = 0;
       }
     empwage = ERPH * emphrs;
     System.out.println("Employee wage: " + empwage);
  }
}


