package com.company;

/*
1507. Level 15 Lection 4. ООП - Перегрузка
Перегрузите метод printMatrix 8 различными способами. В итоге должно получиться 10различных методов printMatrix.

Требования:
1. В классе Solution должны быть реализованы 10 методов printMatrix с различными аргументами.
2. Класс Solution должен быть public.
3. Все методы класса Solution должны быть статическими.
4. Все методы класса Solution должны быть публичными.

 */

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) { //1
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) { //2
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(){                            //3
        System.out.println("Что-то по умолчанию");
    }

    public static void printMatrix(int[][] matrix) {             //4
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
        }
    }

    public static void printMatrix(String title){               //5
        System.out.println(title);
    }

    public static int printMatrix(int n, int m){               //6
        return n*m;
    }

    public static int printMatrix(int n, int m, int k){        //7
        return n*m*k;
    }

    public static double printMatrix(double n, double m){      //8
        return n*m;
    }

    public static String printMatrix(Object o){               //9
        return "Matrix SAY: Hello my FirstName is:"+o.getClass().getSimpleName();
    }

    public static Object printMatrix(Object o, boolean life){  //10
        boolean is = true;
        if (life || is || life)
            return o;
        return null;
    }
}
