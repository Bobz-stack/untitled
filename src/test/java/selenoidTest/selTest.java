package selenoidTest;

import org.testng.annotations.Test;
import pageObject.initPage;

public class selTest extends Baze {
    @Test
    public void sel(){
        getDriver().get("https://www.google.ru/");
        getDriver().manage().window().maximize();
        initPage in = new initPage(getDriver());

        in.setSearchText("Привет");

        in.clickSubmitSearch();
    }
}
