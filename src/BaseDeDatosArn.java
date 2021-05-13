import java.util.List;

public class BaseDeDatosArn {
  //ATVEKGGKHKTGPNEKGKKIFVQKCSQCHTVLHGLFGRKTGQA
  List<String> A = List.of("GCU", "GCC", "GCA", "GCG");
  List<String> R = List.of("CGU", "CGC", "CGA", "CGG");
  List<String> D = List.of("GAC", "GAU");
  List<String> N = List.of("AAU", "AAC");
  List<String> C = List.of("UGU", "UGC");
  List<String> Q = List.of("CAA", "CAG");
  List<String> E = List.of("GAA", "GAG");
  List<String> G = List.of("GGG", "GGA", "GGC", "GGU");
  List<String> H = List.of("CAU", "CAC");
  List<String> L = List.of("AUU", "AUC", "AUA");
  List<String> K = List.of("AAA", "AAG");
  List<String> M = List.of("AUG");
  List<String> F = List.of("UUU", "UUC");
  List<String> P = List.of("CCU", "CCC", "CCA", "CCG");
  List<String> S = List.of("UCU", "UCC", "UCA", "UCG");
  List<String> T = List.of("ACU", "ACC", "ACA", "ACG");
  List<String> Y = List.of("UAU", "UAC", "UAA", "UAG");
  List<String> V = List.of("GUU", "GUC", "GUA", "GUG");
  List<String> I = List.of(	"AUU", "AUC", "AUA");


  public List<String> getArn(char aminoacido) {
    switch (String.valueOf(aminoacido)) {
      case "A": return this.A;
      case "R":
        return this.R;
      case "D":
        return this.D;
      case "N":
        return this.N;
      case "C":
        return this.C;
      case "Q":
        return this.Q;
      case "E":
        return this.E;
      case "G":
        return this.G;
      case "H":
        return this.H;

      case "L":
        return this.L;

      case "K":
        return this.K;

      case "M":
        return this.M;

      case "F":
        return this.F;


      case "P":
        return this.P;

      case "S":
        return this.S;

      case "T":
        return this.T;

      case "Y":
        return this.Y;
      case "V":
        return this.V;
      case "I":
        return this.I;

      default:

        return List.of("NADA");



    }


  }
}








