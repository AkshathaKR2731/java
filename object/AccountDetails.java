class AccountDetails{

int customerId;
String bankName;
String branchName;
String ifscCode;
long accountNumber;
String adresss;
String accountType;

//default constructor
public AccountDetails(){
System.out.println("default constructor is invoked");
}
public AccountDetails(int customerId,String bankName,String branchName,String ifscCode,
                             long accountNumber,String adresss,String accountType){
		System.out.println("parameterised constructor is invokeing");					 
		//boolean isAccountCreated=false;
		this.customerId=customerId;
		this.bankName=bankName;
		this.branchName=branchName;
		this.ifscCode=ifscCode;
		this.accountNumber=accountNumber;
		this.adresss=adresss;
		this.accountType=accountType;
 }
		
public void getAccount(){
	System.out.println("the customerId is:" +customerId);
	System.out.println("the bank name is:" +bankName);
	System.out.println("the barnch name is:" +branchName);
	System.out.println("the ifscCode is:" +ifscCode);
	System.out.println("the accountNumber is:" +accountNumber);
	System.out.println("The adresss is:" +adresss);
	System.out.println("the accountType is:" +accountType);


}
}