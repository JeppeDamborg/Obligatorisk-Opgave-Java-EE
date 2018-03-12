package java_EE.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Entity implementation class for Entity: Mapping_info
 *
 */
@Entity

public class Mapping_info implements Serializable {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long exch_id;
	@NotNull
	@Size(min=2)
	@Column(length = 2)
	private String exch_code;
	@NotNull
	@Size(min=2)
	@Column(length = 50)
	private String exch_name;
	@NotNull
	@Size(min=2)
	@Column(length = 2)
	private String composite_code;
	@NotNull
	@Size(min=2)
	@Column(length = 2)
	private String iso_country;
	@ManyToMany(mappedBy="map_info")
	private Collection<Exchange_Code_Info> ex_code;
	
	private static final long serialVersionUID = 1L;

	public Mapping_info() {
		super();
	}

	public long getExch_id() {
		return exch_id;
	}

	public void setExch_id(long exch_id) {
		this.exch_id = exch_id;
	}

	public String getExch_code() {
		return exch_code;
	}

	public void setExch_code(String exch_code) {
		this.exch_code = exch_code;
	}

	public String getExch_name() {
		return exch_name;
	}

	public void setExch_name(String exch_name) {
		this.exch_name = exch_name;
	}

	public String getComposite_code() {
		return composite_code;
	}

	public void setComposite_code(String composite_code) {
		this.composite_code = composite_code;
	}

	public String getIso_country() {
		return iso_country;
	}

	public void setIso_country(String iso_country) {
		this.iso_country = iso_country;
	}

	public Collection<Exchange_Code_Info> getEx_code() {
		return ex_code;
	}

	public void setEx_code(Collection<Exchange_Code_Info> ex_code) {
		this.ex_code = ex_code;
	}
   
}
