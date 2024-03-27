package Interface;

public class Child implements Father, Mother {

	@Override
	public void Smile() {
		System.out.println("Smiles same as mom");

	}

	@Override
	public void behaviour() {
		System.out.println("Behaves same as papa");

	}

	public static void main(String[] args) {
		Child child =  new Child();
		child.Smile();
		child.behaviour();
		

	}

}
