package user.exception;

class  AmountInputException extends Exception{
	 AmountInputException(String warning){
		super(warning);
	}
	
	 AmountInputException(){
		this("This is a UserException");
	}	
} // 입금 경고문

class InvalidAmountException extends Exception{
	InvalidAmountException(String warning){
		super(warning);
	}
	
	InvalidAmountException(){
		this("This is a UserException");
	}	
}//출금 경고문



class Account{
	int balance;
	
	Account(int balance){
		this.balance=balance;
		
	}
	
	public void deposit(int amount) throws AmountInputException {
		/*
		 * 입금액은 반드시 1000원 이상
		 * 그렇지 않으면 AmountInputException을 발생시킴
		 * 
		 * 현재 잔액에 amount를 추가하고 그 결과로 잔액은 증가
		 * 메세지 출력...잔액을 출력
		 */
		if(amount<1000)
			throw new  AmountInputException("입금액은 1000원이상입니다.");
		else {
			balance +=amount;			
		}
		System.out.println("입금 후 현재 잔액은 :: "+balance);
	}
	
	public void withdraw(int amount) throws InvalidAmountException{
		/*
		 * 잔액보다 출금 하려는 금액이 많으면 InvaildAmountException을 발생
		 * 그렇지 않다면
		 * 잔액에서 출금액이 빠지고
		 * 메세지 출력... 잔액 출력...
		 */
		
		if(balance<amount)
			throw new InvalidAmountException("출금액은 잔액보다 크지 못합니다.");
		
			else {
				balance -= amount;
			}
		System.out.println("출금 후 현재 잔액은 :: "+balance);
	}
}

public class BankAccountException {
	public static void main(String[] args) {
		//10000 balance 시작
		Account acc = new Account(10000);
		//입금
		System.out.println(" 입금을 시작합니다...");
		try {
		acc.deposit(20000);		
		acc.deposit(800);
		}catch(AmountInputException e) {
			System.out.println(e.getMessage());
		}
		//출금
		System.out.println("출금을 시작합니다...");
		try {
		acc.withdraw(23000);
		acc.withdraw(7000);
		acc.withdraw(20000);
		}catch(InvalidAmountException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("현재 잔액은 :: "+acc.balance);
		
		/*
		 * 1. 20000원 입금
		 * 2. 800원 입금(에러)
		 * 3. 23000원 출금
		 * 4. 7000원을 출금
		 * 5. 20000원을 추름(에러)
		 * 마지막 최종 잔액을 출력
		 */
	}

}
