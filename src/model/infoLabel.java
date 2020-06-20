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

public class infoLabel extends Label {
	
	public final static String FONT_PATH ="src/model/res/kenvector_future.ttf";
	public final static String BACKGROUND_IMAGE ="/view/res/yellow_button05.png";
	
	
	public infoLabel(String text) {
		prefWidth(190);
		prefHeight(49);
		setText(text);
		setWrapText(true);
		setLabelFont();
		setAlignment(Pos.CENTER);
		
		BackgroundImage backgroundImage = new BackgroundImage(new Image(BACKGROUND_IMAGE, 400, 49, false, true), BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT,null);
		setBackground(new Background(backgroundImage));
	}
	
	private void setLabelFont() {
		try {
		setFont(Font.loadFont(new FileInputStream(new File(FONT_PATH)),28));
		}catch (FileNotFoundException e) {
			setFont(Font.font("verdana",23));
			
		}
	}
}
	

