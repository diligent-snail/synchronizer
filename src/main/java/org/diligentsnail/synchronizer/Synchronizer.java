package org.diligentsnail.synchronizer;

public class Synchronizer {

	public void acceptFirst(Runnable runnable) {
		// TODO: Сделать так, чтобы runnable.run() вызывался первым
		//  Метод main класса main сюда передаёт runnable, который печатает "1" в консоль
		runnable.run();
	}

	public void acceptSecond(Runnable runnable) {
		// TODO: Сделать так, чтобы runnable.run() вызывался вторым
		runnable.run();
	}

	public void acceptThird(Runnable runnable) {
		// TODO: Сделать так, чтобы runnable.run() вызывался третьим
		runnable.run();
	}
}
