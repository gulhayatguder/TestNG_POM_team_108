package tests.practies;

import org.testng.annotations.Test;

public class Q02 {

    //   - Birbirine bagimli testler olusturun.
    //    -Configreader ile birbirine bagimli testler olusturarak.
    //        =>ilk once wisequarter'a gidin
    //        =>sonra wisequrter'a bagimli olarak youtube'a gidin
    //        =>daha sonra youtube'a bagimli olarak amazon'a gidin
    //    - driver'i kapatin.

    /*
    > TestNG default olarak @Test methodlarini alfabetik siraya gore run eder,
    yukaridan asagiya dogru degil.
    > priority annotation testlere oncelik vermek icin kullanilir,
     kucuk olan numara daha once calisir.
    > priority : TestNG testlerinde , testler konsola alfabetik sira ile yazdirilir.
    > priority default degeri sifirdir.
    > enabled = false methodu : Testi gormezden gelmek icin @Test 'in yanina yazilir.
     */

    @Test
    public void wisequarter(){

    }
    @Test(dependsOnMethods = "wisequarter")
    public void youtuber(){

    }
    @Test(dependsOnMethods = "youtube")
    public void amazon(){

    }
}
