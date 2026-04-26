

public class Tile {
    int value;
    char letter;

    Tile(char letter , int value){
        this.letter = letter;
        this.value = value;
    }
    int getValue(){
        return value;
    }
    void setValue(int value){
        this.value = value;
    }
    char getLetter(){
        return letter;
    }
    void setLetter(char letter){
        this.letter = letter;
    }
    
    public void printTile(){
        System.out.println("letter = "+letter+" value = "+value);
    }
    public static void main(String[] args) {
        Tile t1 = new Tile('G',10);
        t1.printTile();
        t1.setLetter('h');
        t1.setValue(11);
        t1.printTile();
    }
}
