package Details;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestCricketer {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			ArrayList<Cricketer> cricketersArrayList = new ArrayList<>();
			cricketersArrayList.add(new Cricketer("abc", 16, "abc.16@gmail.com", "9864645132", 4));
			cricketersArrayList.add(new Cricketer("efg", 18, "efg.18@gmail.com", "9864641321", 3));
			cricketersArrayList.add(new Cricketer("pqr", 14, "pqr.14@gmail.com", "9821545132", 2));
			cricketersArrayList.add(new Cricketer("xyz", 16, "abc.16@gmail.com", "9864671132", 4));
			System.out.println(cricketersArrayList);

			boolean flag = true;

			while (flag) {
				System.out.println("Please select an option from the menu");
				System.out.println("1.Add new Cricketer\n");
				System.out.println("2.Modify Cricketers rating\n");
				System.out.println("3.Search Cricketers by name\n");
				System.out.println("4.Display all Cricketers added in collection\n");
				System.out.println("5.Display all Cricketers in sorted from by rating\n");
				System.out.println("6.exit\n");

			
				switch (sc.nextInt()) {

				case 1:
					System.out.println("Enter name\n");
					String name = sc.next();
					System.out.println("Enter Age\n");
					int age = sc.nextInt();
					System.out.println("Enter email_id \n");
					String email_id = sc.next();
					System.out.println("Enter Phone number \n");
					String phoneNumber = sc.next();
					System.out.println("Enter ratings out of 5 \n");
					int ratings = sc.nextInt();

					Cricketer obj = new Cricketer(name, age, email_id, phoneNumber, ratings);

					System.out.println(obj);
					System.out.println("in case1");
					break;
				case 2:
					System.out.println("Enter cricketer name whose rating are to be modified");
					String nm = sc.next();
					System.out.println("Enter the new rating");
					int newRating = sc.nextInt();
					Cricketer name1 = new Cricketer(nm);

					int index = cricketersArrayList.indexOf(name1);
					if (index != -1) {
						cricketersArrayList.get(index).setRating(newRating);

						System.out.println("Rating updated successfully");
						System.out.println(index);
					} else {
						System.out.println();
					}
					System.out.println("in case2");
					break;
				case 3:
					System.out.println("Enter name of the cricketer");
					String nameOfCricketer = sc.next();
					Cricketer name3 = new Cricketer(nameOfCricketer);
					int index1 = cricketersArrayList.indexOf(name3);
					System.out.println(cricketersArrayList.get(index1));

					break;
				case 4:
					System.out.println(cricketersArrayList);
					System.out.println("in case4");
					break;
				case 5:
					Collections.sort(cricketersArrayList,
							(t1, t2) -> ((Integer) t1.getRating()).compareTo(t2.getRating()));
					System.out.println("in case5");
					break;
				case 6:

					flag = false;
					break;
				}
				System.out.println("Thank you");
			}
		}
	}

}
