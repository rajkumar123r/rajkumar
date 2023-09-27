package TESTNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft_assert {
	@Test
	public void tc1()
	{
		String s1="hii";
		String s2="hello";
		SoftAssert s=new SoftAssert();
		s.assertEquals(s1, s2);//it will fail
		//after failing iam writting step
		System.out.println("hii iam after failing the test case");
		s.assertAll();
		
		}

}
