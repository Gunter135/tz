import java.io.*;
import java.util.List;

public class Task2 {
    public static void main(String[] args) throws IOException {
        coords(args[0],args[1]);
//        coords("file1.txt","file2.txt");
    }
    public static int coords(String file_name, String file_name2) throws IOException {
        File f1 = new File(file_name);
        File f2 = new File(file_name2);
        FileReader fr1 = new FileReader(f1);
        FileReader fr2 = new FileReader(f2);
        BufferedReader circle_info = new BufferedReader(fr1);
        BufferedReader dots = new BufferedReader(fr2);
        String[] circle_x_y = circle_info.readLine().split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        float radius = Float.parseFloat(circle_info.readLine());
        for (String line = dots.readLine(); line != null; line = dots.readLine()) {
            String[] x_y = line.split(" ");
            double distance = Math.sqrt(Math.pow((Float.parseFloat(x_y[0]) - Float.parseFloat(circle_x_y[0])),2)
                    + (Math.pow(Float.parseFloat(x_y[1]) - Float.parseFloat(circle_x_y[1]),2)));
            if (distance == radius)
                stringBuilder.append("0");
            else if (distance < radius) {
                stringBuilder.append("1");
            }else {
                stringBuilder.append("2");
            }
            stringBuilder.append(" ");
        }
        dots.close();
        circle_info.close();


        stringBuilder.setLength(stringBuilder.length()-1);
        System.out.println(stringBuilder.toString());
        return 0;
    }
}
