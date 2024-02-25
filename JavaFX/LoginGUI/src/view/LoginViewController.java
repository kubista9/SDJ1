package view;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import model.LoginModel;
import javax.swing.plaf.synth.Region;
import java.awt.*;
import model.*;

public class LoginViewController {

	@FXML
	private TextField inputField;
	@FXML private PasswordField passwordField;
	@FXML private Label label;
	private Region root;
	private LoginModel model;

	private ViewHandler viewHandler;

	public LoginViewController(){}

	public void init(ViewHandler viewHandler, LoginModel model, Region root){
		this.viewHandler = viewHandler;
		this.model = model;
		this.root = root;
	}

	public void reset(){
		inputField.setText("");
		label.setText("");
	}

	public Region getRoot(){
		return root;
	}

	@FXML private void loginButtonPressed(){
		viewHandler.closeView();
	}

	@FXML private void cancelButtonPressed(){
		try {
			model.login(inputField.getText(), passwordField.getText());
		}
		catch (IllegalArgumentException e){
			System.out.println("");
		}
	}

	public void init(ViewHandler viewHandler, LoginModel model, javafx.scene.layout.Region root) {
	}
}
