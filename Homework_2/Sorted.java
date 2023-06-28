package Homework_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
public class Sorted {
    private static OutputStreamWriter fileWriter;
    private static File logFile;

    /**
     * @param args
     */
    public static void Sorted(String[] args) {
    
        int [] mas = {11, 3, 14, 16, 7};
 
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;
                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                    logFile = new File("log.txt");
            try {
                fileWriter = new FileWriter(logFile);
            } catch (IOException e) {
        
                e.printStackTrace();
            }

            for (int j = 0; j < 5; j++){
                try {
                    fileWriter.write("hello " + i + '\n');
                } catch (IOException e) {
                    e.printStackTrace();
                }logFile = new File("log.txt");
            try {
                fileWriter = new FileWriter(logFile);
            } catch (IOException e) {
        
                e.printStackTrace();
            }
            }
        }
        System.out.println(Arrays.toString(mas));}
        
  }}}

