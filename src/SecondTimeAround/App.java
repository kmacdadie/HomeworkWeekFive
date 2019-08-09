package SecondTimeAround;

public class App {
	
public static void main(String[] args) {
		
		Logger logger = new SpacedLogger();
		
		logger.log("Keith");
		
		logger.error("MacIlroy");
		
		Logger logger1 = new AsterriskLogger();
		
		logger1.log("Brantley");
		
		logger1.error("Megan");

	}

}
