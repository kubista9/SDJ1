package external;

import java.beans.PropertyChangeListener;

public interface NamedPropertySubject {
  void addListener(String propertyName, PropertyChangeListener listener);
  void removeListener(String propertyName, PropertyChangeListener listener);
}
