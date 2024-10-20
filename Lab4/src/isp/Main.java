package isp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crea un programa principal que permita invocar al método sendEmail de la clase
		//EmailSender con un objeto de la clase GmailAccount
		EmailContact ec = new Contact();
		GmailAccount ga = new GmailAccount("nombre", "dirEmail");
		ga.sendEmail(ec, "este sería el mensaje a enviar");
	}

}
