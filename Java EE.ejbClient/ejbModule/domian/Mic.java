package domian;

import java.io.Serializable;

public class Mic implements Serializable {
		
	
	private String mic;
	private String operating_mic;
	private String name;
	private String corp_exchange;
	
	
	
	public String getMic() {
		return mic;
	}
	public void setMic(String mic) {
		this.mic = mic;
	}
	public String getOperating_mic() {
		return operating_mic;
	}
	public void setOperating_mic(String operating_mic) {
		this.operating_mic = operating_mic;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCorp_exchange() {
		return corp_exchange;
	}
	public void setCorp_exchange(String corp_exchange) {
		this.corp_exchange = corp_exchange;
	}
	
}
