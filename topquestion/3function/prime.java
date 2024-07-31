import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }


      //   scanner.close();
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Not a prime number
            }
        }

        return true; // Prime number
    }
}




















// public class prime {

// public static boolean isPrime(int n){

//     ///corner case
//     if(n==2){
//        boolean isPrime=true;
//     }
//     boolean isPrime=true;
//     for(int i=2;i<=Math.sqrt(n);i++){
//   if(n%i==0){
//     isPrime=false;
//     break;
//   }

//     }
//     return isPrime;
// }

//    public static void main(String args[]){
// System.out.println(isPrime(15));
//    } 
// }
