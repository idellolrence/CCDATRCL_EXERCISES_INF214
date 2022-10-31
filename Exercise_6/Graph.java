public class Graph {

    // inner class
    // to keep track of edges
    class Edge {
        String from, to;
    }

    // number of vertices and edges
    int vertices, edges;

    // array to store all edges
    Edge[] edge;

    Graph(int vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;

        // initialize the edge array
        edge = new Edge[edges];
        for (int i = 0; i < edges; i++) {

            // each element of the edge array
            // is an object of Edge type
            edge[i] = new Edge();
        }
    }
    
    public static void main(String[] args) throws Exception {

        // create an object of Graph class
        int noVertices = 14;
        int noEdges = 26;
        Graph myGraph = new Graph(noVertices, noEdges);

        // create graph

        // Edge 1
        myGraph.edge[0].from = "Idel";
        myGraph.edge[0].to = "Mharc";


        // Edge 2
        myGraph.edge[1].from = "Idel";
        myGraph.edge[1].to = "Gela";

        // Edge 3
        myGraph.edge[2].from = "Idel";
        myGraph.edge[2].to = "Che";

        // Edge 4
        myGraph.edge[3].from = "Idel";
        myGraph.edge[3].to = "Aron";
        
        // Edge 5
        myGraph.edge[4].from = "Idel";
        myGraph.edge[4].to = "Sophia";
        
        // Edge 6
        myGraph.edge[5].from = "Idel";
        myGraph.edge[5].to = "Aubrey";
        
        // Edge 7
        myGraph.edge[6].from = "Idel";      
        myGraph.edge[6].to = "Myco";
        
        // Edge 8
        myGraph.edge[7].from = "Idel";
        myGraph.edge[7].to = "Tricia";
        
        // Edge 9
        myGraph.edge[8].from = "Idel";
        myGraph.edge[8].to = "Tine";
        
        // Edge 10
        myGraph.edge[9].from = "Idel";
        myGraph.edge[9].to = "Jaki";

        // Edge 11
        myGraph.edge[10].from = "Mharc";
        myGraph.edge[10].to = "Ela";
        
        // Edge 12
        myGraph.edge[11].from = "Mharc";
        myGraph.edge[11].to = "Che";
        
        // Edge 13
        myGraph.edge[12].from = "Gela";
        myGraph.edge[12].to = "Ela";
        
        // Edge 14
        myGraph.edge[13].from = "Gela";
        myGraph.edge[13].to = "Luke";
        
        // Edge 15
        myGraph.edge[14].from = "Gela";
        myGraph.edge[14].to = "Che";
        
        // Edge 16
        myGraph.edge[15].from = "Gela";
        myGraph.edge[15].to = "Aubrey";
        
        // Edge 17
        myGraph.edge[16].from = "Ela";
        myGraph.edge[16].to = "Luke";
        
        // Edge 18
        myGraph.edge[17].from = "Che";
        myGraph.edge[17].to = "Miles";
        
        // Edge 19
        myGraph.edge[18].from = "Che";
        myGraph.edge[18].to = "Aron";
        
        // Edge 20
        myGraph.edge[19].from = "Aron";
        myGraph.edge[19].to = "Sophia";
        
        // Edge 21
        myGraph.edge[20].from = "Aubrey";
        myGraph.edge[20].to = "Jaki";
        
        // Edge 22
        myGraph.edge[21].from = "Jaki";
        myGraph.edge[21].to = "Tricia";
        
        // Edge 23
        myGraph.edge[22].from = "Tricia";
        myGraph.edge[22].to = "Myco";     
        
        // Edge 24
        myGraph.edge[23].from = "Tricia";
        myGraph.edge[23].to = "Tine";
        
        // Edge 25
        myGraph.edge[24].from = "Tricia";
        myGraph.edge[24].to = "Emman";
        
        // Edge 26
        myGraph.edge[25].from = "Emman";
        myGraph.edge[25].to = "Tine";
        
        
        System.out.println("Idel's Social Media Network");

        // print graph
        for (int i = 0; i < noEdges; i++) {
            System.out.println(i+1 + ") " + myGraph.edge[i].from + " - " + myGraph.edge[i].to);
        }

    }
}
