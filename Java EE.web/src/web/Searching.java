package web;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import domian.Papir;


@Named
@RequestScoped
public class Searching {

	
	private String id_Type;
	private String id_Value;
	private String currency;
	private String micCode;
	private List<Papir> papir;
	
	
	public String getId_Type() {
		return id_Type;
	}
	public void setId_Type(String id_Type) {
		this.id_Type = id_Type;
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
	public List<Papir> getPapir() {
		return papir;
	}
	public void setPapir(List<Papir> papir) {
		this.papir = papir;
	}
	public String getId_Value() {
		return id_Value;
	}
	public void setId_Value(String id_Value) {
		this.id_Value = id_Value;
	}
	
}
