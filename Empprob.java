public class Empprob{

  public static final int IS_FULL_TIME = 1;
  public static final int IS_PART_TIME = 2;

  private final String company;
  private final int ERPH;
  private final int NOWD;
  private final int MHIM;
  private int totalempwage;

public Empprob(String company, int ERPH, int NOWD, int MHIM) {
       this.company = company;
       this.ERPH = ERPH;
       this.NOWD = NOWD;
       this.MHIM = MHIM;
  }

public void computeempwage() {

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
     totalempwage = totalemphrs * ERPH;
  }
    public String toString(){
      return "Total Employee Wage for Company: " +company+ " is: " + totalempwage;
  }
    public static void main(String[] args) {
       Empprob dMart = new Empprob("Dmart", 30, 26, 120);
       Empprob reliance = new Empprob("Reliance", 25, 23, 110);
       dMart.computeempwage();
       System.out.println(dMart);
       reliance.computeempwage();
       System.out.println(reliance);
 }

}
