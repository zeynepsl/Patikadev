package coderbyte.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Hard {

	  public static String ShortestPath(String[] strArr) {
	    // / a��rl�kland�r�lmam�� pozitif maliyet grafi�i sa�lan�r
		// ilk ve son d���mler aras�ndaki minimum maliyetli ba�lant�y� bulun.

	    // Extract information from input
	    int numNodes = Integer.parseInt(strArr[0]);
	    //array in ilk eleman�, ka� d���m oldu�unu s�yl�yor 
	    //--> 
	    // "4", "X", "Y","Z","W","X-Y","Y-Z","X-W"  gibi
	    //output -> X-W
	    String nodeFirst = strArr[1];
	    String nodeLast = strArr[numNodes];
	    String[] nodesRest = Arrays.copyOfRange(strArr, 2, numNodes);// Y Z
	    String[] connections = Arrays.copyOfRange(strArr, numNodes + 1, strArr.length);


	 // Olas� dallar� depola (bo� olmayan)
	    ArrayList<String> branches = new ArrayList<String>();
	    // ilk yol �ablonu eklendi
	    branches.add(nodeFirst);


	    //�lk yol �ablonunu al�n
	    String path = branches.get(0);
	    // Yineleme i�in nodeFirst al�n
	    String head = String.valueOf(path.charAt(path.length() - 1));

	    while(true) {
	      // herhangi bir ��z�m mevcutsa, onu d�nd�r�n
	      for (String branch : branches) {
	        if (branch.endsWith(nodeLast)) {
	          return branch;
	          }
	      }
	      
	      // Listeye d�ng�sel olmayan olas� alt yollar ekleyin
	      for (String conn : connections) {
	        // olas� atlama
	        String next;

	        // head i�in bir sonraki olas� atlamay� bulun
	        int charIndex = conn.indexOf(head);
	        // Left
	        if (charIndex == 0) {
	          next = String.valueOf(conn.charAt(2));
	        }
	        // Right
	        else if (charIndex == 2) {
	          next = String.valueOf(conn.charAt(2));//?????
	        }
	        // Alakas�z ba�lant�y� ge�
	        else {
	          continue;
	        }

	        // Sonraki atlama bir d�ng�ye neden olmazsa (yani daha �nce eklenmemi�se)
	        if (path.indexOf(next) < 0) {
	          // Add next as head
	          String child = path + "-" + next;
	          branches.add(0, child);
	        }
	      }

	      // Orijinal ana yolu listeden kald�r�n
	      branches.remove(path);

	   // Dallar� artan boyutta s�rala
	      if (branches.size() > 0) {
	        branches.sort(Comparator.comparingInt(String::length));
	      }
	      // No possible connections
	      else {
	        return "-1";
	      }

	      // En ucuz yolu al�n (tak�l�p kalabilir)
	      path = branches.get(0);
	      // Mevcut minimum maliyet yolu i�in ba� d���m
	      head = String.valueOf(path.charAt(path.length() - 1));
	    }
	  }

	  public static void main (String[] args) {
	    // keep this function call here
	   // Scanner s = new Scanner(System.in);
	    String[] paths = {"4", "X", "Y","Z","W","X-Y","Y-Z","Z-W"};
	    System.out.print(ShortestPath(paths)); 
	  }

	}

