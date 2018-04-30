package java_EE.ejb;

import java.util.List;

import javax.ejb.Local;

import domian.Exch;

@Local
public interface SearchLocal {
	
	public List<Exch> search(String exch);

}
