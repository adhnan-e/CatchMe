package model;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.text.Font;

public class helpLablel extends Label {
	
	public final static String FONT_PATH ="src/model/res/kenvector_future.ttf";
	public final static String BACKGROUND_IMAGE ="/view/res/blue_button03.png";
	
	
	public helpLablel(String text) {
		prefWidth(1);
		prefHeight(1);
		setText(text);
		setWrapText(true);
		setLabelFont();
		setAlignment(Pos.CENTER);
		
		
	}
	
	private void setLabelFont() {
		try {
		setFont(Font.loadFont(new FileInputStream(new File(FONT_PATH)),23));
		}catch (FileNotFoundException e) {
			setFont(Font.font("verdana",23));
			
		}
	}
}
	

