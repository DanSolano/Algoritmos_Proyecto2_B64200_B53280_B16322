package Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Archivos {
    
    private String nombre;
    private String ruta;

    public Archivos(String ruta) {
        this.ruta = ruta;
    }

    Archivos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //crea un nuevo archivo fisico
    public void crear(){
        try{
            ObjectOutputStream oos = new ObjectOutputStream
        (new FileOutputStream(new File(ruta)));
            oos.close();
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    //permite escribir en un archivo
    //reemplaza el contenido del archivo
    public void escribir(Object objeto){
        try{
           ObjectOutputStream oos = new ObjectOutputStream(
           new FileOutputStream(new File(ruta)));
           oos.writeObject(objeto);
           oos.close();
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    //carga en tda el contenido de un archivo 
    //existente
    public Object cargar(){
        Object aux=null;
        try{
          //se crea un objeto input stream
          ObjectInputStream ois = new ObjectInputStream
        (new FileInputStream(ruta));
          //lee el objeto
          aux = ois.readObject();
          ois.close();
        }catch(IOException | ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        return aux;
    }
    
}
