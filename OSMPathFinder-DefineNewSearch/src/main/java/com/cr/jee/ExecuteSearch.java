package com.cr.jee;

public class ExecuteSearch {
	private DownloadMap map_p;
	private SearchingProblem search_map;
	public ExecuteSearch(DownloadMap map_p) {
		super();
		this.map_p = map_p;
		this.search_map=new SearchingProblem();
	}
	public void executeasearch(){
		this.search_map.calculateSearch();
	}
	public DownloadMap getMap_p() {
		return map_p;
	}
	public void setMap_p(DownloadMap map_p) {
		this.map_p = map_p;
	}

	@Override
	public String toString() {
		return "ExecuteSearch [map_p=" + map_p + "]";
	}
	
}
