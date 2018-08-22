package SeleniumTraining.Barc;

import org.testng.annotations.Test;

public class DemoGroups {
  @Test(groups="smoke")
  public void f1() {
	  System.out.println("test1 smoke");
  }
  @Test(groups="regression")
  public void f2() {
	  System.out.println("test2 regression");
  }
  @Test(groups="smoke")
  public void f3() {
	  System.out.println("test3 smoke");
  }
  @Test(groups="regression")
  public void f4() {
	  System.out.println("test4 regression");
  }
  @Test(groups="smoke,regression")
  public void f5() {
	  System.out.println("test4 smoke and regression");
  }
}
