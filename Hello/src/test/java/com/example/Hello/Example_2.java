package com.example.Hello;

import java.util.Objects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Example_2 {
	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

	@GetMapping("/Hi")
	public GiveResponse SayHi() {
		return new GiveResponse("HiMrBoo");
	}
//		record GiveResponse(String message) {
		
	class GiveResponse{
		private final String msg;
		GiveResponse(String msg){
			this.msg=msg;
		}
		public String getResponse() {
			return msg;
		}
	}
	
//	@Override
//	public String toString() {
//		return "{" +
//	        "msg=''" + msg +'\' + "}";
//	}
//	@Override
//	public boolean equals(Object o) {
//		if(this==o)return true;
//		if(o==null||getClass();=o.getClass())returnfalse;
//		GiveResponse that=(GiveResponse)o;
//		return.Objects.equals(msg, that.msg);
//	}
//	@Override
//	public int hashcode() {
//		return objects.hash(msg);
//	}
//	}

