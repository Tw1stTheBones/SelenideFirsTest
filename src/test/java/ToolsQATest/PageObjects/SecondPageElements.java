package ToolsQATest.PageObjects;

import ToolsQATest.Helpers.TestInit;
import com.codeborne.selenide.SelenideElement;
import com.sun.javafx.binding.StringFormatter;


import static com.codeborne.selenide.Selenide.*;

public class SecondPageElements extends TestInit {
    public SelenideElement checkText() { return $x("//div[text()='Please select an item from left to start practice.']"); }

    public SelenideElement boxTextElement() { return $x("(//div[@class='element-list collapse show']//li[@class='btn btn-light '])"); }

    public SelenideElement toureFullName() {
        return $x("(//div[@class='col-md-9 col-sm-12']/input)");
    }

    public SelenideElement youreEmail() {
        return $x("(//div[@class='col-md-9 col-sm-12']/input)[2]");
    }

    public SelenideElement youreCurrentAddress() {
        return $x("(//div[@class='col-md-9 col-sm-12']/textarea)[1]");
    }

    public SelenideElement yourePermanentAddress() {
        return $x("(//div[@class='col-md-9 col-sm-12']/textarea)[2]");
    }

    public SelenideElement textBoxSubmit() {
        return $x("(//div[@class='text-right col-md-2 col-sm-12']/button)");
    }

    protected String checkFinalText = "(//div[@class='border col-md-12 col-sm-12']/p)[%d]";

    public SelenideElement checks(int a) {
        return $x(String.format(checkFinalText, a));
    }

    public SelenideElement checkBoxElement() { return $x("//div[@class='element-list collapse show']//li[@id='item-1']"); }

    public SelenideElement checkBoxButton() { return $x("//span[@class='rct-checkbox']"); }

    public SelenideElement resultTextCheckBox() {
        return $x("//div[@id='result']");
    }

    public SelenideElement testCheckBox() {
        return $("span.rct-checkbox > svg");
    }

    public SelenideElement textRadioButtonShow() { return $x("//div[text()='Radio Button']"); }

    public SelenideElement radioButtonElement() { return $x("(//div[@class='element-list collapse show']//li[@id='item-2'])"); }

    public String radioButtonYesAndImpressive = "(//label[@class='custom-control-label'])[%d]";

    public SelenideElement radioButtonYes() { return $x(String.format(radioButtonYesAndImpressive, 1)); }

    public SelenideElement radioButtonImpressive() { return $x(String.format(radioButtonYesAndImpressive, 2)); }

    public SelenideElement radioButtonNo() { return $x("//label[@class='custom-control-label disabled']"); }

    public SelenideElement colorText() { return $x("//span[@class='text-success']"); }

    public SelenideElement buttonsButtonElement() { return $x("(//div[@class='element-list collapse show']//li[@id='item-4'])"); }

    public SelenideElement uploadAndDownloadElementButton() {return $x("(//div[@class='element-list collapse show']//li[@id='item-7'])"); }

    public SelenideElement doubleClickMeButton() {
        return $x("//button[@id='doubleClickBtn']");
    }

    public SelenideElement rightClickMeButton() {
        return $x("//button[@id='rightClickBtn']");
    }

    public SelenideElement clickMeButton() {
        return $x("//button[text()='Click Me']");
    }

    public SelenideElement clickMeTexTAfterClick() {
        return $x("//p[@id='dynamicClickMessage']");
    }

    public SelenideElement doubleClickMeTexTAfterClick() {
        return $x("//p[@id='doubleClickMessage']");
    }

    public SelenideElement rightClickMeTextAfterClick() {
        return $x("//p[@id='rightClickMessage']");
    }

    public SelenideElement chooseFileButton() {return $x("//input[@id='uploadFile']"); }

    public SelenideElement downloadFileButton() {return $x("//a[@id='downloadButton']"); }


}
