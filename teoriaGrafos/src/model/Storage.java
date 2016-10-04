
package model;

import java.util.ArrayList;


public class Storage {
    private static Storage instance = null;
    private ArrayList disciplinas = null; 
    
    protected Storage() {
        disciplinas = new ArrayList();
    }
    public static Storage getInstance() {
        if (instance == null) {
            instance = new Storage();
        }
        return instance;
    }
    public ArrayList getDisciplinas() {
        return disciplinas;
    }
}
