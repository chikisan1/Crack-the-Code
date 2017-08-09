import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
public class AnimalShelter{
// 	Animal Shelter: An animal shelter, which holds only dogs and cats, operates on a strictly"first in, first
// out" basis. People must adopt either the "oldest" (based on arrival time) of all animals at the shelter,
// or they can select whether they would prefer a dog or a cat (and will receive the oldest animal of
// that type). They cannot select which specific animal they would like. Create the data structures to
// maintain this system and implement operations such as enqueue, dequeueAny, dequeueDog,
// and dequeueCat. You may use the built-in Linked List data structure.
// Hints: #22, #56, #63
	public static class Animal{
		Queue<String> shelter = new LinkedList<String>();
		Queue<String> temp = new LinkedList<String>();

		Animal(Queue<String> shelter){
			this.shelter = shelter;
		}
		
		void enqueue(String animal){
			System.out.println("enqueue " + animal);
			shelter.add(animal);
		}

		void dequeueAny(){
			if(shelter.isEmpty()){
				isEmpty();
				return;
			}
			else{
				shelter.remove();
				System.out.println("dequeue any");
			}
		}

		void dequeueDog(){
			if(shelter.isEmpty()){
				isEmpty();
				return;
			}
			int count = 0;
			while(count <= shelter.size()){
				if(shelter.element().equals("dog")){
					shelter.remove();
					break;
				}
				else{
					String insert = shelter.remove();
					temp.add(insert);
					count++;
				}
			}
			while(!temp.isEmpty()){
				shelter.add(temp.remove());
			}
			System.out.println("dequeue cat");

		}

		void dequeueCat(){
			if(shelter.isEmpty()){
				isEmpty();
				return;
			}
			int count = 0;
			while(count <= shelter.size()){
				if(shelter.element().equals("cat")){
					shelter.remove();
					break;
				}
				else{
					String insert = shelter.remove();
					temp.add(insert);
					count++;
				}
			}
			while(!temp.isEmpty()){
				shelter.add(temp.remove());
			}
			System.out.println("dequeue cat");

		}

		void isEmpty(){
			System.out.println("Shelter is empty");
		}

		void printQ(){
			if(shelter.isEmpty()){
				isEmpty();
			}
			while(!shelter.isEmpty()){
				String insert = shelter.remove();
				temp.add(insert);
			}
			while(!temp.isEmpty()){
				String insert = temp.remove();
				shelter.add(insert);
				System.out.print(insert);
				if(!temp.isEmpty()){
					System.out.print(", ");
				}
			}
			System.out.println();
		}

	}

	public static void main(String [] args){
		Queue<String> shelter = new LinkedList<String>();
		Animal animal = new Animal(shelter);
		System.out.println("All Dog List");
		animal.enqueue("dog");
		animal.enqueue("dog");
		animal.enqueue("dog");
		animal.enqueue("dog");
		animal.printQ();
		System.out.println("dequeueDog");
		animal.dequeueDog();
		animal.printQ();
		System.out.println("dequeueCat");
		animal.dequeueCat();
		animal.printQ();
		System.out.println("dequeueAny");
		animal.dequeueAny();
		animal.printQ();

		Queue<String> shelter2 = new LinkedList<String>();
		Animal animal2 = new Animal(shelter2);
		System.out.println("All Cat List");
		animal2.enqueue("cat");
		animal2.enqueue("cat");
		animal2.enqueue("cat");
		animal2.enqueue("cat");
		animal2.printQ();
		System.out.println("dequeueDog");
		animal2.dequeueDog();
		animal2.printQ();
		System.out.println("dequeueCat");
		animal2.dequeueCat();
		animal2.printQ();
		System.out.println("dequeueAny");
		animal2.dequeueAny();
		animal2.printQ();

		Queue<String> random = new LinkedList<String>();
		Animal animal3 = new Animal(random);
		System.out.println("Random starting with empty list");
		int count = 0;
		while(count <= 10){

			Random rand = new Random();
			int randomNumber = rand.nextInt(9) + 1;
			switch(randomNumber%3){
				case 0:
					animal3.enqueue("cat");
				break;
				case 1:
					animal3.enqueue("dog");
				break;
				case 2:
					switch(randomNumber){
						case 5:
							animal3.dequeueAny();
						break;
						case 7:
							animal3.dequeueDog();
						break;
						case 8:
							animal3.dequeueCat();
						break;
					}
				break;
			}
			animal3.printQ();
			count++;
		}

	}


}