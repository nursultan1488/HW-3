public class Main {
    public static void main(String[] args) {

        double[] numbers = {3.5, 2.7, -1.2, 4.6, 5.3, -2.8, 6.9, 7.2, -4.1, 8.8, -9.3, 1.1, 2.3, 4.4, -5.6};

        boolean firstNegativeFound = false;
        double sum = 0;
        int count = 0;

        for (double num : numbers) {
            if (firstNegativeFound && num > 0) {
                sum += num;
                count++;
            } else if (num < 0) {
                firstNegativeFound = true;
            }
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);
        } else {
            System.out.println("Положительных чисел после первого отрицательного не найдено.");
        }
    }
}
