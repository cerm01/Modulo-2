
package com.mycompany.archivos_secuenciales;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Cliente_File {
    private DataOutputStream write;
    private DataInputStream read;
    private String path = "C:\\Proyecto\\clientes.txt";

    public void guardarCliente(cliente cliente) {
        try {
            write = new DataOutputStream(new FileOutputStream(path, true));
            write.writeInt(cliente.getId());
            write.writeUTF(cliente.getNombre());
            write.writeUTF(cliente.getApellidoPaterno());
            write.writeUTF(cliente.getApellidoMaterno());
            write.close();
        } catch (IOException e) {
            System.out.println("Error al guardar el cliente");
        }
    }
}
