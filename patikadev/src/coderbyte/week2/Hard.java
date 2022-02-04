package coderbyte.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Hard {

	  public static String ShortestPath(String[] strArr) {
	    // / aðýrlýklandýrýlmamýþ pozitif maliyet grafiði saðlanýr
		// ilk ve son düðümler arasýndaki minimum maliyetli baðlantýyý bulun.

	    // Extract information from input
	    int numNodes = Integer.parseInt(strArr[0]);
	    //array in ilk elemaný, kaç düðüm olduðunu söylüyor 
	    //--> 
	    // "4", "X", "Y","Z","W","X-Y","Y-Z","X-W"  gibi
	    //output -> X-W
	    String nodeFirst = strArr[1];
	    String nodeLast = strArr[numNodes];
	    String[] nodesRest = Arrays.copyOfRange(strArr, 2, numNodes);// Y Z
	    String[] connections = Arrays.copyOfRange(strArr, numNodes + 1, strArr.length);


	 // Olasý dallarý depola (boþ olmayan)
	    ArrayList<String> branches = new ArrayList<String>();
	    // ilk yol þablonu eklendi
	    branches.add(nodeFirst);


	    //Ýlk yol þablonunu alýn
	    String path = branches.get(0);
	    // Yineleme için nodeFirst alýn
	    String head = String.valueOf(path.charAt(path.length() - 1));

	    while(true) {
	      // herhangi bir çözüm mevcutsa, onu döndürün
	      for (String branch : branches) {
	        if (branch.endsWith(nodeLast)) {
	          return branch;
	          }
	      }
	      
	      // Listeye döngüsel olmayan olasý alt yollar ekleyin
	      for (String conn : connections) {
	        // olasý atlama
	        String next;

	        // head için bir sonraki olasý atlamayý bulun
	        int charIndex = conn.indexOf(head);
	        // Left
	        if (charIndex == 0) {
	          next = String.valueOf(conn.charAt(2));
	        }
	        // Right
	        else if (charIndex == 2) {
	          next = String.valueOf(conn.charAt(2));//?????
	        }
	        // Alakasýz baðlantýyý geç
	        else {
	          continue;
	        }

	        // Sonraki atlama bir döngüye neden olmazsa (yani daha önce eklenmemiþse)
	        if (path.indexOf(next) < 0) {
	          // Add next as head
	          String child = path + "-" + next;
	          branches.add(0, child);
	        }
	      }

	      // Orijinal ana yolu listeden kaldýrýn
	      branches.remove(path);

	   // Dallarý artan boyutta sýrala
	      if (branches.size() > 0) {
	        branches.sort(Comparator.comparingInt(String::length));
	      }
	      // No possible connections
	      else {
	        return "-1";
	      }

	      // En ucuz yolu alýn (takýlýp kalabilir)
	      path = branches.get(0);
	      // Mevcut minimum maliyet yolu için baþ düðüm
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

