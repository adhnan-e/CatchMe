package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class crediteLabel extends Label  {
	public final static String FONT_PATH ="src/model/res/kenvector_future.ttf";
	
	
	
	public crediteLabel(String text) {
		prefWidth(400);
		prefHeight(49);
		setText(text);
		setWrapText(true);
		setLabelFont();
		setAlignment(Pos.CENTER);
		
	
	}
	
	private void setLabelFont() {
		try {
		setFont(Font.loadFont(new FileInputStream(new File(FONT_PATH)),18));
		}catch (FileNotFoundException e) {
			setFont(Font.font("verdana",23));
			
		}
	}
}
