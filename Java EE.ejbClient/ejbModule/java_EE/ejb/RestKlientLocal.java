package java_EE.ejb;

import java.util.List;

import javax.ejb.Local;

import domian.Data;
import domian.PapirSamlet;

@Local
public interface RestKlientLocal {

	
	
	public List<Data> search(PapirSamlet papir);
}
