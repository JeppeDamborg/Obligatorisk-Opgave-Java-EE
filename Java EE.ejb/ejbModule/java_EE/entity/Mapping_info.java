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
   
}
