package User;

public class User {
	
	// Attribute
	private int userID;
	private String name;
	private String vorname;
	private String mail;
	private String userName;
	private String passwort;
	private int status;
	
	//Konstruktor
	public User(int userID, String name, String vorname, String mail, String userName, String passwort,
			int status) {
		super();
		this.userID = userID;
		this.name = name;
		this.vorname = vorname;
		this.mail = mail;
		this.userName = userName;
		this.passwort = passwort;
		this.status = status;
	}

	
	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPasswort() {
		return passwort;
	}

	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
