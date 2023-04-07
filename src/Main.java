public class Main {
    public static void main(String[] args) {

                double[] arr = {8, -2, -4, 2, 3, 6, -7, 5.5, -3.5, 1.2, -2.6, 4.3, -6.7, 9.1, -0.5};

                double sum = 0;
                int count = 0;
                boolean foundNegative = false;

                for (double x : arr) {
                    if (x < 0 && !foundNegative) {
                        foundNegative = true;
                    } else if (x > 0 && foundNegative) {
                        sum += x;
                        count++;
                    }
                }

                if (count > 0) {
                    double avg = sum / count;
                    System.out.println("Среднее арифметическое положительных чисел, расположенных после первого отрицательного числа, равно: " + avg);
                } else {
                    System.out.println("Положительные числа после первого отрицательного не найдены.");
                }

        int[] arr = {-7, -4, -2, 2, 3, 6, 8};

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            // Ищем самый минимальный элемент в оставшейся части массива
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Меняем местами текущий элемент и найденный минимальный элемент
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            // Распечатываем текущее состояние массива
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
    }
}

