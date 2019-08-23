package com.example.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import org.springframework.stereotype.Service;

import com.example.demo.model.Payment;

@Service
public class PaymentService {

	
	private HashMap<Long, Payment> pmtList;
	
	  public PaymentService() {
		// TODO Auto-generated constructor stub
		super();
		this.pmtList=new HashMap<>();
		pmtList.put(203L,new Payment(203,"creditcardpmt",4200));
		pmtList.put(204L,new Payment(204,"ebillpmt",8200));
	} 
	
	  public Payment addToList(Payment pmt) {
		  
		  long reqId = pmt.getPaymentId();
		  
		  Payment obj = this.pmtList.put(pmt.getPaymentId(), pmt);
		  
//		  int val;
//		  if(this.pmtList.put(pmt.getPaymentId(), pmt)==null){
//			  
//			   val=1;
//		  }
//		  else {
//			  val=0;
//		  }
//		  return val;
		  return  this.pmtList.get(reqId);
		  
	  }
	  
	  public Payment findById(long id) {
		  return this.pmtList.get(id);
	  }
//	  public List<Payment> findAll(){
//			return this.pmtList.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());		
//	  }
	  
}
