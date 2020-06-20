package model;

import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class LevelPicker extends VBox{
	
	private ImageView circleImage;
	private ImageView levelImage;
	
	private String circleNotChoosen ="view/res/ns.png";
	private String circleChoosen ="view/res/s.png";
	
	private LEVEL level;
	
	private boolean isCircleChoosen;
	
	public LevelPicker(LEVEL level) {
		circleImage = new ImageView(circleNotChoosen);
		levelImage = new ImageView(level.geturl());
		this.level = level;
		isCircleChoosen =false;
		this.setAlignment(Pos.CENTER);
		this.setSpacing(20);
		this.getChildren().add(circleImage);
		this.getChildren().add(levelImage);
	}
	
	public LEVEL getlevel() {
		return level;
		
	}
	
	public boolean getIsCircleChoosen() {
		return isCircleChoosen;
		
	}
	
	public void setIsCircleChoosen(boolean isCircleChoosen) {
		this.isCircleChoosen =isCircleChoosen;
		String imageToSet = this.isCircleChoosen ? circleChoosen : circleNotChoosen;
		circleImage.setImage(new Image(imageToSet));
		
	}
	}
	
	
