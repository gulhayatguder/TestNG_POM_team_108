package tests.practies;

import org.testng.annotations.Test;

public class Q01 {

    //Priority e numarandirma yaparken 10,20,30,... seklinde numaralandirma yaparsak
    // daha sonra araya baska tesler ihtiyac halinde yerlestirile bilir


    /*
  > TestNG default olarak @Test methodlarini alfabetik siraya gore run eder,
  yukaridan asagiya dogru degil.
  > priority annotation testlere oncelik vermek icin kullanilir,
   kucuk olan numara daha once calisir.
  > priority : TestNG testlerinde , testler konsola alfabetik sira ile yazdirilir.
  > priority default degeri sifirdir.
  > enabled = false methodu : Testi gormezden gelmek icin @Test 'in yanina yazilir.
   */
    @Test(priority = 3)
    public void  b(){
        System.out.println("b");
    }

    @Test(enabled = false)  //enable = false testi ignore eder
    public void  a(){
        System.out.println("a");
    }
    @Test(priority = 2)
    public void  c(){
        System.out.println("c");
    }

    @Test(dependsOnMethods = "e")
    public void  d(){
        System.out.println("d");
    }
    @Test
    public void  e(){
        System.out.println("e");
    }@Test
    public void  f(){
        System.out.println("f");
    }
    @Test
    public void  g(){
        System.out.println("g");
    }
}
