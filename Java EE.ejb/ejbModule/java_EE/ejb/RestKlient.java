package java_EE.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import domian.Data;
import domian.PapirSamlet;

/**
 * Session Bean implementation class RestKlient
 */
@Stateless
//@RolesAllowed("role1")
public class RestKlient implements RestKlientLocal {
	private final String PATH = "https://api.openfigi.com/v1/mapping";
    
    
    @Override
    public List<Data> search(PapirSamlet papir){
    	
    	Client client = ClientBuilder.newClient();
    	List<Data> list = client.target(PATH).request(MediaType.APPLICATION_JSON).post(Entity.entity(papir.toJson(), "text/json") , new GenericType<List<Data>>(){});
    	System.out.println("list size:" + list.size());
    	return list;		
    	
    }
    
    

}
