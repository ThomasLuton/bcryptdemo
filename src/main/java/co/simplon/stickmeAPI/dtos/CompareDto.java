package co.simplon.stickmeAPI.dtos;

public class CompareDto {

    private String hashToCompare;
    private String candidate;

    public String getHashToCompare() {
	return hashToCompare;
    }

    public void setHashToCompare(String hashToCompare) {
	this.hashToCompare = hashToCompare;
    }

    public String getCandidate() {
	return candidate;
    }

    public void setCandidate(String candidate) {
	this.candidate = candidate;
    }

    public CompareDto() {
	super();
	// TODO Auto-generated constructor stub
    }

}
