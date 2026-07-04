class Solution {

    public int minScore(int n, int[][] roads) {
        List<List<int[]>> adj = new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge : roads){
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            adj.get(u).add(new int[] {v,w});
            adj.get(v).add(new int[] {u,w});
        }

        Queue<Integer> q = new LinkedList<>();
        int[] vis = new int[n+1];
        int minPath = Integer.MAX_VALUE;

        q.offer(1);
        vis[1]=1;

        while(!q.isEmpty()){
            int currNode = q.poll();

            for(int[] adjNode : adj.get(currNode)){
                minPath = Math.min(minPath, adjNode[1]);

                if(vis[adjNode[0]]!=1){
                    vis[adjNode[0]] = 1;
                    q.offer(adjNode[0]);
                }
            }
        }

        return minPath;
    }
}