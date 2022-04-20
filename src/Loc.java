import java.util.*;
import java.io.*;
public class Loc {
    String location;
    String abriv;
    boolean com = false;
    
    Loc(String loc, String abr){
        this.location = loc;
        this.abriv = abr; 
    }
    @Override
    public String toString() {
        String s = abriv + ": " + location; 
        // TODO Auto-generated method stub
        // return super.toString();
        return s;
    }
    
}