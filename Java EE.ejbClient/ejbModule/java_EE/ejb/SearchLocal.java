package java_EE.ejb;

import java.util.List;

import javax.ejb.Local;

import domian.Mic;

@Local
public interface SearchLocal {
	
	public List<Mic> search(String exch);

}
