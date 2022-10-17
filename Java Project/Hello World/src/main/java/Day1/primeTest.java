package Day1;

import java.util.Scanner;

public class primeTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter a number from where it has started");
        int s = in.nextInt();
        int e = in.nextInt();
        int count = 0, totalPrime = 0;
        for (int i=s;i<=e;i++){
            for (int j=2;j<=i-1;j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(i);
                totalPrime++;
            }
            count=0;
        }
        System.out.println("Total prime number is : "+totalPrime);
    }

}
