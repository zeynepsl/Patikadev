package dataStructures.LinkedList;


/*Bu interface LinkedList için ortak bir arayuz görevi görecektir.
 * Bu interface, LinkedList'te mevcut olan iþlemleri tanýmlayacaktýr.
 * Diðer tüm Veri Yapýlarý gibi, LinkedList de aþaðýdaki iþlemlere sahip olacaktýr:
 * 1. baðlantýlý listeye bir düðüm ekleyin.
 * 2. baðlantýlý listeden bir düðümü silin.
 * 3. Baðlantýlý listede bir düðüm arayýn.
 * 4. Tüm baðlantýlý listeyi, düðümlerinin içerdiði veri türüne göre sýralayýn.
 * 5. Tüm baðlantýlý listeyi gezin ve düðümlerinin içeriðini yazdýrýn.*/
public interface LinkedListInterface<T> {
	/**
     * Bu yöntem, baðlantýlý listeye bir düðüm ekleyecektir.
     * Programcý yalnýzca bu yönteme veri deðerini gönderir ve bu
     * yöntemi, içine eklenecek baðlantýlý listeye uygun bir düðüm oluþturur.
     *
     * @param item Baðlantýlý listeye eklenecek veri deðeri.
     */
    void add(T item);

    /**
     * Bu yöntem, baðlantýlý listenin sonundaki bir düðümü kaldýracaktýr.
     *
     * @return düðümün verilerini döndürür
     */
    T remove();

    /**
     * Bu yöntem, baðlantýlý listede verilen öðenin herhangi bir tekrarýný arayacaktýr.
     * Öðe baðlantýlý listede bulunursa, yöntem negatif olmayan bir tamsayý döndürür
     * sýfýrdan büyük veya sýfýra eþit ve boyuttan küçük.
     *
     * @param item Baðlantýlý listede aranacak öðe.
     * @return listede bulunan öðenin dizinini döndürür.
     */
    int search(T item);

    /**
     * Bu yöntem, baðlantýlý listenin öðelerini sýralayacaktýr.
     */
    void sort();

    /**
     * Bu yöntem baðlantýlý listede gezinir ve düðümlerin içeriðini tek tek yazdýrýr.
     */
    void print();
}
