
public class StringBuilderExample {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("abc1234567890");
        stringBuilder.append("d");
        stringBuilder.append("as");
        stringBuilder.delete(1, 2);
        stringBuilder.replace(3, 4, "****");
        System.out.println(stringBuilder);
    }
}







