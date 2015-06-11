/* 114210211 - Tainah Emmanuele Silva: LAB 4 - Turma 3 */
package sp2fy;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestaAlbum {

    @Test
	public void testAlbum() {
		try{
			
			//cria album.
			Album climax = new Album("Climax","Marina Lima", 2011);
			Album mtv = new Album("MTV Ao Vivo","Titas",2005);
			Album mtv1 = new Album("MTV Ao Vivo","Barao Vermelho",2005);
			Album profana = new Album("Profana", "Gal Costa",1985);
			Album profana1 = new Album("Profana", "Gal Costa",1985);
			
			//testa se um album e igual a outro.
			Assert.assertFalse(mtv.equals(mtv1));
			Assert.assertEquals(profana, profana1);

			//testa se o album foi criado corretamente.
			Assert.assertEquals("Climax", climax.getNome());
			Assert.assertEquals("Marina Lima", climax.getArtista());
			Assert.assertEquals(2011, climax.getAno());
			
			//testa se o album foi criado corretamente.
			Assert.assertNotSame("Bem Bom",profana.getNome());
			Assert.assertNotSame("Gal",profana.getArtista());
			Assert.assertNotSame(2005 ,profana.getAno());
			
			
		
           
		}catch(Exception e){
			Assert.fail();//nao possui Exception esse teste.
		}
	}
    @Test
    public void testAlbumInvalido() throws Exception{
    	
    	try{
    		//cria album com nome do album vazio.
    		Album nevermind = new Album("","Nirvana",1991);
    		Assert.fail();//se chegar aqui da erro, pois deveria lancar exception.
    	}catch(Exception e){
    		//mensagem que deve ser vista ao tentar criar album vazio.
    		Assert.assertEquals("Nome do album nao pode ser vazio", e.getMessage());
    	}
    	try{
    		//cria album com nome do artista vazio.
        	Album inutero= new Album("In Utero","",1993);
        	Assert.fail();//se chegar aqui da erro, pois deveria lancar exception.
        }catch(Exception e){
        	//mensagem que deve ser vista ao tentar criar album com nome do artista vazio.
        		Assert.assertEquals("Nome do artista nao pode ser vazio", e.getMessage());
    	}
    	try{
    		//cria album com ano negativo.
        	Album bleach= new Album("Bleach","Nirvana",-1990);
        	Assert.fail();//se chegar aqui da erro, pois deveria lancar exception.
        }catch(Exception e){
        	//mensagem que deve ser vista ao tentar criar album com ano negativo.
        		Assert.assertEquals("Ano nao pode ser negativo", e.getMessage());
    
        }
    }
    	@Test
        public void testAlbumAdicaoMusicas() throws Exception{
        	
        	try{
        		//cria musicas
        		Musica vaca = new Musica("Vaca Profana",5,"MPB");
    			Musica ave = new Musica("Ave Nossa ",4,"MPB");
    			Musica nadamais = new Musica("Nada Mais (Lately)",4,"MPB");
    			Musica atras = new Musica("Atras da Luminosidade",2,"MPB");
    			Musica devolta = new Musica("De Volta ao Comeco",5,"MPB");
    			Musica ondeesta = new Musica("Onde Esta o Dinheiro? ",2,"MPB");
    			Musica chuva = new Musica("Chuva de Prata ",3,"MPB");
    			Musica cabeca = new Musica("Cabeca Feita ",5,"MPB");
    			Musica topazio = new Musica("Topazio",4,"MPB");
    			Musica revolver = new Musica("O Revolver do meu Sonho ",4,"MPB");
        	
    			//cria album
    			Album profana = new Album("Profana", "Gal Costa",1985);
    			
    			//adiciona musicas ao album
    			profana.add(vaca);
    			profana.add(ave);
    			profana.add(nadamais);
    			profana.add(atras);
    			profana.add(devolta);
    			profana.add(ondeesta);
    			profana.add(chuva);
    			profana.add(cabeca);
    			profana.add(topazio);
    			profana.add(revolver);
    			
    			//testa se as musicas estao contidas no album
    			Assert.assertTrue(profana.contains(vaca));
    			Assert.assertTrue(profana.contains(ave));
    			Assert.assertTrue(profana.contains(nadamais));
    			Assert.assertTrue(profana.contains(atras));
    			Assert.assertTrue(profana.contains(devolta));
    			Assert.assertTrue(profana.contains(ondeesta));
    			Assert.assertTrue(profana.contains(chuva));
    			Assert.assertTrue(profana.contains(cabeca));
    			Assert.assertTrue(profana.contains(topazio));
    			Assert.assertTrue(profana.contains(revolver));
    			
    			//testa se as musicas adicionadas estao na ordem de adicao
    			Assert.assertEquals(vaca, profana.get(1));
    			Assert.assertEquals(devolta, profana.get(5));
    			Assert.assertNotSame(topazio,profana.get(5));
    			Assert.assertNotSame(revolver,profana.get(1));
        	
    			//testa se a duracao do album e a esperada
    			Assert.assertSame(38, profana.getTempototal());
    			Assert.assertNotSame(45, profana.getTempototal());
        
            
    	}catch(Exception e){
			Assert.fail();//nao possui Exception esse teste.
		}
	
  
    
}
    @Test
       public void testAlbumRemocaoMusicas() throws Exception{
        	
        	try{
        		//cria musicas
        		Musica vaca = new Musica("Vaca Profana",5,"MPB");
    			Musica ave = new Musica("Ave Nossa ",4,"MPB");
    			Musica nadamais = new Musica("Nada Mais (Lately)",4,"MPB");
    			Musica atras = new Musica("Atras da Luminosidade",2,"MPB");
    			Musica devolta = new Musica("De Volta ao Comeco",5,"MPB");
    			Musica ondeesta = new Musica("Onde Esta o Dinheiro? ",2,"MPB");
    			Musica chuva = new Musica("Chuva de Prata ",3,"MPB");
    			Musica cabeca = new Musica("Cabeca Feita ",5,"MPB");
    			Musica topazio = new Musica("Topazio",4,"MPB");
    			Musica revolver = new Musica("O Revolver do meu Sonho ",4,"MPB");
        	
    			//cria album
    			Album profana = new Album("Profana", "Gal Costa",1985);
    			
    			//adiciona musicas ao album
    			profana.add(vaca);
    			profana.add(ave);
    			profana.add(nadamais);
    			profana.add(atras);
    			profana.add(devolta);
    			profana.add(ondeesta);
    			profana.add(chuva);
    			profana.add(cabeca);
    			profana.add(topazio);
    			profana.add(revolver);
    			
    			//remove musicas do album
    			profana.remove(vaca);
    			profana.remove(topazio);
    			
    			//testa se as musicas que eram pra ser removidas foram removidas e as que nao foram removidas se continuam no album.
    			Assert.assertFalse(profana.contains(vaca));
    			Assert.assertTrue(profana.contains(ave));
    			Assert.assertTrue(profana.contains(nadamais));
    			Assert.assertTrue(profana.contains(atras));
    			Assert.assertTrue(profana.contains(devolta));
    			Assert.assertTrue(profana.contains(ondeesta));
    			Assert.assertTrue(profana.contains(chuva));
    			Assert.assertTrue(profana.contains(cabeca));
    			Assert.assertFalse(profana.contains(topazio));
    			Assert.assertTrue(profana.contains(revolver));
    			
        	
        
            
    	}catch(Exception e){
			Assert.fail();//nao possui Exception esse teste.
		}
	
  
    
}
}
