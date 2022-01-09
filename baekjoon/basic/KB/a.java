package KB;


public class a {
    public static int solution(int[][] fees, int usage) {
        int answer = 0;
        int n=fees.length;
        int index=0;
        int cnt=0;
        for (int i = 0; i <n-1; i++) {
            if (fees[i][0] >= usage) {
                index=cnt;
                break;
            }
            cnt+=1;
        }
        index=cnt;
        System.out.println(index);
        for (int i = 0; i < index; i++) {
            if (i == 0) {
                answer+=fees[i][0]*fees[i][2];
            } else {
                answer+=(fees[i][0]-fees[i-1][0])*fees[i][2];
            }
            System.out.println(answer);
        }
        System.out.println(answer);
        int dif=0;
        if (index >= 1) {
            dif = usage - fees[index - 1][0];
        } else {
            dif=usage;
        }
        answer+=fees[index][1]+fees[index][2]*dif;
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        //solution(new int[][] {{200, 910, 93}, {400, 1600, 188}, {655, 7300, 281}, {0, 15372, 435}},320);
        solution(new int[][]
                {{200, 910, 93}, {400, 1600, 188}, {655, 7300, 281},{0, 15372, 435}}, 450);

        //solution(new int[][]  {{1851, 1000, 100}, {0, 2000, 155}},1205);


    }
}
