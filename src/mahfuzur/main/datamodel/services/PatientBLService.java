package mahfuzur.main.datamodel.services;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mahfuzur.main.datamodel.Patients;

public class PatientBLService {


    public static List<Patients> readEntries(String pathname) throws FileNotFoundException {
        File file = new File(pathname);
        List<Patients> patients = new ArrayList<>();
        Scanner sc = new Scanner(file);
        sc.nextLine();

        while (sc.hasNextLine()) {
        Scanner sc1 = new Scanner(sc.nextLine());
        sc1.next();
        Scanner sc2 = new Scanner(sc.nextLine());

        }


        return patients;
    }

}
