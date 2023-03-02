package lab1;

/**
 * @author EU - High Major Commodore of the First Legion Third Multiplication Double Admiral Artillery Vanguard Company
 */
public class Exemplu1 {

    //membrii unei clase: campuri si metode

    int numarLaborator;

    public int getNumarLaborator(){
        return numarLaborator;
    }

    public void setNumarLaborator(int numarLaborator){
        this.numarLaborator = numarLaborator; // == compara
    }

    //single line comment
    /*
    multi-line comment
    */


    /**
     * metoda main = entry point
     * @param args lista de parametrii pasati aplicatiei la run
     *
     */


    /*
    public - cel mai permisiv
    private - cel mai restrictiv
    default-package - accesibil doar din acelasi pachet
    protected - vizibil in acelasi pachet si in alt pachet prin mostenire
    */

    public static void main(String[] args){

    }
}
