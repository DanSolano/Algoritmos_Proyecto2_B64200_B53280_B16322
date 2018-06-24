
package Bodegas;

import java.io.Serializable;

/**
 *
 * @author Michelle
 * B64200
 */
public class Vertex implements Serializable{
    public Object element;
    public boolean isVisited;

    public Vertex(Object element) {
        this.element = element;
        this.isVisited = isVisited;
    }

    @Override
    public String toString() {
        return "Vertice{" + "element=" + element + ", isVisited=" + isVisited + '}';
    }
    
    
    
}
