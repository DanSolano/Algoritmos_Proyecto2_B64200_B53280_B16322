
package Bodegas;

/**
 *
 * @author Michelle
 * B64200
 */
public interface Graph {
    
    public void Cancel()throws GraphException;
    
    public int getSize()throws GraphException;
    
    public boolean existVertex (Object element)throws GraphException;
    
    public boolean existEdge(Object v1,  Object v2)throws GraphException;
    
    public void insertVertex(Object element)throws GraphException;
    
    public void insertEdge(Object v1,  Object v2)throws GraphException;
    
    public void insertHeight(Object v1,  Object v2, int Height)throws GraphException;
    
    public boolean isEmpty()throws GraphException;
    
    public void deleteVertex(Object element) throws GraphException;
    
    public void deleteEdge(Object v1, Object v2) throws GraphException;
    
}
