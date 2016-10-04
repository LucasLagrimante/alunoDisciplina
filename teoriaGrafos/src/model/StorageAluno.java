
package model;

import java.util.ArrayList;


public class StorageAluno {
    private static StorageAluno instance = null; 
    private ArrayList alunos = null;
    
    protected StorageAluno() {
        alunos = new ArrayList();
    }
    public static StorageAluno getInstanceAluno() {
        if (instance == null) {
            instance = new StorageAluno();
        }
        return instance;
    }
    public ArrayList getAlunos() {
        return alunos;
    }
}
