package lv_1.minusPlusSumnum;

public class MinusPlusSumnum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};
        System.out.println(solution.solution(absolutes, signs));
    }
}
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if(signs[i]){
                answer += absolutes[i];
            }else{
                answer -= absolutes[i];
            }
        }
        return answer;
    }
}
