package com.cr.jee;

public class DownloadMap {
	private String map_select;

	public DownloadMap(String map_select) {
		super();
		this.map_select = map_select;
	}

	public String getMap_select() {
		return map_select;
	}

	public void setMap_select(String map_select) {
		this.map_select = map_select;
	}

	@Override
	public String toString() {
		return "DownloadMap [map_select=" + map_select + "]";
	}
	public void downloadMapSelected(){
		MapDownloader aux = new MapDownloader(this.map_select);
		aux.downloadmap(this.map_select);
		System.out.println("Mapa descargado");
	}
	
}
