import java.io.*;
import java.util.*;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Loc> locations = new ArrayList<Loc>();
        /** 
        //com == 0
        //nav == 1
        //out == 2
        //sta == 3
        //kit == 4
        //lou == 5
        //eng == 6
        //bio == 7
        //grh == 8
        */
        ArrayList<Crew> members = new ArrayList<Crew>();
        /**
        //captain == 0
        // engineer == 1
        // navigator == 2
        // physician == 3
        // biologist == 4
        // USER == 5
        */
        InitializeAll(locations, members);   

        System.out.println(members + "\n" + locations + "\n");
        // System.out.println((AccessLocations.toString()));
        // FileWriter logs = new FileWriter("Access.txt");
        // logs.write("ACCESS:" + location + ";USERID:" + id
            // + ";DATE:" + date + ";TIME:" + time);
        // logs.close();

        System.out.println("done");

        //Date and time will be determined throuugh a for-loop
        //days and hours. 42 days. 12 hours per day (8 hours for rest)
        //will do one run with normal crew, then runs with past crews

        //Step 1 : choose a location and crew member
        Map<String, Crew> acc_crew = GetAccessLogs(locations, members);
        // System.out.println("ACCESS:" + loc + ";USERID:" + crew.ID);
        //dont forget to generate the separate log for that location as well
       System.out.println(acc_crew.keySet()); 


    }
    static Map<String, Crew> GetAccessLogs(ArrayList<Loc> locations, ArrayList<Crew> members){

        int random = (int)(Math.random()*((locations.size()-1) - 0 + 1) + 0);
        String loc = locations.get(random).abriv;
        Crew crew; 
        //compare loc to possible crew
        switch(loc){
            case "COM"://coms
            case "LOU"://lounge
            case "KIT"://kitchen
            {
                int r = (int)(Math.random()*((members.size()-1) - 0 + 1) + 0);
                crew = members.get(r);
                break;
            }
            case "NAV"://nav
            {
                crew = members.get(2); //navigator
                break;

            }
            case "ENG"://engine
            {
                crew = members.get(1); //engineer
                break;

            }
            case "GRH": //greenhouse
            {
                crew = members.get(4); //biologist
                break;

            }
            case "BIO": //physicians
            {
                crew = members.get(3); //physician
                break;

            }
            default://either the Space station or the Outside door lock
            {
                int r = (int)(Math.random()*(3 - 0 + 1) + 0);
                //if engineer does it (1) then its fine, but there are suspicious things
                //others may do
                crew = members.get(r);
                break;

            }
        }
       
        //now loc == location and you have the crew member who logged
        Map<String, Crew> s = new HashMap<>();
        s.put(loc, crew);

        // String s = "ACCESS:" + loc + ";USERID:" + crew.ID;
        Loc place = locations.get(random);



        return s;

    }
    
    static void InitializeAll(ArrayList<Loc> locations, ArrayList<Crew> members){

        Loc Com = new Loc("Communications", "COM");
        Loc Nav = new Loc("Navigation", "NAV");
        Loc Out = new Loc("Outside Door", "OUT");
        Loc Sta = new Loc("Station on Earth", "STA");
        Loc Kit = new Loc("Kitchen", "KIT");
        Loc Lou = new Loc("Lounge", "LOU");
        Loc Eng = new Loc("Engine", "ENG");
        Loc Bio = new Loc("Physician Office", "BIO");
        Loc Grh = new Loc("GreenHouse", "GRH");
        // Loc Bdr = new Loc("Bedroom", "BDR");

        locations.add(Com); //com == 0
        locations.add(Nav); //nav == 1
        locations.add(Out); //out == 2
        locations.add(Sta); //sta == 3
        locations.add(Kit); //kit == 4
        locations.add(Lou); //lou == 5
        locations.add(Eng); //eng == 6
        locations.add(Bio); //bio == 7
        locations.add(Grh); //grh == 8
        // locations.add(Bdr); //bdr == 


        // String AccessLocations[] = {"COM", "OUT", "STA", "BDR", "KIT", "LOU", "ENG", "BIO", "GRH", "NAV"};
        //arraylist holding ten rn; 0-9
       // Crew captain = new Crew ("Captain", "Abigail Conlin", "021102102201");
        // Map<Integer, String> crewID = new HashMap<Integer, String>();

        Crew captain = new Crew("Captain","Abigail Conlin", "021102102201", "Great work! Let's get these colonists to their new homes.");
        members.add(captain); // captain == 0
        Crew engineer = new Crew("Head Engineer", "Xavier Llewellyn", "062889040422", "Ship is purring like a kitten!!");
        members.add(engineer); // engineer == 1
        Crew navigator = new Crew("Navigator", "Quinn Warwick", "102203301120", "Our path is clear, route on schedule.");
        members.add(navigator); // navigator == 2
        Crew physician = new Crew("Physician", "Odessa Holtz", "586932745896", "Crew is healthy.");
        members.add(physician); // physician == 3
        Crew biologist = new Crew("Biologist", "Artemis Dewitt", "125874693018", "My babies are growing into beautiful sprouts!");
        members.add(biologist); // biologist == 4
        Crew USER = new Crew("Crewmate", "[REDACTED]", "042020229786", "----------------- :)");
        members.add(USER); // USER == 5
    }

    static void LocationLog(Loc loc, Crew crew){
       
        switch(loc.abriv){
            case "COM"://coms
            {

                break;
            }
            case "LOU"://lounge
            {

                break;
            }
            case "KIT"://kitchen
            {
               
               
                break;
            }
            case "NAV"://nav
            {
               
                break;

            }
            case "ENG"://engine
            {
                
                break;

            }
            case "GRH": //greenhouse
            {
                
                break;

            }
            case "BIO": //physicians
            {
                
                break;

            }
            default://either the Space station or the Outside door lock
            {
                //if engineer does it (1) then its fine, but there are suspicious things
                //others may do
                
                break;

            }
        }
    }

}
