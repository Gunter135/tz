import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task4 {
    public static void main(String[] args) throws IOException {
        min_dist(args[0]);
//        min_dist("file1.txt");
    }
    public static int min_dist(String filename) throws IOException {
        File f1 = new File(filename);
        FileReader fr1 = new FileReader(f1);
        BufferedReader bf1 = new BufferedReader(fr1);
        List<Integer> arr = new ArrayList<>();
        int median = 0;
        for (String line = bf1.readLine(); line != null; line = bf1.readLine()) {
            arr.add(Integer.parseInt(line));
        }
        arr.sort(Comparator.naturalOrder());
        median = arr.get(arr.size()/2);
        int res = 0;
        for (Integer num : arr) {
            res += Math.abs(median - num);
        }
        System.out.println(res);
        return 0;
    }
}
