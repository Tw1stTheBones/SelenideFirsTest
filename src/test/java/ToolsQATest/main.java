package ToolsQATest;

import ToolsQATest.Helpers.TestInit;
import ToolsQATest.PageObjects.HomePageHelpers;
import ToolsQATest.PageObjects.SecondPageHelpers;
import com.codeborne.selenide.Condition;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;

public class main extends TestInit {
    HomePageHelpers aqa = new HomePageHelpers();

    @Test
    public void ToolsQaTextBox() {
        aqa.openSiteWebsite();
        aqa.element().click();

        SecondPageHelpers textBox = new SecondPageHelpers();
        Assert.assertEquals("incorrect text", textBox.checkText().getText(), "Please select an item from left to start practice.");
        textBox.boxTextElement().click();
        textBox.EnterFullNameAndCheckFullName("Alexndr Kvashonkin Nikinson");
        textBox.EnterEmail("test@mail.com");
        textBox.EnterCurrentAddress("314 Robinson Lane");
        textBox.EnterPermanentAddress("12 rue Eugеne Hеnaff");
        textBox.textBoxSubmit().click();
        textBox.CheckNameEmailAdresses();
    }

    @Test
    public void ToolsQaCheckBox(){
        aqa.openSiteWebsite();
        aqa.element().shouldBe(Condition.exist);
        aqa.element().click();
        SecondPageHelpers checkBox = new SecondPageHelpers();
        Assert.assertEquals("incorrect text", checkBox.checkText().getText(), "Please select an item from left to start practice.");
        checkBox.checkBoxElement().click();
        checkBox.checkBoxButton().click();
        Assert.assertEquals(checkBox.testCheckBox().getAttribute("class"),"rct-icon rct-icon-check");
        Assert.assertEquals(checkBox.resultTextCheckBox().getText().replace("\n", " "), "You have selected : home desktop notes commands documents workspace react angular veu office public private classified general downloads wordFile excelFile");
        checkBox.checkBoxButton().click();
        checkBox.resultTextCheckBox().shouldNotBe(Condition.visible);
        Assert.assertEquals(checkBox.testCheckBox().getAttribute("class"),"rct-icon rct-icon-uncheck");
    }
    @Test
    public void ToolsQaRadoButton(){
        aqa.openSiteWebsite();
        aqa.element().click();
        SecondPageHelpers radoButton = new SecondPageHelpers();
        radoButton.radioButtonElement().click();
        radoButton.textRadioButtonShow().shouldHave(Condition.text("Radio Button"));
        radoButton.radioButtonYes().click();
        String color = "rgba(40, 167, 69, 1)";
        Assert.assertEquals(radoButton.colorText().getCssValue("color"),color);
        radoButton.radioButtonImpressive().click();
        Assert.assertEquals(radoButton.colorText().getCssValue("color"),color);
        Assert.assertEquals(radoButton.radioButtonNo().hover().getCssValue("cursor"),"not-allowed");
    }
    @Test
    public void ToolsQaButtons(){
        aqa.openSiteWebsite();
        aqa.element().click();
        SecondPageHelpers buttuns = new SecondPageHelpers();
        buttuns.buttonsButtonElement().click();
        buttuns.doubleClickMeButton().doubleClick();
        buttuns.doubleClickMeTexTAfterClick().shouldHave(Condition.text("You have done a double click"));
        buttuns.rightClickMeButton().contextClick();
        buttuns.rightClickMeTextAfterClick().shouldHave(Condition.text("You have done a right click"));
        buttuns.clickMeButton().click();
        buttuns.clickMeTexTAfterClick().shouldHave(Condition.text("You have done a dynamic click"));

    }
    @Test
    public void ToolsQaUploadAndDownload(){
        aqa.openSiteWebsite();
        aqa.element().click();
        SecondPageHelpers uploadAndDownload = new SecondPageHelpers();
        uploadAndDownload.uploadAndDownloadElementButton().click();
        uploadAndDownload.chooseFileButton().uploadFile(new File("src/photo.jpg"));

    }
}
