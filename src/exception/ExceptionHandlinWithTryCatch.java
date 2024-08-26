package exception;

public class ExceptionHandlinWithTryCatch {
    public static void main(String[] args) {
        try {
            int num1 =2;
            int num2=0;
            float num3= num1/num2;
            System.out.println(num3);
        }catch (Exception e) {
            System.out.println("lỗi");
        }finally {
            System.out.println("kêt thúc");
        }
    }
}
