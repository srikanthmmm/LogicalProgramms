package com.srikanth;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.sound.sampled.ReverbType;

public class Java {

	public static void main1(String[] args) {
		String arr= "Privaccccey";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<arr.length();i++) {
			if(map.containsKey(arr.charAt(i))) {
				map.put(arr.charAt(i), map.get(arr.charAt(i))+1);
			}else {
				map.put(arr.charAt(i), 1);
			}
		}
		map.forEach((key,value)-> System.out.println("reapeted letter: "+key+"   Number Of Times: "+value));

	}

	
	public static void main2(String[] args) {
		String arr= "SLOKAM TECH SLOKAM TECH ";
		
		char [] chars= arr.toCharArray();
		int count=0;
		for(int i=0;i<arr.length();i++) {
			for(int j=i+1;j<arr.length();j++) {
				if(chars[i]==chars[j]) {
					System.out.println("Reapeted Letters:"+chars[i]);
					count++;
					break;
				}
			}
		}
	}
	public static void main3(String[] args) {
		String arr ="Privaccccey";
		Set<Character>set = new LinkedHashSet<Character>();
		for(int i=0;i<arr.length();i++) {
			set.add(arr.charAt(i));
		}for(Character c:set) {
			System.out.println("After Removing Duplicate Characters: "+c);
		}
	}
	public static void main4(String[] args) {
		String arr ="Privacccey";
		
		for(int i=0;i<arr.length();i++) {
			boolean flag = true;
			for(int j=i+1;j<arr.length();j++) {
				if(i!=j && arr.charAt(i)==arr.charAt(j)) {
					flag=false;
					break;
				}
			}if(flag) {
				System.out.println("First Non Reapeting Character: "+arr.charAt(i));
				break;
			}
		}
	}
	public static void main5(String[] args) {
		String arr ="Srikanth";
		
		char [] chars= arr.toCharArray();
		String reverse="";
		for(int i=chars.length-1;i>=0;i--) {
			reverse=reverse+chars[i];
		}
	    System.out.println("Reverse String : "+reverse);
	}
	public static void main6(String[] args) {
		String arr ="SLOKAM@#$%^&*";
		
		int count =0;
		String removeSpecialCharacters="";
		for(int i=0;i<arr.length();i++) {
			if(!Character.isDigit(arr.charAt(i)) && !Character.isLetter(arr.charAt(i)) && !Character.isWhitespace(arr.charAt(i))) {
				count++;
			}else {
				removeSpecialCharacters=removeSpecialCharacters+arr.charAt(i);
			}
		}
		if(count==0) {
			System.out.println("Total Word");
		}else {
			System.out.println("After remove the Special Charactres: "+removeSpecialCharacters);
		}
	}
	public static void main7(String[] args) {
			String arr ="Privacccey";
			
		 IntStream stream=	arr.chars();
		Stream<Character> map=  stream.mapToObj(a->(char)a);
	Map<Object, Long> result= 	map.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println("Results: "+result);
	}
	
	public static void main8(String[] args) {
		List<String> arr = Arrays.asList("sri","srikanth","'sri","aaa","aaa","aaaaaaa");
		
		Map<Object, Long> map= arr.stream().collect(Collectors.groupingBy(str-> str,Collectors.counting()));
		Entry<Object, Long> result=map.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		
		System.out.println("Most Reapeted Letter: "+result.getKey()+"   Number Of Times: "+result.getValue());
	}
	public static void main9(String[] args) {
		List<String> arr = Arrays.asList("sri","srikanth","'sri","aaa","aaa","aaaaaaa");
		
	List<String> result=	 arr.stream().filter(a-> a.length()>5).collect(Collectors.toList());
	System.out.println("Greter than five : "+result);
	}
	public static void main10(String[] args) {
		int [] arr = {1,2,3,4,5,6,1,2,3,4};

		
		
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}for(int a:arr) {
			System.out.println("Sorting order: "+a);
		}
	}
	public static void main11(String[] args) {
		int [] arr = {1,2,3,4,5,6,1,2,3,4,9};
		
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=1;j<arr.length;j++) {
				if(arr[i]%j==0) {
					count++;
				}
			}if(count==2) {
				System.out.println("Is prime: "+arr[i]);
			}else {
				System.out.println("Is not prime: "+arr[i]);
			}
		}
	}
	public static void main12(String[] args) {
		int num =9;
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}if(count==2) {
			System.out.println("Is prime");
		}else {
			System.out.println("Is not prime");
		}
	}
	public static void main13(String[] args) {
		int [] arr = {1,2,3,4,5,6,1,2,3,4,9};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate numbers: "+arr[i]);
				}
			}
		}
	}
	public static void main14(String[] args) {
		int [] arr = {1,2,3,4,5,6,1,2,3,4,9};
		
		int first= arr[0],second =arr[0];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=2;j<arr.length;j++) {
				if(arr[i]>first) {
					second=first;
					first=arr[i];
				}
			}if(arr[i]<first) {
				second=arr[i];
			}
		}
		System.out.println("Second Largest Number: "+second);
	}
	public static void main15(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,9,10};
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum of All : "+sum);
		int sum1=0;
		
		for(int i=1;i<=10;i++) {
			sum1=sum1+i;
		}
		System.out.println("Count with missing number also: "+sum1);
	System.out.println("Missing Number: "+(sum1-sum));
	}
	public static void main16(String[] args) {
		int [] arr = new int[]{1,2,3,4,5,1,2,4,2,6,7,9,10};
				countOccurency(arr);
	}
	static void countOccurency(int [] arr) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			int count=1;
			if(i!=arr.length-1) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j])
						count++;
					else
						break;
				}
			}System.out.println(arr[i]+" "+count);
			i+=(count-1);
		}
		
	}
	public static void main17(String[] args) {
		String arr ="Srikanth Technoloies Srikanth";
		Map<String, Integer> map = new HashMap();
		for(String s : arr.split(" ")) {
			if(map.containsKey(s)) {
				map.put(s,map.get(s)+1);
			}else {
				map.put(s, 1);
			}
		}
		System.out.println("============>  "+map);
	}
	public static void main18(String[] args) {
		int num=9;
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}if(count==2) {
			System.out.println("Is prime");
		}else {
			System.out.println("Is not Prime");
		}
	}
	public static void main19(String[] args) {
		int [] arr = {2,3,4,5,6,7,8,7,9,10};
		
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=1;j<arr.length;j++) {
				if(arr[i]%j==0) {
					count++;
				}
			}if(count==2) {
				System.out.println("Is prime: "+arr[i]);
			}else {
				System.out.println("Is not Prime: "+arr[i]);
			}
		}
	}
	public static void main20(String[] args) {
		int sumOfCubes =0,a = 0,temp;
		int num=153;
		temp=num;
		
		while(num>0) {
			temp=num%10;
			num=num/10;
			sumOfCubes=sumOfCubes+(a*a*a);
		}if(temp==sumOfCubes) {
			System.out.println("Is arm"+temp);
		}else {
			System.out.println("Is not arm"+temp);
		}
	}
	public static void main21(String[] args) {
		int [] arr = {1,2,3,4};
		
	int sum=	Arrays.stream(arr).sum();
	System.out.println(sum);
	}
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,1,1,2,2,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		
		List<Integer> num = Arrays.asList(2,3,4,5,6,7,8,9,10);
		
		List<String> one = Arrays.asList("aaa","aaaa","aaa","aaaa","aaaaaa");
		
		List<Integer> dup= list.stream().filter(a-> Collections.frequency(list, a)>1).collect(Collectors.toList());
		System.out.println("Duplicate Numbers: "+dup);
		
		List<Integer> even= num.stream().filter(a-> a%2==0).collect(Collectors.toList());
		System.out.println("Even Numbers: "+even);
		
		List<Integer> odd= num.stream().filter(a-> a%2!=0).collect(Collectors.toList());
		System.out.println("odd Numbers: "+odd);
		
		Optional<Integer> sum=	list.stream().reduce((a,b)-> a+b);
		System.out.println("Sum of All: "+sum);
		
		Integer maximum= list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Maximum Number: "+maximum);
		
		Integer minimum= list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Minimum Number: "+minimum);
		
		Integer secondLargestNumbe=	list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println("Second Largest Number: "+secondLargestNumbe);
		
		List<String> lessThan= one.stream().filter(a-> a.length()<5).collect(Collectors.toList());
		System.out.println("Less Than Five: "+lessThan);
		
		//First Five Numers adding
		List<Integer> nums= list.stream().limit(5).collect(Collectors.toList());
		System.out.println("First fIVE number: "+nums);
		
	    int sumOf=	list.stream().limit(5).reduce((a,b)-> a+b).get();
	    System.out.println("SumOf All 5 Numbers: "+sumOf);
	    
	    
	    //after five numbers    
	   List<Integer> a=  list.stream().skip(5).collect(Collectors.toList());
	   System.out.println(a);
	   
	   int sumOsAll= list.stream().skip(5).reduce((c,b)-> c+b).get();
	   System.out.println("Sum Of Numbers : "+sumOsAll);
	}
}
