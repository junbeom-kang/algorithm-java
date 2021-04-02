package 朝朝神坪砺;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class 朝朝神_2020_3 {
    static HashMap<String, HashMap<String, HashMap<String,HashMap<String, ArrayList<Integer>>>>> m = new HashMap<>();
    public static void main(String[] args) {
        solution(new String[] {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"},new String[] {
                "java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"
        });
    }
    public static int[] solution(String[] info, String[] query) {
        String[] langs = {"cpp", "java", "python"},
                deps = {"backend", "frontend"},
                exps = {"junior", "senior"},
                foods = {"chicken", "pizza"};
        for (String lang : langs) {
            m.put(lang, new HashMap<>());
            for (String dep : deps) {
                m.get(lang).put(dep, new HashMap<>());
                for (String exp : exps) {
                    m.get(lang).get(dep).put(exp,new HashMap<>());
                    for (String food : foods) {
                        m.get(lang).get(dep).get(exp).put(food, new ArrayList<>());
                    }
                }
            }
        }
        for (String s : info) {
            String[] s1 = s.split(" ");
            m.get(s1[0]).get(s1[1]).get(s1[2]).get(s1[3]).add(Integer.parseInt(s1[4]));
        }
        for (String lang : langs) {
            for (String dep : deps) {
                for (String exp : exps) {
                    for (String food : foods) {
                        Collections.sort(m.get(lang).get(dep).get(exp).get(food));
                    }
                }
            }
        }
        int[] answer = new int[query.length];
        int i=0;
        for (String q : query) {
            String[] s = q.split(" and ");
            int score = Integer.parseInt(s[3].split(" ")[1]);
            s[3]=s[3].split(" ")[0];
            for (String lang : langs) {
                if (s[0].equals(lang) || s[0].equals("-")) {
                    for (String dep : deps) {
                        if (s[1].equals(dep) || s[1].equals("-")) {
                            for (String exp : exps) {
                                if (s[2].equals(exp) || s[2].equals("-")) {
                                    for (String food : foods) {
                                        if (s[3].equals(food) || s[3].equals("-")) {
                                            ArrayList<Integer> temp=m.get(lang).get(dep).get(exp).get(food);
                                            int left=0,right=temp.size()-1;
                                            answer[i]+=lower_bound(temp,left,right,score);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i+=1;

        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static int lower_bound(ArrayList<Integer> arr, int left, int right, int score) {
        int ans=-1;
        while (left <= right) {
            int mid=(left+right)/2;
            if (score <= arr.get(mid)) {
                ans = mid;
                right=mid-1;
            } else {
                left=mid+1;
            }
        }
        if (ans == -1) {
            return 0;
        } else {
            return arr.size()-ans;
        }

    }


}
