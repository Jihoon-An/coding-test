package lv_1.personality;

// RT CF JM AN
public class Personality {
    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        Personality personality = new Personality();
        System.out.println(personality.solution(survey, choices));
    }

    public String solution(String[] survey, int[] choices) {
        String answer = "";

        /*
        RTCFJMAN의 배열을 만든다.
        RTCFJMAN의 점수를 담은 배열을 만들고
        choices의 숫자를 보고
        servey의 문자열에서 해당 맞는 값을 찾아 점수를 저장한다.
        answer에 문자의 크기를 비교하여 하나씩 넣는다.
         */

        String[] types = {"R", "T", "C", "F", "J", "M", "A", "N"};
        int[] point = {0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < choices.length; i++) {
            if (choices[i] < 4) {
                for (int t = 0; t < types.length; t++) {
                    if (survey[i].split("")[0].equals(types[t])) {
                        point[t] += (4 - choices[i]);
                        break;
                    }
                }
            } else if (choices[i] > 4) {
                for (int t = 0; t < types.length; t++) {
                    if (survey[i].split("")[1].equals(types[t])) {
                        point[t] += (choices[i] - 4);
                        break;
                    }
                }
            }
        }

        for (int index = 0; index < point.length; index += 2) {
            if (point[index] < point[index + 1]) {
                answer += types[index+1];
            }
            else{
                answer += types[index];
            }
        }

        return answer;
    }
}
