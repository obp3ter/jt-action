package msg.group.action;

import java.io.Serializable;
import java.util.List;

public class Request implements Serializable {
    private List<Image> uris;
    private String action;

    public List<Image> getUris() {
        return uris;
    }

    public void setUris(List<Image> uris) {
        this.uris = uris;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Request(List<Image> uris, String action) {
        this.uris = uris;
        this.action = action;
    }

    public Request(){}
}
