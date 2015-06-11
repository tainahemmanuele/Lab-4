/* 114210211 - Tainah Emmanuele Silva: LAB 4 - Turma 3 */
package sp2fy;

import java.util.ArrayList;

public class Album implements Comparable<Album> {
	private String artista;
	private String nomeAlbum;
	private int ano;
	private int tempototal;
	private ArrayList<Musica> musicas;

	public Album(String nomeAlbum, String artista, int ano) throws Exception {
		if (nomeAlbum.equals("")) {
			throw new Exception("Nome do album nao pode ser vazio");
		}
		if (artista.equals("")) {
			throw new Exception("Nome do artista nao pode ser vazio");
		}
		if (ano < 0) {
			throw new Exception("Ano nao pode ser negativo");
		}
		this.artista = artista;
		this.nomeAlbum = nomeAlbum;
		this.ano = ano;
		this.musicas = new ArrayList<Musica>();

	}

	// retorna nome do album.
	public String getNome() {
		return nomeAlbum;
	}

	// retorna nome do artista do album.
	public String getArtista() {
		return artista;
	}

	// retorna ano de lancamento do album.
	public int getAno() {
		return ano;
	}

	// retorna o tempo total de duracao do album.
	public Integer getTempototal() {
		return tempototal;
	}

	public void setTempototal(int tempototal) {
		this.tempototal = tempototal;
	}

	public String toString() {
		return getNome() + "," + getArtista() + "," + getAno();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artista == null) ? 0 : artista.hashCode());
		result = prime * result
				+ ((nomeAlbum == null) ? 0 : nomeAlbum.hashCode());
		return result;
	}

	@Override
	// Equals para saber se dois albuns sao iguais. No caso, so sao iguais se
	// tiverem o mesmo artista e o mesmo nome.
	public boolean equals(Object obj) {
		if (obj instanceof Album) {

			Album album = (Album) obj;
			if (album.getNome().equals(this.getNome())
					&& album.getArtista() == this.getArtista()) {
				return true;

			} else {

				return false;
			}
		}
		return false;
	}

	// metodo criado para adicionar musicas ao album
	public void add(Musica musica) {
		tempototal += musica.getDuracao();
		musicas.add(musica);
	}

	// metodo criado para remover musicas do album.
	public void remove(Musica musica) {
		musicas.remove(musica);

	}

	// metodo criado para recuperar faixas de um album
	public Musica get(int faixa) {
		Musica musica = musicas.get(faixa - 1);
		return musica;
	}

	// metodo criado para ordenar albuns por ano. Nesse metodo a ordenacao e
	// realizada.
	public int compareTo(Album album2) {
		if (this.getAno() > album2.getAno()) {
			return 1;
		} else if (this.getAno() < album2.getAno()) {
			return -1;
		} else {
			return 0;
		}
	}

	// metodo criado para saber se em um album, existe uma determinada musica.
	public boolean contains(Musica musica) {
		return musicas.contains(musica);

	}

}
