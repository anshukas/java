package tech.thread;

public class Resource {
	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	public String getTokenByUser(){
		if(token != null & token !="")
			return token;
		else
			return (this.token = "abc");
	}
}
