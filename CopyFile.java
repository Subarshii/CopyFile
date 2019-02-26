/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Copyfile;

import java.io.*;
import static jdk.nashorn.internal.objects.NativeRegExp.source;

/**
 *
 * @author Administratorr
 */
class copyFile {

    void copyFile() {
        InputStream is;
        OutputStream os;
        try {
            is = new FileInputStream("C:\\Users\\Administratorr\\Desktop\\home\\hello.java");
            os = new FileOutputStream("C:\\Users\\Administratorr\\Desktop\\home\\test\\hello-Copy.java");
          
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);          
            }
            is.close();
            os.close();
        } catch (IOException ioe) {
            System.out.println(ioe);

        }
    }

  

}
