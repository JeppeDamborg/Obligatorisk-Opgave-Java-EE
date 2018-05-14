package web;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

import domian.Papir;
import domian.PapirSamlet;
import java_EE.ejb.POILocal;
import java_EE.ejb.RestKlientLocal;


@Named
@SessionScoped
public class Searching implements Serializable {
	
	@EJB RestKlientLocal ejb;
	@EJB POILocal poi;
	
	private String id_Type;
	private String id_Value;
	private String currency;
	private String micCode;
	private List<Papir> papirer;
	private Papir selectedPapir;
	
	
	
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
	public List<Papir> getPapirer() {
		return papirer;
	}
	public void setPapirer(List<Papir> papir) {
		this.papirer = papir;
	}
	public String getId_Value() {
		return id_Value;
	}
	public void setId_Value(String id_Value) {
		this.id_Value = id_Value;
	}
	
	public Papir getSelectedPapir() {
		return selectedPapir;
	}
	public void setSelectedPapir(Papir selectedPapir) {
		this.selectedPapir = selectedPapir;
	}
	
	public void search(){
		System.out.println("Search enter:");
		PapirSamlet samlet = new PapirSamlet();
		samlet.setIdType(id_Type);
		samlet.setIdValue(id_Value);
		samlet.setCurrency(currency);
		samlet.setMicCode(micCode);
		papirer = ejb.search(samlet).get(0).getData();
		if(papirer != null){
		System.out.println("papir.size" + papirer.size());
		}
	}
	
	public void readExcel() {
		try {
			poi.readExcel();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	
	//Hej Jeppe
}
