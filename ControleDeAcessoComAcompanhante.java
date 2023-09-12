
public class ControleDeAcessoComAcompanhante {
	
	public static void main (String [] args) {
		
		int idadeDoConvidado1 = 17;
		int idadeDoConvidado2 = 18;
		int idadeDoConvidado3 = 19;
		int idadeDoAcompanhante1 = 17;
		int idadeDoAcompanhante2 = 21;
		int acessoDoConvidado = idadeDoConvidado1; 
		int acessoDoAcompanhante = idadeDoAcompanhante1;
		
		
		
		System.out.println(     "CONTROLE DE ACESSO COM ACOMPANHANTE");
		System.out.println(" ");
		
		if(acessoDoConvidado < 18){ 
			
			if(acessoDoAcompanhante >= 18){
				System.out.println("O convidado pode entrar no recinto");
			}else{
				System.out.println("O Convidado não pode entrar");
			}
		
		}else{ 
			System.out.println("O convidado pode entrar no recinto");
		
		}
		
	}
}
