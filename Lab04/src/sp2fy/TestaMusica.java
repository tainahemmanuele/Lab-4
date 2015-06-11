/* 114210211 - Tainah Emmanuele Silva: LAB 4 - Turma 3 */
package sp2fy;

import org.junit.Assert;
import org.junit.Test;

public class TestaMusica {

	@Test
	public void testMusica() {
		try {
			// criacao de musicas.
			Musica chandelier = new Musica("Chandelier", 3, "Pop");
			Musica elasticHeart = new Musica("Elastic Heart", 3, "Pop");
			Musica cellophane = new Musica("Cellophane", 4, "Pop");
			Musica badgirl = new Musica("Bad Girl", 6, "Pop");
			Musica badgirl2 = new Musica("Bad Girl", 6, "Pop");
			Musica fullgas = new Musica("Fullgas", 4, "Pop");
			Musica fullgas2 = new Musica("Fullgas (1996)", 4, "Pop");

			// teste para saber se as musicas foram criadas corretamente.
			Assert.assertEquals("Chandelier", chandelier.getNome());
			Assert.assertEquals(3, chandelier.getDuracao());
			Assert.assertEquals("Pop", chandelier.getTipo());

			// teste para saber se as musicas foram criadas corretamente.
			Assert.assertEquals("Elastic Heart", elasticHeart.getNome());
			Assert.assertEquals(3, elasticHeart.getDuracao());
			Assert.assertEquals("Pop", elasticHeart.getTipo());

			// teste para saber se as musicas foram criadas corretamente.
			Assert.assertEquals("Cellophane", cellophane.getNome());
			Assert.assertEquals(4, cellophane.getDuracao());
			Assert.assertEquals("Pop", cellophane.getTipo());

			// criacao de musica.
			Musica chandelierRemix = new Musica("Chandelier", 3, "Pop");

			// teste para saber se uma musica e igual a outra.
			Assert.assertEquals(chandelier, chandelierRemix);
			Assert.assertFalse(chandelier.equals(cellophane));

			// teste para saber se uma musica e igual a outra.
			Assert.assertEquals(badgirl, badgirl2);
			Assert.assertFalse(fullgas.equals(fullgas2));

		} catch (Exception e) {
			Assert.fail();// nao deveria ter lancado nenhuma Exception nesse
							// teste.
		}
	}

	@Test
	public void testMusicaInvalida() {
		try {
			// criacao de musica com nome da musica vazio.
			Musica tituloInvalido = new Musica("", 3, "Pop");
			Assert.fail(); // se chegar aqui da erro, pois deveria lancar
							// exception.
		} catch (Exception e) {
			// mensagem que deve ser vista ao tentar criar musica com nome
			// vazio.
			Assert.assertEquals("Titulo da musica nao pode ser vazio.",
					e.getMessage());
		}

		try {
			// criacao de musica com duracao negativa.
			Musica duracaoInvalida = new Musica("Elastic Heart", -5, "Pop");
			Assert.fail(); // se chegar aqui da erro, pois deveria lancar
							// exception.
		} catch (Exception e) {
			// mensagem que deve ser vista ao tentar criar musica com duracao
			// negativa.
			Assert.assertEquals("Duracao da musica nao pode ser negativa.",
					e.getMessage());
		}

		try {
			// criacao da musica com genero vazio.
			Musica tipoInvalido = new Musica("Cellophane", 4, "");
			Assert.fail(); // se chegar aqui da erro, pois deveria lancar
							// exception.
		} catch (Exception e) {
			// mensagem que deve ser vista ao tentar criar musica com genero
			// vazio.
			Assert.assertEquals("Genero da musica nao pode ser vazio.",
					e.getMessage());
		}

	}
}