package com.sh.app;

import com.sh.app.animal.Bird;
import com.sh.app.animal.Cat;
import com.sh.app.animal.Chicken;
import com.sh.app.animal.Dog;
import com.sh.app.animal.Snake;

public class Main {

	public static void main(String[] args) {
		System.out.println("HELLO WORLD");
		System.out.println("HELLO GIT");
		
		new Dog().bark();
		new Cat().jump();
		new Snake().crawl();
		new Bird().fly();
		new Chicken().run();
	}

	public void test() {
		System.out.println("Main#test");
	}
}
