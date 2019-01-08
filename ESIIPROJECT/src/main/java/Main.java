import java.util.Scanner;

public class Main {

    public static GUI gui = new GUI();
    public static CriarTXT criarTXT = new CriarTXT();
    //public static Remover remover = new Remover();

    public static void main(String[] args) {

        //String[] frases = new String[100];
        String frase;

        /*criarTXT.CriarTXT();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(400,400);
        gui.setVisible(true);
        gui.setTitle("ESSIPROHECT");*/


        System.out.println("Escreva a frase: ");
        Scanner scanner = new Scanner(System.in);
        frase = scanner.nextLine();
        String aux = Remover(frase);
        System.out.println(aux);


    }

    public static String Remover(String frase) {
        //String aux;
        //DIGITOS
        frase = frase.replace("0","");
        frase = frase.replace("1","");
        frase = frase.replace("2","");
        frase = frase.replace("3","");
        frase = frase.replace("4","");
        frase = frase.replace("5","");
        frase = frase.replace("6","");
        frase = frase.replace("7","");
        frase = frase.replace("8","");
        frase = frase.replace("9","");
        //SINAIS DE PONTUAÇÃO
        frase = frase.replace(",","");
        frase = frase.replace(";","");
        frase = frase.replace(":","");
        frase = frase.replace(".","");
        frase = frase.replace("-","");
        frase = frase.replace("_","");
        frase = frase.replace("!","");
        frase = frase.replace("?","");


        //aux = frase;
        return frase;
    }
}