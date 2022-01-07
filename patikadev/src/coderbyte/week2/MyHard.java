package coderbyte.week2;

import java.util.ArrayList;

public class MyHard {
	public static String enKisaYol(String[] strArr) {
		// "4", "X", "Y","Z","W","X-Y","Y-Z","X-W"  gibi
		//ilk elemaný al --> düðüm sayýsýný veriyor
		//ilk düðümü al
		//son düðümü al
		//aradaki düðümleri al
		//baðlantýlarý al
		
		int nodeCount = Integer.parseInt(strArr[0]);//4
		//String nodeStart = strArr[1];
		//String nodeEnd = strArr[nodeCount];
		
		String[] nodesRest = new String[]{};
		ArrayList<String> connections = new ArrayList<String>();
		
		//4
		for (int i = 1; i < strArr.length; i++) {
			if(i <= nodeCount) {
				nodesRest[i] = strArr[i];
			}
			else {
				connections.add(strArr[i]);
			}
		}
		
		String yazi = "kjkds dsd";
		yazi.trim();
	
		
		//String[] nodesRest = Arrays.copyOfRange(strArr, 2, nodeCount);
		//String[] connections = Arrays.copyOfRange(strArr, nodeCount+1, strArr.length);
	
		
		ArrayList<String> branches = new ArrayList<String>();
		//branches.add(nodeStart);
		
		String path = branches.get(0);
		String head = String.valueOf(path.charAt(path.length()-1));
		
		return null;
		
	}

}
