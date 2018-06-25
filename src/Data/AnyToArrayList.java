/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Domain.Usuario;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author daniel
 */
public class AnyToArrayList {

    public AnyToArrayList() {
    }

    public ArrayList<Object> userToArrayListObject(LinkedList<Usuario> agentOrAdminList) {
        ArrayList<Object> arrayUsuario = new ArrayList<Object>();
        for (Usuario object : agentOrAdminList) {
            arrayUsuario.add(object);
        }
        return arrayUsuario;
    }

    public ArrayList<Object> clientToArrayListObject(LinkedList<Usuario> clientsArrayList) {
        ArrayList<Object> arrayClient = new ArrayList<Object>();
        for (Usuario object : clientsArrayList) {
            arrayClient.add(object);
        }
        return arrayClient;
    }

}
