package data;

public class user {
	
	int id;
	String name, address;
	public user(int id,String name,String address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public int getid()
	{
		return id;
	}

	public String getname()
    {
    	return name;
    }
	public String getaddress()
    {
    	return address;
    }
}
