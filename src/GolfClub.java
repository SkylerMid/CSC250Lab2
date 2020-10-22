
public class GolfClub extends Object
{
	public String mat; //as in material.
	public int dis; //as in distance.
	
	public GolfClub(String mat, int dis)
	{
		this.mat = mat;
		this.dis = dis;
	}
	
	int addNums(int a, int b)
	{
		return a + b;
	}
	
	static int addNums2(int a, int b)
	{
		return a + b;
	}
	
	public int getdis() 
	{
		return dis;
	}

	public String getmat()
	{
		return this.mat;
	}
	
	public void setmat(String newmat)
	{
		if(newmat.length() >= 5)
		{
			this.mat = newmat;
		}
	}
	public void display()
	{
		System.out.println("Club: "+ this.mat + " Distance: "+ this.dis);
	}
}