package anton;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ClassTest {
    @DataProvider(name = "SetEnvironment", parallel = true)
    public Object[][] getData() {
        Object[][] browserProperty = new Object[][]{
                {"chrome", "70.0"},
                {"chrome", "71.0"}
        };

        return browserProperty;
    }
    @Test(dataProvider = "SetEnvironment")
    public void metod22(String a,String b){
        System.out.println(a+" "+b);

    }
}
