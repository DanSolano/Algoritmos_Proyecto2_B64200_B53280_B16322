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

        Usuario u = new Usuario("nombre1", "admi", StringMD.getStringMessageDigest("werty", StringMD.SHA512), "w");
        Usuario us = new Usuario("nombre2", "admi", StringMD.getStringMessageDigest("asdf", StringMD.SHA512), "w");
        Usuario usu = new Usuario("nombre13", "admi", StringMD.getStringMessageDigest("zxcv", StringMD.SHA512), "w");
        Usuario usua = new Usuario("nombre4", "admi", StringMD.getStringMessageDigest("fghj", StringMD.SHA512), "w");
        Usuario usuar = new Usuario("nombre5", "admi", StringMD.getStringMessageDigest("poiuy", StringMD.SHA512), "w");
        users.add(u);
        users.add(us);
        users.add(usu);
        users.add(usua);
        users.add(usuar);

        DataCSV dataCSV = new DataCSV(StringPath.PATH_USUARIO);
        dataCSV.writeCSV(users);
        ArrayList<Object> usersRead = new ArrayList<>();
        usersRead = dataCSV.readCSV();
        Usuario uu = new Usuario();
        for (Object object : usersRead) {

            uu = (Usuario) object;
            System.out.println(uu.getId() + "   Nombre:   " + uu.getNombre() + "   Rol:   " + uu.getRol() + "   pass:   " + uu.getUsuario());

        }

        CargaDatos cd = new CargaDatos();

    }

}
