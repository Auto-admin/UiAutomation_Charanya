package au.com.uiautomation;


import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ReadTestData {
	static Properties props;
	static CSVReader reader = null;
	static HashMap<String, Properties> dataMap = new HashMap<String, Properties>();
	static String configPath = new File("").getAbsolutePath() + "\\src\\test\\resources\\TestData.csv";
	private static final Logger LOGGER = LoggerFactory.getLogger(ReadTestData.class);
	
	public ReadTestData(){
		
	}

		public static HashMap<String, Properties> populateDataFromCSVFile(){
	    try {
	    	props = new Properties();
	    	int count =1,colNumber=0;
	    	String scenario="";

	    	String OS = System.getProperty("os.name");
			LOGGER.info("OS Name: "+OS);
			if(OS.equalsIgnoreCase("Windows")) {
				configPath = new File("").getAbsolutePath() + "\\src\\test\\resources\\TestData.csv";
			}else{
	            configPath = configPath.replace("\\", File.separator);

			}
			LOGGER.info("configPath: "+configPath);
			
	        reader = new CSVReader(new FileReader(configPath));
	        String[] line;
	        while ((line = reader.readNext()) != null) {
	        	 props = new Properties();
	        	 for (colNumber=0;count<(line.length-1);colNumber++) {
	        		 if(colNumber==0){
	 	        		scenario = line[colNumber];
	 	        		continue;
	 	        	}else{
	 	        		props.setProperty(line[count], line[++count]);
	 	        		count++;
	 	        	} 
	              }
	        	 if(count>1) {
		        	 dataMap.put(scenario, props);
		        	 count=1;colNumber=0;
	        	 }
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    
	    return dataMap;
	}


	public static String readTestData(String scenario,String key){
		String result = "";
		Properties localProp = new Properties();
		
		if(dataMap!=null){
			Map<String, Properties> map = new HashMap<String, Properties>();
			map = dataMap;
			scenario = scenario.replace("\"", "");
			key = key.replace("\"", "");
			for (Map.Entry<String, Properties> entry : map.entrySet())
			{
				if(entry.getKey().equals(scenario.trim())) {
					localProp = entry.getValue();
					break;
				}
					
			}
			result = localProp.getProperty(key.trim());
			if (result == null)
				return "";
			else {
				result = result.replace("\"", "");
				result.trim();
			}
		}
		return result;
	}
	

	
}
