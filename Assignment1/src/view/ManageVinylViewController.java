package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import viewmodel.ManageVinylViewModel;

import java.awt.event.ActionEvent;

public class ManageVinylViewController
{
  private ViewHandler handler;
  private ManageVinylViewModel viewModel;
  private Region root;
  @FXML private Label headerLabel;
  @FXML private Label errorLabel;
  @FXML private TextField titleField;
  @FXML private TextField nameField;
  @FXML private Button submitButton;

  public void init (ViewHandler handler, ManageVinylViewModel viewModel, Region root)
  {
    this.handler = handler;
    this.viewModel = viewModel;
    this.root = root;
    headerLabel.textProperty().bindBidirectional(viewModel.getHeaderProperty());
    errorLabel.textProperty().bind(viewModel.getErrorProperty());
    titleField.textProperty().bind(viewModel.getTitleProperty());
    nameField.textProperty().bindBidirectional(viewModel.getNameProperty());
    titleField.setDisable(true);
    if (viewModel.getEditableProperty().get().equals(true))
    {
      nameField.setDisable(true);
    }
  }

  public void reset()
  {
    viewModel.reset();
  }

  public Region getRoot()
  {
    return root;
  }

  @FXML public void submitButton()
  {
    viewModel.accept();
    handler.openView("list");
  }

  @FXML public void cancelButton()
  {
    handler.openView("list");
  }

  @FXML public void onEnter (ActionEvent event)
  {
    if (event.getSource() == titleField)
    {
      nameField.requestFocus();
    }
    else if (event.getSource() == nameField)
    {
      submitButton.requestFocus();
    }
    else if (event.getSource() == submitButton)
    {
      submitButton();
    }
  }
}
