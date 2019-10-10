package Symbols;

import java.util.Hashtable;

public class SymbolTable {
    private Hashtable symbols;
    private Hashtable parent;

    public SymbolTable() {
        this.parent = null;
        symbols = new Hashtable();
    }

    public Hashtable getValue(String name){

        var value = symbols.getOrDefault( name,"");
        if (value == null && parent!=null)
            parent.get(name);

        return (Hashtable) value;
    }

    public void setValue(String name,String value){
        symbols.put(name,value);

    }

    public void remove(String name) {
        symbols.remove(name);
    }

}
