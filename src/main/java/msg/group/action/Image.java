package msg.group.action;

import java.io.Serializable;

public class Image implements Serializable {
    private String name,path;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Image(String name, String path) {
        this.name = name;
        this.path = path;
    }
}
