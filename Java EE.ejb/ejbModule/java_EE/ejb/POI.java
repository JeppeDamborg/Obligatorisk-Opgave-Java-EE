package java_EE.ejb;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java_EE.entity.Exchange_Code_Info;
import java_EE.entity.Mapping_info;




/**
 * Session Bean implementation class POI
 */
@Stateless
@LocalBean
public class POI implements POILocal{
	@PersistenceContext private EntityManager em;
	
	Exchange_Code_Info mic = new Exchange_Code_Info();
//	@Schedule(hour="*",minute="*",second="*/30")
//	@Schedule(hour="*",minute="*/4")
	public void readExcel() throws IOException {
		em.createNamedQuery("deleteMappingInfo").executeUpdate();
		em.createNamedQuery("deleteExchangeCode").executeUpdate();
		String url = "https://openfigi.com/assets/local/exchange-code-mic-mapping.xls";
		URL exchange = new URL(url);
		Workbook wb = new HSSFWorkbook(exchange.openStream());
		Sheet sheet = wb.getSheetAt(0);
		for (Row row : sheet) {
			System.out.println("");
//			for(int i = row.getFirstCellNum(); i<= row.getLastCellNum(); i++){
//				System.out.print(i + "-" + row.getCell(i) + " ");
//				
//			}
			if(row.getFirstCellNum() == 0 && row.getCell(0).toString() != ""){
				mic = new Exchange_Code_Info();
				mic.setMic(row.getCell(0).toString().trim());
				mic.setOperating_mic(row.getCell(1).toString().trim());
				mic.setName(row.getCell(2).toString().trim());
				mic.setCorp_exchange(row.getCell(3).toString().trim());
				em.persist(mic);
			}
			List<Exchange_Code_Info> mics = new ArrayList<>();
			mics.add(mic);
			Mapping_info exch = new Mapping_info();
			exch.setExch_code(row.getCell(4).toString().trim());
			if(row.getCell(5) != null){
				exch.setExch_name(row.getCell(5).toString().trim());
			}else{
				exch.setExch_name(""); 
			}
			exch.setComposite_code(row.getCell(6).toString().trim());
			exch.setIso_country(row.getCell(7).toString().trim());
			exch.setEx_code(mics);
			em.persist(exch);
		}
		wb.close();

	}
}