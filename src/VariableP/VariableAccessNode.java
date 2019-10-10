package VariableP;

import Position.Position;

public class VariableAccessNode {
    private String variableName;
    private Position positionStart;
    private Position positionEnd;

    public VariableAccessNode(String variableName, Position positionStart, Position positionEnd) {
        this.variableName = variableName;
        this.positionStart = positionStart;
        this.positionEnd = positionEnd;
    }



}
