package exception;

import java.util.Scanner;

public class ExceptionThrows {
    public static void main(String[] args) {
        System.out.println("chuong trinh bat dau: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thu nhat: ");
        int first=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap so thu hai: ");
        int second=Integer.parseInt(sc.nextLine());
        int result = divide(first,second);
        System.out.println(result);
        System.out.println("chuong trinh ket thuc");
    }
    public static int divide(int firstNumber, int secondNumber) throws ArithmeticException {
        if(secondNumber == 0){
            throw new ArithmeticException("Divide by zero");
        }
        return firstNumber / secondNumber;
    }
}
