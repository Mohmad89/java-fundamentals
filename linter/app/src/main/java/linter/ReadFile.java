package linter;


import java.io.*;
import java.util.Scanner;

public class ReadFile {

    public void readFile() throws FileNotFoundException{

        int count = 0;
        String sp ="";
        Scanner scanner = new Scanner(getFileAsIOStream("gates.js.txt"));
        scanner.hasNextLine();
        String [] arr ;
        while(scanner.hasNext()){
            count++;
            sp=scanner.nextLine();
            arr = sp.split("");
            if(!(arr[arr.length-1]).equals(";") ){
                if(((arr[arr.length-1]).equals("}")) || (arr[arr.length-1]).equals("{") || sp.indexOf("if") != -1 || sp.indexOf("else") != -1 || sp.equals("") )  {
                }else {
                    System.out.println("Line " +count + " Missing semicolon.");
                }
            }
        }
        scanner.close();

        // Empty file
        if(count == 0){
            System.out.println("The File Is Empty");
        }
    }

    
    // Read File from resource directory
    private InputStream getFileAsIOStream(final String fileName)
    {
        InputStream ioStream = this.getClass().getClassLoader().getResourceAsStream(fileName);

        if (ioStream == null) {
            throw new IllegalArgumentException(fileName + " is not found");
        }
        return ioStream;
    }

}
