package anton;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
    @Parameters({"iDoNotKnow", "iKnow"})
    @Test
    public void newMetod(String a,String b){
        System.out.println(a);
        System.out.println(b);

    }
}
