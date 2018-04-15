package basicDataStructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class sampleGraph {

	int V;
	LinkedList<Integer> adj[];
	
	public sampleGraph(int v) {
		V = v;
		adj = new LinkedList[V];
		for(int i=0;i<v;i++)
		adj[i] = new LinkedList<Integer>();
	}
	
	public void addEdge(int v,int w){
		adj[v].add(w);
	}
	
	public void traverseBFS(int s){		
		boolean visited[] = new boolean[V];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		queue.add(s);
		visited[s]=true;
		while(!queue.isEmpty()){			
			int key = queue.poll();		
			System.out.println(key);
			Iterator<Integer> i = adj[key].listIterator();
			while(i.hasNext()){
				int nextKey = i.next();
				if(visited[nextKey]!=true){
					visited[nextKey] = true;
					queue.add(nextKey);
				}				
			}			
		}		
	}
	
	
public void  traverseDFS(int s){
	boolean visited[] = new boolean[V];		
	
	for(int i=0;i<V;i++)
	{
		if(visited[i]!=true)
		traverseDFSUtil(i,visited);
	}
}
	public void traverseDFSUtil(int s,boolean visited[]){				
		visited[s]=true;
		System.out.println(s);
		Iterator<Integer> i = adj[s].listIterator();
		while(i.hasNext()){
			int n = i.next();			
			if(visited[n]!=true){
				traverseDFSUtil(n,visited);
			}
		}
		
	}
	
	public static void main(String[] args) {
		sampleGraph graph = new sampleGraph(4);
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		//graph.addEdge(2, 3);
		graph.addEdge(3, 3);
		
		
		System.out.println("Following is Breadth First Traversal");
		graph.traverseBFS(2);
		
		System.out.println("Following is Depth First Traversal");
		graph.traverseDFS(0);

	}

}
