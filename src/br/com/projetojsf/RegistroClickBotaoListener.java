package br.com.projetojsf;

import javax.faces.bean.ManagedBean;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

@ManagedBean
public class RegistroClickBotaoListener implements ActionListener{

	@Override
	public void processAction(ActionEvent evento) throws AbortProcessingException {
		System.out.println("Clicando no bot�o : " + evento.getComponent().getId());
		
	}

}
