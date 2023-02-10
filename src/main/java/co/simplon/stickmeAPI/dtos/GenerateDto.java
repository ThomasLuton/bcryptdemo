package co.simplon.stickmeAPI.dtos;

public class GenerateDto {

    private String password;
    private int cost;

    public GenerateDto() {
	super();
	// TODO Auto-generated constructor stub
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public int getCost() {
	return cost;
    }

    public void setCost(int cost) {
	this.cost = cost;
    }

    @Override
    public String toString() {
	return "{password=" + password + ", cost=" + cost
		+ "}";
    }

}
