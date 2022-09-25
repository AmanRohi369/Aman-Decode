class UnionFind {
    int n;
    int parent[];
    int rank[];
    public UnionFind(int n){
        this.n = n;
        this.parent = new int[n];
        this.rank = new int[n];
        for(int i=0;i<n;i++) parent[i]=i;
    }
    
    public int find(int x){
        if(parent[x]!=x) parent[x] = find(parent[x]);
        return parent[x];
    }
    public void unify(int x, int y){
        int px=find(x);
        int py=find(y);
        
        if(px == py) return;
        if(rank[px]>rank[py]) parent[py]=px;
        else if(rank[px]<rank[py]) parent[px]=py;
        else {
            rank[py]++;
            parent[px]=py;
        }
    }
}
