public static void DECRYPTER(String TexteADeCrypter,int pas){
		//decryptage jules cesar
				char alphabet [] = {'z','y','x','w','v','u','t','s','r','q','p','o','n','m','l','k','j','i','h','g','f','e','d','c','b','a'};
				char charTexte []  = TexteADeCrypter.toCharArray();
				char charSOut [] = new char[charTexte.length];   
				for(int i = 0; i < charTexte.length; i++){
					for(int j = 0; j < alphabet.length; j++){ 
		    	           	if(alphabet[j] == charTexte[i]){			 
		    	        	   			if(j+pas <= 26 ){
		    	        	   				charSOut[i] = alphabet[j+pas];
		    	        	   			}else{
		    	        	   				pas = ((j+pas)-26);
		    	        	   				charSOut[i] = alphabet[pas];
		    	        	   			}
		    	           	}
					}   
				}
		System.out.println(String.valueOf(charSOut));
}