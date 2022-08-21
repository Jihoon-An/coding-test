package lv_1.marathon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Marathon {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        System.out.println(solution.solution(participant, completion));
    }
}
class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        for (int i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[participant.length-1];
    }
}