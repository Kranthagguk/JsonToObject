import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr= new ArrayList<>();
		arr.add(1);
		arr.add(4);
		arr.add(2);
		arr.add(6);
		arr.add(7);
		int res= arr.stream().filter(r->r>6)
				.collect(Collectors.summingInt(r->r));
		
		System.out.println(res);
	}

}
