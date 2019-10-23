package exercise1;
import java.util.*;

class Person {
	private String name;
	private int age;

	public Person (String name, int age) {
		this.name = name;
		this.age= age;
	}

	public String getName() {
		return name;
	}
// set pour changer les elements
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
