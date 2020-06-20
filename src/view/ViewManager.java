package view;


import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.HBox;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import model.LEVEL;
import model.LevelPicker;
import model.catchMeButton;
import model.catchMeSubScene;
import model.crediteLabel;
import model.helpLablel;
import model.infoLabel;
import model.levelButton;

public class ViewManager {
    
    private static final int HEIGHT = 600;
    private static final int WIDTH = 1250;
    
    private AnchorPane mainPane;
    private Scene mainScene;
    private Stage mainStage;

private final static int MENU_BUTTONS_START_X = 80;
private final static int MENU_BUTTONS_START_Y = 150;

private catchMeSubScene credistsSubScene;
private catchMeSubScene helpSubScene;
private catchMeSubScene scoreSubScene;
private catchMeSubScene levelChooserScene;

private catchMeSubScene sceneToHide;

List<catchMeButton> menuButtons;

List<LevelPicker> levelList;

    public ViewManager(){
    	menuButtons =new ArrayList<>();
        mainPane = new AnchorPane();
        mainScene = new Scene(mainPane, WIDTH, HEIGHT);
        mainStage = new Stage();
        mainStage.setScene(mainScene);
        
        createSubScene();
        createButtons();
        createBackground();
        createLogo();
        extraImage();
        extranow();
        extranow2();
        extraTreeImage();
        
    }
    
    						//subscene start 
    
    private void showSubScene(catchMeSubScene subScene) {
    	if(sceneToHide != null) {
    		sceneToHide.moveSubScene();
    	}
    	
    	subScene.moveSubScene();
    	sceneToHide =subScene;
    }
    private void createSubScene() {
    	
    	credistsSubScene = new catchMeSubScene();
    	mainPane.getChildren().add(credistsSubScene);
    	
    	helpSubScene = new catchMeSubScene();
    	mainPane.getChildren().add(helpSubScene);
    	
    	scoreSubScene = new catchMeSubScene();
    	mainPane.getChildren().add(scoreSubScene);
    	
    	
    	createLevelChooserSubScene();
    	createHelpSubScene();
    	createCrediteSubScene();
    }
    
    private void createLevelChooserSubScene() {
		levelChooserScene = new catchMeSubScene();
		mainPane.getChildren().add(levelChooserScene);
		
		infoLabel chooseLevelLabel = new infoLabel("CHOOSE A LEVEL");
		chooseLevelLabel.setLayoutX(190);
		chooseLevelLabel.setLayoutY(25);
		levelChooserScene.getPane().getChildren().add(chooseLevelLabel);
		levelChooserScene.getPane().getChildren().add(createEasyBotton());
		levelChooserScene.getPane().getChildren().add(createMeadumBotton());
		levelChooserScene.getPane().getChildren().add(createHardBotton());
		createEasyBotton();
		
    }
    
   
    
    private catchMeButton createEasyBotton() {
    	catchMeButton easyButton = new catchMeButton("EASY");
    	easyButton.setLayoutX(250);
    	easyButton.setLayoutY(100);
    	return easyButton;
    	
    	
    }
    private catchMeButton createMeadumBotton() {
    	catchMeButton easyButton = new catchMeButton("NORMAL");
    	easyButton.setLayoutX(250);
    	easyButton.setLayoutY(200);
    	return easyButton;
    	
    	
    }
    private catchMeButton createHardBotton() {
    	catchMeButton easyButton = new catchMeButton("HARD");
    	easyButton.setLayoutX(250);
    	easyButton.setLayoutY(300);
    	return easyButton;
    	
    	
    }
    
    private void createHelpSubScene() {
    	helpSubScene = new catchMeSubScene();
		mainPane.getChildren().add(helpSubScene);
		
		helpLablel chooseLevelLabel2 = new helpLablel("\t\t\t\t\t Help\n\poda patty");
		chooseLevelLabel2.setLayoutX(80);
		chooseLevelLabel2.setLayoutY(45);
		helpSubScene.getPane().getChildren().add(chooseLevelLabel2);
    }
    private void createCrediteSubScene() {
    	credistsSubScene = new catchMeSubScene();
		mainPane.getChildren().add(credistsSubScene);
		
		crediteLabel chooseLevelLabel3 = new crediteLabel("vdjkf;  nirthi poda ");
		chooseLevelLabel3.setLayoutX(80);
		chooseLevelLabel3.setLayoutY(45);
		credistsSubScene.getPane().getChildren().add(chooseLevelLabel3);
		
    }

	public Stage getMainStage(){
        return mainStage;
    }
    
    private void addMenuButton(catchMeButton button) {
    	button.setLayoutX(MENU_BUTTONS_START_X);
    	button.setLayoutY(MENU_BUTTONS_START_Y + menuButtons.size() * 80);
    	menuButtons.add(button);
    	mainPane.getChildren().add(button);
    	
    	
    }
    
    private void createButtons(){
    	
    	createStartButton();
    	createScoreButton();
    	createHelpButton();
    	createCreditsButton();
    	createExitButton();
    }
    private void createStartButton() {
          
        catchMeButton startButton = new catchMeButton("PLAY");
        addMenuButton(startButton);
        startButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				showSubScene(levelChooserScene);
				
				
			}
        	
        });
       
}
    private void createScoreButton() {
        
        catchMeButton scoreButton = new catchMeButton("SCORE");
        addMenuButton(scoreButton);
        scoreButton.setOnAction(new EventHandler<ActionEvent>() {

 			@Override
 			public void handle(ActionEvent event) {
 				showSubScene(scoreSubScene);
 				
 				
 			}
         	
         });
        
       
}
  private void createHelpButton() {
        
        catchMeButton helpButton = new catchMeButton("HELP");
        addMenuButton(helpButton);
        helpButton.setOnAction(new EventHandler<ActionEvent>() {

 			@Override
 			public void handle(ActionEvent event) {
 				showSubScene(helpSubScene);
 				
 				
 			}
         	
         });
        
}
  private void createCreditsButton() {
      
      catchMeButton creditsButton = new catchMeButton("CREDITS");
      addMenuButton(creditsButton);
      
      creditsButton.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent arg0) {
			showSubScene(credistsSubScene);
			
		}
    	  
      });
     
}
  private void createExitButton() {
      
      catchMeButton exitButton = new catchMeButton("EXIT");
      addMenuButton(exitButton); 
      exitButton.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			mainStage.close();
			
		}
    	  
      });
     
}
    
    private void createBackground() {
    	Image backgroundImage = new Image("/view/res/background.png", 1250,600,false,true);
    	BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT,BackgroundPosition.DEFAULT,null);
    	mainPane.setBackground(new Background(background));
    }
    private void createLogo() {
    	ImageView logo = new ImageView("/view/res/catchmelogo.png");
    	logo.setLayoutX(500);
    	logo.setLayoutY(30);
    	
    	logo.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				logo.setEffect(new DropShadow());
				
			}
    });
    	
    	logo.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				logo.setEffect(null);
				
			}
    	});
    	
    	mainPane.getChildren().add(logo);
    	
    	}
    
    private void extraImage() {
    	ImageView extraPng = new ImageView("/view/res/foliageTree_04.png");
    	extraPng.setLayoutX(1100);
    	extraPng.setLayoutY(300);
    	
    	extraPng.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				extraPng.setEffect(new DropShadow());
				
			}
    });
    	
    	extraPng.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				extraPng.setEffect(null);
				
			}
    	});
    	
    	mainPane.getChildren().add(extraPng);
    	
    	}         
    private void extranow() {
    	ImageView extra1 = new ImageView("/view/ext/voxelTile_14.png");
    	extra1.setLayoutX(1100);
    	extra1.setLayoutY(30);
    	
    	extra1.setOnMouseEntered(new EventHandler<MouseEvent>() {
    		
			@Override
			public void handle(MouseEvent event) {
				
				extra1.setEffect(new DropShadow());
				
			}
			
    });
    	
    	extra1.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				extra1.setEffect(null);
				
			}
    	});
    	
    	mainPane.getChildren().add(extra1);
    	
    	}
    private void extranow2() {
    	ImageView extra1 = new ImageView("/view/ext/voxelTile_15.png");
    	extra1.setLayoutX(100);
    	extra1.setLayoutY(30);
    	
    	extra1.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				extra1.setEffect(new DropShadow());
				
				
			}
    });
    	
    	extra1.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				extra1.setEffect(null);
				
			}
    	});
    	
    	mainPane.getChildren().add(extra1);
    	
    	}
    private void extraTreeImage() {
    	ImageView extraPng = new ImageView("/view/res/giphy (2).gif");
    	extraPng.setLayoutX(300);
    	extraPng.setLayoutY(270);
    	
    	extraPng.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				extraPng.setEffect(new DropShadow());
				
			}
    });
    	
    	extraPng.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				extraPng.setEffect(null);
				
			}
    	});
    	
    	mainPane.getChildren().add(extraPng);
    	
    	}

    
}