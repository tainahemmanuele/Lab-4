/* 114210211 - Tainah Emmanuele Silva: LAB 4 - Turma 3 */
package sp2fy;

import java.util.Comparator;

//classe criada para ordenar os albuns por tempo total de duracao.
public class ComparadorDuracao implements Comparator<Album> {
	@Override
	public int compare(Album a, Album b) {
		return a.getTempototal().compareTo(b.getTempototal());
	}
}