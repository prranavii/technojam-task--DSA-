public class Q4 {
    public static int compress(char[] chars) {
        int write = 0; // Pointer to place compressed characters
        int read = 0;  // Pointer to traverse through chars
        
        while (read < chars.length) {
            char currentChar = chars[read];  // Current character to process
            int count = 0;                   // Count how many times currentChar repeats

            // Count the consecutive repeating characters
            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }

            // Write the character
            chars[write++] = currentChar;

            // If count is greater than 1, write the count as well
            if (count > 1) {
                String countStr = Integer.toString(count);
                for (char c : countStr.toCharArray()) {
                    chars[write++] = c;  // Write each digit of count
                }
            }
        }

        // Return the new length of the compressed array
        return write;
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int newSize = compress(chars);
        System.out.println("New length: " + newSize);
        for (int i = 0; i < newSize; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.println();
    }
}
