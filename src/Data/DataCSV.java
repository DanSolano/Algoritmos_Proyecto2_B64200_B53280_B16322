package Data;

import Domain.Categoria;
import Domain.ProductoMayorista;
import Domain.Usuario;
import Utilities.StringMD;
import Utilities.StringPath;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class to read CSV files on Java. We use javacsv.jar to read it.
 *
 * @author daniel
 */
public class DataCSV {

    // Propiedades
    private String path;
    private StringMD stringMD = new StringMD();

    // Constructor
    public DataCSV(String path) {
        this.path = path;

    }

    public LinkedList<Usuario> readUsuario() {
        ArrayList<Object> list = readCSV();
        LinkedList<Usuario> users = new LinkedList<Usuario>();
        for (Object object : list) {
            new Usuario();
            users.add((Usuario) object);
        }
        return users;
    }

    public HashMap<String, Categoria> readCategoria() {
        ArrayList<Object> list = readCSV();
        HashMap<String, Categoria> categorias = new HashMap<String, Categoria>();
        for (Object object : list) {
            Categoria categoria = (Categoria) object;
            new Categoria();
            categorias.put(categoria.getNombre(), categoria);
        }
        return categorias;
    }

//    public Queue<Driver> readDrivers() {
//        ArrayList<Object> list = readCSV();
//        Queue<Driver> drivers = new LinkedList<Driver>();
//        for (Object object : list) {
//            drivers.offer((Driver) object);
//        }
//        return drivers;
//    }
//
//    public ArrayList<User> readAgentAdmin() {
//        ArrayList<Object> list = readCSV();
//        ArrayList<User> users = new ArrayList<User>();
//        for (Object object : list) {
//            users.add((User) object);
//        }
//        return users;
//    }
//
//    public ArrayList<Products> readProducts() {
//        ArrayList<Object> list = readCSV();
//        ArrayList<Products> products = new ArrayList<Products>();
//        for (Object object : list) {
//            products.add((Products) object);
//        }
//        return products;
//    }
//
//    public ArrayList<Order> readOrderDetails() {
//        ArrayList<Object> list = readCSV();
//        ArrayList<Order> users = new ArrayList<Order>();
//        for (Object object : list) {
//            users.add((Order) object);
//        }
//        return users;
//
//    }
//
//    public ArrayList<Restaurant> readRestaurants() {
//        ArrayList<Object> list = readCSV();
//        ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>();
//        for (Object object : list) {
//            restaurants.add((Restaurant) object);
//        }
//        return restaurants;
//
//    }
    // Métodos
    /**
     * Lee un CSV que no contiene el mismo caracter que el separador en su texto
     * y sin comillas que delimiten los campos
     *
     * @param path Ruta donde está el archivo
     * @throws IOException
     */
    public ArrayList<Object> readCSV() {

        String outputFile = this.path;

        try {

            ArrayList<Object> objeclArrList = new ArrayList<>();

            File alreadyExists = new File(outputFile);

            if (alreadyExists.exists()) {

                CsvReader dataImport = new CsvReader(outputFile, stringMD.codificarChar(';'), Charset.forName("UTF-8"));
                dataImport.setDelimiter(stringMD.codificarChar(';'));

                dataImport.readHeaders();

                while (dataImport.readRecord()) {

                    if (path.equals(StringPath.PATH_USUARIO)) {

                        int id = Integer.parseInt(stringMD.decodificar(dataImport.get(0)));
                        String nombre = stringMD.descifrar(dataImport.get(1));
                        String rol = stringMD.decodificar(dataImport.get(2));
                        String usuario = stringMD.descifrar(dataImport.get(3));
                        String contraseña = stringMD.decodificar(dataImport.get(4));

                        objeclArrList.add(new Usuario(id, nombre, rol, usuario, contraseña));

                    } else if (path.equals(StringPath.PATH_PRODUCTO_MAYORISTA)) {
                        int id = Integer.parseInt(stringMD.decodificar(dataImport.get(0)));
                        String nombre = stringMD.descifrar(dataImport.get(1));
                        String unidadMedida = stringMD.decodificar(dataImport.get(2));
                        int valorUnidad = Integer.parseInt(stringMD.descifrar(dataImport.get(3)));
                        int pesoTotal = Integer.parseInt(stringMD.decodificar(dataImport.get(4)));
                        String descripcion = stringMD.descifrar(dataImport.get(5));
                        int idLote = Integer.parseInt(stringMD.decodificar(dataImport.get(6)));
                        int idCategoria = Integer.parseInt(stringMD.descifrar(dataImport.get(7)));
                        double precioTotal = Double.parseDouble(stringMD.decodificar(dataImport.get(8)));
                        String urlFotografia = stringMD.descifrar(dataImport.get(9));

                        objeclArrList.add(new ProductoMayorista(id, nombre, unidadMedida, valorUnidad, pesoTotal, descripcion, idLote, idCategoria, precioTotal, urlFotografia));

                    } else if (path.equals(StringPath.PATH_CATEGORIA)) {

                        int id = Integer.parseInt(stringMD.decodificar(dataImport.get(0)));
                        String nombre = stringMD.descifrar(dataImport.get(1));
                        String descripcion = stringMD.decodificar(dataImport.get(2));

                        objeclArrList.add(new Categoria(id, nombre, descripcion));

                    }

                }

                dataImport.close();

            }

            return objeclArrList;

        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataCSV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DataCSV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public void writeCSV(ArrayList<Object> writeList) {

        String outputFile = this.path;

        boolean alreadyExists = new File(outputFile).exists();
        if (isDirectory()) {

            if (alreadyExists) {
                File file = new File(outputFile);
                File dir = new File(StringPath.PATH_DIR);
                dir.mkdir();
                file.delete();
            }

            try {

                CsvWriter csvOutput = new CsvWriter(outputFile, stringMD.codificarChar(';'), Charset.forName("UTF-8"));
//                csvOutput.setDelimiter(';');
                if (outputFile.equals(StringPath.PATH_USUARIO)) {
                    csvOutput.write(stringMD.cifrar("ID"));
                    csvOutput.write(stringMD.codificar("Nombre"));
                    csvOutput.write(stringMD.cifrar("Rol"));
                    csvOutput.write(stringMD.codificar("Usuario"));
                    csvOutput.write(stringMD.cifrar("Contrasena"));
                    csvOutput.endRecord();
                    for (Object object : writeList) {
                        Usuario agent = (Usuario) object;
                        csvOutput.write(stringMD.codificar(agent.getId() + ""));
                        csvOutput.write(stringMD.cifrar(agent.getNombre()));
                        csvOutput.write(stringMD.codificar(agent.getRol()));
                        csvOutput.write(stringMD.cifrar(agent.getUsuario()));
                        csvOutput.write(stringMD.codificar(agent.getContraseña()));
                        csvOutput.endRecord();
                    }

                } else if (outputFile.equals(StringPath.PATH_PRODUCTO_MAYORISTA)) {

                    csvOutput.write(stringMD.cifrar("ID"));
                    csvOutput.write(stringMD.codificar("Nombre"));
                    csvOutput.write(stringMD.cifrar("UnidadMedida"));
                    csvOutput.write(stringMD.codificar("valorUnidad"));
                    csvOutput.write(stringMD.cifrar("pesoTotal"));
                    csvOutput.write(stringMD.codificar("descripcion"));
                    csvOutput.write(stringMD.cifrar("idLote"));
                    csvOutput.write(stringMD.codificar("idCategoria"));
                    csvOutput.write(stringMD.cifrar("precioTotal"));
                    csvOutput.write(stringMD.codificar("urlFotografia"));
                    csvOutput.endRecord();

                    for (Object object : writeList) {
                        ProductoMayorista agent = (ProductoMayorista) object;
                        csvOutput.write(stringMD.codificar(agent.getId() + ""));
                        csvOutput.write(stringMD.cifrar(agent.getNombre()));
                        csvOutput.write(stringMD.codificar(agent.getUnidaMedida()));
                        csvOutput.write(stringMD.cifrar(agent.getValorUnidad() + ""));
                        csvOutput.write(stringMD.codificar(agent.getPesoTotal() + ""));
                        csvOutput.write(stringMD.cifrar(agent.getDescripcion() + ""));
                        csvOutput.write(stringMD.codificar(agent.getIdLote() + ""));
                        csvOutput.write(stringMD.cifrar(agent.getIdCategorita() + ""));
                        csvOutput.write(stringMD.codificar(agent.getPesoTotal() + ""));
                        csvOutput.write(stringMD.cifrar(agent.getUrlFotografia()));
                        csvOutput.endRecord();
                    }

                } else if (outputFile.equals(StringPath.PATH_CATEGORIA)) {

                    csvOutput.write(stringMD.cifrar("ID"));
                    csvOutput.write(stringMD.codificar("Nombre"));
                    csvOutput.write(stringMD.cifrar("Descripcion"));
                    csvOutput.endRecord();

                    for (Object object : writeList) {
                        Categoria agent = (Categoria) object;
                        csvOutput.write(stringMD.codificar(agent.getId() + ""));
                        csvOutput.write(stringMD.cifrar(agent.getNombre()));
                        csvOutput.write(stringMD.codificar(agent.getDescripcion()));

                        csvOutput.endRecord();
                    }

                }

                csvOutput.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean isDirectory() {
        File createDir = new File(StringPath.PATH_DIR);

        if (createDir.mkdir()) {
            return false;//false porque el directorio ya existe
        }
        return true;//true cuando CREA directorio nuevo

    }

}
