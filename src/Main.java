import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //a) XML-Datei einlesen
        List<Evenimente> evenimente = XMLReader.einlesenXML("src/marvel_konfrontationen.xml");
    }
}