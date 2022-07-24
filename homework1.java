package first_prog;



public class homework1 {
	
	// isim     : Egemen
	// Soyisim  : Güçlü
	// Numara	: N21236839
	
    public static int num_digits(int a){
        int decimal = 10;
        int counter = 1;// Tamsayi en kucuk tek basamakli olacagi icin counter 1 den baslatildi
        double division =  a/decimal;// ilk bolme islemi yapildi
        
        while (division >= 1){// eger bolum 1 den buyuk ise bolmeye devam edildi
            division = division/decimal;
            counter += 1;// basamak sayisi arttirildi
        }
    return counter;
    }//completed Q1

    public static void number_matrix(int a, int b){
        int[][] matrix = new int[a][b];
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                matrix[i][j] = i+j+1; // matrix olusturuldu
            }
        }
        //System.out.println(matrix);
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                System.out.print(matrix[i][j] + " ");// ekrana bastirildi
                }
        System.out.println();
        }
    }//completed Q2
    
	public static String str_replace(String str1, String str2, String str3) {
		
		//data field
		String result_string = new String();
		result_string = str1;
		
		char[] str1_array = str1.toCharArray(); // String ler char array haline getirildi
		char[] str2_array = str2.toCharArray();
		char[] str3_array = str3.toCharArray();
		
		int str1_len = 0;
		int str2_len = 0;
		int str3_len = 0;
		
		for(char value: str1_array) { // string 1 in uzunlugunu bulmak icin
			str1_len += 1; }
		for(char value: str2_array) { // string 2 in uzunlugunu bulmak icin
			str2_len += 1; }
		for(char value: str3_array) { // string 3 in uzunlugunu bulmak icin
			str3_len += 1; }


		int match_size_for_array = 0;
		int match_successful = 0;
	
		
		for(int i=0; i<=str1_len-str2_len; i++) {
			if(str1_array[i] == str2_array[0]) {
				int char_match_count = 1 ;
				if(str2_len==1){
					match_size_for_array += 1;
				}
				else {
					for(int j=1; j<str2_len; j++) {//str2 nin tek harfli olma kosulu icin dusunulecek completed________
						
						if(str1_array[i+j] == str2_array[j]) {
							char_match_count += 1;
							
							if(char_match_count == str2_len) {// str2 match successful
								match_size_for_array += 1;//  eslesen indexlerin arrayini olusturmak icin size bulduruldu
								
							}
						}
					}
				}
			}
		}

		int[] i_array = new int[match_size_for_array];
		int match_count3_for_loop = 0;

		for(int i=0; i<=str1_len-str2_len; i++) {
			if(str1_array[i] == str2_array[0]) {
				int char_match_count = 1 ;
				if(str2_len==1) {
					//match_count += 1;
					match_successful = 1;
					i_array[match_count3_for_loop] = i;
					match_count3_for_loop += 1;					
					
				}
				else {
					for(int j=1; j<str2_len; j++) {//str2 nin tek harfli olma kosulu icin dusunulecek completed________
						
						if(str1_array[i+j] == str2_array[j]) {
							char_match_count += 1;
							
							if(char_match_count == str2_len) {// str2 match successful
								
								match_successful = 1;
								i_array[match_count3_for_loop] = i;// eslesen kelimelerin indexlerin tutuldugu array olusturuldu
								match_count3_for_loop += 1;
							}
						}
					}
				}
			}
		}

		
		int temp_array_size2 = str1_len+(str3_len-str2_len);
		char[] temp_str_array2 = new char[temp_array_size2];
		if(match_successful == 0) {
			return result_string;
			
		}
		else if (match_successful == 1){

			for(int k=0; k<i_array[0];k++) {
				temp_str_array2[k] = str1_array[k];// str1 basindan eslesmeye kadar kendini basti
			}
			int increment_for_str3 = 0;
			for(int l=i_array[0]; l < i_array[0]+str3_len;l++) {
				temp_str_array2[l] = str3_array[increment_for_str3];// str3 basildi
				increment_for_str3 += 1;
			}
			
			int increment_for_str1 = i_array[0]+str2_len;
			for(int m=i_array[0]+str3_len; m<temp_array_size2; m++) {// str1 str3 un ardindan basilmaya devam edildi
				temp_str_array2[m] = str1_array[increment_for_str1];
				increment_for_str1 += 1;
			}
			
			result_string = new String(temp_str_array2); // degistirilen array String haline getirildi
			
			str1 = result_string; // recursion oncesi str1 degistirilmis string olarak degistirildi
			result_string = str_replace(str1, str2, str3); // recursion sonrasi return edebilmek icin result_stringe esitlendi
		}

		return result_string;
	
		
	}
	
    public static String compute_letter(int a1, int a2, int a3, int f){
        String letter_note = "";
        double avg = a1*0.2 + a2*0.2 + a3*0.2 + f*0.4;
        int int_avg = (int) avg;
        //System.out.println("raw avg is " + avg);
        if(avg-int_avg <0.5){
            avg = int_avg;
        }
        else{
            avg = int_avg + 1;
        }
        //System.out.println("trancated avg is " + avg);
        
        if( avg >= 0 && avg < 40){
            letter_note = "F";
        }
        else if( avg >= 40 && avg < 55){
            letter_note = "D";
        }
        else if( avg >= 55 && avg < 60){
            letter_note = "C3";
        }
        else if( avg >= 60 && avg < 65){
            letter_note = "C2";
        }
        else if( avg >= 65 && avg < 70){
            letter_note = "C1";
        }
        else if( avg >= 70 && avg < 75){
            letter_note = "B3";
        }
        else if( avg >= 75 && avg < 80){
            letter_note = "B2";
        }
        else if( avg >= 80 && avg < 85){
            letter_note = "B1";
        }
        else if( avg >= 85 && avg < 90){
            letter_note = "A3";
        }
        else if( avg >= 90 && avg < 95){
            letter_note = "A2";
        }
        else if( avg >= 95 && avg <= 100){
            letter_note = "A1";
        }
        
        return letter_note;
    }//completed Q4
	
    public static  int binary_to_decimal(String a){
        int result_decimal = 0;
        //int a_ary_size = a.length();
        //char[] a_ary = new char[a_ary_size];
        
        char[] a_ary = a.toCharArray();
        int a_ary_size = 0;
        
        for(char value: a_ary) {//a arrayinin uzunlugu bulundu
        	a_ary_size += 1;
        	}
        
        int[] int_ary = new int[a_ary_size];
        
        for(int i=0; i<a_ary_size; i++){// integer array icin eleman atamalari yapildi
            if(a_ary[i] == '.'){
                int_ary[i] = 1;
            }
            if(a_ary[i] == '-'){
                int_ary[i] = 0;
            }
        }
        
        int invert_loop_count = 0;
        int number = 1;
        int ans = 0;
        int sum = 0; 
        for(int i = a_ary_size-1; i>=0; i--){
            
            ans = number << invert_loop_count;// bitwise operator kullanildi kuvvet hesaplamak icin
            sum = sum + int_ary[i] * ans;// decimal a cevirme islemi
            //sum = sum + Math.pow(2, invert_loop_count) * int_ary[i]; // kodun fonksiyon iceren hali
            invert_loop_count += 1;
        }
        
        result_decimal = sum;
        //System.out.println("Sum = " + result_decimal);
        return result_decimal;
    }//completed Q5
    
    public static int calculateArea(int[][] a){
        
        int area = 0;
        
        int sum_satir = 0;
        int sum_sutun = 0;
        int sum_sutun_final = 0;
        int sum_satir_final = 0;
        int finish_flag = 0;
        
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){// ilk satirdan baslayarak sirasiyla satirin butun elemanlarini toplandi
                if(finish_flag == 0){// her satir bittiginde satir sum_satir sifirdan buyuk mu diye kontrol yapildi
                    sum_satir += a[i][j];
                }
            }
            //if(sum_satir == 0){}
            if(sum_satir > 0){
                for(int sutun=0; sutun<a[0].length; sutun++){
                    for(int satir=0; satir<a.length; satir++){
                        if(finish_flag == 0){
                            sum_sutun += a[satir][sutun]; // ilk sutundan baslayarak sutunun butun elemanlari toplandi
                        }
                    }
                    //if(sum_sutun == 0){}
                    if(sum_sutun > 0){ // her sutun toplamasindan sonra kontrol yapildi eger toplam sifirdan buyuk ise toplamlar son toplama esitlendi
                    sum_sutun_final = sum_sutun;
                    sum_satir_final = sum_satir;
                    finish_flag = 1;// for dongusu devam ettiginde sorun olmamasi icin flag 1 e esitlendi
                    }
                }
            }
        }
        area = sum_sutun_final * sum_satir_final;// alan hesaplandi
        return area;
    }//completed Q6
	
}
