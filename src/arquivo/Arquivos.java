/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author Andre
 */
public class Arquivos {

    private static File file;
    private static byte[] Arquivo;

    public static byte[] getArquivo() {
        return Arquivo;
    }

    public static void setArquivo(byte[] Arquivo) {
        Arquivos.Arquivo = Arquivo;
    }

    public static File getFile() {
        return file;
    }

    public static void setFile(File file) {
        Arquivos.file = file;
    }

    public static byte[] coverterArquivoEmArrayDeByte(File file) {
        FileInputStream fis;

        byte[] conteudoByte = new byte[(int) file.length()];

        try {

            fis = new FileInputStream(file);
            fis.read(conteudoByte);
            fis.close();

        } catch (IOException ex) {
            throw new RuntimeException("Arquivo não encontrada!\n" + ex.getMessage());
        }

        return conteudoByte;
    }

    public static boolean deletarArquivo(String caminho) {
        File deletar = new File(caminho);
        return deletar.delete();

    }

    public static boolean deletarArquivo(File file) {
        if (file == null) {
            return false;
        }
        File deletar = file;
        return deletar.delete();

    }

    public static void compiarArquivos(String caminhoOrigem, String caminhoDestino) {
        try {

            if (caminhoDestino.trim().isEmpty() || caminhoOrigem.trim().isEmpty()) {
                throw new IOException("Caminho de Origem e destino não pode ser vasio!");
            }

            File src = new File(caminhoOrigem);

            File[] files = src.listFiles();

            if (files == null || (files.length <= 0)) {
                return;
            }

            for (File f : files) {
                
                String fileName = f.getName();
                 boolean isArquivoSalvo = salvaArquivo(caminhoDestino, fileName, coverterArquivoEmArrayDeByte(f));
                if(isArquivoSalvo){
                    deletarArquivo(f);
                }
               
            }

        } catch (IOException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

    public static boolean salvaArquivo(String caminhoDestino, String nomeDoArquivo, byte[] arquivo) {

        if(caminhoDestino.trim().isEmpty() || nomeDoArquivo.trim().isEmpty() || arquivo == null)
            return false;
            
        File criarPasta = new File(caminhoDestino);
        FileOutputStream fos;
        
        try {
            if (!criarPasta.exists()) { // testa se a pasta ja existe 
                criarPasta.mkdir(); // criar pasta caso nao existe
            }

            fos = new FileOutputStream(caminhoDestino + "/" + nomeDoArquivo);
            fos.write(arquivo);
            return true;

        } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
        }

    }
    

}
