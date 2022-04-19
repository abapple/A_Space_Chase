import java.util.*;
import java.io.*;
public class Crew {
    String name;
    String role;
    String ID;
    Crew(String r, String n, String i){
        this.name = n;
        this.role = r; 
        this.ID = i;
    }
    @Override
    public String toString() {
        String s = role + " "+ name; 
        // TODO Auto-generated method stub
        // return super.toString();
        return s;
    }

    
}
