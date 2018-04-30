package web;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

import domian.Papir;
import domian.PapirSamlet;
import java_EE.ejb.RestKlientLocal;


@Named
@RequestScoped
@ManagedBean(name="dtSelectionView")
public class Searching {
	
	@EJB RestKlientLocal ejb;
	
	private String id_Type;
	private String id_Value;
	private String currency;
	private String micCode;
	private List<Papir> papir;
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
		papir = ejb.search(samlet).get(0).getData();
	}
	
	public void onRowSelect(SelectEvent event) {
        FacesMessage msg = new FacesMessage("Car Selected", ((Papir) event.getObject()).getId_ISIN());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
 
    public void onRowUnselect(UnselectEvent event) {
        FacesMessage msg = new FacesMessage("Car Unselected", ((Papir) event.getObject()).getId_ISIN());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
	
	
}
