package seleniumPractice;

public class sampleTest {

	public static void main(String[] args) {

		int num[] ={20,10,20,40};
		System.out.println("Display in loop");
		for(int i=0;i<num.length;i++)
		{
			System.out.println("Num : " + num[i]);
		}
	
		sampleTest st = new sampleTest();
		st.testMethod();
		st.testMethod2();
		
	}
	
	public void testMethod2()
	{
		System.out.println("Method for testing");
	}
	
	public void testMethod()
	{
		System.out.println("Method for testing 2");
	}
	
	

}
