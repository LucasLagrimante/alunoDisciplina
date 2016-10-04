
package model;

import java.util.ArrayList;


public class Disciplina {
    
    private String nomeDisciplina, anoDisciplina, periodoDisciplina;;
    
    
    public Disciplina(String nomeDisciplina, String anoDisciplina, String periodoDisciplina) {
       
        this.nomeDisciplina = nomeDisciplina;
        this.anoDisciplina = anoDisciplina;
        this.periodoDisciplina = periodoDisciplina;
  
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
    
    @Override
    public String toString() {
        return this.nomeDisciplina;
    }
    
}
