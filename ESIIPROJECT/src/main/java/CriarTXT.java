

import java.io.*;
import java.util.Scanner;

/**
 * @author ANDRE
 */


public class CriarTXT {


    public int CriarTXT() {
        String txt = "";

        while (txt != "EXIT") {
            System.out.println("Escreva o nome do ficheiro: ");
            Scanner file = new Scanner(System.in);
            txt = file.nextLine();
            if (txt.equals("EXIT")){
                System.out.println("ACABOU");
                return 0;
            }
            else {
                File arquivo = new File("C:\\Users\\ANDRE\\Desktop\\TEST\\" + txt + ".txt");

                try {
                    if (!arquivo.exists()) { //se nao existe
                        //cria um arquivo (vazio)
                        arquivo.createNewFile();
                    }

                    //caso seja um diretório, é possível listar seus arquivos e diretórios
                    File[] arquivos = arquivo.listFiles();


                    // ESCREVE
                    //escreve no arquivo
                    FileWriter fw = new FileWriter(arquivo, true);
                    BufferedWriter bw = new BufferedWriter(fw);

                    //Pede ao utilizador para escrever o que ele quer guardar no ficheiro txt
                    System.out.println("Escreva uma mensagem nova: ");
                    Scanner scan = new Scanner(System.in);
                    String buff = scan.nextLine();


                    bw.write(buff);
                    bw.newLine();
                    bw.close();
                    fw.close();

                    //LÊ
                    //faz a leitura do arquivo
                    FileReader fr = new FileReader(arquivo);
                    BufferedReader br = new BufferedReader(fr);
                    //enquanto houver mais linhas
                    while (br.ready()) {
                        //lê a proxima linha
                        String linha = br.readLine();
                        //faz algo com a linha
                        System.out.println(linha);
                    }
                    br.close();
                    fr.close();

                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }


        return 0;
    }

}
