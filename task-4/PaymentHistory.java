// Task 4

public class PaymentHistory { 
  List<Payment> paymenthistory;
  User user;
  
  public PaymentHistory(User user){
		this.user = user;
  }

  public Boolean add(Payment payment) { 
	for(Payment p : paymenthistory){
		if(p == payment) return false;
	}   
	paymenthistory.add(payment);
	return true;
	}          
} 

