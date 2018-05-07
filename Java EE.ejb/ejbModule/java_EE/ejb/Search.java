package java_EE.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import domian.Exch;
import domian.Mic;
import java_EE.entity.Exchange_Code_Info;
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
    
    private Mapping_info map(Exch mi) {
    	Mapping_info mapping_info = new Mapping_info();
    	mapping_info.setExch_code(mi.getExch_code());
    	mapping_info.setExch_name(mi.getExch_name());
    	mapping_info.setComposite_code(mi.getComposite_code());
    	mapping_info.setIso_country(mi.getIso_country());
    	return mapping_info;
    }
    
    private Mic map(Exchange_Code_Info mc) {
    	Mic mic = new Mic();
    	mic.setMic(mc.getMic());
    	mic.setName(mc.getName());
    	mic.setOperating_mic(mc.getOperating_mic());
    	mic.setCorp_exchange(mc.getCorp_exchange());
    	return mic;
    }
    
    Exchange_Code_Info map(Mic eci) {
    	Exchange_Code_Info exchange_Code_Info = new Exchange_Code_Info();
    	exchange_Code_Info.setMic(eci.getMic());
    	exchange_Code_Info.setName(eci.getName());
    	exchange_Code_Info.setOperating_mic(eci.getOperating_mic());
    	exchange_Code_Info.setCorp_exchange(eci.getCorp_exchange());
    	return exchange_Code_Info;
    }

	@Override
	public List<Exch> search(String exch) {
		List<Exch> exchlist = new ArrayList<>();		
		@SuppressWarnings("unchecked")
		List<Mapping_info> list = em.createNamedQuery("SearchPaper").setParameter("exch_code", exch).getResultList();
		for (Mapping_info mi: list) {
			exchlist.add(map(mi));
		}
		return exchlist;
	}

}
