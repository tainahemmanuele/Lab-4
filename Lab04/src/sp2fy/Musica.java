/* 114210211 - Tainah Emmanuele Silva: LAB 4 - Turma 3 */
package sp2fy;

public class Musica {
	private String nomeMusica;
	private int duracao;
	private String genero;
	
	public Musica(String nomeMusica, int duracao, String genero) throws Exception{
		if (nomeMusica.equals("")){
			throw new Exception("Titulo da musica nao pode ser vazio.");
		}
		if (duracao<0 ){
			throw new Exception("Duracao da musica nao pode ser negativa.");
		}
		if (genero.equals("")){
			throw new Exception("Genero da musica nao pode ser vazio.");
		}
		this.nomeMusica = nomeMusica;
		this.duracao = duracao;
		this.genero = genero;
	}
	
	//retorna o nome da musica.
	public String getNome() {
		return nomeMusica;
	}
	
	//retorna a duracao da musica.
	public int getDuracao() {
		return duracao;
	}
	
	//retorna o genero da musica.
	public String getTipo() {
		return genero;
	}
    
	public String toString() {
		return getNome()+ ","+getDuracao()+ ","+ getTipo();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + duracao;
		result = prime * result
				+ ((nomeMusica == null) ? 0 : nomeMusica.hashCode());
		return result;
	}
	 @Override
	//Equals para saber se duas musicas sao iguais. No caso, so sao iguais se tiverem o mesmo nome e o mesmo tempo de duracao..
	public boolean equals(Object obj) {
		 if(obj instanceof Musica){
				
				Musica musica = (Musica)obj;		
				if(musica.getNome().equals(this.getNome()) && musica.getDuracao() == this.getDuracao()){
					return true;
				
				}else{
					
					return false;
				}			
			}
			return false;
}


	
}
