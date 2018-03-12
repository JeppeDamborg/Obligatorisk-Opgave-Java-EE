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

public class Exchange_Code_Info implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long mic_id;
	@NotNull
	@Column(length = 4)
	private String mic;
	@NotNull
	@Column(length = 4)
	private String operating_mic;
	@NotNull
	@Column(length = 250)
	private String name;
	@NotNull
	@Column(length = 50)
	private String corp_exchange;
	@ManyToMany
	@JoinTable(name = "Info_Keys", joinColumns = @JoinColumn(name = "mic_id", referencedColumnName = "mic_id"), inverseJoinColumns = @JoinColumn(name = "exch_id", referencedColumnName = "exch_id"))
	private Collection <Mapping_info> map_info;
	private static final long serialVersionUID = 1L;

	public Exchange_Code_Info() {
		super();
	}
   
}
