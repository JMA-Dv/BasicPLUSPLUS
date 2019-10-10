package VariableP;

import Position.Position;

public class VariableAssignNode {

    private String variableNameToken;
    private String valueNode;
    private Position positionStart;
    private Position positionEnd;

    public VariableAssignNode(String variableNameToken, String valueNode, Position positionStart, Position positionEnd) {
        this.variableNameToken = variableNameToken;
        this.valueNode = valueNode;
        this.positionStart = positionStart;
        this.positionEnd = positionEnd;
    }
}
