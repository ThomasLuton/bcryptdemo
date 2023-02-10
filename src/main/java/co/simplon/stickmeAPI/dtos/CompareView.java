package co.simplon.stickmeAPI.dtos;

public class CompareView {

    private String hashToCompare;
    byte[] hashFromCandidate;
    private boolean match;

    public CompareView() {
	super();
	// TODO Auto-generated constructor stub
    }

    public String getHashToCompare() {
	return hashToCompare;
    }

    public void setHashToCompare(String hashToCompare) {
	this.hashToCompare = hashToCompare;
    }

    public byte[] getHashFromCandidate() {
	return hashFromCandidate;
    }

    public void setHashFromCandidate(
	    byte[] hashFromCandidate) {
	this.hashFromCandidate = hashFromCandidate;
    }

    public boolean isMatch() {
	return match;
    }

    public void setMatch(boolean match) {
	this.match = match;
    }

}
