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

    public void save() {
        saveUser();
    }

    private void saveUser() {
        AnyToArrayList anyArrayList = new AnyToArrayList();
        DataCSV adminCSV = new DataCSV(StringPath.PATH_USUARIO);
        //  adminCSV.writeCSV(anyArrayList.userToArrayListObject(Algoritmos_Proyecto01_B16322_B31710_B67156.ADMIN_LIST));
    }

}
