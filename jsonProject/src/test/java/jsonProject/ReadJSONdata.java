package jsonProject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSONdata {

	public static void main(String[] args) throws IOException, ParseException {
		JSONParser jsonparser = new JSONParser();
		
		FileReader reader = new FileReader(".\\jsonFiles\\5.json");
		
		Object obj = jsonparser.parse(reader);
		
		JSONObject jsonobj = (JSONObject)obj;
		
		//String kurzbezeichnung = (String) jsonobj.get("kurzbezeichnung");
		//String strassenbezeichnung = (String) jsonobj.get("strassenbezeichnung");
		
		//System.out.println("kurzbezeichnung :" +kurzbezeichnung);
		//System.out.println("strassenbezeichnung :" +strassenbezeichnung);

		JSONArray array = (JSONArray)jsonobj.get("data");
		
		for(int i=0;i<array.size();i++)
		{
			JSONObject data =(JSONObject) array.get(i);
			
			String kurzbezeichnung=(String) data.get("kurzbezeichnung");
			int id =(int) data.get("id");
			String strassenbezeichnung=(String) data.get("strassenbezeichnung");
			
			System.out.println("kurzbezeichnung and strassenbezeichnung of  "+id+ "is:");
			System.out.println("kurzbezeichnung:"+kurzbezeichnung);
			System.out.println("strassenbezeichnung:"+strassenbezeichnung);
			
			
		}
	}

}
