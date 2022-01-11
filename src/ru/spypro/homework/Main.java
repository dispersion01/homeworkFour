package ru.spypro.homework;

public class Main {

    public static void main(String[] args) {
	// write your code here
        exerciseOneToThree();
        //exerciseFour();
    }

    public static void exerciseOneToThree() {
        //массив первый
        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;

        System.out.println(firstArray[0] + ", " + firstArray[1] + ", " + firstArray[2]);
        System.out.print(firstArray[2] + ", " + firstArray[1] + ", " + firstArray[0]);

        System.out.println(); //разделение между массивами

        //вывод массива в прямом порядке
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i]  < firstArray.length) {
                System.out.print(firstArray[i] + ", ");
            } else {
                System.out.print(firstArray[i] + " ");
            }

        }

        System.out.println(); //разделение между массивами

        //вывод массива в обратном порядке
        for (int c = firstArray.length - 1; c >= 0; c--) {

            if (firstArray[c] -1 < firstArray.length ){
                System.out.print(firstArray[c] + ", ");
            } else {
                System.out.print(firstArray[c]);
            }
        }


        System.out.println(); //разделение между массивами

        //массив второй
        double[] secondArray = new double[]{1.57, 7.654, 9.986};
        secondArray[0] = 1.57;

        //вывод массива в прямом порядке
        for (int i = 0; i < secondArray.length; i++) {
            if (secondArray[i]< secondArray.length) {
                System.out.print(secondArray[i] + ", ");
            }
            else {
                System.out.print(secondArray[i] + " ");
            }
        }

        System.out.println(); //разделение между массивами

        //вывод массива в обратном порядке
        for (double y = secondArray.length - 1; y >= 0; y--) {
            System.out.print(secondArray[(int) y] + ", ");
        }

        System.out.println(); //разделение между массивами

        //массив третий
        int[] thirdArray = new int[]{89, 65, 33, 4, 90};
        thirdArray[0] = 89;

        //вывод массива в прямом порядке
        for (int t = 0; t < thirdArray.length; t++) {
            if (thirdArray[t] < thirdArray.length){
                System.out.print(thirdArray[t] + ", ");
            } else {
                System.out.print(thirdArray[t] + " ");
            }
        }
        System.out.println(); //разделение между массивами

        //вывод массива в обратном порядке
        for (int r = thirdArray.length - 1; r >= 0; r--) {
            System.out.print(thirdArray[r] + ", ");
        }

        System.out.println(); //разделение между массивами

    }


    public static void exerciseFour() {
        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;


     for (int x = 0; x < firstArray.length; x++) {
         if (firstArray[x] % 2 != 0) {
             System.out.print(firstArray[x] + 1 + " ");
         } else {
             System.out.print(firstArray[x] + " ");
         }
     }

 }
}