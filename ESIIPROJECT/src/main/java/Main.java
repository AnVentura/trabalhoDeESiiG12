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


        File dir = new File("C:\\Users\\ANDRE\\Desktop\\TEST\\");

        for (File file : dir.listFiles()) {
            Scanner s = new Scanner(file);

            while (scanner.hasNext()) {
                frase = frase.replaceAll("\\d","");
            })

            s.close();
        }




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