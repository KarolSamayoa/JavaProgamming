
import java.io.IOException;
import java.io.PrintWriter;
import java.net.*;
import java.util.*;
import java.util.stream.Collectors;

class MyDatabase
{
	private Map<String, ArrayList<BabyName>> myDB;

	public MyDatabase()
	{
		myDB = new TreeMap<>();
		loadData();
	}

	public void findAndPrint(String name)
	{
		ArrayList<BabyName> oneList = myDB.get(name);

		if(oneList != null)
		{

			for(BabyName oneName : oneList)
			{
				System.out.println(oneName);
			}
			System.out.println(name + " was found: " + oneList.size());
		}

		else
		{
			System.out.println(name + " was Not found. ");
		}

		System.out.println("------------------");
	}

	private void loadData()
	{
		try
		{
			for (int year = 2001; year < 2011; year++)
			{
				String URLstring = "https://liveexample.pearsoncmg.com/data/babynamesranking" + year + ".txt";
				System.out.println(URLstring);
				URL url = new URI(URLstring).toURL();
				Scanner input = new Scanner(url.openStream());
				while (input.hasNext())
				{
					//read the tokens for the boy
					int ranking = input.nextInt();
					String boyname = input.next();
					int count = input.nextInt();
					BabyName boy = new BabyName(year,ranking, boyname, count, "Male");

					String girlname = input.next();
					int girlcount = input.nextInt();
					BabyName girl = new BabyName(year,ranking, girlname, girlcount, "Female");

					//System.out.println(ranking + " " + boyname + " " + count + " " + girlname +
					//                     " " + girlcount );


					//process the boy
					if (myDB.containsKey(boyname))
					{
						myDB.get(boyname).add(boy);
					}
					else
					{
						myDB.put(boyname, new ArrayList<>(List.of(boy)));
					}

					//process the girl
					if (myDB.containsKey(girlname))
					{
						myDB.get(girlname).add(girl);
					}
					else
					{
						myDB.put(girlname, new ArrayList<>(List.of(girl)));
					}

				}
			}
		}
		catch (IOException | URISyntaxException ex)
		{
			ex.printStackTrace();
		}
		System.out.println();
	}
	public void printDatabase()
	{
		this.toString();
	}
	public String toString()
	{
		System.out.println("-------------------------Database Content----------------------------");
		for (String key : myDB.keySet())
		{
			System.out.println(key + " was ranked " + "the following years:");
			List<BabyName> babyNames = myDB.get(key);
			Collections.sort(babyNames);
			for (BabyName oneName : babyNames)
			{
				System.out.println(oneName);
			}
			System.out.println();
		}
		return "";
	}
	public Map<String, ArrayList<BabyName>> getMyDB()
	{
		return myDB;
	}
	public void setMyDB(Map<String, ArrayList<BabyName>> myDB)
	{
		this.myDB = myDB;
	}
}
public class ListOfNames
{
	public static void printList(List<BabyName> oneList)
	{
		System.out.println( "------------------" );



		System.out.println( "------------------" );
	}
	public static void main(String[] args)
	{
		MyDatabase myDatabase = new MyDatabase();
		//System.out.println(myDatabase);

		myDatabase.findAndPrint("Zion");
		myDatabase.findAndPrint("ZionX");
		//FIND your NAME and print it
		myDatabase.findAndPrint("Karol");

	}
}
class BabyName implements Comparable<BabyName>
{
	String name;
	int rank;
	int count;
	String gender;
	int year;
	public BabyName(int year, int rank, String name, int count, String gender)
	{
		this.year = year;
		this.name = name;
		this.rank = rank;
		this.count = count;
		this.gender = gender;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getRank()
	{
		return rank;
	}
	public void setRank(int rank)
	{
		this.rank = rank;
	}
	public int getCount()
	{
		return count;
	}
	public void setCount(int count)
	{
		this.count = count;
	}
	public String getGender()
	{
		return gender;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public int getYear()
	{
		return year;
	}
	public void setYear(int year)
	{
		this.year = year;
	}
	@Override
	public int compareTo(BabyName o)
	{
// TODO Auto-generated method stub
		return gender.compareTo(o.gender);
	}
	public String toShortString()
	{
		return year + ": " + "rank: " + rank + " count: " + count;
	}
        @Override
	public String toString()
	{
		return year + ": " + name + " " + gender + " rank: " + rank + " count: " + count;
	}
}
