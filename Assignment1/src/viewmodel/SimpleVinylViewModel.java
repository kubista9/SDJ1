package viewmodel;

import javafx.beans.property.*;
import model.Vinyl;
import viewmodel.ListVinylViewModel;

public class SimpleVinylViewModel {
	private StringProperty titleProperty;
	private StringProperty artistProperty;
	private StringProperty stateProperty;
	private IntegerProperty yearProperty;
	public SimpleVinylViewModel(Vinyl vinyl)
	{
		titleProperty = new SimpleStringProperty(vinyl.getTitle());
		artistProperty = new SimpleStringProperty(vinyl.getArtist());
		stateProperty = new SimpleStringProperty(vinyl.getStatus());
		yearProperty = new SimpleIntegerProperty(vinyl.getYear());
	}

	public StringProperty titleProperty() {
		return titleProperty;
	}

	public void setTitleProperty(StringProperty titleProperty) {
		this.titleProperty = titleProperty;
	}

	public int getYearProperty() {
		return yearProperty.get();
	}

	public IntegerProperty yearPropertyProperty() {
		return yearProperty;
	}

	public String getArtistProperty() {
		return artistProperty.get();
	}

	public StringProperty artistPropertyProperty() {
		return artistProperty;
	}

	public String getStateProperty() {
		return stateProperty.get();
	}

	public StringProperty statePropertyProperty() {
		return stateProperty;
	}
}
