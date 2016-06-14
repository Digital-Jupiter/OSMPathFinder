package com.cr.jee;

public class CreateNewSearch {

	private String map;
	private String origin;
	private String destination;
	private String algorithm;
	private DownloadMap map_d;
	public CreateNewSearch(String map, String origin, String destination, String algorithm) {
		super();
		this.map = map;
		this.origin = origin;
		this.destination = destination;
		this.algorithm = algorithm;
		this.map_d = new DownloadMap(map);
	}
	public boolean isCorrect(){
		return !this.map.equals(null);
	}
	public void defineSearch(){
		this.map_d.downloadMapSelected();
		System.out.println("Define a search");
	}
	@Override
	public String toString() {
		return "CreateNewSearch [map=" + map + ", origin=" + origin + ", destination=" + destination + ", algorithm="
				+ algorithm + "]";
	}
	public String getMap() {
		return map;
	}
	public void setMap(String map) {
		this.map = map;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getAlgorithm() {
		return algorithm;
	}
	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}
	
}
