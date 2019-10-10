package Position;

public class Position {
    private int  index;
    private int line;
    private int column;
    private String fileName;
    private String fileText;

    public Position(int index, int line, int column, String fileName, String fileText) {
        this.index = index;
        this.line = line;
        this.column = column;
        this.fileName = fileName;
        this.fileText = fileText;
    }

    public Position advance(String currentChar){
        index+=1;
        column+=1;
        if (currentChar.equals("N")){
            line++;
            column=0;
        }
        return this;
    }


    public Position copy(){
        return new Position(index,line,column,fileName,fileText);
    }


}
