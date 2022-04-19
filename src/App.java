import java.io.*;
import java.util.*;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String AccessLocations[] = {"COM", "OUT", "STA", "BDR", "KIT", "LOU", "ENG", "BIO", "GRH", "NAV"};
        //arraylist holding ten rn; 0-9
       // Crew captain = new Crew ("Captain", "Abigail Conlin", "021102102201");
        Map<Integer, String> crewID = new HashMap<Integer, String>();
        ArrayList<Crew> members = new ArrayList<Crew>();
        Crew captain = new Crew("Captain","Abigail Conlin", "021102102201");
        members.add(captain); // captain == 0
        Crew engineer = new Crew("Head Engineer", "Xavier Llewellyn", "062889040422");
        members.add(engineer); // engineer == 1
        Crew navigator = new Crew("Navigator", "Quinn Warwick", "102203301120");
        members.add(navigator); // navigator == 2
        Crew physician = new Crew("Physician", "Odessa Holtz", "586932745896");
        members.add(physician); // physician == 3
        Crew biologist = new Crew("Biologist", "Artemis Dewitt", "125874693018");
        members.add(biologist); // biologist == 4
        Crew USER = new Crew("Crewmate", "[REDACTED]", "042020229786");
        members.add(USER); // USER == 5

        System.out.println(members);
        FileWriter logs = new FileWriter("Access.txt");
        logs.write("Files in java tricky but it ok");
        logs.close();
        System.out.println("done");



    }
}
