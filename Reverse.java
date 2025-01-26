public class Reverse {
    public static void main(String[]args) {
        String name = "Human"; int len = name.length();
        String result = "";
        System.out.printf("Given String is: %s", name);
        for (int i = len - 1; i >= 0; i--) {
            result = result + name.charAt(i);
        }
        System.out.printf("\nString Reversal: %s", result);
    }
}