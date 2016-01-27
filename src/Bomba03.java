
public class Bomba03 {

	public static void main(String[] args) {
		String frase = "Paco@es@un c1ch4nd4";
		String subfrase1 = "Paco@es@un";
		String subfrase2 = "c1ch4nd4";
		String codificada1 = "";
		String codificada2 = "";
		char w, c;
		for (int i = 0; i < subfrase1.length(); i++) {
			w = subfrase1.charAt(i);
			if (w == '@') {
				w = ' ';

				codificada1 = codificada1+w;
			} else {

				codificada1 = codificada1+w;

			}
			

		}
		for (int x=0;x<subfrase2.length();x++){
			c = subfrase2.charAt(x);
			if (c == '1'){
				c = 'a';
				
			}
			if (c == '2'){
				c = 'e';
		}
			if (c == '3'){
				c = 'i';
	}
			if (c == '4'){
				c = 'o';
			}
			if (c== '5'){
				c = 'u';
				codificada2 = codificada2 +c;
			}else{
				codificada2 = codificada2 +c;
			}
		}
		System.out.println(codificada1+" "+codificada2);
	}
}
			
		
				

