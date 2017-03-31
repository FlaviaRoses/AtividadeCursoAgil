package br.com.mundodosfilmes.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class DefaultController {
	private String oiMundo = "Oi mundo!!!";

	public String getOiMundo() {
		return oiMundo;
	}

	public void setOiMundo(String oiMundo) {
		this.oiMundo = oiMundo;
	}
}
