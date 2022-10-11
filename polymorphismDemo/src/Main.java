
public class Main {

	public static void main(String[] args) {
//		BaseLogger [] loggers = new BaseLogger[] {new FileLogger(),new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
//		for (BaseLogger baseLogger : loggers) {
//			baseLogger.Log("Log mesajý");
//		}

		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}
