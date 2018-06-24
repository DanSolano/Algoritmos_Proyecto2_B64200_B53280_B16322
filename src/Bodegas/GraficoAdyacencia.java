
package Bodegas;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Michelle
 * B64200
 */
public class GraficoAdyacencia implements Graph, Serializable {

    private Object adjacencyMatrixGraph[][];
    private int counter;
    private int num;
    private Vertex[] vertexList;
    
    
private Map<Integer, String> arbolGrafo = new TreeMap<>();
    private Object adjacencyMatrix[][]; //matriz de adyacencia
    
    private int contadorArboles;
    

    public GraficoAdyacencia(int num) {

        if (num < 0) {
            System.out.println("Tamaño invalido");
            System.exit(0);
        }
        this.adjacencyMatrixGraph = new Object[num][num];
        this.num = num;
        this.counter = 0;
        this.vertexList = new Vertex[this.num];

        initializeMatrix();
    }

    private void initializeMatrix() {
        for (int i = 0; i < this.num; i++) {
            for (int j = 0; j < this.num; j++) {
                this.adjacencyMatrixGraph[i][j] = 0;
            }
        }
    }

    @Override
    public void Cancel() throws GraphException {
        for (int i = 0; i < this.vertexList.length; i++) {
            this.vertexList[i] = null;
        }
        this.counter = 0;
        this.initializeMatrix();
    }

    @Override
    public int getSize() throws GraphException {

        try {
            if (isEmpty()) {
                try {
                    throw new GraphException("El grafo está vacío");
                } catch (GraphException ex) {
                    Logger.getLogger(GraficoAdyacencia.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (GraphException ex) {
            Logger.getLogger(GraficoAdyacencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.counter;
    }

    @Override
    public boolean existVertex(Object element) throws GraphException {
        if (isEmpty()) {
            throw new GraphException("El grafo está vacío");
        }
        for (int i = 0; i < this.counter; i++) {
            if (vertexList[i].element.equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean existEdge(Object v1, Object v2) throws GraphException {
        if(!existVertex(v1)||!existVertex(v2)){
            throw new GraphException("Alguno de los vertices no existe");
        }
        if(!adjacencyMatrixGraph[getPosition(v1)][getPosition(v2)].equals(0)){
            return true;
        }
        return false;
    }

    private int getPosition(Object verti){
        
        for (int i = 0; i < this.counter; i++) {
            if(vertexList[i].element.equals(verti))
                return i;
        }
        return -1;
    }
    @Override
    public void insertVertex(Object element) throws GraphException {
        if(this.counter>= this.vertexList.length){
         throw  new GraphException("El grafo está lleno");
        }
        this.vertexList[this.counter++] = new Vertex(element);
    }

    @Override
    public void insertEdge(Object v1, Object v2) throws GraphException {
        if(!existVertex(v1)||!existVertex(v2)){
            throw new GraphException("Alguno de los vertices no existe");
        }
        this.adjacencyMatrixGraph[getPosition(v1)][getPosition(v2)]=1;
        this.adjacencyMatrixGraph[getPosition(v2)][getPosition(v1)]=1;
    }

    @Override
    public void insertHeight(Object v1, Object v2, int weight) throws GraphException {
        if (!existEdge(v1, v2) ) {
            throw new GraphException("Alguno o alguno de los vertices no existe");
        }
        this.adjacencyMatrixGraph[getPosition(v1)][getPosition(v2)]= weight;
        this.adjacencyMatrixGraph[getPosition(v2)][getPosition(v1)]= weight;
    }

    
    @Override
    public boolean isEmpty() throws GraphException {

        return this.counter == 0;

    }

    @Override
    public String toString() {
        String output = "GRAFO CON MATRICES DE ADYACENCIA\n";
        for (int i = 0; i < this.counter; i++) {
            output += "Vertice en posicioin "+i+" es :"+this.vertexList[i].element+"\n";
           
        }
        output+= "Lista de aristas\n";    
        
        for (int i = 0; i < this.num; i++) {
            for (int j = 0; j < this.num; j++) {
                if (!this.adjacencyMatrixGraph[i][j].equals(0)) {
                    output+= this.vertexList[i].element+"-------"+this.vertexList[j].element+"\n";
                }
                
            }
        }
        return output;
    }

    @Override
    public void deleteVertex(Object element) throws GraphException {
        
        if (existVertex(element)) {
            for (int i = 0; i < this.counter; i++) {
               if(this.vertexList[i].element.equals(element)){
                   for (int j = 0; j < this.counter; j++) {
                       if(existEdge(element, this.vertexList[j].element))
                           deleteEdge(element, this.vertexList[j].element);
                   }
                   for (int j = i; j < this.counter-1; j++) {
                       this.vertexList[j] = this.vertexList[j+1];
                   }
                   this.counter--;
               } 
            }           
        }
    }

    @Override
    public void deleteEdge(Object v1, Object v2) throws GraphException {
        
        if(!existVertex(v1)|| !existVertex(v2)){
            throw new GraphException("Alguno de las vertices no existe");
        }
        this.adjacencyMatrixGraph[getPosition(v1)][getPosition(v2)]=0;
        this.adjacencyMatrixGraph[getPosition(v2)][getPosition(v1)]=0;
    }
    
   
public void ejercicioExtra(Object vertice1, Object vertice2) throws GraphException {

        if (!existVertex(vertice1) || !existVertex(vertice2)) {
            throw new GraphException("Alguno o ninguno de los vértices existe!");
        }
        String conexiones = vertice1 + "--------" + vertice2;
        arbolGrafo.put(contadorArboles, conexiones);
        contadorArboles++;
    }

    public String toStringListTree() {
        String temporal = "Arista treemap para el grafo de adyacencia\n";
        for (Map.Entry<Integer, String> mapeo : arbolGrafo.entrySet()) {
            temporal += mapeo.getValue() + "\n";
        }
        return temporal;
    }
    
}
