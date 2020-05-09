import java.io.*;
import java.util.Scanner; // Import the Scanner class to read text files

public class Main {

    public Main(String path){
        String data = this.readFile(path);
        System.out.print(data);
    }
    
    private String readFile(String path) { // method for readfile & split data
        String data = "";

        try {
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()){
                data += myReader.nextLine();
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!");
            e.printStackTrace();
        }
        return data;

        //method for split
}