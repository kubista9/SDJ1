package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Region;
import model.LoginModel;

public class ViewHandler {
	private Scene currentScene;
	private Stage primaryStage;
	private LoginModel model;
	private LoginViewController controller;

	public ViewHandler(){
		this.currentScene = new Scene(new Region());
		this.primaryStage = null;
		this.model = model;
	}

	public void start(Stage primaryStage){
		this.primaryStage= primaryStage;
		openView();
	}

	public void openView(){
		Region root = loadLoginView("LoginView.fxml");
		currentScene.setRoot(root);
		String title = "";

		if (root.getUserData() != null){
			title += root.getUserData();
		}

		primaryStage.setTitle(title);
		primaryStage.setScene(currentScene);
		primaryStage.setWidth(root.getPrefWidth());
		primaryStage.setHeight(root.getPrefHeight());
		primaryStage.show();
	}

	private Region loadLoginView(String fxmlFile){
		Region root = null;
		if (controller == null) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource(fxmlFile));
				root = loader.load();
				controller = loader.getController();
				controller.init(this, model, root);
			}

			catch (Exception e) {
				e.printStackTrace();
			}
		}
		return root;
	}

	public void closeView(){
		primaryStage.close();
	}

}
