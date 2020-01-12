public static void CRYPTER(String TexteACrypter,int pas){
		//cryptage jules cesar
		char alphabet [] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char charTexte []  = TexteACrypter.toCharArray();
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