class hello
{
	int id;
	String name,company;

	public void detail(){

		name="shivam";
	id=75557;
		company="capgemini";
	System.out.println(name+ " " +company+ ""  +id);
	}

	public static void main(String args[])
	{
		hello h =new hello();
		h.detail();
	}
}

