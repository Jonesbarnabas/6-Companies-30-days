import java.util.LinkedList;

public class graph_bfs {
    public static int v;
    public static LinkedList<Integer> adj[];
    graph_bfs(int vertices){
        adj=new LinkedList[vertices];
        for(int i=0;i<vertices;i++){
            adj[i]=new LinkedList<>();
        }
    }
    public void add(int a,int b){
        adj[a].add(b);
        adj[b].add(a);
    }
    public void bfs(int s){
        boolean visited[]=new boolean[v];
        

    }
    public static void main(String[] args) {
        graph_bfs g=new graph_bfs(4);
        g.add(1,0);
        g.add(1,2);
        g.add(2,3);
        g.add(3,0);
        g.bfs(0);
    }
}

