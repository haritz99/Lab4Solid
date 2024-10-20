package isp;

public class GmailAccount extends EmailSender{
	 String name, emailAddress;
	
	 public GmailAccount(String name, String emailAddress) {
		 this.name = name;
		 this.emailAddress = emailAddress;
	 }
	 
	 public void setName(String n) { name=n; }
	 public String getName() { return name; }
	 
	 public void setEmailAddress(String ea) { emailAddress=ea; }
	 public String getEmailAddress() { return emailAddress; }
	 
	 public static void sendEmail(EmailContact c, String message) {
		 EmailSender.sendEmail(c, message);
	 }
}
