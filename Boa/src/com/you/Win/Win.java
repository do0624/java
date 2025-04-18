package com.you.Win;

import com.you.Dodo.Sv;

public class Win {

  static void os() {
	  while (true) {
		  Sv.y("메인");
		  Sv.y("번호입력시이동");
		  Sv.y("목차:1   목차내용:2   리스트:3  종료:t");
		  String wow=Sv.v();
			
			xx:switch (wow) {
			case"1":
				Lic.ds();
				break;

			case"2":	
				Palist.li();
				break;
				
			case"3":
				
					
				
				break;
			case"t":
				
				Sv.y("종료");
				break xx; 
				default:
					
					break;
			}
		}
			
		}

		
		

	}