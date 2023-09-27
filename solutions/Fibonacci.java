import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
	public static void rwFile(){
        FileWriter filewriter = null;
        BufferedReader buffbuilder = null;
        try {
        	File file = new File("out.txt");
        	if(file.exists()){
        		file.delete();
        	}
        	buffbuilder = new BufferedReader(new InputStreamReader(new FileInputStream("in.txt")));
        	filewriter = new FileWriter("out.txt", true);
            String line = null;
            while ((line = buffbuilder.readLine()) != null) {
            	int n1 = line.indexOf(" ");
            	String m1 = line.substring(0, n1);
            	int a = Integer.valueOf(m1);
            	int b=a+1;
            	String m2 = line.substring(n1+1,line.length());
            	int d = Integer.valueOf(m2);
            	int c = a + b;
            	String f = m1+" "+String.valueOf(b);
            	for(int i=2;i<d;i++){
            		f += " ";
            		f += String.valueOf(c);
            		a=b;
            		b=c;
            		c=a+b;
            	}
                filewriter.write(f);
                filewriter.flush();
            }
            buffbuilder.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
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

