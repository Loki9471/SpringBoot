package com.codegnan.model;

@Entity

public class MovieInfo {
	@Id
private Long id;
private String name;
private String description;
private String path;
public MovieInfo(Long id, String name, String description, String path) {
	super();
	this.id = id;
	this.name = name;
	this.description = description;
	this.path = path;
}
public MovieInfo() {
	super();
	// TODO Auto-generated constructor stub
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getPath() {
	return path;
}
public void setPath(String path) {
	this.path = path;
}
@Override
public String toString() {
	return "MovieInfo [id=" + id + ", name=" + name + ", description=" + description + ", path=" + path + "]";
}

}
