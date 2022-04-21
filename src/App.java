import java.io.*;
import java.util.*;
import java.util.HashMap;

public class App {
    public static int BIOcnt;
    public static void main(String[] args) throws Exception {

        ArrayList<Loc> locations = new ArrayList<Loc>();
        /**
         * //com == 0
         * //nav == 1
         * //out == 2
         * //sta == 3
         * //kit == 4
         * //lou == 5
         * //eng == 6
         * //bio == 7
         * //grh == 8
         */
        ArrayList<Crew> members = new ArrayList<Crew>();
        /**
         * //captain == 0
         * // engineer == 1
         * // navigator == 2
         * // physician == 3
         * // biologist == 4
         * // USER == 5
         */
        InitializeAll(locations, members);

        System.out.println(members + "\n" + locations + "\n");
        /**
         * // System.out.println((AccessLocations.toString()));
         * // 
         * // logs.write("ACCESS:" + location + ";USERID:" + id
         * // + ";DATE:" + date + ";TIME:" + time);
         * // logs.close();
         */

        
        // int day = 0;
        String date = "";
        String time = ""; 
        String log = "";
        // int BIOcnt = 0; 

        /**
       // FileWriter COM = new FileWriter("COM.txt");
        HashMap<String, FileWriter> LogList = new HashMap<String, FileWriter>();
        FileWriter COMS = new FileWriter("COM.txt");
        FileWriter NAVS = new FileWriter("NAV.txt");
        FileWriter GRHS = new FileWriter("GRH.txt");
        FileWriter BIOS = new FileWriter("BIO.txt");
        FileWriter ENGS = new FileWriter("ENG.txt");
        FileWriter LOUS = new FileWriter("LOU.txt");
        FileWriter KITS = new FileWriter("KIT.txt");
        // FileWriter COMS = new FileWriter("COM.txt");

        LogList.put("COM",COMS);
        LogList.put("NAV",NAVS);
        LogList.put("GRH",GRHS);
        LogList.put("BIO",BIOS);
        LogList.put("ENG",ENGS);
        LogList.put("LOU",LOUS);
        LogList.put("KIT",KITS);
         */
      
         PrintWriter logs = new PrintWriter("Access.txt");
         for(int i = 0; i<locations.size(); i++){
             String n = locations.get(i).abriv + ".txt";
            File l = new File(n);
         }

        //date start: 3/01/2035 wakeup: 03/31/2035
        for(int d = 1; d<32; d++){

            //record the date
            if (d<10){
                date = "03/0" + d + "/2035";
            }
            else{
                date = "03/" + d + "/2035";
            }

            //12 hours in the day. military time. 07:00:00
            for(int h = 0; h < 25; h++){
                if(h<10){
                    time = "0" + h + ":00:00";
                }
                else{
                    time = h + ":00:00";
                }

                int random = (int) (Math.random() * ((locations.size() - 1) - 0 + 1) + 0);
                Loc place = locations.get(random);
                String loc = place.abriv;
                Crew crew;
                
                // compare loc to possible crew
                switch (loc) {
                    case "COM":// coms
                    case "LOU":// lounge
                    case "KIT":// kitchen
                    {
                        int r = (int) (Math.random() * ((members.size() - 1) - 0 + 1) + 0);
                        crew = members.get(r);
                        break;
                    }
                    case "NAV":// nav
                    {
                        int r = (int) (Math.random() * ((100 - 0) + 1) + 0);
                        if (r <= 80) {// 80%
        
                            crew = members.get(2); // navigator
        
                        } else if ((80 < r) && (r <= 88)) {// 8%
        
                            crew = members.get(0); // captain
        
                        } else if ((88 < r) && (r <= 92)) {// 4%
        
                            crew = members.get(1); // engineer
        
                        } else if ((92 < r) && (r <= 96)) {// 4%
        
                            crew = members.get(3); // physician
        
                        } else {// 4%
        
                            crew = members.get(4); // biologist
        
                        }
        
                        break;
        
                    }
                    case "ENG":// engine
                    {
                        int r = (int) (Math.random() * ((100 - 0) + 1) + 0);
                        if (r <= 80) {// 80%
        
                            crew = members.get(1); // engineer
        
                        } else if ((80 < r) && (r <= 88)) {// 8%
        
                            crew = members.get(0); // captain
        
                        } else if ((88 < r) && (r <= 92)) {// 4%
        
                            crew = members.get(2); // navigator
        
                        } else if ((92 < r) && (r <= 96)) {// 4%
        
                            crew = members.get(3); // physician
        
                        } else {// 4%
        
                            crew = members.get(4); // biologist
        
                        }
        
                        break;
        
                    }
                    case "GRH": // greenhouse
                    {
                        int r = (int) (Math.random() * ((100 - 0) + 1) + 0);
                        if (r <= 80) {// 80%
        
                            crew = members.get(4); // biologist
        
                        } else if ((80 < r) && (r <= 88)) {// 8%
        
                            crew = members.get(0); // captain
        
                        } else if ((88 < r) && (r <= 92)) {// 4%
        
                            crew = members.get(2); // navigator
        
                        } else if ((92 < r) && (r <= 96)) {// 4%
        
                            crew = members.get(3); // physician
        
                        } else {// 4%
        
                            crew = members.get(1); // engineer
        
                        }
                        break;
        
                    }
                    case "BIO": // physicians
                    {
                        BIOcnt++;
        
                        int r = (int) (Math.random() * ((100 - 0) + 1) + 0);
                        if (r <= 80) {// 80%
        
                            crew = members.get(3); // physician
                            
                        } else if ((80 < r) && (r <= 85)) {// 5%
        
                            crew = members.get(0); // captain
        
                        } else if ((85 < r) && (r <= 95)) {// 10%
        
                            crew = members.get(2); // navigator
        
                        } else if ((95 < r) && (r <= 97)) {// 3%
        
                            crew = members.get(4); // biologist
        
                        } else {// 2%
        
                            crew = members.get(1); // engineer
        
                        }
        
                        //IF STATEMENT FOR THE BIOCOUNTER
        
                        break;
        
                    }
                    default:// either the Space station or the Outside door lock
                    {
                        int r = (int) (Math.random() * (1 - 0 + 1) + 0);
                        // if engineer does it (1) then its fine, but there are suspicious things
                        // others may do
                        crew = members.get(r);
                        break;
        
                    }
                }
                // add a captain probability for overall appearance
        
                // now loc == location and you have the crew member who logged
                // Map<String, Crew> s = new HashMap<>();
                // s.put(loc, crew);
        
                // String s = "ACCESS:" + loc + ";USERID:" + crew.ID;
        
                String aLog = "ACCESS:" + loc + ";USERID:" + crew.ID + 
                            ";DATE:" + date + ";TIME:" + time + "\n";
                
                logs.write(aLog);

                String filename = loc + ".txt";
                FileWriter Writer = new FileWriter(filename, true);
                aLog = LocationLog(place, crew, date, time);
                Writer.append(aLog);
                // Writer.flush();
                Writer.close();


            }

        }
        // log = GetAccessLogs(locations, members, date, time);
        logs.close();
        // System.out.println(log);

    }

    static void InitializeAll(ArrayList<Loc> locations, ArrayList<Crew> members) {

        Loc Com = new Loc("Communications", "COM");
        Loc Nav = new Loc("Navigation", "NAV");
        // Loc Out = new Loc("Outside Door", "OUT");
        // Loc Sta = new Loc("Station on Earth", "STA");
        Loc Kit = new Loc("Kitchen", "KIT");
        Loc Lou = new Loc("Lounge", "LOU");
        Loc Eng = new Loc("Engine", "ENG");
        Loc Bio = new Loc("Physician Office", "BIO");
        Loc Grh = new Loc("GreenHouse", "GRH");
        // Loc Bdr = new Loc("Bedroom", "BDR");

        locations.add(Com); // com == 0
        locations.add(Nav); // nav == 1
        locations.add(Kit); // kit == 2
        locations.add(Lou); // lou == 3
        locations.add(Eng); // eng == 4
        locations.add(Bio); // bio == 5
        locations.add(Grh); // grh == 6
        // locations.add(Out); // out == 2
        // locations.add(Sta); // sta == 3


        // locations.add(Bdr); //bdr ==

        // String AccessLocations[] = {"COM", "OUT", "STA", "BDR", "KIT", "LOU", "ENG",
        // "BIO", "GRH", "NAV"};
        // arraylist holding ten rn; 0-9
        // Crew captain = new Crew ("Captain", "Abigail Conlin", "021102102201");
        // Map<Integer, String> crewID = new HashMap<Integer, String>();

        // ADD SUS STATEMENTS
        Crew captain = new Crew("Captain", "Abigail Conlin", "021102102201",
                "Great work! Let's get these colonists to their new homes.",
                "We need to get this ship in shape..");
        members.add(captain); // captain == 0
        Crew engineer = new Crew("Head Engineer", "Xavier Llewellyn", "062889040422",
                "Ship is purring like a kitten!!", "I had some trouble, but we're good to go!");
        members.add(engineer); // engineer == 1
        Crew navigator = new Crew("Navigator", "Quinn Warwick", "102203301120",
                "Our path is clear, route on schedule.", "Route made");
        members.add(navigator); // navigator == 2
        Crew physician = new Crew("Physician", "Odessa Holtz", "586932745896", "Crew is healthy.", 
                "Crewmate taken care of. ");
        members.add(physician); // physician == 3
        Crew biologist = new Crew("Biologist", "Artemis Dewitt", "125874693018",
                "My babies are growing into beautiful sprouts!", "I really hope there's no bugs out here..");
        members.add(biologist); // biologist == 4
        Crew USER = new Crew("Crewmate", "[REDACTED]", "042020229786", "----------------- :)", 
                "----------------- :(");
        members.add(USER); // USER == 5
    }

    static String LocationLog(Loc loc, Crew crew, String date, String time) {

        int sus =(int) (Math.random() * ((100 - 0) + 1) + 0);
        String alog;
        String phrase; 
        if(sus <= 30){
            phrase = crew.sphrase;
        }
        else{
            phrase = crew.ephrase;
        }

        if((loc.abriv == "BIO") && (crew.name == "Quinn Warwick")){

            //switch statement for specific codes in the BIO logs
            switch(BIOcnt){
                case  4:
                {
                    phrase = "I've been waiting for a response. I don't know how many messages you expect me to leave.";
                    break;
                }
                case  11:
                {
                    phrase = "It doesn't seem to matter how many times I call, every time I do I get a voicemail.";
                    break;
                }
                case  14:
                {
                    phrase = "I can't believe this. How many times do I have to remind you? Lock the door when you leave.";
                    break;
                }
                case  25:
                {
                    phrase = "I'm starting to think I'm allergic to flowers." + 
                            " I am always sneezing when Doctor Dewitt walks by, and there is always pollen on her sleeves.";
                    break;
                }
                case  32:
                {
                    phrase = " I've been looking through the ship's network every night." + 
                        " I know there is an interference in our data, but I can't spot where." + 
                        " I thought my computer was clean, but there exists a disturbance in the logs on my computer.";
                    break;
                }
                case  44:
                {
                    phrase = "I know I really shouldn't have, but I couldn't help myself. We only had so many freeze-dried"+
                    " ice cream sandwiches left, and I was craving a sweet. How was I supposed to know that frozen ice cream sandwiches were not lactose free?"+
                    " If a stomach ache is what I get, it was well worth it.";

                    break;
                }
                case  70:
                {
                    phrase = " Hey doc, it seems we have got an issue here. I don't know how, but I think Deimos Aries is becoming " + 
                    "… sentient? This is really strange for me to bring up, but I have realized my navigation courses have been changing."+
                    " I chart the course and save it into the system every night. I even get approval. But after that, it's altered. I wonder if someone has my key.";
                    break;
                }
                case  84:
                {
                    phrase = "This might be a silly question, but how fast are your reflexes? I know the captain's aren't great, but Xavier's are amazingly quick."+
                    " [REDACTED] seems to have cat-like reflexes despite an unassuming demeanor about them. "+
                    "Their handsome and/or beautiful appearance always throws me off.. Anyways, I think our reflexes get faster the more we play video games." +
                    " Xavier told me that he liked to play a lot of Street Fighter when he was younger. As for me," +
                    "  I played a lot of FFXV when I was younger, so I think that is why my reflexes are so quick. Man, I love games.";
                    break;
                }
                default:
                {
                    break;
                }
            }
        }

        alog = "USERID:" + crew.ID + 
        ";DATE:" + date + ";TIME:" + time + ";STATEMENT:" + phrase + "\n";

       return alog;
    }

}
