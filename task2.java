package HW10;

public class task2 {


    String vowels(String input){
        String str = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (String.valueOf(c).matches("[aeiouAEIOU]")) {
                str += c;
            }
        }
        return str;
    }

    public static void main(String[] args) {

        task2 obj = new task2();
        String result = obj.vowels("Hello World");
        System.out.println(result);

    }
    
    
    
    
    
}
