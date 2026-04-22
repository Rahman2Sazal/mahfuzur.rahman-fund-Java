package Test.launcher;

import static mahfuzur.main.datamodel.readers.InsuranceReader.withFileAndScanner;
import static mahfuzur.main.datamodel.readers.PatientReader.withParients;

public class TestOOP2 {



    public static void main(String [] args) throws Exception {
        withFileAndScanner();
        withParients();

    }
}


