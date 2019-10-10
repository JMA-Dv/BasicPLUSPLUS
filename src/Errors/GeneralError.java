package Errors;

import Position.Position;

public class GeneralError {
    private Position positionStart;
    private Position positionEnd;
    private GeneralError errorName;
    private String details;

    public GeneralError(Position positionStart, Position positionEnd, GeneralError errorName, String details) {
        this.positionStart = positionStart;
        this.positionEnd = positionEnd;
        this.errorName = errorName;
        this.details = details;
    }

    public String asString(){
        String result = errorName +" : "+ details+"\n";

        return result;

    }

}
