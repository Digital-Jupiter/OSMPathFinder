package com.cr.jee;

import java.io.File;

public class MapDownloader {
	private String map_selected;
	private File file_map;
	public MapDownloader(String map_selected) {
		super();
		this.map_selected = map_selected;
	}
	public String getMap_selected() {
		return map_selected;
	}
	public void setMap_selected(String map_selected) {
		this.map_selected = map_selected;
	}
	public File getFile_map() {
		return file_map;
	}
	public void setFile_map(File file_map) {
		this.file_map = file_map;
	}
	@Override
	public String toString() {
		return "MapDownloader [map_selected=" + map_selected + ", file_map=" + file_map + "]";
	}
	public File downloadmap(String map_selected){
		System.out.println("Downloading map...");
		return this.file_map;
	}
}
