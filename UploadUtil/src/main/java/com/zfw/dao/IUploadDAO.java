package com.zfw.dao;

import java.util.List;

import com.zfw.entity.UploadFile;

public interface IUploadDAO {


	void insertFile(UploadFile uploadFile);

	List<UploadFile> selectAllFile();

	boolean deleteFileById(UploadFile uploadFile);

	UploadFile selectUploadFileById(UploadFile uploadFile);

}
