package Domain;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Categoría implements Serializable{
	private String nombre;
	private Object categoría;
	private int id;
	private HashMap<String, Object> mapa;
	
	public Categoría(String nombre, Object categ) {
		this.nombre = nombre;
		this.categoría = categ;
		this.id = 1111;
		mapa = new HashMap<String, Object>();
		mapa.put(nombre, categ);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Object getCategoría() {
		return categoría;
	}

	public void setCategoría(Object categoría) {
		this.categoría = categoría;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public HashMap<String, Object> getMapa() {
		return mapa;
	}

	public void setMapa(HashMap<String, Object> mapa) {
		this.mapa = mapa;
	}

	//ejemplo de c�mo las propiedades de un hashmap
	//public void hash() {
	//Set set = mapa.entrySet();
		//el iterador funciona como token
	//    Iterator iterator = set.iterator();
	//    while(iterator.hasNext()) {
	//       Map.Entry mentry = (Map.Entry)iterator.next();
	//       System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	//       System.out.println(mentry.getValue());
	//    }
	//}
	
}
