package viewmodel;

import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Model;
import model.Vinyl;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.security.spec.ECField;
import java.util.concurrent.ExecutionException;

public class ListVinylViewModel implements PropertyChangeListener {

	private ObservableList<SimpleVinylViewModel> list;
	private ObjectProperty<SimpleVinylViewModel> selectedExerciseProperty;
	private StringProperty errorProperty;
	private ViewState viewState;
	private Model model;

	public ListVinylViewModel(Model model, ViewState viewState) {
		this.model = model;
		this.viewState = viewState;
		this.list = FXCollections.observableArrayList();
		errorProperty = new SimpleStringProperty();
		selectedExerciseProperty = new SimpleObjectProperty<>();
		model.addListener(null,this);
		loadFromModel();
	}

	public ObservableList<SimpleVinylViewModel> getList(){
		return list;
	}

	public void loadFromModel(){
		list.clear();
		for (var ex : model.getAllVinyls()){
			list.add(new SimpleVinylViewModel(ex));
		}
	}

	public void setSelected(SimpleVinylViewModel simpleVinylViewModel){
		selectedExerciseProperty.set(simpleVinylViewModel);
	}

	public void borrow() throws Exception
	{
		try
		{
			errorProperty.set("");
			SimpleVinylViewModel selected = selectedExerciseProperty.get();
			viewState.setTitle(selected.titleProperty().get());
			viewState.borrow();
		}
		catch (Exception e)
		{
			errorProperty.set("No vinyl selected");
			throw new Exception(e);
		}

	}

	public void returnVinyl() throws Exception
	{
		try
		{
			errorProperty.set("");
			SimpleVinylViewModel selected = selectedExerciseProperty.get();
			viewState.setTitle(selected.titleProperty().get());
			viewState.setReturn();
		}
		catch (Exception e)
		{
			errorProperty.set("No vinyl selected");
			throw new Exception(e);
		}
	}

	public void reserve() throws Exception
	{
		try
		{
			errorProperty.set("");
			SimpleVinylViewModel selected = selectedExerciseProperty.get();
			viewState.setTitle(selected.titleProperty().get());
			viewState.setReserve();
		}
		catch (Exception e)
		{
			errorProperty.set("No vinyl selected");
			throw new Exception(e);
		}
	}

	public void remove() throws Exception
	{
		try
		{
			errorProperty.set("");
			SimpleVinylViewModel selected = selectedExerciseProperty.get();
			viewState.setTitle(selected.titleProperty().get());
			viewState.remove();
		}
		catch (Exception e)
		{
			errorProperty.set("No vinyl selected");
			throw new Exception(e);
		}

	}

	public StringProperty errorPropertyProperty() {
		return errorProperty;
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		loadFromModel();
	}
}
