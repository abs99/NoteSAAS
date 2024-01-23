import org.yaml.snakeyaml.util.ArrayUtils;

import java.util.*;

class Solution {

    public static void main(String[] args) {
       String s= "a good   example";
        String[]arr = s.split(" ",0);
        int i=0,e=arr.length-1;

        while(i<e){
            String t=arr[i];
            arr[i]=arr[e];
            arr[e]=t;
            i++;e--;
        }
        System.out.print(arr.length);
        String ans="";
        for(int j=0;j<arr.length;j++){
            // System.out.println(arr[j]+":");
            if(arr[j]=="")continue;
            ans+=arr[j] +( j==arr.length-1? "" :" ");
        }
        System.out.println(ans);


    }
}

class  CustomComp implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}

class sub {
    public  List<Integer> maxCombinations(int N, int K, int A[], int B[]) {
        int C=K;


        PriorityQueue<Integer> p = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<A.length;i++){

            for(int j=0;j<B.length;j++){
                int num =A[i]+B[j];
                p.add(num);
            }
        }

        Iterator itr=p.iterator();
        int i=0;
        List<Integer> ans = new ArrayList<Integer>();
        while (!p.isEmpty()) {
            int a = p.poll();
            System.out.print(a + ",");
            ans.add(a);
            i++;
        }

        return ans;

    }
}