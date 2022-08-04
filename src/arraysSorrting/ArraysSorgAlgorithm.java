package arraysSorrting;

import java.util.Arrays;

public class ArraysSorgAlgorithm {
    public static void main(String[] args) {
        int [] numbers = {2, 5, 3, 7 ,78, 91, 54, 32};

        int temp = numbers[0];
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]){
                    temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));



    }
}
