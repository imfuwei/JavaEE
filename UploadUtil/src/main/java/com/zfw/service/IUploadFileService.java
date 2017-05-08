package com.zfw.service;

import java.util.List;

import com.zfw.entity.UploadFile;

public interface IUploadFileService {
	List<UploadFile> findAllFile();

	void addFile(UploadFile uploadFile);
	boolean removeFileById(UploadFile uploadFile);

	UploadFile findUploadFileById(UploadFile uploadFile);

}
