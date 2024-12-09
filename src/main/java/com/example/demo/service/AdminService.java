package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.MallAdmin;
import com.example.demo.repository.MallAdminRepository;

@Service
public class AdminService {
	
	@Autowired
	public MallAdminRepository mrepo;
	
	public MallAdmin addMallAdmin(MallAdmin ma) {
		return mrepo.save(ma);
	}
	public List<MallAdmin> getMallAdmin(){
		
		return mrepo.findAll();
	}
	
	public void deleteMallAdmin(int id) {
		mrepo.deleteById(id);
	}
	
	public MallAdmin updateMallAdmin(MallAdmin ma) {
		
		Integer id = ma.getId();
		MallAdmin ma1 = mrepo.findById(id).get();
		ma1.setName(ma.getName());
		return mrepo.save(ma);
	}

}
