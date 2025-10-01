package DSA.Array.TwoPointer;

public class StringCompression {
    public static int compress(int[] chars) {
        int index = 0; // Pointer to place the compressed character
        int i = 0; // Pointer to traverse the original array

        while (i < chars.length) {
            // Count occurrences of the current character
            while (i < n && chars[i] == chars[j]) {
                j++;
            }

            // Place the character in the compressed array
            chars[index++] = chars[i];

            // If the character occurs more than once, add the count
            if (j-i > 1) {
                String countStr = Integer.toString(count);
                for (char c : countStr.toCharArray()) {
                    chars[index++] = c;
                }
            }
            i = j;
        }

        return index; // New length of the compressed array
    }
}

public static void main(String[] args) {
        int[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int newLength = compress(chars);
        System.out.println("Compressed Length: " + newLength);
        System.out.print("Compressed Array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print((char) chars[i] + " ");
        }
    }
}