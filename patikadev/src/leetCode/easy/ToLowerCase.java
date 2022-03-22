package leetCode.easy;

public class ToLowerCase {
	/*k���k harf ve b�y�k harf ascii de�eri aras�ndaki fark 32'dir, 
	 * bu nedenle b�y�k harfin k���k harfe d�n��t�r�lmesi gerekti�inde, b�y�k harf de�erine 32 ekleyin.
	 *  ve k���k harften b�y�k harfe d�n��t�rmek i�in, k���k harf karakterden 32 eksiltin
	 
	 mesela:
	 if ('A' <= a[i] && a[i] <= 'Z')
            a[i] = (char) (a[i] - 'A' + 'a');
            
     - 'A' + 'a' --> burada aslinda buyuk ve kucuk harf arasindaki fark aliniyor(yukarida yaz�ilan gibi) 
     ve (buyuk olan)harfe kucuk harfe donusmesi icin ekleniyor
	 
	 */

	
	//birinci yol: (en yava� ve acemi cozum)
	//runtime == 13ms
	public String toLowerCase1(String s) {
        String res = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                res += Character.toLowerCase(c);
            }
            else
                res += c;
        }
        return res;
    }
	
	//ikinci yol: (daha iyi cozum)
	//runtime == 0ms
	public static String toLowerCase2(String str) {
	    char[] res = str.toCharArray();
	    for(int i = 0; i < res.length; i++)
	        if(res[i] >= 'A' && res[i] <= 'Z') 
	        	res[i] += 32;//1. yol
	           //a[i] = (char) (a[i] - 'A' + 'a'); --> 2.yol
	    return new String(res);
	  String.val
	}    
	
	//ucuncu yol: (char array kullanmadan)
	 public String toLowerCase(String str) {
	        StringBuilder sb = new StringBuilder();        
	        for (int i = 0; i < str.length(); i++) {            
	            char c = (char)(str.charAt(i) | (char)(32));
	            // |  --> bitsel veya (1 0 -->1, 1 1-->1, 0 0-->0 
	            sb.append(c);
	        }
	        return sb.toString();
	    }
	
	public static void main(String[] args) {
		System.out.println(toLowerCase2("MERhaBa"));
		
	}
}
