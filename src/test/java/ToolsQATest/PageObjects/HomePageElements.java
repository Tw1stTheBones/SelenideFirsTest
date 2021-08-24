package ToolsQATest.PageObjects;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class HomePageElements {
    public SelenideElement element(){ return
        $x("//div[@class='avatar mx-auto white']");
    }
    public void openSiteWebsite(){
         open("https://demoqa.com/");
    }

}
