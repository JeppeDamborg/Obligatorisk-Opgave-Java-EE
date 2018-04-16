package domian;

import java.util.List;

public class Data {

	private List<Papir> data;
	private String error;

	public List<Papir> getData() {
		return data;
	}

	public void setData(List<Papir> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Data [data=" + data + ", error=" + error + "]";
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
}
