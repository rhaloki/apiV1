package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller extends SpringBootServletInitializer{
	
	List<Book> listBook = new ArrayList<>();
	
	@GetMapping("/")
	public String home(){
		return "Hello World";
	}
	
	@GetMapping("/listBook")
	public List<Book> getAllBook(){
		return listBook;
	}
	
	@PostMapping("/listBook/add")
	public String addBook(@RequestBody Book book){
		listBook.add(book);
		return "book add"; 
	}
	
	@PostMapping("/listBook/addAll")
	public String addBook(@RequestBody List<Book> book){
		listBook.addAll(book);
		return "book add all"; 
	}
	
	@PostMapping("/listBook/searchBy")
	public String search(@RequestBody String book){
		JSONObject jsonObject = new JSONObject(book);
		System.err.println("cek yah : "+jsonObject.get("bookName"));
		
		JSONObject respons = new JSONObject();
		int status = 0;
		try {
			for(int c = 0; c < listBook.size() ; c++){
				if(listBook.get(c).getBookName().equalsIgnoreCase((String) jsonObject.get("bookName"))){
					System.err.println("masuk sini");
					respons.put("status", 0);
					respons.put("index", listBook.get(c).getIndex());
					respons.put("bookName", listBook.get(c).getBookName());
					respons.put("bookPictureUrl", listBook.get(c).getBookPictureUrl());
					respons.put("bookDesc", listBook.get(c).getBookTitle());
					status  = 1;
				}
			}
			
			if(status == 1){
				return respons.toString();
			}else{
				respons.put("status", 0);
				return respons.toString();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}

}
