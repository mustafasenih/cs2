public class Main {

    public static void main(String[] args) {
      Scanner cs=new Scanner(System.in);

      int num1,num2,i;
      System.out.println("Please enter two integers:");
      num1=cs.nextInt();
      num2=cs.nextInt();
      int sum1=0;
      int sum2=0;
      for(i=1;i<num1;i++)
      {
         if(num1%i==0)
         {
            sum1=sum1+i;
         }
      }

      for( i=1;i<num2;i++)
      {
         if(num2%i==0)
         {
            sum2=sum2+i;
         }
      }
      if((double)num1/num2==(double)sum1/sum2)
         System.out.println("It is a Friendly Pair");
      else
         System.out.println("It is not Friendly Pair");
      cs.close();
    }
