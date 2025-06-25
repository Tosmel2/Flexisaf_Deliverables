public class NumberStringAndReverse {
    public static void main(String[] args) {
        // Convert Number to String and back
        int number = 12345;
        String numberAsString = Integer.toString(number);
        int stringToNumber = Integer.parseInt(numberAsString);

        System.out.println("Original number: " + number);
        System.out.println("Number as String: " + numberAsString);
        System.out.println("String back to Number: " + stringToNumber);

        // Reverse a String
        String input = "hello world";
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }
}
