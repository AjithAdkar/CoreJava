package singleton;

public class lazyinstantiation {
	
 private lazyinstantiation() {}
 private static volatile lazyinstantiation instance=null;
 public static lazyinstantiation getInstance() {
	  if (instance== null) {
		   synchronized (lazyinstantiation.class) {
			    if (instance== null) {
			    	instance= new lazyinstantiation();
			    }
		}
	  }
	 
	return instance;
	 
 }
	public static void main(String[] args) {
		System.out.println(lazyinstantiation.getInstance());
		System.out.println(lazyinstantiation.getInstance());
	}
}
