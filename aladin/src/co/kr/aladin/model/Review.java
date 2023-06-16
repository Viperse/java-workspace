package co.kr.aladin.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Review {
	
	private String id;
	private String title;
	private boolean recommend;
	private String comment;
	LocalDateTime now;
	
	
	public Review() {}

	public Review(String id, String title, boolean recommend, String comment, LocalDateTime now) {
		super();
		this.id = id;
		this.title = title;
		this.recommend = recommend;
		this.comment = comment;
		this.now = now;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isRecommend() {
		return recommend;
	}

	public void setRecommend(boolean recommend) {
		this.recommend = recommend;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public LocalDateTime getNow() {
		return now;
	}

	public void setNow(LocalDateTime now) {
		this.now = now;
	}

	@Override
	public String toString() {
		return "리뷰 정보 [id=" + id + ", title=" + title + ", recommend=" + recommend + ", comment=" + comment + ", now="
				+ now + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(comment, id, now, recommend, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Review other = (Review) obj;
		return Objects.equals(comment, other.comment) && Objects.equals(id, other.id) && Objects.equals(now, other.now)
				&& recommend == other.recommend && Objects.equals(title, other.title);
	}
}
