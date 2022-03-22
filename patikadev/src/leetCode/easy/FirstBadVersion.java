package leetCode.easy;

public class FirstBadVersion {
	//ilk kotu surumu bul
	//cunku bu ilk kotu surum sonraki surumlerin hepsini kotu yapiyor
	/*Alg:
	 * sürümün başlangıcını al (start)
	 * sürümün sonunu al(end)
	 * orta sürümü bul (mid)--> mid = start + (end-start)/2 
	 * ans(cevap)
	 * 
	 * eğer orta surum kotu ise ve orta surumden bir onceki surum de kotu değilse
	 *  (bu durumda ilk kotu surum ortadaki surumdur)
	 *  return orta_surum
	 * eğer orta sürüm kotu ise
	 *  return func(start, mid-1) veya
	 *  ans = mid;
	 *  end = mid -1;//kotu sürüm orta surumden daha once var olabilir. BU yuzden end'i ortaSurumun 1 eksiğine guncelledik
	 *  
	 * yukaridaki kosullardan hicbir saglanmamissa(o zaman hem mid hem de (mid-1) sürümü kötü değildir)
	 *  return func(start, mid+1) veya
	 *  start = mid+1;*/
	public static int badVersion(int n) {
		int start = 0, end = n;
		int ans = 0, mid = 0;
		while(start < end) {
			mid = start + (end - start)/2;
			if(isBadVersion(mid) && !isBadVersion(mid-1)) {
				ans = mid;
				break;
			}
			else if(isBadVersion(mid)) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		return ans;
	}

	private static boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		return false;
	}
}
/*public int firstBadVersion(int n) {
        
        int ans = BinarySearch(n);
        return ans;
    }
    public int BinarySearch(int n)
    {
        int start =1;
        int end = n;
        int ans = 0;
        while(start<=end)
        {
            int mid = start +(end-start)/2;
            
            if(!isBadVersion(mid))
            {
                start = mid+1;
            }
            
            else {
                ans = mid;
                end = mid-1;
            }
            
        }
        return ans;
    }*/

/*int start =1;
        int h = n;
        int mid;
        while(h>l){
            mid = l+((h-l)/2);
            if(isBadVersion(mid)){
                h=mid;
            }
            else{
                l=mid+1;
            }
        }
        return l;*/



/*public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int s = 0;
        int e = n;
        int firstBad = binSearch(s,e);
        return firstBad;
    }
    public int binSearch(int s, int e)
    {
        if(s<=e)
        {
            int mid=s+(e-s)/2;
            if((!isBadVersion(mid-1) || mid==0) && isBadVersion(mid)) return mid;
            else if(isBadVersion(mid)) //look left
            {
                return binSearch(s,mid-1);
            }
            else
                //we will check only for larger versions
                return binSearch(mid+1,e);
            
        }
        return -1;
    }
}*/
