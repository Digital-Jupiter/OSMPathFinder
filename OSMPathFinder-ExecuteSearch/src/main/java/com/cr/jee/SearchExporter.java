package com.cr.jee;

public class SearchExporter {
	public SearchExporter(){
		
	}
	public boolean searchToGPX(SearchingProblem aux){
		try{
			aux.getCorrdenates();
			//Imprime mapa con las coordenadas
			return true;
		}catch(Exception e){
			return true;
		}
	}
	
}
