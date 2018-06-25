/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Data.AnyToArrayList;
import Data.DataCSV;
import Utilities.StringPath;

/**
 *
 * @author daniel
 */
public class SaveAll {

    public SaveAll() {
        saveUser();
        saveCategoria();
    }

    private void saveUser() {
        AnyToArrayList anyArrayList = new AnyToArrayList();
        DataCSV adminCSV = new DataCSV(StringPath.PATH_USUARIO);
        adminCSV.writeCSV(anyArrayList.userToArrayListObject(CargaDatos.USUARIOS));
    }

    private void saveCategoria() {
        AnyToArrayList anyArrayList = new AnyToArrayList();
        DataCSV adminCSV = new DataCSV(StringPath.PATH_CATEGORIA);
        adminCSV.writeCSV(anyArrayList.categoriaToArrayListObject(CargaDatos.CATEGORIAS));
    }

}
