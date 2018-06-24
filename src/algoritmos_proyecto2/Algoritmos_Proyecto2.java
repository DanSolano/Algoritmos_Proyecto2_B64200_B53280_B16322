/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos_proyecto2;

import Data.CargaDatos;
import Data.DataCSV;
import Domain.Usuario;
import Utilities.StringMD;
import Utilities.StringPath;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public class Algoritmos_Proyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ArrayList<Object> users = new ArrayList<>();
//
//        Usuario u = new Usuario("Daniel", "admi", "dan", StringMD.getStringMessageDigest("1234", StringMD.SHA512));
//        Usuario us = new Usuario("Michelle", "admi", "jes", StringMD.getStringMessageDigest("asdf", StringMD.SHA512));
//        Usuario usu = new Usuario("Jesús", "admi", "mic", StringMD.getStringMessageDigest("qwert", StringMD.SHA512));
//        Usuario usua = new Usuario("Harry", "admi", "har", StringMD.getStringMessageDigest("harry", StringMD.SHA512));
//        Usuario usuar = new Usuario("Snape", "admi", "sna", StringMD.getStringMessageDigest("snape", StringMD.SHA512));
//        users.add(u);
//        users.add(us);
//        users.add(usu);
//        users.add(usua);
//        users.add(usuar);
//
        DataCSV dataCSV = new DataCSV(StringPath.PATH_USUARIO);
//        dataCSV.writeCSV(users);
        ArrayList<Object> usersRead = new ArrayList<>();
        usersRead = dataCSV.readCSV();
        Usuario uu = new Usuario(0);
        for (Object object : usersRead) {

            uu = (Usuario) object;
            System.out.println(uu.getId() + "   Nombre:   " + uu.getNombre() + "   Rol:   " + uu.getRol() + "   Usuario:   " + uu.getUsuario() + "   pass:   " + uu.getContraseña());

        }

        CargaDatos cd = new CargaDatos();

    }

}
