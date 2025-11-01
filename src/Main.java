import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();

        System.out.print("Введите номер задания: ");
        int task = scanner.nextInt();

        System.out.print("Введите номер подзадания: ");
        int subtask = scanner.nextInt();

        switch (task) {
            case 1:
                switch (subtask) {
                    case 3: {
                        int res = main.charToNum('3');
                        System.out.println(res);
                        break;
                    }

                    case 4: {
                        boolean res = main.isPositive(3);
                        System.out.println(res);
                        res = main.isPositive(-5);
                        System.out.println(res);
                        break;
                    }

                    case 8: {
                        boolean res = main.isDivisor(3, 6);
                        System.out.println(res);
                        res = main.isDivisor(2, 15);
                        System.out.println(res);
                        break;
                    }

                    case 9: {
                        boolean res = main.isEqual(3, 3, 3);
                        System.out.println(res);
                        res = main.isEqual(2, 15, 2);
                        System.out.println(res);
                        break;
                    }

                    case 10: {
                        int res = main.lastNumSum(5, 11);
                        System.out.println(res);
                        break;
                    }

                    default:
                        System.out.println("Такой подзадачи нету");
                        System.exit(0);
                        break;
                }
                break;
            case 2:
                switch (subtask) {
                    case 2: {
                        double res = main.safeDiv(8, 2);
                        System.out.println(res);
                        break;
                    }

                    case 5: {
                        int res = main.max3(5, 7, 7);
                        System.out.println(res);
                        break;
                    }

                    case 6: {
                        boolean res = main.sum3(5, 7, 2);
                        System.out.println(res);
                        break;
                    }

                    case 7: {
                        int res = main.sum2(5, 7);
                        System.out.println(res);
                        break;
                    }

                    case 10: {
                        main.printDays("четверг");
                        break;
                    }

                    default:
                        System.out.println("Такой подзадачи нету");
                        System.exit(0);
                        break;
                }
                break;
            case 3:
                switch (subtask) {
                    case 1: {
                        String res = main.listNums(5);
                        System.out.println(res);
                        break;
                    }

                    case 4: {
                        int res = main.pow(2, 5);
                        System.out.println(res);
                        break;
                    }

                    case 6: {
                        boolean res = main.equalNum(1111);
                        System.out.println(res);
                        break;
                    }

                    case 7: {
                        main.square(2);
                        break;
                    }

                    case 9: {
                        main.rightTriangle(3);
                        break;
                    }

                    default:
                        System.out.println("Такой подзадачи нету");
                        System.exit(0);
                        break;
                }
                break;
            case 4:
                switch (subtask) {
                    case 1: {
                        int[] arr = { 1, 2, 3, 4, 2, 2, 5 };
                        int res = main.findFirst(arr, 2);
                        System.out.println(res);
                        break;
                    }

                    case 2: {
                        int[] arr = { 1, 2, 3, 4, 2, 2, 5 };
                        int res = main.findLast(arr, 2);
                        System.out.println(res);
                        break;
                    }

                    case 5: {
                        int[] arr = { 1, 2, 3, 4, 5 };
                        int[] s = { 7, 8, 9 };
                        int[] res = main.add(arr, s, 3);
                        System.out.println(Arrays.toString(res));
                        break;
                    }

                    case 8: {
                        int[] arr1 = { 1, 2, 3 };
                        int[] arr2 = { 7, 8, 9 };
                        int[] res = main.concat(arr1, arr2);
                        System.out.println(Arrays.toString(res));
                        break;
                    }

                    case 10: {
                        int[] arr = { 1, 2, -3, 4, -2, 2, -5 };
                        int[] res = main.deleteNegative(arr);
                        System.out.println(Arrays.toString(res));
                        break;
                    }

                    default:
                        System.out.println("Такой подзадачи нету");
                        System.exit(0);
                        break;
                }
                break;
            default:
                System.out.println("Такой задачи нету");
                System.exit(0);
                break;
        }

    }

    /**
     * Глава 1
     * Задание 3
     */
    public int charToNum(char x) {
        return Character.getNumericValue(x);
    }

    /**
     * Задание 4
     */
    public boolean isPositive(int x) {
        return x > 0;
    }

    /**
     * Задание 8
     */
    public boolean isDivisor(int a, int b) {
        if (b != 0 && a % b == 0) {
            return true;
        }
        if (a != 0 && b % a == 0) {
            return true;
        }
        return false;
    }

    /**
     * Задание 9
     */
    public boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    /**
     * Задание 10
     */
    public int lastNumSum(int a, int b) {
        return (a + b) % 10;
    }

    /**
     * Глава 2
     * Задание 2
     */
    public double safeDiv(int x, int y) {
        return y == 0 ? 0 : (double) x / y;
    }

    /**
     * Задание 5
     */
    public int max3(int x, int y, int z) {
        int max = x;

        if (y > max) {
            max = y;
        }

        if (z > max) {
            max = z;
        }

        return max;
    }

    /**
     * Задание 6
     */
    public boolean sum3(int x, int y, int z) {
        return (x + y == z) || (x + z == y) || (y + z == x);
    }

    /**
     * Задание 7
     */
    public int sum2(int x, int y) {
        int sum = x + y;

        if (sum >= 10 && sum <= 19) {
            return 20;
        }

        return sum;
    }

    /**
     * Задание 10
     */
    public void printDays(String x) {
        switch (x) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
        }
    }

    /**
     * Глава 3
     * Задание 1
     */
    public String listNums(int x) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i <= x; i++) {
            result.append(i);
            if (i < x) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    /**
     * Задание 4
     */
    public int pow(int x, int y) {
        int result = 1;

        for (int i = 0; i < y; i++) {
            result *= x;
        }

        return result;
    }

    /**
     * Задание 6
     */
    public boolean equalNum(int x) {
        if (x < 10 && x >= 0) {
            return true;
        }
        if (x > -10 && x < 0) {
            return true;
        }
        int lastDigit = Math.abs(x % 10);
        int temp = Math.abs(x / 10);
        while (temp > 0) {
            int currentDigit = temp % 10;
            if (currentDigit != lastDigit) {
                return false;
            }
            temp = temp / 10;
        }

        return true;
    }

    /**
     * Задание 7
     */
    public void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    /**
     * Задание 9
     */
    public void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     * Глава 4
     * Задание 1
     */
    public int findFirst(int[] arr, int x) {
        int index = 0;
        for (int num : arr) {
            if (num == x) {
                return index;
            }
            index++;
        }
        return -1;
    }

    /*
     * Задание 2
     */
    public int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    /*
     * Задание 5
     */
    public int[] add(int[] arr, int[] ins, int pos) throws Exception {
        if (pos < 0 || pos > arr.length) {
            throw new Exception("Некорректная позиция: " + pos);
        }
        int[] result = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        for (int i = 0; i < ins.length; i++) {
            result[pos + i] = ins[i];
        }
        for (int i = pos; i < arr.length; i++) {
            result[ins.length + i] = arr[i];
        }
        return result;
    }

    /*
     * Задание 8
     */
    public int[] concat(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }

        return result;
    }

    /*
     * Задание 10
     */
    public int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num >= 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num >= 0) {
                result[index] = num;
                index++;
            }
        }
        return result;
    }
}
