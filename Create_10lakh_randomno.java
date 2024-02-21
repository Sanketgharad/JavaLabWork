import java.util.Random;
//import java.util.Scanner;

public class Create_10lakh_randomno {





        public int randomno;
    public int count1 = 0;
  public int count2 = 0;


    public int reate_10lakh_randomno(){
            Random sc=new Random();
            randomno=sc.nextInt(1000000);
            System.out.println("");
         return randomno;

        }



        public int gussNo () {

            int count = 0;

            for (int i = 1; i <= randomno; i++) {
                if (randomno % i == 0) {
                    count++;
                }

            }
            if (count == 2) {
                ++count1;
                return count1;
            } else if (count!=2) {

                count2++;
                return count2;
            } else {
                  return 0;
            }
        }

        public static void main (String[]args){
            Create_10lakh_randomno sa = new Create_10lakh_randomno();
           int b =1;
            for(int i=1;i<=1000000;i++){
                System.out.println( sa.reate_10lakh_randomno());
                sa.gussNo();
            }
            while (b<=5) {

                long starttime=System.nanoTime();
                long endtime=System.nanoTime();

                sa.gussNo();
                System.out.println("prime no count-"+sa.count1);
                System.out.println(" non prime no count-"+(sa.count2-1));
                System.out.println("time required to count prime and non-prime number"+(starttime-endtime));

                sa.count2--;
                b++;
                }

        }

    }


