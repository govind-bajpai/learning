
	// Java program to demonstrate ListIterator
	import java.util.ArrayList;
	import java.util.ListIterator;

	public class Test
	{
		public static void main(String[] args)
		{
			ArrayList al = new ArrayList();
			for (int i = 0; i < 10; i++)
				al.add(i+10);

			System.out.println(al);

			// at beginning ltr(cursor) will point to
			// index just before the first element in al
			ListIterator ltr = al.listIterator();
		

			// checking the next element availabilty
			while (ltr.hasNext())
			{
				// moving cursor to next element
				int i = (Integer)ltr.next();

				// getting even elements one by one
				if(i==13){
				    System.out.println("1  "+ltr.nextIndex());
				    System.out.println("2  "+ltr.previousIndex());
				System.out.println("3  "+ltr.previous());
				System.out.println("4  "+ltr.nextIndex());
					System.out.println();
					
				System.out.println("5  "+ltr.next());
				System.out.println("5-  "+ltr.previousIndex());
				System.out.println("6  "+ltr.nextIndex());
				    System.out.print("7  "+ltr.previousIndex());
				}

				// Changing even numbers to odd and
				// adding modified number again in 
				// iterator
			
			}
			System.out.println();
			System.out.println(al);
		}
	}


