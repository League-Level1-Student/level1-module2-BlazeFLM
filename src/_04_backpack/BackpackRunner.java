package _04_backpack;

public class BackpackRunner {
	public static void main(String[] args) {
		Pencil pencil = new Pencil();
		Ruler ruler = new Ruler();
		Textbook book = new Textbook();
		new Backpack().packAndCheck();
	Backpack backpack = new Backpack();
	backpack.putInBackpack(pencil);
	backpack.putInBackpack(ruler);
	backpack.putInBackpack(book);
	log();
	goToSchool();
	}
}
