class Solution {
    public class Node{
        int id;
        List<Node> prereq;
        int indegree;
        Node(int id){
            this.id = id;
            indegree=0;
            prereq =new ArrayList<Node>();
        }
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Node[] nodes =canCreate(numCourses,prerequisites);
        
        Queue <Node> queue =new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(nodes[i].indegree==0){
                queue.add(nodes[i]);
            }
        }
        int ct=0;
        while(!queue.isEmpty()){
            // System.out.println(queue);
            ct++;
            Node n = queue.poll();
            List<Node> list = n.prereq;
            for(Node a: list){
                a.indegree--;
                if(a.indegree==0){
                    queue.add(a);
                }
            }
        }
        
        return ct==numCourses;
        
    }
    public Node[] canCreate(int numCourses, int[][] prerequisites){
        Node [] nodes =new Node[numCourses];
        for(int i=0;i<numCourses;i++){
            nodes[i]= new Node(i);
        }
        for(int [] pre : prerequisites){
            nodes[pre[0]].indegree++;
            nodes[pre[1]].prereq.add(nodes[pre[0]]);
        }
        
        return nodes;
    }
}