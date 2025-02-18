import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class XMLReader {
    public static List<Evenimente> einlesenXML(String dateipfad) {
        List<Evenimente> evenimente = new ArrayList<>();
        try {
            File xmlFile = new File(dateipfad);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(xmlFile);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("log");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    int id = Integer.parseInt(element.getElementsByTagName("Id").item(0).getTextContent());
                    String held = element.getElementsByTagName("Held").item(0).getTextContent();
                    String antagonist = element.getElementsByTagName("Antagonist").item(0).getTextContent();
                    //String konfrontationsTyp = element.getElementsByTagName("KonfrontationsTyp").item(0).getTextContent();
                    String ort = element.getElementsByTagName("Ort").item(0).getTextContent();
                    LocalDate datum = LocalDate.parse(element.getElementsByTagName("Datum").item(0).getTextContent());
                    double globalerEinfluss = Double.parseDouble(element.getElementsByTagName("GlobalerEinfluss").item(0).getTextContent());

                    evenimente.add(new Evenimente(id, held, antagonist,  ort, datum, globalerEinfluss));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return evenimente;
    }
}

