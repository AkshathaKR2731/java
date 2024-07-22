class Passport{
	
	cpvLocations;
	int dcdrLocations;
	String surNames;
	String dobs;
	String givenNames;
	String emails;
	String loginIds;
	String loginPwds;
	String confirmPwds;
	boolean isemailLoginSames;
	String hintQuets;
	String hintAnss;
	String Captchas;

public Passport(){
	
	System.out.println("user Passport object created
}
	public static boolean createPassport(String cpvLocation,int dcdrLocation,String surName,
	String dob,String givenName,String email,String loginId,String loginpwds,String confirmPwd,
	boolean isemailLoginSame,String hintQuet,String hintAns,String Captcha){
	boolean isPassportDataCreated=false;
	
	boolean isSurnameCreated=false;
	
	if(null != surName) {
		this.surName =surName;
		isSurnameCreated=true;
	}else{
		System.out.println("passport created");
	}
	
	
	System.out.println("The Passport created satrted...");
	if(cpvLocation !=null && dcdrLocation>0 && surName !=null && dob !=null && givenName !=null && email !=null && 
	loginId !=null && loginpwds !=null && confirmPwd !=null && isemailLoginSame !=false && hintQuet !=null && hintAns !=null && Captcha !=null){ 
	
	this.cpvLocations = cpvLocation;
	this.dcdrLocations = dcdrLocation;
	this.surNames =surName;
	this.dobs=dob;
	this.givenNames=givenName;
	this.emails=email;
	this.loginIds=loginId;
	this.loginPwds=loginpwds;
	this.confirmPwds=confirmPwd;
	this.isemailLoginSames=isemailLoginSame;
	this.hintQuets=hintQuet;
	this.hintAnss=hintAns;
	this.Captchas=Captcha;
	}
	else{
		System.out.println("Initializing the Valid Detiles");
	}
	
	return isPassportDataCreated;
	
		
	}
	//System.out.println("The Passport is created" +isPassportDataCreated);
	public static void getPassportDetails(){
	System.out.println(" cpv Location is:" +cpvLocation);
	System.out.println(" dcdr Location is:" +dcdrLocation);
	System.out.println(" sur name is:" +surName);
	System.out.println(" date of birth is:" +dob);
	System.out.println(" given name is:" +givenName);
	System.out.println(" e mail  is:" +email);
	System.out.println(" login id is:" +loginId);
	System.out.println("login passward is:" +loginPwd);
	System.out.println(" confirm Pwd is:" +confirmPwd);
	System.out.println(" is email ligin same is:" +isemailLoginSame);
	System.out.println(" hint Quet is:" +hintQuet);
	System.out.println(" hint answer is:" +hintAns);
	System.out.println(" captch is:" +Captcha);
	System.out.println("Passport created ended...");
	
	
	}
	}
	
	
	if
	
//cpvLocation= po
//dcdrLocation = 7
//surName =Akshi
//dob =31/08/2003
//givenName= Aksatha k R
//email =akshatakr1031@gamil.com
//loginId =akshatakr1031@gamil
//Login pwd =Akshu$10
//confirmPwd =Akshau&10
//isemailLoginSame= true
//hintQuet= colour
//hintAns =blue
//Captcha = DA27AV