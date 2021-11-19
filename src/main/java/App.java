import org.apache.log4j.*;

public class App {

	private static Zoo zoo;
	private static final Logger logger = LogManager.getLogger(App.class);
	

	
	public static void main(String[] args) {
		zoo = new Zoo();
		System.out.println("Test");
		logger.info("Application run successfully");
	}
	
	public static Zoo getZoo() {
		return zoo;
	}
}
