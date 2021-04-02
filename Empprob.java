public class Empprob{

  public static final int IS_FULL_TIME = 1;
  public static final int IS_PART_TIME = 2;
  public static final int ERPH = 20;
  public static final int NOWD = 20;
  public static final int MHIM = 100;

public static void main(String[] args){

    // Variables
     int emphrs = 0;
     int totalemphrs = 0;
     int totalworkingdays = 0;

    //Computation
     while (totalemphrs <= MHIM && totalworkingdays < NOWD){
     totalworkingdays++;
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
     totalemphrs += emphrs;
     System.out.println("Days#: " + totalworkingdays + " Employee Hours: " +emphrs);
   }
     int totalempwage = totalemphrs * ERPH;
     System.out.println("Total Employee Wage: " + totalempwage);
 }
}
