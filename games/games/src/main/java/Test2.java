import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class Test2 {
	
	
	
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub
		Student student = new Student("Sai", 1, 80, LocalDate.of(1997,12, 9), "M");
		Student student1 = new Student("Kranth", 2, 90, LocalDate.of(1998,2,4), "M" );
		Student student2 = new Student("Vijay", 3, 70, LocalDate.of(1950,1,26), "F" );
		Student student3 = new Student("Madhu", 4, 82, LocalDate.of(1950,1,26), "F" );
		Student student4 = new Student("Vineeth", 5, 56, LocalDate.of(1950,1,26), "G" );
		Student student5 = new Student("Venkat", 6, 65, LocalDate.of(1950,1,26), "G" );
		Student student6 = new Student("Sunny", 7, 77, LocalDate.of(1950,1,26), "F" );
		Student student7 = new Student("Kzay", 8, 86, LocalDate.of(1950,1,26), "M" );
		Student student8 = new Student("Arun", 9, 80, LocalDate.of(1950,1,26), "M" );
		
		List<Student> std= new ArrayList<>();
		std.add(student8);
		std.add(student7);
		std.add(student6);
		std.add(student5);
		std.add(student4);
		std.add(student3);
		std.add(student2);
		std.add(student1);
		std.add(student);
		
		Map<String, Long> resMa=std.stream()
			.collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
		//System.out.println(resMa);
	List<Student> res= std.stream()
						.sorted(Comparator.comparing(Student::getName))
						.collect(Collectors.toList());
		
				//.forEach(s-> s.getMarks()>87)
				//.forEach(System.out::println);
		
		//System.out.println(res);
		
		List<Student> resAge=std.stream()
			.sorted(Comparator.comparing(Student::getDoj)).collect(Collectors.toList());
		resAge.stream()
		.forEach(e->System.out.println("name "+e.getName()+"-  Age "+e.getDoj()));
		System.out.println(resAge.toString());
		
		ObjectMapper obj = new ObjectMapper();
		
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("name", "Kranth");
		//jsonObj.put("Sai", 2);
		Student st= obj.readValue(jsonObj.toString(), Student.class);
		System.out.println(st);
		//Student st = obj.write
		
		String jsonobj = obj.writeValueAsString(st);
		System.out.println(jsonobj);
		
	}

}
