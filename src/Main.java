public class Main {

    public int occurence (String input, char character) {
        int result = 0;
        if (input != null) {
            for (int i = 0; i < input.length(); i++) {
                if (Character.toLowerCase(input.charAt(i)) == Character.toLowerCase(character)) {
                    result++;
                }
            }
            return result;
        }
        return -1;
    }
    public static void main(String[] args) {

    }
}