import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_txt {
    public static void rwFile(){
        FileWriter filewriter = null;
        BufferedReader buffreader = null;
        try {
            File file = new File("out.txt");
            if(file.exists()){
                file.delete();
            }
            buffreader = new BufferedReader(new InputStreamReader(new FileInputStream("in.txt")));
            filewriter = new FileWriter("out.txt", true);
            String line = null;
            while ((line = buffreader.readLine()) != null) {
                String[] arr = line.split(" ");
                int length = arr.length;
                System.out.println(length);
                StringBuilder stringbuilder = new StringBuilder(line.length());

                for (int i = 0; i < length - 1; i++) {
                    stringbuilder.append(arr[i] + " ");
                }
                stringbuilder.append(arr[length - 1]);
                stringbuilder.append("\n");
                // for (int i=length-1; i>=1; i--) {
                //         stringbuilder.append(arr[i]+" ");
                // }
                // stringbuilder.append(arr[0]);
                // stringbuilder.append("\n");

                filewriter.write(stringbuilder.toString());
                filewriter.flush();
            }
            buffreader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File Not Found!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (filewriter != null) {
                try {
                    filewriter.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {
        rwFile();
    }
}
