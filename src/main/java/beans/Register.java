package beans;
public class Register {

	private int regid;
	private String fname;
	private String lname;
	private String email;
	private String pass;
	private long mobile;
	private String address;

	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Register(int regid, String fname, String lname, String email, String pass, long mobile, String address) {
		super();
		this.regid = regid;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pass = pass;
		this.mobile = mobile;
		this.address = address;
	}
	
	public int getRegid() {
		return regid;
	}


	public void setRegid(int regid) {
		this.regid = regid;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public String toString() {
		return regid+" "+fname+" "+lname+" "+email+" "+pass+" "+mobile+" "+address;
	}
	public int hashCode() {
		return toString().hashCode();
	}

	public boolean equals(Object o) {
		boolean flag=false;
		if(o instanceof Register) {
			Register reg=(Register)o;
			if( this.regid==reg.getRegid() && this.fname.equals(reg.getFname()) && this.lname.equals(reg.getLname()) && this.email.equals(reg.getEmail()) && this.pass.equals(reg.getPass()) &&  this.mobile==reg.getMobile() && this.address.equals(reg.getAddress()) ) {
				flag=true;
			}
		}
		return flag;
	}
}
