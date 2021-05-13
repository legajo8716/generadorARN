import java.util.ArrayList;
import java.util.List;

public class Generador {
    String cadena;
    List<String>cadenaARNCod=new ArrayList<String>();
    BaseDeDatosArn baseDeDatosArn=new BaseDeDatosArn();

    public Generador() {
    }

    public void ingresarPeptido(String peptido){
        for(int i=0;i<peptido.length();i++){

        }

    }
    public void generarCadenaARNcodificante(){
        for(int i=0;i<this.cadena.length();i++) {

            this.cadenaARNCod.add(this.generarArnCodificante(this.cadena.charAt(i)));
        }

    }

    private String generarArnCodificante(char aminoacido) {
        this.baseDeDatosArn.getArn(aminoacido);

    }


}
