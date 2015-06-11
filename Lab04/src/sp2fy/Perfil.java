/* 114210211 - Tainah Emmanuele Silva: LAB 4 - Turma 3 */
package sp2fy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Perfil {
	private String usuario;
	private ArrayList<Album> albuns;
	private HashSet<Album> favoritos;
	private HashMap<String, ArrayList<Musica>> playlists;
	private String nomePlaylist;
	private String nomeAlbum;
	private int faixa;

	public Perfil(String usuario) throws Exception {
		if (usuario.equals("")) {
			throw new Exception("Nome usuario nao pode ser vazio");
		}
		this.usuario = usuario;
		this.albuns = new ArrayList<Album>();
		this.favoritos = new HashSet<Album>();
		this.playlists = new HashMap<String, ArrayList<Musica>>();

	}

	// retorna a faixa do album.
	public int getFaixa() {
		return faixa;
	}

	// retorna o nome de usuario.
	public String getUsuario() {
		return usuario;
	}

	// retorna o nome da playlist.
	public String getNomePlaylist() {
		return nomePlaylist;
	}

	// retorna lista de albuns favoritos contida no perfil
	public HashSet<Album> getFavoritos() {
		return favoritos;
	}

	// retorna o nome do album.
	public String getNomeAlbum() {
		return nomeAlbum;
	}

	// retorna as playlists criadas.
	public HashMap<String, ArrayList<Musica>> getPlaylists() {
		return playlists;
	}

	public void setPlaylists(HashMap<String, ArrayList<Musica>> playlists) {
		this.playlists = playlists;
	}

	// metodo para adicionar albuns ao perfil do usuario
	public void adicionaAlbum(Album album) {
		albuns.add(album);

	}

	// metodo para adicionar albuns ja adicionados ao perfil aos favoritos do
	// usuario.
	public void adicionaAosFavoritos(Album album) {
		if (albuns.contains(album)) {
			favoritos.add(album);
		}

	}

	// retorna a lista de albuns contidas no perfil
	public ArrayList<Album> getAlbuns() {
		return albuns;
	}

	// ordena os albuns por ano de lancamento
	public void ordenaAlbuns() {
		Collections.sort(getAlbuns());
	}

	// ordena os albuns por artista
	public void ordenaAlbunsArtista() {
		Collections.sort(getAlbuns(), new ComparadorArtista());
	}

	// ordena os albuns por duracao
	public void ordenaAlbunsDuracao() {
		Collections.sort(getAlbuns(), new ComparadorDuracao());
	}

	// metodo para procurar album dentro do perfil do usuario. Caso album nao
	// exista, retorna mensagem.
	public Album getAlbum(String nomeAlbum) throws Exception {
		for (Album disco : albuns) {
			if (disco.getNome().equals(nomeAlbum)) {
				return disco;
			}
		}
		throw new Exception("Album nao pertence ao perfil especificado");
	}

	// metodo para adicionar musicas as playlist. As musicas so serao
	// adicionadas, se o album estiver no perfil do usuario.
	public void adicionaPlaylist(String nomePlaylist, String nomeAlbum,
			int faixa) throws Exception {
		this.nomePlaylist = nomePlaylist;
		this.nomeAlbum = nomeAlbum;
		this.faixa = faixa;

		// if para saber se a playlist já existe. Se nao existir, ela sera
		// criada.
		if (!playlists.containsKey(nomePlaylist)) {
			playlists.put(nomePlaylist, new ArrayList<Musica>());

		}

		// if para procurar album dentro da lista de albuns. Se tiver, procura a
		// faixa. Depois a adiciona na playlist.
		if (albuns.contains(getAlbum(nomeAlbum))) {
			Album album = getAlbum(nomeAlbum);
			Musica musica = album.get(faixa);
			playlists.get(nomePlaylist).add(musica);

		}

	}

	// metodo criado para saber se uma determinada musica esta contida na
	// playlist.
	public boolean temPlaylist(String nomePlaylist, Musica musica) {
		if (playlists.get(nomePlaylist).contains(musica)) {
			return true;
		}
		return false;

	}
}
