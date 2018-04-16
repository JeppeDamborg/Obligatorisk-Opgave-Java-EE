package domian;

import java.io.Serializable;

public class Papir implements Serializable {

	private String id_ISIN;
	private String currency;
	private String micCode;
	private String ticker;
	private String name;
	private String exchangeCode;

	public String getId_ISIN() {
		return id_ISIN;
	}

	public void setId_ISIN(String id_ISIN) {
		this.id_ISIN = id_ISIN;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getMicCode() {
		return micCode;
	}

	public void setMicCode(String micCode) {
		this.micCode = micCode;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExchangeCode() {
		return exchangeCode;
	}

	public void setExchangeCode(String exchangeCode) {
		this.exchangeCode = exchangeCode;
	}

}
