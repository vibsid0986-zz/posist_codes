import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class HelloWorld{
     public static void main(String []args){
       Node gen=new Node();
       
     }
         
     }
     public class Node{
        DateFormat time = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        data d=new data();
        HashSet<data> map=new HashSet<>();
        long nodenum;
        String nodeid;
        Node parentref=null;
        ArrayList<Node>childref=new ArrayList<>();
        Node genesisref=null;
        HashSet<Node>values=new HashSet<>();
     }
     Node root;
     public void createnode(float data){
         if(root==null){
             root=generateroot(root,data);
         }else{
             Node child=new Node();
             float sum=0;
             for(int i=0;i<childref.size();i++){
                 sum+=childref.get(i).d.value;
             }
             if(sum<parentref.d.value){
                 childref.add(child);
                 child.d.value=data;
             }
             else{
                 createnode(data);
             }
         }
     }
     
    void longestchain(Node node, int path[], int pathLen, 
                                         int max, int f)
{
    if (node == NULL)
        return;
 
    path[pathLen] = node.d.value;
    pathLen++;
 
    if (node.childref.size()==0) {
        if (pathLen == max && (f == 0 || f == 1)) {
            printArray(path, pathLen, f);
            f = 2;
        }
    }
 
    else {
 
        for(Node child:childref){
            printPathsRecur(child, path, pathLen, max, f);
        }
        
    }
}
     public Node generateroot(Node root,float data)
        {
           root.d.value=data;
           return root;
        }  
     
     public class data{
              int own_id;
              float value;
              String own_name;
              
    }
}
