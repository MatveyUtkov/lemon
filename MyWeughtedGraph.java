import java.util.HashSet;
import java.util.Set;

public class MyWeughtedGraph<T> {
    private final boolean undirected;
    private Set<Vertex<T>> vertices;
    public MyWeughtedGraph() {
        this.undirected = true;
    }

    public MyWeughtedGraph(boolean undirected) {
        this.undirected = undirected;
        vertices=new HashSet<>();    
    }
    public void addVertex(Vertex<T> source) {
    	 vertices.add(source);
    }
  
    public void addEdge(Vertex<T> source, Vertex<T> dest, double weight) {
    if(!hasVertex(source)) addVertex(source);
    if(!hasVertex(dest))addVertex(dest);
    if (hasEdge(source, dest)
            || source.equals(dest))
        return;
   source.add(new MyEdge<>(source, dest, weight));
    }

    public int getVerticesCount() {
        return vertices.size();
    }

    public int getEdgesCount() {
        int count = 0;
        for (Vertex<T> vertex : vertices) {
            int degree = vertex.degreeOfVertex();
            count += degree;
        }

        if (undirected) return count / 2;

        return count;
    }


    public boolean hasVertex(Vertex<T> v) {
        return vertices.contains(v);
    }

    public boolean hasEdge(Vertex<T> source, Vertex<T> dest) {
    	 return hasVertex(source) && source.hasAdjacentVertex(dest);
    }
    public Set<Vertex<T>> adjacencyList(Vertex<T> vertex) {
        return !hasVertex(vertex) ? null : vertex.getAdjacentVertices();
    }
 

	

   
}