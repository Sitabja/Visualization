package Answers;

public class PCQ2A {
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayStack s = new ArrayStack();
		System.out.println(s);
		s.push(new Character('e'));
		System.out.println(s);
		s.push(new Character('s'));
		System.out.println(s);
		s.push(new Character('c'));
		System.out.println(s);
		Character ch = (Character) s.pop();
		//System.out.println("Element Poped: "+ch.charValue());
		System.out.println(s);
		s.push(new Character('u'));
		System.out.println(s);
		s.push(new Character('a'));
		System.out.println(s);
		ch = (Character) s.pop();
		//System.out.println("Element Poped: "+ch.charValue());
		System.out.println(s);
		s.push(new Character('o'));
		System.out.println(s);
		s.push(new Character('t'));
		System.out.println(s);
		ch = (Character) s.pop();
		System.out.println(s);
		s.push(new Character('h'));
		System.out.println(s);	
	}
}
