package web;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import domian.Exch;
import domian.Mic;
import domian.Papir;
import domian.PapirSamlet;
import java_EE.ejb.POILocal;
import java_EE.ejb.RestKlientLocal;
import java_EE.ejb.SearchLocal;


@Named
@SessionScoped
public class Searching implements Serializable {
	
	@EJB RestKlientLocal ejb;
	@EJB POILocal poi;
	@EJB SearchLocal sl;
	
	private String id_Type;
	private String id_Value;
	private String currency;
	private String micCode;
	private List<Papir> papirer;
	private Papir selectedPapir;
	private List<Mic> mics;
	private Mic mic;
	private Exch exch;
	
	
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
	
	public void searchEx(){
		try {
			System.out.println("Felt trykket " + selectedPapir.getExchCode());			
			mics = sl.search(selectedPapir.getExchCode());	
			if (mics.size() > 0) {
				mic = mics.get(0);
			} else  {
				mic = null;
			}
			if (mics != null) {
			System.out.println("Succes på " + mics.size());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public List<Mic> getMics() {
		return mics;
	}
	public void setMics(List<Mic> mics) {
		this.mics = mics;
	}
	public Mic getMic() {
		return mic;
	}
	public void setMic(Mic mic) {
		this.mic = mic;
	}
	public Exch getExch() {
		return exch;
	}
	public void setExch(Exch exch) {
		this.exch = exch;
	}
	
	//Hej Jeppe
}
