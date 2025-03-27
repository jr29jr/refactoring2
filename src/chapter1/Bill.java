package chapter1;

public class Bill {
    public static String statment(String invoice){
        int totalAmount = 0;
        int volumeCredits = 0;
        String result = String.format("청구내역 (고객명: %S)\n",invoice);

        return result;
    }

    public static void main(String[] args) {
        String temp = statment("asdf");
        System.out.println(temp);
    }
}
