package com.tnsif.dayfifteen.generics;

public class SenderDemo {

	public static void main(String[] args) {
Sender<String> stringSender =new Sender<String>("Hello! How are you?");//Message as String 
		
		Sender<Person> personSender =new Sender<Person>();
		personSender.setMessage(new Person("Adi","Pdy")); //Message as Person Object

		stringSender.sendMessage();
		personSender.sendMessage();
	}

}