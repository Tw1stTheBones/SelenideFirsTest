package ToolsQATest.PageObjects;

import org.junit.Assert;

public class SecondPageHelpers extends SecondPageElements {

    public void EnterFullNameAndCheckFullName(String fullName) {
        toureFullName().setValue(fullName);
        int a = 0;
        String strfullName = toureFullName().getValue();
        for (int i = 0; i < strfullName.length(); i++) {
            String str = "" + strfullName.charAt(i);
            if (str.equals(" ")) {
                a++;
            }
        }
        String str = "your name is full";
        String str1 = str;
        if (a >= 2) {
        } else {
            str1 = "your name isn't full";
            Assert.assertEquals(str, str1);

        }
    }

    public void EnterEmail(String email) {
        youreEmail().setValue(email);
    }

    public void EnterCurrentAddress(String adress) {
        youreCurrentAddress().setValue(adress);
    }

    public void EnterPermanentAddress(String adress) {
        yourePermanentAddress().setValue(adress);
    }

    public void CheckNameEmailAdresses() {
        boolean a;

            a = checks(1).getText().contains("Alexndr Kvashonkin Nikinson");
            Assert.assertEquals(a, true);
            a = checks(2).getText().contains("test@mail.com");
            Assert.assertEquals(a, true);
            a = checks(3).getText().contains("314 Robinson Lane");
            Assert.assertEquals(a, true);
            a = checks(4).getText().contains("12 rue Eugеne Hеnaff");
            Assert.assertEquals(a, true);
    }
    public void S(){

    }


}
