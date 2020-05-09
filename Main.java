import java.io.*;
import java.util.Scanner; // Import the Scanner class to read text files

public class Main {

    public Main(String path){
        String[] data = this.readFile(path);
        for(String d : data)
            System.out.println(d);
    }
    

    private String[] readFile(String path) { // method for readfile & split data

        try {
        String inputfile = "C:/xampp/htdocs/f2-exam/test.txt";
        File file = new File(inputfile);
        Scanner s = new Scanner(file);
        while (s.hasNextLine()) {
          String data = s.nextLine();
          System.out.println(data);  
        }
         s.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }   
}