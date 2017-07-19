package hello;

public class Greeting{
	private long id;
	private String content;
	
	public Greeting(long id, String c){
		this.id = id;
		this.content = c;
	}
	
	
	public long getId(){
		return this.id;
	}
	
	public void setId(long id){
		this.id = id;
	}
	
	public String getContent(){
		return this.content;
	}
	
	public void setContent(String c){
		this.content = c;
	}
	
}