package com.zfw.service;

import java.util.List;

import com.zfw.dao.IUploadDAO;
import com.zfw.entity.UploadFile;

public class UploadFileServiceImpl implements IUploadFileService{
	private IUploadDAO uploadDAO;
	

	public void setUploadDAO(IUploadDAO uploadDAO) {
		this.uploadDAO = uploadDAO;
	}


	public void addFile(UploadFile uploadFile) {
		uploadDAO.insertFile(uploadFile);
	}


	public List<UploadFile> findAllFile() {
		// TODO Auto-generated method stub
		return uploadDAO.selectAllFile();
	}


	public boolean removeFileById(UploadFile uploadFile) {
		// TODO Auto-generated method stub
		return uploadDAO.deleteFileById(uploadFile);
	}


	public UploadFile findUploadFileById(UploadFile uploadFile) {
		// TODO Auto-generated method stub
		return uploadDAO.selectUploadFileById(uploadFile);
	}

}
