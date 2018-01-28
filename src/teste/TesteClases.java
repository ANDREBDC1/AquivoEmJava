/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

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
public class TesteClases {

    public static void main(String[] args) {
        arquivo.Arquivos.compiarArquivo("C:\\Origem","C:\\Destino");
    }

    private void metoTeste() throws FileNotFoundException, IOException {

        File src = new File(".");
        String dstPath = "C:\\java\\";
        File dst;

        File[] files = src.listFiles();

        for (File f : files) {
            String fileName = f.getName();

            if (fileName.contains("File")) {

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

        }
    }

}
