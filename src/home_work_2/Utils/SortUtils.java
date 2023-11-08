package home_work_2.Utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SortUtils {
    public static int[] sort(int[] someArray){
        int size = someArray.length;

        for(int i = 0; i < size - 1; i++){
            for(int j = (size - 1); j > i; j--){
                if (someArray[j-1] > someArray[j]){
                    int temp = someArray[j - 1];
                    someArray[j - 1] = someArray[j];
                    someArray[j] = temp;
                }
            }
        }
        return someArray;
    }

    public static int[] shake(int[] arr){
        int count = arr.length;
        int left = 0;
        int right = count - 1;
        int flag = 1;

        while((left < right) && flag > 0){
            flag = 0;
            for(int i = left; i < right; i++){
                if (arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i + 1] = temp;
                    flag = 1;
                }
            }
            right--;
            for(int i = right; i>left; i--){
                if(arr[i-1]>arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                    flag = 1;
                }
            }
            left++;
        }
        return arr;
    }

    @Test
    void bubbleTest(){
        Assertions.assertArrayEquals(new int[]{1,2,3,4,5,6}, sort(new int[]{6,2,1,3,5,4}));
    }
    @Test
    void shakeTest(){
        Assertions.assertArrayEquals(new int[]{1,2,3,4,5,6}, shake(new int[]{6,2,1,3,5,4}));
    }
}

