public ArrayList<Integer>[] getGraph(int edges[][],int n){
    ArrayList<Integer> graph[] = new ArrayList[n];
    for(int i=0;i<n;i++) graph[i]=new ArrayList<>();
    for(int edge[] : edges){
        graph[edge[0]].add(edge[1]);
        graph[edge[1]].add(edge[0]);
    }
    return graph;
}
