import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generador {
    String cadena;
    List<String>cadenaARNCod=new ArrayList<String>();
    BaseDeDatosArn baseDeDatosArn=new BaseDeDatosArn();
    Random aleatorio = new Random(System.currentTimeMillis());

    public Generador() {
    }

    public void ingresarPeptido(String peptido){
       this.cadena=peptido;

    }
    public void generarCadenaARNcodificante(){
        for(int i=0;i<this.cadena.length();i++) {
            System.out.println(this.generarArnCodificante(this.cadena.charAt(i)));
        }

    }

    private String generarArnCodificante(char aminoacido) {
       List<String> arns=this.baseDeDatosArn.getArn(aminoacido);
       Integer cantArn=arns.size();
        return arns.get(this.aleatorio.nextInt(cantArn));

    }


}
