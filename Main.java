public static void main(String[] args) {

    int[] numbers = {10, 20, 30, 40, 50};

    int[] result = Solution.reverseArray(numbers);

    System.out.print("Reversed Array: ");

    for (int num : result) {
        System.out.print(num + " ");
    }
}