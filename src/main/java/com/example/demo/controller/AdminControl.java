package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.MallAdmin;
import com.example.demo.service.AdminService;

@RestController
public class AdminControl {
	@Autowired
	public AdminService aser;
	@PostMapping("/addma")
	public MallAdmin regMallAdmin(@RequestBody MallAdmin ma) {
		return aser.addMallAdmin(ma);
	}
	
	@GetMapping("/getma")
	public List<MallAdmin> getma(){
		return aser.getMallAdmin();
	}
	@DeleteMapping("/deletema/{id}")
	public void deletema(@PathVariable Integer id) {
		aser.deleteMallAdmin(id);
	}
	@PutMapping("/updatema")
	public MallAdmin updatema(@RequestBody MallAdmin ma) {
		return aser.updateMallAdmin(ma);
	}

}
