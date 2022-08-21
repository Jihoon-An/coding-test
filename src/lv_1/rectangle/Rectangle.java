package lv_1.rectangle;

public class Rectangle {
    public static void main(String[] args) {
        int arr[][] = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        Solution solution = new Solution();
        System.out.println(solution.solution(arr));

    }
}
class Solution{
    static int solution(int[][] sizes){
        int width = 0;
        int vertical = 0;
        for(int[] i : sizes){
            if (i[0] < i[1]) {
                int tmp = i[1];
                i[1] = i[0];
                i[0] = tmp;
            }
            width = width > i[0] ? width:i[0];
            vertical = vertical > i[1] ? vertical:i[1];
        }

        return width*vertical;
    }
}