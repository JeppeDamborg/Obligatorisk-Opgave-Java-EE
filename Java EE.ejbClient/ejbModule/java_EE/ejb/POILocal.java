package java_EE.ejb;

import java.io.IOException;

import javax.ejb.Local;

@Local
public interface POILocal {
	public void readExcel() throws IOException;
}
