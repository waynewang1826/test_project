package java8_test;

public class rotateCode {
    public static void main(String[] args) {
        int[] input = {1, 2};
        int[] rotation = {1, 2, 3, 4, 5, 6, 7};

        int[] result = helper(input, rotation);
        for (int i : result) {
            System.out.print(i);
        }
    }

    public static int[] helper(int[] input, int[] rotation) {
        if (input == null  || input.length == 0){
            return null;
        }
        if (rotation == null){
            return null;
        }
        int length = input.length;
        int max = input[0];
        int index = 0;
        for (int i = 1; i < length; i++) {
            if (input[i] > max) {
                max = input[i];
                index = i;
            }
        }

        int[] result = new int[rotation.length];

        for (int j = 0; j < rotation.length; j++) {
            int temp = rotation[j];
            int curIndex = index;
            if (temp >= length) {
                temp = temp % length;
            }

            while (temp > 0) {
                if (curIndex >= 0) {
                    curIndex--;
                } else {
                    curIndex = length - 1;
                }
                temp--;
            }

            result[j] = curIndex;
        }

        return result;
    }
}
