package ocp;

public class AuthService {

	public boolean signIn(Service service, String log, String pass) {
		return service.signInService(log, pass);
	}

}
