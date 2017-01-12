package nyc.c4q.josegonzalez.test11117.Model;

import java.util.List;

/**
 * Created by mathcore on 1/11/17.
 */

public class Success {

    private boolean success;
    private List<AvailableKey> availableKeys = null;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<AvailableKey> getAvailableKeys() {
        return availableKeys;
    }

    public void setAvailableKeys(List<AvailableKey> availableKeys) {
        this.availableKeys = availableKeys;
    }
}
