package dataStructures.LinkedList;


/*Bu interface LinkedList i�in ortak bir arayuz g�revi g�recektir.
 * Bu interface, LinkedList'te mevcut olan i�lemleri tan�mlayacakt�r.
 * Di�er t�m Veri Yap�lar� gibi, LinkedList de a�a��daki i�lemlere sahip olacakt�r:
 * 1. ba�lant�l� listeye bir d���m ekleyin.
 * 2. ba�lant�l� listeden bir d���m� silin.
 * 3. Ba�lant�l� listede bir d���m aray�n.
 * 4. T�m ba�lant�l� listeyi, d���mlerinin i�erdi�i veri t�r�ne g�re s�ralay�n.
 * 5. T�m ba�lant�l� listeyi gezin ve d���mlerinin i�eri�ini yazd�r�n.*/
public interface LinkedListInterface<T> {
	/**
     * Bu y�ntem, ba�lant�l� listeye bir d���m ekleyecektir.
     * Programc� yaln�zca bu y�nteme veri de�erini g�nderir ve bu
     * y�ntemi, i�ine eklenecek ba�lant�l� listeye uygun bir d���m olu�turur.
     *
     * @param item Ba�lant�l� listeye eklenecek veri de�eri.
     */
    void add(T item);

    /**
     * Bu y�ntem, ba�lant�l� listenin sonundaki bir d���m� kald�racakt�r.
     *
     * @return d���m�n verilerini d�nd�r�r
     */
    T remove();

    /**
     * Bu y�ntem, ba�lant�l� listede verilen ��enin herhangi bir tekrar�n� arayacakt�r.
     * ��e ba�lant�l� listede bulunursa, y�ntem negatif olmayan bir tamsay� d�nd�r�r
     * s�f�rdan b�y�k veya s�f�ra e�it ve boyuttan k���k.
     *
     * @param item Ba�lant�l� listede aranacak ��e.
     * @return listede bulunan ��enin dizinini d�nd�r�r.
     */
    int search(T item);

    /**
     * Bu y�ntem, ba�lant�l� listenin ��elerini s�ralayacakt�r.
     */
    void sort();

    /**
     * Bu y�ntem ba�lant�l� listede gezinir ve d���mlerin i�eri�ini tek tek yazd�r�r.
     */
    void print();
}
