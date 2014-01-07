package com.micro.web.util;

import java.io.File;

public class MyFile {
	File file;
	Integer rotation;
	String fileName;
	String fileType;
	
	

	public MyFile(File file, Integer rotation, String fileName, String fileType) {
		this.file = file;
		this.rotation = rotation;
		this.fileName = fileName;
		this.fileType = fileType;
	}

	public MyFile() {

	}
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public Integer getRotation() {
		return rotation;
	}

	public void setRotation(Integer rotation) {
		this.rotation = rotation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((file == null) ? 0 : file.hashCode());
		result = prime * result
				+ ((rotation == null) ? 0 : rotation.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyFile other = (MyFile) obj;
		if (file == null) {
			if (other.file != null)
				return false;
		} else if (!file.equals(other.file))
			return false;
		if (rotation == null) {
			if (other.rotation != null)
				return false;
		} else if (!rotation.equals(other.rotation))
			return false;
		return true;
	}
	
	
	
	
	
}
