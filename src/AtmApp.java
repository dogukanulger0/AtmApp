import java.util.Scanner;

public class AtmApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("TC KİMLİK NUMARANIZI GİRİNİZ :");
		String tcNo = sc.next();
		System.out.println("KART ŞİFRENİZİ GİRİNİZ :");
		String cardPassW = sc.next();
		accountControl(tcNo, cardPassW);

	}

	static void accountControl(String tcNo, String cardPassW) {
		String[] user= {"123456","456789","987654","654321"};
		String[] passWord= {"123","456","789","987"};
		boolean giris=false;
	
		for(int i =0 ; i<user.length;i++) {
			if(user[i].equals(tcNo)&& passWord[i].equals(cardPassW)) {
				giris=true;
				break;
			}else {
				giris=false;
			}
		}
		if(giris) {
			System.out.println("GİRİŞ BAŞARILI");
			Scanner sc=new Scanner(System.in);
		    switch (tcNo) {
			case "123456": {
				String ad="DOĞUKAN ÜLGER";
				double bakiye=1500.0;
				System.out.println("SAYIN "+ad+" HOŞGELDİNİZ \nGÜNCEL BAKİYENİZ :"+bakiye);
				hesapİslem(ad, bakiye, false);
				break;
			}
			case "456789": {
				String ad="MEVLÜT BOZDEMİR";
				double bakiye=1600.0;
				System.out.println("SAYIN "+ad+" HOŞGELDİNİZ \nGÜNCEL BAKİYENİZ :"+bakiye);
				hesapİslem(ad, bakiye, false);
				break;
			}
			case "987654": {
				String ad="ARİF ALBAYRAK";
				double bakiye=1700.0;
				System.out.println("SAYIN "+ad+" HOŞGELDİNİZ \nGÜNCEL BAKİYENİZ :"+bakiye);
				hesapİslem(ad, bakiye, false);
				break;
			}
			case "654321": {
				String ad="ÖMER ALTIN";
				double bakiye=1800.0;
				System.out.println("SAYIN "+ad+" HOŞGELDİNİZ \nGÜNCEL BAKİYENİZ :"+bakiye);
				hesapİslem(ad, bakiye, false);
				break;
			}
			default:
				System.out.println("HATA!!!");
			}
		}else {
			System.out.println("HATALI BİLGİ GİRİŞİ !!!");
		}
		
	}
	static void hesapİslem(String ad, double bakiye, boolean giris) {
		Scanner sc= new Scanner(System.in);
		System.out.println("SAYIN "+ad+" YAPMAK İSTEDİĞİNİZ İŞlEMİ SEÇİNİZ: \n[1]PARA ÇEKME \n[2]PARA YATIRMA ");
	    double islem=sc.nextDouble();
	     if(islem==1) {
	    	 System.out.println("SAYIN "+ad+" ÇEKMEK İSTEDİĞİNİZ TUTARI GİRİNİZ :");
	    	 double tutar=sc.nextDouble();
	    	 if(tutar<=bakiye) {
	    		 bakiye=tutar-bakiye;
	    		 System.out.println("SAYIN "+ad+" PARA ÇEKİLDİ "+" \n SAYIN "+ad +"  GÜNCEL BAKİYENİZ: "+bakiye);
	    		 
	    	 }else {
	    		 System.out.println("SAYIN "+ad+" YETERSİZ BAKİYE!!!");
	    	 }
	    	 
	     }else if(islem==2) {
	    	 System.out.println(ad+ " YATIRMAK İSTEDİĞİNİZ TUTARI GİRİNİZ :");
	    	 double tutar=sc.nextDouble();
	    	 bakiye=tutar+bakiye;
	    	 System.out.println("SAYIN "+ad+" PARA YATIRMA İŞLEMİNİZ BAŞARILI  " +" \n SAYIN "+ad+" GÜNCEL BAKİYENİZ : "+bakiye);
	     }else {
	    	 System.out.println("HATALI İŞLEM!!!");
	     }
	}
	
}
