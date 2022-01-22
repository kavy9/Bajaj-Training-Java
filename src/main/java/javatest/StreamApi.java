package javatest;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Collection;


class Mobile implements Comparable<Mobile>
{
	@Override
	public String toString() {
		return "Mobile [name=" + name + ", MarketRating=" + MarketRating + ", Benchmark=" + Benchmark + ", company="
				+ company + "]";
	}
	@Override
	public boolean equals(Object obj) {
		Mobile other = (Mobile)obj;
		return this.company==other.getCompany();
	}
	public Mobile(String name, int marketRating, int benchmark, String company) {
		super();
		this.name = name.toLowerCase();
		MarketRating = marketRating;
		Benchmark = benchmark;
		this.company = company.toLowerCase();
	}
	protected String name;
	protected int MarketRating;
	protected int Benchmark;
	protected String company;
	@Override
	public int compareTo(Mobile o) {
		if(this.getMarketRating()>o.getMarketRating())
		{
			return 1;
		}
		else if(this.getMarketRating()<o.getMarketRating()) {
			return -1;
		}
		return 0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarketRating() {
		return MarketRating;
	}
	public void setMarketRating(int marketRating) {
		MarketRating = marketRating;
	}
	public int getBenchmark() {
		return Benchmark;
	}
	public void setBenchmark(int benchmark) {
		Benchmark = benchmark;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

	
}
class SortByBenchMark implements Comparator<Mobile>
{

	@Override
	public int compare(Mobile o1, Mobile o2) {
		if(o1.getBenchmark()>o2.getBenchmark())
		{
			return 1;
		}
		else if(o1.getBenchmark()<o2.getBenchmark()) {
			return -1;
		}
		return 0;
	}
	
}
class SortByCompany implements Comparator<Mobile>
{

	@Override
	public int compare(Mobile o1, Mobile o2) {

		return o1.getCompany().compareTo(o2.getCompany());
	}
	
}
public class StreamApi {

	public static void main(String[] args) {
		
//		Stream<String> stream = Stream.empty();
//		
//		Collection<Integer> collection = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//		
//		Stream<Integer> collectionstream1 = collection.stream();
		
		//List<Integer> list=collectionstream1
		//.filter(a->a%2!=0)
		//.collect(Collectors.toList());
		//.forEach(a->System.out.println(a));
		//list.forEach(x->System.out.println(x));
		
		//count 
		//min
		//max
		//filter
		//map
		//forEach
		//collectors
		//distinct 
		//sorting - .sorted()
		List<Mobile> list = new ArrayList<>();
		list.add(new Mobile("7T",7,34598,"Oneplus"));
		list.add(new Mobile("s10",8,36708,"Samsung"));
		list.add(new Mobile("s20",9,40198,"Samsung"));
		list.add(new Mobile("iPhone13",10,45598,"Apple"));
		list.add(new Mobile("Pixel6",8,41598,"Google"));
		list.add(new Mobile("Zenfone",7,39598,"Asus"));
		
		Stream<Mobile> stream1 = list.stream();
		//sorting by market rating 
		System.out.println("sorting by market rating ASCE ");
		stream1
		.sorted((a,b)->a.compareTo(b))
		.forEach(x->System.out.println(x.toString()));
		//Comparator.comparingInt(Mobile::getMarketRating)
		
		//phone with highest rating
		System.out.println();
		System.out.println("phone with highest rating ");
		Stream<Mobile> stream2 = list.stream();
		Optional<Mobile> max = stream2
		.max((a,b)->a.compareTo(b));
		System.out.println(max.toString());
		
		//sort by benchmark 
//		System.out.println("sorting by benchmark ");
//		Stream<Mobile> stream3 = list.stream();
//		stream3
//		.sorted((a,b)->{
//			if(a.getBenchmark()>b.getBenchmark())
//			{
//				return 1;
//			}
//			else if(a.getBenchmark()<b.getBenchmark()) {
//				return -1;
//			}
//			else {
//				return 0;
//			}
//		})
//		.forEach(x->System.out.println(x.toString()));
		System.out.println();
		System.out.println("sorting by benchmark ");
		Stream<Mobile> stream3 = list.stream();
		stream3
		.sorted(new SortByBenchMark())
		.forEach(x->System.out.println(x.toString()));
		
		System.out.println();
		System.out.println("getting all distinct companies ");
		Stream<Mobile> stream4 = list.stream();
//		stream4
//		.distinct()
//		.forEach(x->System.out.println(x.toString()));
		stream4
		.collect(Collectors.groupingBy(a->a.getCompany()))
		.values()
		.forEach(b->System.out.println(b.get(0).getCompany()));
//		System.out.println();
//		System.out.println("distinct");
//		list.stream().map(x->x.getCompany()).distinct().forEach(x->System.out.println(x.toString()));
		
		//filter by rating 
		System.out.println();
		System.out.println("mobiles with rating 7 ");
		Stream<Mobile> stream5 = list.stream();
		stream5
		.filter(x->x.getMarketRating()==7)
		.forEach(x->System.out.println(x.toString()));
		
		System.out.println();
		System.out.println("categorising according to benchmark");
		Stream<Mobile> stream6 = list.stream();
		list.stream()
		.map(x->{
			if(x.getBenchmark()>40000)
				return x.getName()+" high";
			else 
				return x.getName()+" low";
		})
		.forEach(x->System.out.println(x.toString()));
		
		System.out.println();
		System.out.println("Getting Average BenchMark");
		Double avgBenchmark = list.stream().collect(Collectors.averagingInt(p->p.getBenchmark()));
		System.out.println("Average Benchmark of all Mobiles "+ avgBenchmark.floatValue());
		
		System.out.println();
		System.out.println("Sum of all benchmark");
		Stream<Mobile> stream8 = list.stream();
		int sumOfAllBenchmark = list.stream()
		.map(x->x.getBenchmark())
		.reduce(0,(a,b)->(a+b)/2);
		System.out.println(sumOfAllBenchmark);
		
		System.out.println();
		System.out.println("Count");
		System.out.println(list.stream().count());
		

		
		System.out.println();
		System.out.println("Highest Benchmark");
		Optional<Mobile> highestBenchMark=list.stream().max(new SortByBenchMark());
		System.out.println(highestBenchMark.toString());
	}

}
