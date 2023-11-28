package Details;

import java.util.Objects;

public class Cricketer {
String name;
int age;
String email_id;
String phone;
int rating;



public Cricketer(String name, int age, String email_id, String phone, int rating) {
	super();
	this.name = name;
	this.age = age;
	this.email_id = email_id;
	this.phone = phone;
	this.rating = rating;
}
public Cricketer(String name) {
	super();
	this.name = name;
}



@Override
public String toString() {
	return "\nCricketer [ name=" + name + ", age=" + age + ", email_id=" + email_id + ", Phone=" + phone + ", rating="
			+ rating + "]";
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
public String getEmail_id() {
	return email_id;
}
public void setEmail_id(String email_id) {
	this.email_id = email_id;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}
@Override
public int hashCode() {
	return Objects.hash(name);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Cricketer other = (Cricketer) obj;
	return Objects.equals(name, other.name);
}



}

