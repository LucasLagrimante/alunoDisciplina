package model;

public class Principal {

	public static void main(String[] args) {
             
             Disciplina d1 = new Disciplina ("Matematica", "10/07/2016", "6periodo");
             Disciplina d2 = new Disciplina ("Portugues", "10/07/2016", "8periodo");
             Aluno a1 = new Aluno ("Jose", "10/07/2016", d1);
             
             //faltando a biblioteca
             XStream xstream = new XStream();
             
             xstream.alias("disciplina", Disciplina.class);
             xstream.alias("aluno", Aluno.class);
             
             String xml = xstream.toXML(a1);
             
             System.out.println(xml);
             a1 = null;
             a1 = (Aluno) xstream.fromXML(xml);
             System.out.println("==>" + a1.getNomeAluno());
             
        
        }
    
}

