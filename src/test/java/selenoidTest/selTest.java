package selenoidTest;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import pageObject.initPage;

public class selTest extends Baze {
    @Epic("Селениум")
    @Feature("Гугле тетс")
    @Story("Проверяем картинки")
    @Test
    public void sel(){
        getDriver().get("https://www.google.ru/");
        getDriver().manage().window().maximize();
        initPage in = new initPage(getDriver());

        in.setSearchText("Привет");

        in.clickSubmitSearch();
    }
}
