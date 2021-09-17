package ua.kupaiev.modul1;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        int[] numbersArray = new int[15];

        int s = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = s++;
        }
        numbersArray[1] = 0;
        numbersArray[10] = 4;
        numbersArray[5] = 0;
        System.out.println(Arrays.toString(removeElm(numbersArray)));
    }

    public static int[] removeElm(int arr[]) {
        int[] tempArr = new int[arr.length];
        int j = 0;
        tempArr[j] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            boolean check = false;
            for (int k = 0; k < j + 1; k++) {
                if (tempArr[k] != arr[i]) {
                    check = true;
                } else {
                    check = false;
                    break;
                }
            }
            if (check) {
                tempArr[++j] = arr[i];
            }
        }
        difference(tempArr);
        return tempArr;
    }

    private static void difference(int[] tempArr) {
        int count = 0;
        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 0) {
                count++;
            }
        }
        System.out.println("Различных элементов массива: " + (tempArr.length-count+1));
    }
}
