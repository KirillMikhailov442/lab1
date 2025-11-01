# Михайлов К. Н. Лабораторная №1

# Задача 1
## Подзадача 3
```java
public int charToNum(char x) {
        return Character.getNumericValue(x);
    }
```

## Подзадача 4
```java
public boolean isPositive(int x) {
        return x > 0;
    }
```

## Поздачада 8
```java
public boolean isDivisor(int a, int b) {
        if (b != 0 && a % b == 0) {
            return true;
        }
        if (a != 0 && b % a == 0) {
            return true;
        }
        return false;
    }
```
## Подзадача 9
```java
public boolean isEqual(int a, int b, int c) {
    return a == b && b == c;
    }
```

## Подзадача 10
```java
public int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);
    }
```


# Задача 2
## Подзадача 2
```java
public double safeDiv(int x, int y) {
        return y == 0 ? 0 : (double) x / y;
    }
```

## Подзадача 5
```java
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
```

## Подзадача 6
```java
 public boolean sum3(int x, int y, int z) {
        return (x + y == z) || (x + z == y) || (y + z == x);
    }
```

## Подзадача 7
```java
public int sum2(int x, int y) {
        int sum = x + y;

        if (sum >= 10 && sum <= 19) {
            return 20;
        }

        return sum;
    }
```

## Подзадача 10
```java
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
```


# Задача 3
## Подзадача 1
```java
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
```

## Подзадача 4
```java
public int pow(int x, int y) {
        int result = 1;

        for (int i = 0; i < y; i++) {
            result *= x;
        }

        return result;
    }
```

## Подзадача 6
```java
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
```

## Подзадача 7
```java
public void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
```

## Подзадача 9
```java
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
```

# Задача 4
## Подзадача 1
```java
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
```

## Подзадача 2
```java
 public int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
```

## Подзадача 5
```java
public int[] add(int[] arr, int[] ins, int pos) {
        if (pos < 0 || pos > arr.length) {
            throw new IllegalArgumentException("Некорректная позиция: " + pos);
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
```

## Подзадача 8
```java
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
```

## Подзадача 10
```java
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
```