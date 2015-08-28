package threadsObserver;
import java.util.Observable;

public interface RandomUserObserver {
    
    //method to update the observer, used by subject
    public void update(Observable o, Object arg);
     
}
