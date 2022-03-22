package leetCode.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Contest {
	public static List<List<Integer>> getAncestors(int n, int[][] edges) {
        Set<Integer> nums = new HashSet<Integer>();
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        boolean flag = false;
            
        for(int i = 0; i < edges.length; i++){
            for(int j = 0; j < 2; j++){
                nums.add(edges[i][j]);
            }
        }
        
       ///her bir eleman icin:
        for(int num : nums){
        	ArrayList<Integer> parent = new ArrayList<Integer>();
            for(int j = 0; j < edges.length; j++){
                if(num == edges[j][1])//elemanin atasini bulduk
                {
                    parent.add(edges[j][0]);
                }
            }
            results.add(parent);
    
        }
        return results;
    }
	
	public static void main(String[] args) {
		System.out.println(getAncestors(5, new int[][] {{0,3},{0,4},{1,3},{2,4},{2,7},{3,5},{3,6},{3,7},{4,6}}));
	}
}
