package domian;

import java.io.Serializable;

public class Papir implements Serializable {

	private String id_ISIN;
	private String currency;
	private String micCode;
	private String ticker;
	private String name;
	private String exchCode;
	private String error;
	private String figi;
	private String securityType;
	private String marketSector;
	private String uniqueID;
	private String shareClassFIGI;
	private String compositeFIGI;
	private String securityType2;
	private String securityDescription;
	private String uniqueIDFutOpt;
	

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

	public String getExchCode() {
		return exchCode;
	}

	public void setExchCode(String exchangeCode) {
		this.exchCode = exchangeCode;
	}

	@Override
	public String toString() {
		return "Papir [id_ISIN=" + id_ISIN + ", currency=" + currency + ", micCode=" + micCode + ", ticker=" + ticker
				+ ", name=" + name + ", exchCode=" + exchCode + ", error=" + error + ", figi=" + figi
				+ ", securityType=" + securityType + ", marketSector=" + marketSector + ", uniqueID=" + uniqueID
				+ ", shareClassFIGI=" + shareClassFIGI + ", compositeFIGI=" + compositeFIGI + ", securityType2="
				+ securityType2 + ", securityDescription=" + securityDescription + ", uniqueIDFutOpt=" + uniqueIDFutOpt
				+ "]";
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getFigi() {
		return figi;
	}

	public void setFigi(String figi) {
		this.figi = figi;
	}

	public String getSecurityType() {
		return securityType;
	}

	public void setSecurityType(String securityType) {
		this.securityType = securityType;
	}

	public String getMarketSector() {
		return marketSector;
	}

	public void setMarketSector(String marketSector) {
		this.marketSector = marketSector;
	}

	public String getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}

	public String getShareClassFIGI() {
		return shareClassFIGI;
	}

	public void setShareClassFIGI(String shareClassFIGI) {
		this.shareClassFIGI = shareClassFIGI;
	}

	public String getCompositeFIGI() {
		return compositeFIGI;
	}

	public void setCompositeFIGI(String compositeFIGI) {
		this.compositeFIGI = compositeFIGI;
	}

	public String getSecurityType2() {
		return securityType2;
	}

	public void setSecurityType2(String securityType2) {
		this.securityType2 = securityType2;
	}

	public String getSecurityDescription() {
		return securityDescription;
	}

	public void setSecurityDescription(String securityDescription) {
		this.securityDescription = securityDescription;
	}

	public String getUniqueIDFutOpt() {
		return uniqueIDFutOpt;
	}

	public void setUniqueIDFutOpt(String uniqueIDFutOpt) {
		this.uniqueIDFutOpt = uniqueIDFutOpt;
	}

}
