package br.com.aula.conexao;


public class TestarConexao {
	
	
   
	//Testar Conex�o
	
    public static void main(String[] args) {
        
        try {
            
            new CriarConexao();
			CriarConexao.getConexao();
            
        } catch (Exception erro) {
            System.out.println("Erro: " + erro);

        }
        
    }
    
}