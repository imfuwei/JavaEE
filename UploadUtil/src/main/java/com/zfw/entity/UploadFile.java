package com.zfw.entity;

import java.util.Date;

public class UploadFile {
	private Integer id;
	private String fileName;
	private String path;
	
	private Date uploadTime;
	private String type;
	private long length;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public Date getUploadTime() {
		return uploadTime;
	}
	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getLength() {
		return length;
	}
	public void setLength(long length) {
		this.length = length;
	}
	@Override
	public String toString() {
		return "UploadFile [id=" + id + ", fileName=" + fileName + ", path="
				+ path + ", uploadTime=" + uploadTime + ", type=" + type
				+ ", length=" + length + "]";
	}
	public UploadFile() {
		uploadTime=new Date();
	}
	public UploadFile(String fileName) {
		this();
		this.fileName = fileName;
	}
	
	
}
