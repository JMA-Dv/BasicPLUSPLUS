package Tokens;

import Position.Position;
import Tokens.Tokens;

import java.util.ArrayList;

public class Tokenizer {

    private Tokens type;
    private String value;
    private Position positionStart;
    private Position positionEnd;

    public Tokenizer(Tokens type, String value, Position positionStart, Position positionEnd) {
        this.type = type;
        this.value = value;
        this.positionStart = positionStart;

    }

    public void check() {
        positionStart.copy();
        positionEnd = positionStart.copy();
        positionEnd.advance("N");
    }




}
