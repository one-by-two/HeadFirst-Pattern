import java.rmi.Naming;
import java.rmi.RemoteException;

public class MyRemoteClient {

	public static void main(String[] args) {
		new MyRemoteClient().go();
	}

	public void go() {
		try {
			MyRemote service = (MyRemote) Naming.lookup("rmi://10.192.32.12/RemoteHello");
			String string = service.sayHello();
			System.out.println(string);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
