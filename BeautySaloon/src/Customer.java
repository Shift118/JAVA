public class Customer {
	private String name,memberType;
	private boolean member = false;
	Customer(String name){
		this.name = name;
	}
	String getName() {
		return name;
	}
	boolean isMember(){
		return member;
	}
	void setMember(boolean member) {
		this.member = member;
	}
	String getMemberType() {
		return this.memberType;
	}
	void setMemberType(String mem) {
		memberType = mem;
	}
	public String toString() {
		return "Customer: "+"\n"+
					"Name: "+getName()+"\n"+
					"Member: "+isMember()+"\n"+
					"Member Type: "+getMemberType();
	}
	
	
}
