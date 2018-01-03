<<<<<<< HEAD
package reflect;

public class Person {
	public String name;
	public int age;

	public Person() {

	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return name + "," + age;
	}
	public void show(){
		System.out.println("我被反射了");
	}

}
=======
package reflect;

public class Person {
	public String name;
	public int age;

	public Person() {

	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return name + "," + age;
	}
	public void show(){
		System.out.println("我被反射了");
	}

}
>>>>>>> eb701f607e65845085d7f732a560446847aae8f6
