
package boletin18;

import com.Boletin18.persoal.Persoal;

/**
 *
 * @author raguiarperez
 */
public class Academica {
    int numreferencia=2018;
    String nome;
    int nota;
    Persoal alumno;

    public Academica(int numreferencia, String nome, int nota, Persoal alumno) {
        this.nome = nome;
        this.nota = analizarNota(nota);
        this.alumno = alumno;
        this.numreferencia= numreferencia;
    }


    public int getNumreferencia() {
        return numreferencia;
    }

    public void setNumreferencia(int numreferencia) {
        this.numreferencia = numreferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Persoal getAlumno() {
        return alumno;
    }

    public void setAlumno(Persoal alumno) {
        this.alumno = alumno;
    }


    private int analizarNota(int nota) {
        if(nota <1 || nota>10){
            System.out.println("Nota superior a 10 o inferior a 1");
            return 0;
        }
        else{
            return nota;
        }
    }
}
    

