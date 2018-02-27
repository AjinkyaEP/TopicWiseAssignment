/************************************************************************
TITLE:- Implementation of Default Interface and Static Interface 
AUTHOR:- AJINKYA
DATE:-26/02/2018
*************************************************************************/
package Topic.wiseassignment;

public interface Interface2 
{
	default void log(String str)
	{
		System.out.println("Interface 2 logging::"+str);
	}
	static boolean isNull(String str) 
	{
		System.out.println("Interface Null Check");

		return str == null ? true : "".equals(str) ? true : false;
	}
}
