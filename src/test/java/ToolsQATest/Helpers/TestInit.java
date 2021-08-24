package ToolsQATest.Helpers;

import com.codeborne.selenide.Configuration;
import org.junit.Before;


public class TestInit {
    @Before public void setUp(){
       Configuration.holdBrowserOpen = true;
        Configuration.startMaximized = true;

    }

}
