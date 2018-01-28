/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivo;

import java.io.File;
import java.io.FileInputStream;
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

    public static void compiarArquivo(String caminhoOrigem, String caminhoDestino) {
        try {

            if (caminhoDestino.isEmpty() || caminhoOrigem.isEmpty()) {
                return;
            }

            File src = new File(caminhoOrigem);

            String dstPath = caminhoDestino;
            if(!dstPath.substring(dstPath.length() -1).contains("/"))
                dstPath += "/";
            File dst;
            File destino = new File(caminhoDestino);
            
            if(!destino.exists())
                destino.mkdir();
            
            File[] files = src.listFiles();
            
            if(files  == null || (files.length <= 0))
                return;

            for (File f : files) {
                String fileName = f.getName();
                dst = new File(dstPath + fileName);
                InputStream in = new FileInputStream(f);
                OutputStream out = new FileOutputStream(dst);
                
                    byte[] buf = new byte[1024];
                    int len;
                    while ((len = in.read(buf)) > 0) {
                        out.write(buf, 0, len);
                    }

                in.close();
                out.close();
                f.delete();
            }

        } catch (IOException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

}
