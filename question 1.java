public class Main {

    public static void main(String[] args) {
   System.out.println("Please enter a digit");
      Scanner in = new Scanner(System.in);

      int num = in.nextInt();
      int count = 0;

      while(num>0){
         num=num/10;
         count++;
      }
      System.out.println("Number of the digits is " + count);
    }
}
