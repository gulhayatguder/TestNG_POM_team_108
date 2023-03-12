package tests.practies;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.Driver;

public class Q05DataProvider {
    @DataProvider
    public static Object[][] gonderilecekMail(){
        Object[][]gonderilecekMailvePassword={{"Nevzat","1234"}};
        return gonderilecekMailvePassword;
    }
    @Test(dataProvider = "gonderilecekMai")
    public void  qualityTest(){

    }
}