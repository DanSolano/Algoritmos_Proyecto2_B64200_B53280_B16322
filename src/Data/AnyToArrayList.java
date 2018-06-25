/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Domain.Categoria;
import Domain.Usuario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

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

    public ArrayList<Object> categoriaToArrayListObject(HashMap<String, Categoria> categorias) {
        ArrayList<Object> arrayCategoria = new ArrayList<Object>();
        Object categoria;
        for (Map.Entry<String, Categoria> entry : categorias.entrySet()) {
            categoria = entry.getValue();
            arrayCategoria.add(categoria);
        }

        return arrayCategoria;
    }
}
