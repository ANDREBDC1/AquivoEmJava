/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import arquivo.Arquivos;
import extensao_arquivos.ExtensaoArquivos;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Andre
 */
public class TesteClases {

    public static void main(String[] args) {
        //arquivo.Arquivos.compiarArquivosDeUmDiretorioEspecifco("C:\\Origem","C:\\Destino");
        //usarBuscaDeArquivo();
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
         //salvarMoverArquivosParaUmasPasta();
//         File fileBusca = new File("c:\\teste");
//         File FileDestino = new File("c:\\PastaTeste");
//         String extensao = ".PNG";
//         
//         Arquivos.moverArquivos(fileBusca, FileDestino, extensao);
         
        // buscarAquivoPelaExtensao();
        usarBuscaDeArquivo();
         
    }
    
    public static void buscarAquivoPelaExtensao(){
        ExtensaoArquivos extesoes = new ExtensaoArquivos();
        
        for(String ex : extesoes.getExtensoesFotos()){
            Arquivos.moverArquivos(new File("c:\\teste"),new File("c:\\Origem"), ex);
        }
            
        
    }
    
    public static void usarBuscaDeArquivo(){
        File file = new File("C:\\Users");
        for (File f : file.listFiles()) {
            
            System.out.println(f.getName());
            System.out.println("---\n"+f.mkdirs());
            
        }
        
         System.out.println("--------------------------------------------");
  
        String extensao =".png";
        ArrayList<File> arquivos = Arquivos.buscaArquivos(file, extensao);
        
        System.out.println("Total de arquivos encontrados: "  +Arquivos.getTotalDeArquivos());
        
        for (File f : arquivos) {  
            System.out.println("\nNome do arquivo: " + f.getName());     
        }
    }
    
     public static void salvarMoverArquivosParaUmasPasta(){
        File file = new File("C:Teste");
        String extensao =".png";
        ArrayList<File> arquivos = Arquivos.buscaArquivos(file, extensao);
        
        System.out.println("Total de arquivos encontrados: "  +Arquivos.getTotalDeArquivos());
        
        for (File f : arquivos) {  
            boolean isSalvarArquivo = Arquivos.salvaArquivo("c:\\PastaTeste", 
                    f.getName(), 
                    Arquivos.coverterArquivoEmArrayDeByte(f));
            
            if(isSalvarArquivo){
                Arquivos.deletarArquivo(f);
            }
        }
    }

}
