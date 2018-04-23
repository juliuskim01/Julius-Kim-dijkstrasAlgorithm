package DijkstrasAlgorithm;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;


    public class Graph {
        /**
         * List of edges containing all the edges.
         */
        private final List<Edge> edges;

        /**
         * Constructs a graph from an ArrayList of ArrayList of ArrayList of Integers.
         * @param graph an ArrayList of ArrayList of ArrayList of Integers.
         */
        public Graph(ArrayList<ArrayList<ArrayList<Integer>>> graph) {
            edges = new ArrayList<Edge>();
            for(int i = 0; i < graph.size(); i++) {
                int source = i + 1;
                ArrayList<ArrayList<Integer>> level1 = graph.get(i);
                for(int j = 0; j < level1.size(); j++) {
                    ArrayList<Integer> level2 = level1.get(j);
                    int target = level2.get(0);
                    int distance = level2.get(1);

                    Edge e = new Edge(source, target, distance);
                    edges.add(e);
                }
            }
        }

        /**
         * Returns a list of edges of the edges.
         * return List<Edge> all the edges in the graph.
         */
        public List<Edge> getEdges() {
            return edges;
        }
    }








