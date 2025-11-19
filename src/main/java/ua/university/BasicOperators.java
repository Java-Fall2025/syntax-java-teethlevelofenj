package ua.university;

public class BasicOperators {

    
    public static double[] sumAndAverage(int a, int b, int c) {
        double sum = a + b + c;
        double avg = sum / 3.0;
        return new double[]{sum, avg};
    }

    public static int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static char gradeFromScore(int score) {
         if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score must be 0–100");
        }
        if (score >= 90) return 'A';
        if (score >= 80) return 'B';
        if (score >= 70) return 'C';
        if (score >= 60) return 'D';
        if (score >= 50) return 'E';
        return 'F';
    }

    public static String dayOfWeek(int day) {
        if (day < 1 || day > 7) {
            throw new IllegalArgumentException("Day must be 1–7");
        }
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return days[day - 1];
    }

    public static int[] countdown(int n) {
        if (n <= 0) throw new IllegalArgumentException("n must be > 0");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = n - i;
        }
        return arr;
    }

    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be >= 0");
        long result = 1;
        for (int i = 2; i <= n; i++) result *= i;
        return result;
    }

    public static int[] reverseArray(int[] arr) {
        if (arr == null) throw new IllegalArgumentException("Array is null");
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[arr.length - 1 - i];
        }
        return res;
    }

    public static int sumMatrix(int[][] matrix) {
        if (matrix == null) throw new IllegalArgumentException("Matrix is null");
        int sum = 0;
        for (int[] row : matrix) {
            if (row == null) throw new IllegalArgumentException("Row is null");
            for (int value : row) sum += value;
        }
        return sum;
    }

    public static boolean isPalindrome(String s) {
        if (s == null) throw new IllegalArgumentException("String is null");
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    public static int[] findMinMax(int[] arr) {
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Array is empty");
        int min = arr[0], max = arr[0];
        for (int x : arr) {
            if (x < min) min = x;
            if (x > max) max = x;
        }
        return new int[]{min, max};
    }

    public static int[][] multiplicationTable(int n) {
        if (n <= 0) throw new IllegalArgumentException("n must be > 0");
        int[][] table = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }

    public static int[] evenNumbersUpToN(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be >= 0");
        int count = n / 2;
        int[] result = new int[count];
        for (int i = 1; i <= count; i++) {
            result[i - 1] = i * 2;
        }
        return result;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int countVowels(String s) {
        if (s == null) throw new IllegalArgumentException("String is null");
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) >= 0) count++;
        }
        return count;
    }

    public static int[] fibonacci(int n) {
        if (n <= 0) throw new IllegalArgumentException("n must be > 0");
        int[] fib = new int[n];
        if (n >= 1) fib[0] = 0;
        if (n >= 2) fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    public static int[][] transpose(int[][] matrix) {
        if (matrix == null) throw new IllegalArgumentException("Matrix is null");
        int rows = matrix.length;
        if (rows == 0) throw new IllegalArgumentException("Matrix empty");
        int cols = matrix[0].length;

        int[][] t = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            if (matrix[i].length != cols)
                throw new IllegalArgumentException("Jagged matrix");
            for (int j = 0; j < cols; j++) {
                t[j][i] = matrix[i][j];
            }
        }
        return t;
    }

    public static int[] sortArray(int[] arr) {
        if (arr == null) throw new IllegalArgumentException("Array is null");
        int[] copy = arr.clone();
        java.util.Arrays.sort(copy);
        return copy;
    }
}
