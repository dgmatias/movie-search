package model;

public class Movie {
	
	private Integer id;
	private String name;
	private String sinopse;
	private String duration;
	private String img_small;
	private String img_banner;
	private Integer category_id;
	
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", sinopse=" + sinopse + ", duration=" + duration + ", img_small="
				+ img_small + ", img_banner=" + img_banner + ", category_id=" + category_id + "]";
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getImg_small() {
		return img_small;
	}
	public void setImg_small(String img_small) {
		this.img_small = img_small;
	}
	public String getImg_banner() {
		return img_banner;
	}
	public void setImg_banner(String img_banner) {
		this.img_banner = img_banner;
	}
	public Integer getCategory_id() {
		return category_id;
	}
	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}
	
}
