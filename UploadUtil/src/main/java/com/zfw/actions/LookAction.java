package com.zfw.actions;

import java.util.List;

import com.zfw.entity.UploadFile;
import com.zfw.service.IUploadFileService;

public class LookAction {
	private IUploadFileService uploadFileService;
	private List<UploadFile> uploadFiles;


	public List<UploadFile> getUploadFiles() {
		return uploadFiles;
	}

	public void setUploadFiles(List<UploadFile> uploadFiles) {
		this.uploadFiles = uploadFiles;
	}

	public IUploadFileService getUploadFileService() {
		return uploadFileService;
	}

	public void setUploadFileService(IUploadFileService uploadFileService) {
		this.uploadFileService = uploadFileService;
	}

	public String execute(){
		uploadFiles = uploadFileService.findAllFile();
		return "success";
	}
}
