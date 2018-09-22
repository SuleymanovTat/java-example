public class ExceptionExample {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("на 0 делить нельзя");
        } catch (Exception e) {
            System.out.println("все ошибки");
        } finally {
            System.out.println("выполнять всегда");
        }
    }
}
