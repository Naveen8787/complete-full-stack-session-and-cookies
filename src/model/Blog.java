package model;

import java.time.LocalDate;

public class Blog{
	int blogId;
	String blogTitle;
	String blogDescription;
	LocalDate postedOn;

//	public Blog(int blogId, String blogTitle, String blogDescription, LocalDate postedOn) {
//		this.blogId = blogId;
//		this.blogTitle = blogTitle;
//		this.blogDescription = blogDescription;
//		this.postedOn = postedOn;
//	}
//	
	public int getBlogId() {
		return blogId;
	}
	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}
	public String getBlogTitle() {
		return blogTitle;
	}
	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}
	public String getBlogDescription() {
		return blogDescription;
	}
	public void setBlogDescription(String blogDescription) {
		this.blogDescription = blogDescription;
	}
	public LocalDate getPostedOn() {
		return postedOn;
	}
	public void setPostedOn(LocalDate postedOn) {
		this.postedOn = postedOn;
	}
}