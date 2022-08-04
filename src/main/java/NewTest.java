import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void RetailPage() {
	  int x =10;
			  int y =2;
			  int sum = x+y;
			  System.out.println(sum);
  }
  @Test
  public void MainPage() {
	  int i =10;
	  int m =45;
	  int sum = i+m;
	  System.out.println(sum);
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Hello! this is the start of test Case");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is the end of the test!");
  }

}
