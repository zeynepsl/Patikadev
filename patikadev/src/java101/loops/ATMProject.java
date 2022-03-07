package java101.loops;

import java.util.Scanner;

public class ATMProject {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String userName = "zeynep", password = "1234";
		double toplamBakiye = 0;
		int choice = 0;

		boolean res = login(userName, password, scanner);
		
		while(res) {
			System.out.println("para yatýrma 1\n" + "para cekme 2\n" + "bakiye sorgulama 3\n" + "çýkýþ yapma 4\n");
			choice = scanner.nextInt();
			if(choice == 1) {
				toplamBakiye = paraYatir(toplamBakiye, scanner);
				System.out.println("toplam bakiyeniz: " + toplamBakiye);
			}
			else if(choice == 2) {
				toplamBakiye = paraCek(toplamBakiye, scanner);
				System.out.println("toplam bakiyeniz: " + toplamBakiye);
			}
			else if(choice == 3) {
				System.out.println("toplam bakiyeniz: " + toplamBakiye);
			}
			else if(choice == 4) {
				break;
			}
			
			System.out.println();
		}

	}
	
	public static double paraCek(double toplamBakiye, Scanner scanner) {
		double toplam = toplamBakiye;
		System.out.println("ne kadar para cekmek istiyordunuz: ");
		double cekilecekMiktar = scanner.nextDouble();
		if(cekilecekMiktar > toplam) {
			System.out.println("bakiyenizde yeterli miktar yok");
		}
		else {
			toplam -= cekilecekMiktar;
		}
		return toplam;
	}
	
	public static double paraYatir(double toplamBakiye, Scanner scanner) {
		System.out.println("ne kadar para yatirmak istiyordunuz: ");
		double yatirilacakBakiye = scanner.nextDouble();
		return toplamBakiye += yatirilacakBakiye;
	}

	public static boolean login(String userName, String password, Scanner scanner) {

		String enteredUserName = "", enteredPassword = "";

		int numberOfEntries = 0;
		boolean flag = false;

		while (numberOfEntries < 3) {
			System.out.print("kullanici ismi: ");
			enteredUserName = scanner.nextLine();

			System.out.print("sifre: ");
			enteredPassword = scanner.nextLine();

			if (enteredUserName.equals(userName) && enteredPassword.equals(password)) {
				System.out.println("successfully login!");
				flag = true;
				break;
			} else {
				System.out.println("invalid login");
				flag = false;
				numberOfEntries++;
			}

			System.out.println();
		}

		if (numberOfEntries == 3) {
			System.out.println("system blocked");
			return flag;
		}

		return flag;
	}
}
