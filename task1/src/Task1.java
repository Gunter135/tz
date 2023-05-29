import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args){
        circle_array(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
//        circle_array(5,4);
    }
    public static int circle_array(int n, int m){
        int[] arr = new int[n];
        int[] start = new int[m];
        int[] next = new int[m];
        List<Integer> resarr = new ArrayList<>();
        int last_pos = m-1;
        for (int i = 0;i<n;i++){
            arr[i] = i+1;
        }
        System.arraycopy(arr, 0, start, 0, m);
        resarr.add(start[0]);


        while (start[0] != next[m-1]){
            for (int i = 0;i<m;i++){
                next[i] = arr[(last_pos + i) % n];
            }
            last_pos += m-1;
            last_pos %= n;
            resarr.add(next[0]);
        }
        StringBuilder result = new StringBuilder();
        for (Integer item:
             resarr) {
            result.append(item);
        }
        System.out.println(result.toString());
        return 0;
    }
}
