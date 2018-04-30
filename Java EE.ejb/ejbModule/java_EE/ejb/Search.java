package java_EE.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import domian.Exch;
import java_EE.entity.Mapping_info;

/**
 * Session Bean implementation class Search
 */
@Stateless
public class Search implements SearchLocal {
	
	@PersistenceContext private EntityManager em;

    
    private Exch map(Mapping_info ex){
		Exch exch = new Exch();
		exch.setExch_code(ex.getExch_code());
		exch.setExch_name(ex.getExch_name());
		exch.setComposite_code(ex.getComposite_code());
		exch.setIso_country(ex.getIso_country());
		return exch;
	}

	@Override
	public List<Exch> search(String exch) {
		List<Exch> exchlist = new ArrayList<>();
		
		return exchlist;
	}

}
