package com.nyi.help;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.ApplicationException;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class CpformDetails implements Serializable {
	private static final long serialVersionUID = 1L;
	private Cpform cp;
	
	@PostConstruct
	public void init() {
		cp=new  Cpform();
	}
	
	public String  save() {
		return "/result?faces-redirect=true";
	}
	public Cpform getCp() {
		return cp;
	}
	public void setCp(Cpform cp) {
		this.cp = cp;
	}
	
}
