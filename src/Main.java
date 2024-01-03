// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String output = Draw.diamonds('x', '.', 9, 9).trim();
        System.out.println(output);

        String output1 = Draw.birthdayCake('x', '.', 29, 14);
        System.out.println(output1);
    }
}