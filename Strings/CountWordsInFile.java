package Strings;

import java.io.*;

public class CountWordsInFile {

    public static int countOccurrences(File file, String searchString) {
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                int index = 0;
                /* 
                while ((index < line.length()) && ((index = line.indexOf(searchString, index)) != -1)) {
                    count++;
                    index += searchString.length(); // Move past the last found occurrence
                }*/
                //
                while(index < line.length()){
                    String substr = line.substring(index, Math.min( index+ searchString.length() , line.length()));
                    if(substr.equals(searchString)) {
                        count++;
                        index += searchString.length();
                    }else{
                        index++;
                    }

                }
                //line.substring(index) --> sub = line.substring(index, Math.min( index+ searchString.length() , line.length()));


                while ((index < line.length()) && ((index = line.indexOf(searchString, index)) != -1)) {
                    count++;
                    index += searchString.length(); // Move past the last found occurrence
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return count;
    }

    public static void main(String[] args) {
        File file = new File("C:\\Users\\n" + //
                        "alagam\\OneDrive - OpenText\\Desktop\\NAV\\Strings\\sample.txt"); // Path to your file
        String searchString = "abc";

        int occurrences = countOccurrences(file, searchString);
        System.out.println("The string \"" + searchString + "\" occurs " + occurrences + " times.");
    }
}
