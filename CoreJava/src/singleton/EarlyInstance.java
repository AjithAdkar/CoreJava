package singleton;

public class EarlyInstance {
	private static EarlyInstance instance= new EarlyInstance();
	public static EarlyInstance getInstance() { return instance;		}
	private EarlyInstance() {}
	public static void main(String[] args) {
		System.out.println(EarlyInstance.getInstance());
		System.out.println(EarlyInstance.getInstance());
	}

}
