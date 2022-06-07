package healenium;

import org.testng.annotations.Test;

import pagefactory.allFunctions;

public class testcase1 extends BaseTest{

	@Test
	public void  guru99()
	{
		allFunctions af = new allFunctions(driver);
		af.open("http://demo.guru99.com/test/newtours/");
		af.check_tile("Welcome: Mercury Tours");
		af.login_guru();
	}
}
