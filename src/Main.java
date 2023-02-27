import  java.util.Scanner;
public class Main {
    public static int fibonacci(int number){
        
        if(number==1 || number==2){
            return 1;
        }
        return fibonacci(number-1) + fibonacci(number-2);

    }
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci Seri Sayısını Giriniz: ");
        number = input.nextInt();

        System.out.println(fibonacci(number));

    }
}