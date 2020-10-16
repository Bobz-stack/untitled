package anton;

import org.testng.asserts.Assertion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AntonTest {
        @org.testng.annotations.Test
        public void metod() throws FileNotFoundException {
            Scanner sc= new Scanner(new File("a.txt"));
            String slova="";
            while(sc.hasNext()) {
                slova = slova + " " + sc.nextLine();
                // System.out.println(slova);
            }
            boolean result= slova.contains("pivet");
            Assertion a= new Assertion();

            if (result){
                System.out.println("slovo naideno");
            }
            else{
                System.out.println("slovo ne naideno");
            }
            a.assertTrue(result);
    }
}
