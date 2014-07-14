package oop.asg02;
public class BigInteger
{
	private int bigInt ;
	public int getBigInt()
	{
		return bigInt;
	}
	
	public void setBigInt(int i)
	{
		this.bigInt = i;
	}
	
	public BigInteger(int init){
		this.bigInt = init;
	}
	
	public BigInteger(String init){
		this.bigInt = Integer.valueOf(init);
	}
	
	public String toString(){
		return Integer.toString(this.bigInt);
	}
	
	public boolean equals(Object other){
		return toString().equals(other.toString());
	}
	
	public long toLong(){
		return Long.valueOf(this.bigInt);
	}
	
	public BigInteger add(BigInteger other){
		this.bigInt += other.getBigInt();
		return this;
	}
	
	public BigInteger subtract(BigInteger other){
		this.bigInt -= other.getBigInt();
		return this;
	}
}