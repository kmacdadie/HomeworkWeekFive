package SecondTimeAround;

public class AsterriskLogger implements Logger {
	

	@Override
	public void log(String log) {
		
		String input = new String("***" + log + "***");
		System.out.println(input.toString() + " ");
		
	}

	@Override
	public void error(String error) {
		
		String input = new String(error);
		System.out.println("******************");
		System.out.println("***Error:" + " " + input.toString() + "***" );
		System.out.println("******************");
	 
	}

}
