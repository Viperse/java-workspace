package com.youtube.model;

import java.sql.Date;
import java.util.List;

public class Video {
	
	private String title;
	private Date uploadAt;
	private int Views; 
	private String imgUrl;
	private String fileUrl;
	private String desc;
	private char kind;  // shorts & Video 둘 중 하나!
	
	private List<Comment> comments;
	private Category category;
	
}
