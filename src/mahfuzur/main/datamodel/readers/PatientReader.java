package mahfuzur.main.datamodel.readers;

import java.io.*;
import java.util.Scanner;




public class PatientReader {


    public static void main(String[] args) throws IOException {
        withParients();

    }


    public static void withParients() throws FileNotFoundException {
        File file2 = new File("Resources/patients.csv");
        Scanner sc = new Scanner(file2);
        while (sc.hasNextLine()) {
            String[] line2 = sc.nextLine().split(",");
            String PT_HospitalCare = line2[0];
            String LastName = line2[1];
            String FirstName = line2[2];
            String Address = line2[3];
            String Telephone = line2[4];
            String Insurance_Id = line2[5];
            String Subscription_date = line2[6];




        }
    }
}
