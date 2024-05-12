import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		// for versions before Java8  
		List<String> list = Arrays.asList("Hello", "World", "Java");	
		// for versions after Java9 
		// List<String> list = List.of("Hello", "World", "Java");
		
		List<List<Integer>> intList = Arrays.asList(
			Arrays.asList(1, 2),
			Arrays.asList(3, 4)
		);
		
		// Lambda forEach()
		System.out.println("Lambda forEach()");
		list.forEach(s -> System.out.println(s));
		
		// method reference forEach() 
		System.out.println("\nmethod reference forEach()");
		list.forEach(System.out::println);
		
		/*
		 * stream()
		 * Collection -> Stream 
		 */
		Stream<String> stream = list.stream();
		
		/*
		 * collect()
		 * Stream -> Collection
		 */
		List<String> newList = list.stream().collect(Collectors.toList());
		Set<String> set = list.stream().collect(Collectors.toSet());
		
		// filter()
		List<String> len5List = list.stream()
									.filter(s -> s.length() == 5)
									.collect(Collectors.toList());
		
		// map()
		List<String> upCaseList = list.stream()
										.map(s -> s.toUpperCase())
										.collect(Collectors.toList());
		
		/*
		 * flatMap()
		 * {{1, 2},
		 *  {3, 4}}
		 *    ¡õ
		 * {1, 2, 3, 4} 
		 */							
		List<Integer> newIntList = intList.stream()
											.flatMap(i -> i.stream())
											.collect(Collectors.toList());
											
		//case 1
		List<Integer> duplicateList = Arrays.asList(26, 5, 4, 5, 24, 4);
		List<Integer> uniqueList = duplicateList.stream()
												.distinct()
												.sorted().collect(Collectors.toList());
		System.out.println("\ncase1: ");
		uniqueList.forEach(System.out::println);
		
		//case 2
		List<Person> personList = Arrays.asList(
				new Person(0, "Cat", true),
				new Person(1, "Lion", false)
		);
		//Map<Id, Person>
		Map<Integer, Person> personMap = personList.stream()
				.collect(Collectors.toMap(Person::getId, Function.identity()));
		System.out.println("\ncase2: ");
		personMap.forEach((k, v) -> System.out.println("key: " + k + ", value: " + v));
	}
}
