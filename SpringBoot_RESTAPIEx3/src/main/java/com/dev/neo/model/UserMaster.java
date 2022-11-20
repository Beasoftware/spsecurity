package com.dev.neo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usermst_tbl")
public class UserMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int uid;
	private String firstname;
	private String lastname;
	private String emailid;

	@OneToMany(cascade = CascadeType.ALL)
	private List<UserContact> usercontacts;

}// end class
