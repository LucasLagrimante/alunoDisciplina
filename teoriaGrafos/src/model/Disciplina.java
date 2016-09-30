
package model;

import java.util.ArrayList;
import java.util.List;


public class Disciplina {
    
    private String nomeDisciplina;
    private String anoDisciplina;
    private String periodoDisciplina;
    
    private static ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public static ArrayList getDisciplinas() {
        return disciplinas;
    }
    
    public Disciplina(String nomeDisciplina, String anoDisciplina, String periodoDisciplina) {
       
        this.nomeDisciplina = nomeDisciplina;
        this.anoDisciplina = anoDisciplina;
        this.periodoDisciplina = periodoDisciplina;
        disciplinas.add(this);
    }

    public Disciplina() {
    }
    
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getAnoDisciplina() {
        return anoDisciplina;
    }

    public void setAnoDisciplina(String anoDisciplina) {
        this.anoDisciplina = anoDisciplina;
    }

    public String getPeriodoDisciplina() {
        return periodoDisciplina;
    }

    public void setPeriodoDisciplina(String periodoDisciplina) {
        this.periodoDisciplina = periodoDisciplina;
    }
    
}
