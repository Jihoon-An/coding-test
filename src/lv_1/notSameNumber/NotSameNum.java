package lv_1.notSameNumber;
import java.util.*;

public class NotSameNum {
    public static void main(String[] args) {
        int arr[] = {1, 1, 3, 3, 0, 1, 1};

        Solution solution = new Solution();
        for(int i : solution.solution(arr)) {
            System.out.println(i);
        }
    }
}

class Solution {
    public int[] solution(int []arr) {
        int arrLength = arr.length;
        int[] result = new int[arrLength];
        int index = 1;
        result[0] = arr[0];
        for (int i = 1; i < arrLength; i++) {
            if (arr[i] != arr[i - 1]) {
                result[index++] = arr[i];
            }
        }
        int[] answer = new int[index];
        for (int j = 0; j < index; j++) {
            answer[j] = result[j];
        }
        return answer;
    }
}