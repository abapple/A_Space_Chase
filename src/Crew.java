import java.util.*;
import java.io.*;
public class Crew {
    String name;
    String role;
    String ID;
    int sus_lvl = 0;
    String ele_phrase;
    String[] general_Log = {"Lookin' good.", "Ready to go!", "All set!!", 
        "Up and ready.", "Clear down here.", "This place isn't so bad."};

    Crew(String r, String n, String i, String p){
        this.name = n;
        this.role = r; 
        this.ID = i;
        this.ele_phrase = p;
        char s = role.charAt(0);
        // switch(s){
        //     case 'C':
        //     {

        //     }
        // }
    }
    @Override
    public String toString() {
        String s = role + " " + name; 
        // TODO Auto-generated method stub
        // return super.toString();
        return s;
    }

    
}
