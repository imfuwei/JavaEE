package com.zfw.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.zfw.entity.UploadFile;

public class UploadDAOImpl implements IUploadDAO {
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	public void insertFile(UploadFile uploadFile) {
		if (uploadFile!=null) {
			sessionFactory.getCurrentSession().save(uploadFile);
		}
	}


	public List<UploadFile> selectAllFile() {
		String hql="from UploadFile";
		List<UploadFile> list = sessionFactory.getCurrentSession().createQuery(hql).list();
		return list;
	}


	public boolean deleteFileById(UploadFile uploadFile) {
		if (uploadFile.getId()!=null) {
			sessionFactory.getCurrentSession().delete(uploadFile);
			return true;
		}
		return false;
	}


	public UploadFile selectUploadFileById(UploadFile uploadFile) {
		UploadFile uploadFile1 = sessionFactory.getCurrentSession().get(UploadFile.class, uploadFile.getId());
		return uploadFile1;
	}

}
