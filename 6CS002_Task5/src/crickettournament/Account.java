package crickettournament;

import java.math.BigDecimal;
import java.util.function.Function;

public class Account {

		 BigDecimal balance;
		 Function<BigDecimal, BigDecimal> interestCalculator;
		
		 public Account(BigDecimal balance,
		 Function<BigDecimal, BigDecimal> interestCalculator) {
		 this.balance = balance;
		 this.interestCalculator = interestCalculator;
		 }
		
		 public BigDecimal getBalance() {
		 return balance;
		 }
		
		 public void setBalance(BigDecimal balance) {
		 this.balance = balance;
		 }
		
		 public void setInterestCalculator(
		 Function<BigDecimal, BigDecimal> interestCalculator) {
		 this.interestCalculator = interestCalculator;
		 }
		
		 public void applyInterest(){
		 balance = interestCalculator.apply(balance);
		 }
	
}
