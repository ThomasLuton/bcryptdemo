package co.simplon.stickmeAPI.dtos;

public class GenerateView {

    private String hash;
    private String salt;

    public String getHash() {
	return hash;
    }

    public void setHash(String hash) {
	this.hash = hash;
    }

    public String getSalt() {
	return salt;
    }

    public void setSalt(String salt) {
	this.salt = salt;
    }

    public GenerateView() {
	super();
	// TODO Auto-generated constructor stub
    }

}
