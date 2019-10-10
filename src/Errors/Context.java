package Errors;

import Position.Position;

public class Context {
    private String displayName;
    private String parent;
    private Position position;

    public Context(String displayName, String parent, Position position) {
        this.displayName = displayName;
        this.parent = parent;
        this.position = position;
    }
}
