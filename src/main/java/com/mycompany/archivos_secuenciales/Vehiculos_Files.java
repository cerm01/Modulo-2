
package com.mycompany.archivos_secuenciales;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Vehiculos_Files {
    private DataOutputStream write;
    private DataInputStream read;
    private String path="C:\\Proyecto\\vehiculos.txt";
    
     Object [][] datos= new Object[6][100];
     Object [][] eliminar= new Object[6][100];
     
     public void Guardar(Vehiculos vcs) throws FileNotFoundException{
        try {
            write=new DataOutputStream(new FileOutputStream(path,true));
            write.writeUTF(vcs.getCliente());
            write.writeInt(vcs.getId_vehiculo());
            write.writeUTF(vcs.getMatricula());
            write.writeUTF(vcs.getMarca());
            write.writeUTF(vcs.getModelo());
            write.writeUTF(vcs.getFecha());
            write.close();
            
        } catch (IOException ex) {
           
        }
        
    }
     
     
     public Vehiculos BuscarIdVehiculo(Vehiculos vcs) throws FileNotFoundException{
        Vehiculos aux=null;
        int id=0;
        String cliente="",matricula="",marca="",modelo="",fecha="";
        try {
        read = new DataInputStream(new FileInputStream(path));
        while(true){
                
                cliente=read.readUTF();
                id= read.readInt();
                matricula=read.readUTF();
                marca=read.readUTF();
                modelo=read.readUTF();
                fecha=read.readUTF();
                
                /*System.out.print("cliente");
                System.out.println(cliente); 
                
                System.out.print("ID");
                System.out.println(id); 
                
                System.out.print("matricula");
                System.out.println(matricula); 
                                
                System.out.print("marca");
                System.out.println(marca); 
                
                                
                System.out.print("modelo");
                System.out.println(modelo); 
                
                System.out.print("fecha");
                System.out.println(fecha);*/ 
                
                if(vcs.getId_vehiculo()==id){
                    aux=new Vehiculos();
                    
                    aux.setCliente(cliente);
                    aux.setId_vehiculo(id);
                    aux.setMatricula(matricula);
                    aux.setMarca(marca);
                    aux.setModelo(modelo);
                    aux.setFecha(fecha);
                    
                }
            } 
        } catch (IOException ex) {
       }
        try {
            read.close();
        } catch (IOException ex) {
            
        }
        /*if(aux!=null){
           System.out.print("ID");
           System.out.println(aux.getId_vehiculo()); 
        }*/
        
        return aux;
    }
     
      public void Editar_Vehiculo(Vehiculos vcs) throws IOException{
        int i=0;
        int z=0;
        try {
        read = new DataInputStream(new FileInputStream(path));
        
        while(true){
                datos[0][i]=read.readUTF();
                datos[1][i]=read.readInt();
                datos[2][i]=read.readUTF();
                datos[3][i]=read.readUTF();
                datos[4][i]=read.readUTF();
                datos[5][i]=read.readUTF();
                i++;
            }
        } catch (IOException ex) {
       }
        try {
            read.close();
            
        } catch (IOException ex) {
            
        }
        
         while(z<i){
                if(vcs.getId_vehiculo()==(int)datos[1][z]){
                System.out.println(datos[0][z]);
                System.out.println(datos[1][z]);
                System.out.println(datos[2][z]);
                System.out.println(datos[5][z]);
                
                datos[0][z]=vcs.getCliente();
                datos[1][z]=vcs.getId_vehiculo();
                datos[2][z]=vcs.getMatricula();
                datos[3][z]=vcs.getMarca();
                datos[4][z]=vcs.getModelo();
                datos[5][z]=vcs.getFecha();
                }
                  z++;
                
            }

        i=0;
        try {
            write= new DataOutputStream(new FileOutputStream(path));
            while(i<z){
                write.writeUTF(datos[0][i].toString());
                write.writeInt((int)datos[1][i]);
                write.writeUTF(datos[2][i].toString());
                write.writeUTF(datos[3][i].toString());
                write.writeUTF(datos[4][i].toString());
                write.writeUTF(datos[5][i].toString());
                i++;
         }
        } catch (FileNotFoundException ex) {
      
        }catch(IOException ex){
            
        }finally{
            if(write!=null){
                try{
                      write.close();
                }catch(IOException ex){
                    
                }
            }
        }
    }
     
}
