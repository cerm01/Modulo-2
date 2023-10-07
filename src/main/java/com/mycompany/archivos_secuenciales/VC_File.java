
package com.mycompany.archivos_secuenciales;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class VC_File {
    private DataOutputStream write;
    private DataInputStream read;
    private String path = "C:\\Proyecto\\vc.txt";
    
    public void guardar(vehiculo_cliente vc) {
        try {
            write = new DataOutputStream(new FileOutputStream(path, true));
            write.writeUTF(vc.getIdUsuario());
            write.writeUTF(vc.getIdCliente());
            write.close();
        } catch (IOException e) {
            System.out.println("Error al guardar el cliente");
        }
    } 
}
