package lv_1.missingNumber;

public class MissingNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {1,2,3,4,6,7,8,0};
        System.out.println(solution.solution(numbers));
    }
}

class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        for(int num : numbers){
            answer -= num;
        }
        return answer;
    }
}