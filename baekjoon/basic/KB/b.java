package KB;


import java.util.Arrays;

public class b {
    static boolean[][] arr;
    static int answer;
    public static int solution(String[][] schedule) {
        answer = 0;
        arr=new boolean[5][30];
        go(0,schedule);
        System.out.println(answer);
        return answer;
    }
    static void go(int cnt,String[][] schedule) {
        if (cnt == 5) {
            answer += 1;
            return;
        } else {
            for (int i = 0; i < 4; i++) {
                int[] temp=change(schedule[cnt][i]);
                if (temp!=null) {
                    if (temp.length == 2) {
                        int start = temp[1] + 1;
                        for (int j = 0; j < 5; j++) {
                            arr[temp[0]][start + j] = true;
                        }
                        go( cnt + 1, schedule);
                        for (int j = 0; j < 5; j++) {
                            arr[temp[0]][start + j] = false;
                        }
                    } else {
                        int start1=temp[1]+1;
                        int start2=temp[3]+1;
                        for (int j = 0; j < 2; j++) {
                            arr[temp[0]][start1 + j] = true;
                            arr[temp[2]][start2 + j] = true;
                        }
                        go(cnt+1,schedule);
                        for (int j = 0; j < 2; j++) {
                            arr[temp[0]][start1 + j] = false;
                            arr[temp[2]][start2 + j] = false;

                        }
                    }
                }
            }
        }
    }

    static int[] change(String s) {
        String[] time = s.split(" ");
        int f1 = setCheck(time[1]);
        int d1 = getdate(time[0]);
        if (s.length() > 10) {
            int f2 = setCheck(time[3]);
            int d2 = getdate(time[2]);
            for (int i = 0; i < 4; i++) {
                if (arr[d1][i + f1] || arr[d2][i + f2]) {
                    return null;
                }
            }
            /*
            for (int i = f1; i < f1 + 4; i++) {
                if (arr[d1][i]) {
                    return null;
                }
            }
            for (int i = f2; i < f2 + 4; i++) {
                if (arr[d2][i]) {
                    return null;
                }
            }
             */
            return new int[]{d1, f1, d2, f2};
        } else {
            for (int i = f1; i < f1+7; i++) {
                if (arr[d1][i]) {
                    return null;
                }
            }
            return new int[]{d1,f1};
        }
    }

    static int setCheck(String time) {
        String[] temp=time.split(":");
        int h=Integer.parseInt(temp[0]);
        int m=Integer.parseInt(temp[1]);
        return ((h-9)*2)+(m/30);
    }
    static int getdate(String day) {
        return switch (day) {
            case "MO" -> 0;
            case "TU" -> 1;
            case "WE" -> 2;
            case "TH" -> 3;
            default -> 4;
        };
    }



    public static void main(String[] args) {
        solution(new String[][]{{"MO 12:00 WE 14:30", "MO 12:00", "MO 15:00", "MO 18:00"}, {"TU 09:00", "TU 10:00", "TU 15:00", "TU 18:00"}, {"WE 09:00", "WE 12:00", "WE 15:00", "WE 18:00"}, {"TH 09:30", "TH 11:30", "TH 15:00", "TH 18:00"}, {"FR 15:00", "FR 15:00", "FR 15:00", "FR 15:00"}});
    }
}
