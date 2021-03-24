package it.polito.tdp.corsi.model;

import java.util.List;
import java.util.Map;

import it.polito.tdp.corsi.db.CorsoDAO;

public class Model {
	
	private CorsoDAO corsoDao ;
	
	
	public Model() {
		corsoDao = new CorsoDAO();
	}
	
	
	
	public List<Corso> getCorsoByPeriodo(Integer pd){
		return corsoDao.getCorsoByPeriodo(pd);
	}
	
	
	public Map<Corso,Integer> getIscrittiiByPeriodo(Integer pd){
		return corsoDao.getIscrittiByPeriodo(pd);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
