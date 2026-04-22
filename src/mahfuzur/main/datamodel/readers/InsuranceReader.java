package mahfuzur.main.datamodel.readers;

import java.io.*;
import java.util.Scanner;

public class InsuranceReader {
    //reading insurance information




    public static void withFileAndScanner() throws Exception {
        File file = new File("Resources/insurances.csv");
        Scanner scanner = new Scanner(file);
    while(scanner.hasNextLine()){
        String line = scanner.nextLine();
        System.out.println(line);
        String[] arr = line.split(",");
for (String str : arr) {
    System.out.println(str.trim());

}
    }



    }

}


