package lv_2;

import java.util.ArrayList;

public class FunctionImplementation {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        ArrayList<Integer> answer = solution.solution(progresses, speeds);
        for (int i : answer) {
            System.out.println(i);
        }
    }
}

class Solution {
    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answerArr = new ArrayList();
        int len = progresses.length;
        int pointer = 0;

        while (pointer < len) {
            int ppointer = pointer;
            for (int i = ppointer; i < len; i++) {
                progresses[i] += speeds[i];
            }
            for (int i = ppointer; i < len; i++) {
                if (progresses[i] >= 100) {
                    pointer++;
                    continue;
                }
                break;
            }
            if (ppointer != pointer) {
                answerArr.add(pointer - ppointer);
            }
        }

        return answerArr;
    }
}