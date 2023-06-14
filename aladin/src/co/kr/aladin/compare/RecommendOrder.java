package co.kr.aladin.compare;

import java.util.Comparator;

import co.kr.aladin.model.Book;

public class RecommendOrder implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getRecomCount() > o2.getRecomCount() ? -1 : o1.getRecomCount() < o2.getRecomCount() ? 1 : 0;
	}

}
