import java.util.Map;
import java.util.TreeMap;

public class ThanosPourCorrection {

	public static void main(String[] args) {

		Hero hulk = new Hero("Hulk", 49);
		Hero blackWidow = new Hero("Black Widow", 34);
		Hero captainAmerica = new Hero("Captain America", 100);
		Hero thor = new Hero("Thor", 1501);
		Hero vision = new Hero("Vision", 3);
		Hero scarletWitch = new Hero("Scarlet Witch", 29);
		Hero doctorStrange = new Hero("Doctor Strange", 42);
		;
		Flower lily = new Flower("Lily");
		Flower tulip = new Flower("Tulip");
		Flower begonia = new Flower("Begonia");
		Flower violet = new Flower("Violet");
		Flower rose = new Flower("Rose");

		// TODO 1 : Create a TreeMap where :
		// Hulk, Thor and Scarlet Witch have a Rose
		// Vision has a Tulip
		// Captain America has a Lily
		// Doctor Strange and Black Widow have a Violet
		Map<String, Flower> party = new TreeMap<>();
		party.put(hulk.getName(), rose);
		party.put(blackWidow.getName(), violet);
		party.put(captainAmerica.getName(), lily);
		party.put(thor.getName(), rose);
		party.put(vision.getName(), tulip);
		party.put(scarletWitch.getName(), rose);
		party.put(doctorStrange.getName(), violet);
		// TODO 2 : Print if `begonia` is contained in the TreeMap
		System.out.println(party.containsValue(begonia));
		// TODO 3 : For each hero, alphabetically, print the corresponding flower
		for (Map.Entry<String, Flower> entry : party.entrySet())
			System.out.println(entry.getValue().getName());
	}
}