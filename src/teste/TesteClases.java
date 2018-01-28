/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import arquivo.Arquivos;
import java.io.File;

/**
 *
 * @author Andre
 */
public class TesteClases {

    public static void main(String[] args) {
        arquivo.Arquivos.compiarArquivos("C:\\Origem","C:\\Destino");
//        File arquivo = new File("C:\\Destino/botaoSair.png");
//        String destino = "C://Teste";
//       
//        boolean isArquivoSalso = Arquivos.salvaArquivo(destino, 
//                arquivo.getName(), 
//                Arquivos.coverterArquivoEmArrayDeByte(arquivo));
//        
//        if(isArquivoSalso){
//            System.out.println("Arquivo foi salvo");
//            Arquivos.deletarArquivo(arquivo);
//        }else{
//            System.out.println("Arquivo não foi salvo");
//        }
    }

}
