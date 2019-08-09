package SecondTimeAround;

public class SpacedLogger implements Logger{
	
	public static String addSpaces(String input) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			if (i > 0) {
				result.append(" ");
			}
			result.append(input.charAt(i));
		}
		return result.toString();
	}

	@Override
	public void log(String log) {
		
		addSpaces(log);
		System.out.println(addSpaces(log));
	}

	@Override
	public void error(String error) {
		
		addSpaces(error);
		System.out.println("ERROR: " + addSpaces(error));
	}

}
