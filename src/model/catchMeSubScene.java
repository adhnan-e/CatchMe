package model;

import javafx.animation.TranslateTransition;
import javafx.scene.Parent;
import javafx.scene.SubScene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.util.Duration;

public class catchMeSubScene extends SubScene {
	
	private final static String FONT_PATH ="src/model/res/kenvector_future.ttf";
	private final static String BACKGROUND_IMAGE ="/model/res/blue_panel.png";

	private boolean isHidden;
	
	public catchMeSubScene() {
		super(new AnchorPane(), 700, 400);
		prefWidth(700);
		prefHeight(400);
		
		BackgroundImage image = new BackgroundImage(new Image(BACKGROUND_IMAGE,700,400,false,true),
				BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT,null);
		
		AnchorPane root2 =(AnchorPane) this.getRoot();
		
		root2.setBackground(new Background(image));
		
		isHidden = true;
		
		setLayoutX(1300);
		setLayoutY(140);
		// TODO Auto-generated constructor stub
	}
	
	public void moveSubScene() {
		TranslateTransition transition = new TranslateTransition();
		transition.setDuration(Duration.seconds(.3));
		transition.setNode(this);
		
		if(isHidden) {
		transition.setToX(-876);
		isHidden = false;
		} else {
			transition.setToX(0);
			isHidden = true;
		}
		transition.play();
	}
	
	public AnchorPane getPane() {
		return (AnchorPane) this.getRoot();
		
	}

}
