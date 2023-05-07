package HW10;

public class Task1 {

    public static String reverse(String input) {
        StringBuilder newReverce = new StringBuilder(input);
        newReverce.reverse();
        String str = newReverce.toString();
        return str;
    }

    public static void main(String[] args) {

        String result = Task1.reverse("ciwit");
        System.out.println(result);


    }












}
