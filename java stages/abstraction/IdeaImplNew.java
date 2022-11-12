package abstraction;

public class IdeaImplNew extends IdeaImpl {

	public IdeaImplNew() {
		System.out.println("IdeaImplNew constructor");
	}

	public void price() {
		System.out.println("price");
	}

	public int add() {
		return 2 + 3;

	}

	public static void main(String[] args) {
		IdeaImplNew id = new IdeaImplNew();
		id.price();
		System.out.println(id.add());
		id.print();

	}
}
