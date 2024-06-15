// Imagine you have to develop a system for a bank that allows it’s customers 
// to open Bank accounts and get bank account details. Let’s say initially your 
// application should support creating 3 account types(Personal, Business, and Checking account), 
// and future there may be more account types.


import java.util.*;

public class FactoryDesignPattern {
	
	public static void main(String[] args) {
		AccountFactory factory = new CheckingAccountFactory();

		Account account = factory.openBankAccount();
		account.getAccountDetails();
	}
}


// Generic Account
interface Account {

	public void getAccountDetails();
}

// Personal Account
class PersonalAccount implements Account {

	long personalAccountId;

	PersonalAccount(long personalAccountId) {
		this.personalAccountId = personalAccountId;
	}

	public void getAccountDetails() {
		System.out.println(" Fetched PersonalAccount Details with accountId - " + this.personalAccountId);
	}

}

// Business Account
class BusinessAccount implements Account {

	long businessAccountId;

	BusinessAccount(long businessAccountId) {
		this.businessAccountId = businessAccountId;
	}

	public void getAccountDetails() {
		System.out.println(" Fetched BusinessAccount Details with accountId - " + this.businessAccountId);
	}

}

// Checking Account
class CheckingAccount implements Account {

	long checkingAccountId;

	CheckingAccount(long checkingAccountId) {
		this.checkingAccountId = checkingAccountId;
	}

	public void getAccountDetails() {
		System.out.println(" Fetched CheckingAccount Details with accountId - " + this.checkingAccountId);
	}

}

// Concrete Class
interface AccountFactory {

	public Account openBankAccount();
}

class PersonalAccountFactory implements AccountFactory {

	public Account openBankAccount() {
		Random random = new Random();
		Account personalAccount = new PersonalAccount(random.nextInt(10000));
		return personalAccount;
	}
}

class BusinessAccountFactory implements AccountFactory {

	public Account openBankAccount() {
		Random random = new Random();
		Account businessAccount = new BusinessAccount(random.nextInt(10000));
		return businessAccount;
	}
}

class CheckingAccountFactory implements AccountFactory {

	public Account openBankAccount() {
		Random random = new Random();
		Account checkingAccount = new CheckingAccount(random.nextInt(10000));
		return checkingAccount;
	}
}