package java_EE.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: Exchange_Code_Info
 *
 */
@Entity
@NamedQuery(name = "deleteExchangeCode", query = "DELETE FROM Exchange_Code_Info")

public class Exchange_Code_Info implements Serializable {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long mic_id;
	@NotNull
	//@Column(length = 4)
	private String mic;
	@NotNull
	//@Column(length = 4)
	private String operating_mic;
	@NotNull
	//@Column(length = 250)
	private String name;
	@NotNull
	//@Column(length = 50)
	private String corp_exchange;
	@ManyToMany(mappedBy="ex_code")
	private Collection <Mapping_info> map_info;
	private static final long serialVersionUID = 1L;

	public Exchange_Code_Info() {
		super();
	}

	public long getMic_id() {
		return mic_id;
	}

	public void setMic_id(long mic_id) {
		this.mic_id = mic_id;
	}

	public String getMic() {
		return mic;
	}

	public void setMic(String mic) {
		this.mic = mic;
	}

	public String getOperating_mic() {
		return operating_mic;
	}

	public void setOperating_mic(String operating_mic) {
		this.operating_mic = operating_mic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCorp_exchange() {
		return corp_exchange;
	}

	public void setCorp_exchange(String corp_exchange) {
		this.corp_exchange = corp_exchange;
	}

	public Collection<Mapping_info> getMap_info() {
		return map_info;
	}

	public void setMap_info(Collection<Mapping_info> map_info) {
		this.map_info = map_info;
	}
	
	
   
}
