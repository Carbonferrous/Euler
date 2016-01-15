import java.util.*;
class Stopwatch
{
	ArrayList<Date> watch;
	ArrayList<String> pointName;
	public Stopwatch()
	{
		watch = new ArrayList<Date>();
		pointName = new ArrayList<String>();
	}
	public Stopwatch(String s)
	{
		watch = new ArrayList<Date>();
		pointName = new ArrayList<String>();
		watch.add(new Date());
		pointName.add(s);
	}
	public String addPoint(String s)
	{
		watch.add(new Date());
		pointName.add(s);
		return s;
	}
	public ArrayList<Long> getTimes()
	{
		ArrayList<Long> output = new ArrayList<Long>();
		for(int x=0;x<watch.size()-1;x++)
		{
			output.add(watch.get(x+1).getTime()-watch.get(x).getTime());
		}
		output.add((new Date()).getTime()-watch.get(watch.size()-1).getTime());
		return output;
	}
	public String toString()
	{
		String output = "";
		for(int x=0;x<watch.size()-1;x++)
		{
			long pointTime = watch.get(x+1).getTime()-watch.get(x).getTime();
			output += pointName.get(x)+": "+(pointTime/1000)+"."+(pointTime%1000)+" seconds\n";
		}
		long pointTime = (new Date()).getTime()-watch.get(watch.size()-1).getTime();
		output += pointName.get(watch.size()-1)+": "+(pointTime/1000)+"."+(pointTime%1000)+" seconds";
		
		return output;
	}
}