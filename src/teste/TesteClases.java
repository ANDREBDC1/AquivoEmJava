/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import arquivo.Arquivos;
import static arquivo.Arquivos.buscaArquivos;
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
       // usarBuscaDeArquivo();
        
        //salvarArquivo();

         //criarPasta();
    }
    
    public static void testeBuscaArquivo(){
       

         //salvarArquivo();
         //criarPasta();
         //usarBuscaDeArquivo();
         usarConverterArrayDeBytes();
    }
    public static void usarConverterArrayDeBytes (){
        
        File file = new  File("C:\\Teste");
        String extensao = ".mkv";
       
        ArrayList<File> arquivos = buscaArquivos(file, extensao);
       
        arquivos.stream().forEach((f) -> {
            
           
            
        });

    }
    
    public static void salvarArquivo(){
        
        String caminho = "C:\\Teste";
        Arquivos.copiarArquivoTipoVideo(new Arquivos(caminho),new File("C:\\destino"));
       
    } 
    
    public void testMethod() {
        
    }
    public static void criarPasta(){

    }
    
//    public static void salvarArquivo(){
//       
//               
//        Arquivos.copiarArquivoTipoFotos(new Arquivos("C:\\Teste"), new Arquivos("C:\\Destino\\Fotos"));
//    }
    
    public static void buscarAquivoPelaExtensao(){
        ExtensaoArquivos extesoes = new ExtensaoArquivos();
        
        for(String ex : extesoes.getExtensoesFotos()){
            Arquivos.moverArquivos(new File("c:\\teste"),new File("c:\\Origem"), ex);
        }
            
        
    }
    
  
    
    }



