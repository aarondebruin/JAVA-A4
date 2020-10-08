package Oefenopdracht3;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
public class Model{
    int counter = 0;
    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    public Model() {
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.addPropertyChangeListener(listener);
    }
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.removePropertyChangeListener(listener);
    }
    public void increase(){
        int oldValue = counter;
        counter++;

        this.pcs.firePropertyChange("counter", oldValue, counter);
    }

    public Integer getCounter(){
        return counter;
    }}