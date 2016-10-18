package test;
import java.util.HashMap;

public class TestValuesofMap{
	public static void main(String[] args){
		HashMap<Integer,String> map = new HashMap<Integer,String>();
//		HashMap<String,String> map = new HashMap<String,String>();
		map.put(1,"zhao");
		map.put(2,"qian");
		map.put(3,"sun");
		System.out.println("key"+map.keySet());
		System.out.println("value"+map.values());
	}
}
