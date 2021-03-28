import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 과제는끝나지않17952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans=0;
        Stack<Work> work = new Stack<>();
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            if (s.length != 1) {
                work.push(new Work(Integer.parseInt(s[1]),Integer.parseInt(s[2])));
            }
            if (!work.isEmpty()) {
                work.peek().setDay(work.peek().getDay()-1);
                if (work.peek().getDay() == 0) {
                    ans+=work.pop().getScore();
                }
            }
        }
        System.out.println(ans);
        Work s=new Work(3,3);
        s.say();
    }
}
class Work{
    private int score;
    private int day;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Work(int score, int day) {
        this.score = score;
        this.day = day;
    }
    public void say() {
        System.out.println("TTTT");
    }
}
