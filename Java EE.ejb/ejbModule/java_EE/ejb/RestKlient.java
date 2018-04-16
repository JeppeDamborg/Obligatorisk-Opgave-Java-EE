package java_EE.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import domian.Papir;
import domian.PapirSamlet;

/**
 * Session Bean implementation class RestKlient
 */
@Stateless
public class RestKlient implements RestKlientLocal {
	private final String PATH = "https://api.openfigi.com/v1/mapping";
    private List<Papir> papirList;
    
    
    public List<Papir> search(Papir papir){
    	
    	Client client = ClientBuilder.newClient();
    	List<PapirSamlet> samletliste = new ArrayList<>();
    	PapirSamlet indput = new PapirSamlet();
    	indput.setIdType("ID_ISIN");
    	indput.setIdValue(papir.getId_ISIN());
    	indput.setCurrency(papir.getCurrency());
    	indput.setMicCode(papir.getMicCode());
    	samletliste.add(indput);
    	List<Papir> list = client.target(PATH).request(MediaType.APPLICATION_JSON).post(samletliste , new GenericType<List<Papir>>(){});
    			
    	
    }
    
    

}
