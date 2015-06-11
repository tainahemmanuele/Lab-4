/* 114210211 - Tainah Emmanuele Silva: LAB 4 - Turma 3 */
package sp2fy;

import static org.junit.Assert.*;

import java.util.Collections;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestaPerfilPlaylist {

	@Test
	public void testPerfilPlaylist() {
		try {
			// criacao de musicas.
			Musica ela = new Musica("Ela e eu", 1, "Pop");
			Musica gravida = new Musica("Gravida", 4, "Pop");
			Musica crianca = new Musica("Crianca", 5, "Pop");
			Musica naoestou = new Musica("Nao estou bem certa", 5, "Pop");
			Musica sim = new Musica("O meu sim", 5, "Pop");
			Musica acontecimentos = new Musica("Acontecimentos", 4, "Pop");
			Musica acho = new Musica("E acho que nao sou so eu", 3, "Pop");
			Musica podeser = new Musica("Pode ser o que for", 4, "Pop");
			Musica naosei = new Musica("Nao sei dancar", 5, "Pop");
			Musica sereifeliz = new Musica("Serei feliz", 4, "Pop");

			// criacao do album.
			Album marina = new Album("Marina Lima", "Marina Lima", 1991);

			// adicao de musicas ao album.
			marina.add(ela);
			marina.add(gravida);
			marina.add(crianca);
			marina.add(naoestou);
			marina.add(sim);
			marina.add(acontecimentos);
			marina.add(acho);
			marina.add(podeser);
			marina.add(naosei);
			marina.add(sereifeliz);

			// criacao de musicas.
			Musica decadence = new Musica("Decadence avec elegance", 4, "Rock");
			Musica malnenhum = new Musica("Mal Nenhum", 4, "Rock");

			// criacao do album.
			Album decadencesingle = new Album(
					"Decadence avec elegance (Single)", "Lobao e Os Ronaldos",
					1985);

			// adicao de musicas ao album.
			decadencesingle.add(decadence);
			decadencesingle.add(malnenhum);

			// criacao de musicas.
			Musica sol = new Musica("O Segundo Sol", 4, "Rock");
			Musica mapa = new Musica("Mapa do meu nada", 4, "Rock");
			Musica gatas = new Musica("Gatas Extraordinarias", 3, "Rock");
			Musica branco = new Musica("Um Branco, Um Xis, Um Zero", 3, "Rock");
			Musica mundo = new Musica("Meu Mundo Ficaria Completo", 4, "Rock");
			Musica palavras = new Musica("Palavras Ao Vento", 3, "Rock");
			Musica aprendiz = new Musica("Aprendiz de Feiticeiro", 3, "Rock");
			Musica pedra = new Musica("Pedra Gigante", 3, "Rock");
			Musica infernal = new Musica("Infernal", 2, "Rock");
			Musica maluca = new Musica("Maluca", 3, "Rock");
			Musica coisas = new Musica("As Coisas Tão Mais Lindas", 3, "Rock");
			Musica filme = new Musica("Esse Filme Eu Já Vi", 4, "Rock");

			// criacao do album.
			Album meumundo = new Album(
					"Com Voce... Meu Mundo Ficaria Completo...",
					"Cassia Eller", 1999);

			// adicao de musicas ao album.
			meumundo.add(sol);
			meumundo.add(mapa);
			meumundo.add(gatas);
			meumundo.add(branco);
			meumundo.add(mundo);
			meumundo.add(palavras);
			meumundo.add(aprendiz);
			meumundo.add(pedra);
			meumundo.add(infernal);
			meumundo.add(maluca);
			meumundo.add(coisas);
			meumundo.add(filme);

			// criacao de musicas.
			Musica palavra = new Musica("A Palavra Forte", 2, "Rock");
			Musica lolita = new Musica("Lolita", 4, "Rock");
			Musica indecencia = new Musica("Indecencia", 4, "Rock");
			Musica naovou = new Musica("Nao vou ficar", 3, "Rock");
			Musica eletricidade = new Musica("Eletricidade", 4, "Rock");
			Musica grandhotel = new Musica("Grand'Hotel", 3, "Rock");
			Musica fantasias = new Musica("Fantasias", 4, "Rock");
			Musica gostodeser = new Musica("Gosto de ser cruel", 3, "Rock");
			Musica noseulugar = new Musica("No seu lugar", 3, "Rock");
			Musica fuga = new Musica("Fuga numero dois", 4, "Rock");

			// criacao de album.
			Album tudoepermitido = new Album("Tudo e permitido", "Kid Abelha",
					1991);

			// adicao de musicas ao album.
			tudoepermitido.add(palavra);
			tudoepermitido.add(lolita);
			tudoepermitido.add(indecencia);
			tudoepermitido.add(naovou);
			tudoepermitido.add(eletricidade);
			tudoepermitido.add(grandhotel);
			tudoepermitido.add(fantasias);
			tudoepermitido.add(gostodeser);
			tudoepermitido.add(noseulugar);
			tudoepermitido.add(fuga);

			// criacao de musicas.
			Musica rubro = new Musica("Rubro Zorro", 4, "Rock");
			Musica manhas = new Musica("Manhas de Domingo", 5, "Rock");
			Musica poder = new Musica("Poder, Sorriso, Fama", 3, "Rock");
			Musica receita = new Musica("Receita Para Se Fazer um Heroi", 5,
					"Rock");
			Musica pegue = new Musica("Pegue Essa Arma", 5, "Rock");
			Musica farto = new Musica("Farto do Rock 'n' Roll", 5, "Rock");
			Musica advogado = new Musica("Advogado do Diabo", 3, "Rock");
			Musica mesmo = new Musica("Mesmo Distante", 4, "Rock");

			// criacao do album.
			Album psicoacustica = new Album("Psicoacustica", "Ira!", 1988);

			// adicao de musicas ao album.
			psicoacustica.add(rubro);
			psicoacustica.add(manhas);
			psicoacustica.add(poder);
			psicoacustica.add(receita);
			psicoacustica.add(pegue);
			psicoacustica.add(farto);
			psicoacustica.add(advogado);
			psicoacustica.add(mesmo);

			// criacao de musicas.
			Musica nunca = new Musica("Nunca fui santa", 3, "Rock");
			Musica independencia = new Musica("Independencia e Vida", 3, "Rock");
			Musica livre = new Musica("Livre Outra Vez", 4, "Rock");
			Musica semendereco = new Musica("Sem Endereco", 3, "Rock");
			Musica zona = new Musica("Zona Zen", 4, "Rock");
			Musica cruela = new Musica("Cruela Cruel", 5, "Rock");
			Musica cecy = new Musica("Cecy Bom", 3, "Rock");
			Musica mana = new Musica("Mana Mane", 3, "Rock");

			// criacao do album.
			Album zonazen = new Album("Zona Zen", "Rita Lee", 1988);

			// adicao de musicas ao album.
			zonazen.add(nunca);
			zonazen.add(independencia);
			zonazen.add(livre);
			zonazen.add(semendereco);
			zonazen.add(zona);
			zonazen.add(cruela);
			zonazen.add(cecy);
			zonazen.add(mana);

			// criacao de um album para testar se esta no perfil
			Album vivendo = new Album("Vivendo e Nao Aprendendo", "Ira!", 1986);
			// criacao do perfil
			Perfil tainah = new Perfil("Tainah");

			// adicao dos albuns ao perfil
			tainah.adicionaAlbum(marina);
			tainah.adicionaAlbum(decadencesingle);
			tainah.adicionaAlbum(meumundo);
			tainah.adicionaAlbum(tudoepermitido);
			tainah.adicionaAlbum(psicoacustica);
			tainah.adicionaAlbum(zonazen);

			// adicao dos albuns favoritos ao perfil
			tainah.adicionaAosFavoritos(marina);
			tainah.adicionaAosFavoritos(zonazen);
			tainah.adicionaAosFavoritos(tudoepermitido);
			tainah.adicionaAosFavoritos(meumundo);

			// teste para saber se o album esta contido no perfil.
			Assert.assertTrue(tainah.getAlbuns().contains(marina));
			Assert.assertTrue(tainah.getAlbuns().contains(psicoacustica));
			Assert.assertFalse(tainah.getAlbuns().contains(vivendo));

			// teste para saber se o album esta contido nos favoritos.
			Assert.assertTrue(tainah.getFavoritos().contains(tudoepermitido));
			Assert.assertFalse(tainah.getFavoritos().contains(psicoacustica));

			// ordenacao de albuns por ano de lancamento.
			tainah.ordenaAlbuns();

			// teste para saber se os albuns estao ordenados por ano de
			// lancamento.
			Assert.assertEquals(decadencesingle, tainah.getAlbuns().get(0));
			Assert.assertEquals(zonazen, tainah.getAlbuns().get(2));
			Assert.assertEquals(marina, tainah.getAlbuns().get(3));
			Assert.assertEquals(tudoepermitido, tainah.getAlbuns().get(4));
			Assert.assertNotSame(zonazen, tainah.getAlbuns().get(0));
			Assert.assertNotSame(psicoacustica, tainah.getAlbuns().get(3));
			Assert.assertNotSame(meumundo, tainah.getAlbuns().get(2));

			// ordenacao de albuns por artista.
			tainah.ordenaAlbunsArtista();

			// teste para saber se os albuns estao ordenados por artista.
			Assert.assertEquals(meumundo, tainah.getAlbuns().get(0));
			Assert.assertEquals(psicoacustica, tainah.getAlbuns().get(1));
			Assert.assertNotSame(psicoacustica, tainah.getAlbuns().get(0));
			Assert.assertNotSame(zonazen, tainah.getAlbuns().get(1));

			// ordenacao dos albuns por tempo de duracao.
			tainah.ordenaAlbunsDuracao();

			// teste para saber se os albuns estao ordenados por tempo de
			// duracao.
			Assert.assertEquals(decadencesingle, tainah.getAlbuns().get(0));
			Assert.assertEquals(zonazen, tainah.getAlbuns().get(1));
			Assert.assertNotSame(psicoacustica, tainah.getAlbuns().get(0));
			Assert.assertNotSame(decadencesingle, tainah.getAlbuns().get(1));

			// criacao e adicao de musicas na playlist
			tainah.adicionaPlaylist("Para Fazer Laboratorios",
					"Decadence avec elegance (Single)", 2);
			tainah.adicionaPlaylist("Para Fazer Laboratorios",
					"Tudo e permitido", 2);
			tainah.adicionaPlaylist("Para Fazer Laboratorios",
					"Tudo e permitido", 3);
			tainah.adicionaPlaylist("Para Fazer Laboratorios", "Zona Zen", 3);
			tainah.adicionaPlaylist("Para Fazer Laboratorios", "Zona Zen", 5);
			tainah.adicionaPlaylist("Para Fazer Laboratorios", "Psicoacustica",
					1);
			tainah.adicionaPlaylist("Para Fazer Laboratorios",
					"Com Voce... Meu Mundo Ficaria Completo...", 2);
			tainah.adicionaPlaylist("Para Fazer Laboratorios",
					"Com Voce... Meu Mundo Ficaria Completo...", 9);

			// teste para saber se o nome da playlist corresponde ao colocado.
			Assert.assertEquals("Para Fazer Laboratorios",
					tainah.getNomePlaylist());

			// teste para saber se a chave do mapa corresponde ao nome da
			// playlist.
			Assert.assertTrue(tainah.getPlaylists().containsKey(
					"Para Fazer Laboratorios"));
			Assert.assertFalse(tainah.getPlaylists().containsKey("Para Fazer"));

			// teste para saber se as musicas estao contidas no arraylist que
			// corresponde ao valor do mapa.
			Assert.assertTrue(tainah.temPlaylist("Para Fazer Laboratorios",
					rubro));
			Assert.assertTrue(tainah.temPlaylist("Para Fazer Laboratorios",
					zona));
			Assert.assertTrue(tainah.temPlaylist("Para Fazer Laboratorios",
					malnenhum));
			Assert.assertFalse(tainah.temPlaylist("Para Relaxar", rubro));
			Assert.assertFalse(tainah.temPlaylist("Para Fazer Laboratorios",
					palavras));
			Assert.assertTrue(tainah.temPlaylist("Para Fazer Laboratorios",
					grandhotel));

			// criacao e adicao de musicas em outra playlist.
			tainah.adicionaPlaylist("Para Relaxar", "Marina Lima", 9);
			tainah.adicionaPlaylist("Para Relaxar", "Marina Lima", 6);
			tainah.adicionaPlaylist("Para Relaxar", "Tudo e permitido", 6);
			tainah.adicionaPlaylist("Para Relaxar", "Zona Zen", 3);
			tainah.adicionaPlaylist("Para Relaxar", "Zona Zen", 5);
			tainah.adicionaPlaylist("Para Relaxar",
					"Com Voce... Meu Mundo Ficaria Completo...", 3);
			tainah.adicionaPlaylist("Para Relaxar",
					"Com Voce... Meu Mundo Ficaria Completo...", 1);
			tainah.adicionaPlaylist("Para Relaxar",
					"Com Voce... Meu Mundo Ficaria Completo...", 6);

			// teste para saber se as musicas estao contidas no arraylist que
			// corresponde ao valor do mapa.
			Assert.assertTrue(tainah.temPlaylist("Para Relaxar", palavras));
			Assert.assertTrue(tainah
					.temPlaylist("Para Relaxar", acontecimentos));
			Assert.assertTrue(tainah.temPlaylist("Para Relaxar", sol));
			Assert.assertFalse(tainah.temPlaylist("Para Relaxar", rubro));
			Assert.assertFalse(tainah.temPlaylist("Relaxar", palavras));
			Assert.assertTrue(tainah.temPlaylist("Para Relaxar", grandhotel));

			Assert.fail();
		} catch (Exception e) {

		}
	}

	@Test
	public void testPerfilPlaylistComErros() throws Exception {

		try {
			// criacao de musicas.
			Musica ela = new Musica("Ela e eu", 1, "Pop");
			Musica gravida = new Musica("Gravida", 4, "Pop");
			Musica crianca = new Musica("Crianca", 5, "Pop");
			Musica naoestou = new Musica("Nao estou bem certa", 5, "Pop");
			Musica sim = new Musica("O meu sim", 5, "Pop");
			Musica acontecimentos = new Musica("Acontecimentos", 4, "Pop");
			Musica acho = new Musica("E acho que nao sou so eu", 3, "Pop");
			Musica podeser = new Musica("Pode ser o que for", 4, "Pop");
			Musica naosei = new Musica("Nao sei dancar", 5, "Pop");
			Musica sereifeliz = new Musica("Serei feliz", 4, "Pop");

			// criacao do album.
			Album marina = new Album("Marina Lima", "Marina Lima", 1991);

			// criacao do perfil.
			Perfil tainah = new Perfil("Tainah");

			// adicao de album ao perfil.
			tainah.adicionaAlbum(marina);

			// criacao de uma playlist sem album contido no perfil.
			tainah.adicionaPlaylist("Diversos", "Decadence", 5);

			Assert.fail(); // se chegar aqui da erro, pois deveria lancar
							// exception.
		} catch (Exception e) {
			// mensagem que deve ser vista ao tentar criar playlist com album
			// nao contido no perfil.
			Assert.assertEquals("Album nao pertence ao perfil especificado",
					e.getMessage());
		}

	}

}
