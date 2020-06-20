package model;

public enum LEVEL {
	
	EASYMOD1("/model/ext/EASY.png"),
	MEDIUMMOD1("/model/ext/MEDIUM.png"),
	HARDMOD1("/model/ext/HARD.png");

	private String urlLevel;
	
	private LEVEL (String urlLevel) {
		this.urlLevel = urlLevel;
	}
	
	public String geturl(){
		return this.urlLevel;
		 
	}
}
