import java.io.FileReader;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class jsonreader
{
	public static void main(String[] args) throws Exception
	{
		//can replace "data.json" with file name
		Object jsonfile = new JSONParser().parse(new FileReader("data.json"));
		JSONObject jo1 = (JSONObject) jsonfile;
		int size=jo1.size();
		String[][] values=new String[size+2][size+1];
		values[0][0]="Tm";
		values[size+1][0]="Tm";
		int cntr=0;
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		String[] teams=new String[size];
		Iterator<Map.Entry> itr1 = jo1.entrySet().iterator();
		while (itr1.hasNext())
		{
            		Map.Entry pair = itr1.next();
			String team=pair.getKey().toString();
			teams[cntr]=team;
			cntr++;
		}
		Arrays.sort(teams);
		for(int i=0;i<size;i++) {
			String team=teams[i];
			values[i+1][0]=team;
			values[0][i+1]=team;
			values[size+1][i+1]=team;
			values[i+1][i+1]="--";
			map.put(team, i+1);
		}
		itr1 = jo1.entrySet().iterator();
		while (itr1.hasNext())
		{
            		Map.Entry pair = itr1.next();
			String team=pair.getKey().toString();
            		int index=map.get(team);
			Object obj=pair.getValue();
			JSONObject jo2= (JSONObject) obj;
			Iterator<Map.Entry> itr2 = jo2.entrySet().iterator();
			while(itr2.hasNext()) {
	           		Map.Entry pair2 = itr2.next();
				String team2=pair2.getKey().toString();
	            		int index2=map.get(team2);
				Object obj2=pair2.getValue();
				JSONObject jo3= (JSONObject) obj2;
				Long a=(Long) jo3.get("W");
				values[index][index2]=Long.toString(a);
			}
		}
		/*Print DATA*/
        for(String[] row : values) {
            printRow(row);
        }
	}
	  public static void printRow(String[] row) {
	        for (String i : row) {
	            System.out.print(i);
	            System.out.print("\t");
	        }
	        System.out.println();
	    }
}
