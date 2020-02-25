public class ShutDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Runtime run =Runtime.getRuntime();
			try {
				
				Process pro =run.exec("shutdown -s -t "+5);
			}
			catch(Exception e){
				System.out.println(e);
			}
			
	}

}