
package model;

import java.util.ArrayList;


public class Aluno {
    
    private String nomeAluno, ano;
    Disciplina disciplina;
    

    public Aluno() {
    }
    
    public Aluno(String nomeAluno, String ano, Disciplina disciplina) {
        this.nomeAluno = nomeAluno;
        this.ano = ano;
        this.disciplina = disciplina;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
    
    
    
}
