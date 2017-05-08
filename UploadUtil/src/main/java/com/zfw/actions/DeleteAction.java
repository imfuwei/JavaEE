package com.zfw.actions;

import java.io.File;

import com.zfw.entity.UploadFile;
import com.zfw.service.IUploadFileService;


public class DeleteAction {
	private Integer id;
	private IUploadFileService uploadFileService;
	public IUploadFileService getUploadFileService() {
		return uploadFileService;
	}
	public void setUploadFileService(IUploadFileService uploadFileService) {
		this.uploadFileService = uploadFileService;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String execute(){
		UploadFile uploadFile=new UploadFile();
		uploadFile.setId(getId());
		UploadFile uploadFileById = uploadFileService.findUploadFileById(uploadFile);
		String path = uploadFileById.getPath();
		File file = new File(path+"/"+uploadFileById.getFileName());
		uploadFileService.removeFileById(uploadFileById);
		file.delete();
		return "success";
	}
}
