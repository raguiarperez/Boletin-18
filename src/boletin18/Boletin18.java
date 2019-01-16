package boletin18;

import com.Boletin18.persoal.Persoal;

/**

 * @author raguiarperez
 */
public class Boletin18 {

    public static void main(String[] args) {
        Persoal Andrés = new Persoal("986444345","Andresiño@gmail.es");
        Academica NotAnd = new Academica(7170, "Andrés", 19, Andrés);
        NotAnd.setNota(8);
        System.out.println(NotAnd.toString());
    }
    
}
