package assignment;

public class Stack_Character {
	private char stack[];
	private int Maxsize, tos;

	public void create_Stack(int size) {
		tos = -1;
		stack = new char[size];
		Maxsize = size;
	}

	void push(char e) {
		tos++;
		stack[tos] = e;
	}

	boolean is_Full() {
		if (tos == Maxsize - 1)
			return true;
		else
			return false;
	}

	char pop() {
		char temp = stack[tos];
		tos--;
		return (temp);
	}

	boolean is_Empty() {
		if (tos == -1)
			return true;
		else
			return false;
	}

	char peek() {

		return (stack[tos]);
	}

	void print_Stack() {
		for (int i = tos; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}

}
