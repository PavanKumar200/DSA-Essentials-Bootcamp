public class assignment {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5,6,7,8,9};
        int rotationCount = 2;

        int length = numbers.length;
        rotationCount = rotationCount % length;  // To handle rotation counts larger than the array length

        for (int i = 0; i < rotationCount; i++) {
            int temp = numbers[length - 1];  // Store the last element

            // Shift each element one position to the right
            for (int j = length - 1; j > 0; j--) {
                numbers[j] = numbers[j - 1];
            }

            numbers[0] = temp;  // Assign the last element as the first element
        }

        // Print the rotated array
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        // Output: 4 5 1 2 3
    }
}
