import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author franck Desmedt github/bigmoletos
 *
 */
public abstract class Thanos implements Comparator<Thanos> {

	/**
	 * @description
	 *
	 *              void permet le trie par ordre alphabétique dans Hero
	 *
	 **/
	static Comparator<Hero> comparatorAsccendant = new Comparator<Hero>() {
		@Override
		public int compare(Hero origin, Hero compare) {
			return origin.getName().compareTo(compare.getName());
		}
	};
	static Comparator<Hero> comparatorDescendant = new Comparator<Hero>() {
		@Override
		public int compare(Hero origin, Hero compare) {
			return compare.getName().compareTo(origin.getName());
		}
	};

	/**
	 * @description
	 *
	 *              permet le trie par ordre alphabétique dans fleur
	 *
	 **/
//	static Comparator<Flower> comparatorFleur = new Comparator<Flower>() {
//
//		@Override
//		public int compare(Flower origin, Flower compare) {
//			return origin.getName().compareTo(compare.getName());
//		}
//	};

	/**
	 * @description
	 *
	 * @return void
	 *
	 * @method main
	 * @class Thanos
	 * @version 1.0
	 * @date vendredi 27 sept. 2019
	 * @see
	 *
	 **/
	public static void main(String[] args) {
//		Construire un TreeMap nommé party, avec en clé User et valeur Flower
//		Ajouter dans party les couples clé/valeur suivants :
//
//		Hulk, Thor et Scarlet Witch ont une Rose
//		Vision a une Tulip
//		Captain America a une Lily
//		Doctor Strange et Black Widow ont une Violet
//		En une seule ligne, afficher si party contient l'instance begonia
//
//		Parcourir le tableau associatif par ordre alphabétique de nom de héros, 
//		et afficher, pour chacun d'entre eux, sa fleur attribuée.
		Hero hulk = new Hero("Hulk", 49);
		Hero blackWidow = new Hero("Black Widow", 34);
		Hero captainAmerica = new Hero("Captain America", 100);
		Hero thor = new Hero("Thor", 1501);
		Hero vision = new Hero("Vision", 3);
		Hero scarletWitch = new Hero("Scarlet Witch", 29);
		Hero doctorStrange = new Hero("Doctor Strange", 42);

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
		Map<Hero, Flower> party = new TreeMap<>(comparatorAsccendant);

		party.put(hulk, rose);
		party.put(thor, rose);
		party.put(scarletWitch, rose);
		party.put(vision, tulip);
		party.put(captainAmerica, lily);
		party.put(doctorStrange, violet);
		party.put(blackWidow, violet);

		// TODO 2 : Print if `begonia` is contained in the TreeMap
		System.out.println("Is the value 'begonia' present? " + party.containsValue(begonia));
		System.out.println("Is the key 'hulk' present? " + party.containsKey(hulk));

		// TODO 3 : For each hero, alphabetically, print the corresponding flower
		for (Hero hero : party.keySet()) {
			Flower fleur = party.get(hero);
			System.out.println(hero.getName() + " : " + fleur.getName());
		}

//		for (Map.Entry<Hero, Flower> entry : party.entrySet()) {
//			Hero hero = entry.getKey();
//			Flower flower = entry.getValue();
//			System.out.println("$ " + flower.getName());
//		}
//**********************************************************
//**********************************************************
		// option FD affichage trie en sens inverse des clés, d'où utilisation d'un
		// autre comparator
		System.out.println("\nOption fd avec un affichage en sens inverse des clés\n");
		Map<Hero, Flower> partyDescendant = new TreeMap<>(comparatorDescendant);
		partyDescendant.putAll(party);

		for (Hero hero : partyDescendant.keySet()) {
			Flower fleur = partyDescendant.get(hero);
			System.out.println(hero.getName() + " : " + fleur.getName());
		}
		System.out.println("\nparcours avec iterator par values\n");
//*********parcours treemap avec un iterator*************
//obtenir l'ensemble des entrees
		Set<Entry<Hero, Flower>> set = party.entrySet();
//obtenir l'iterator pour parcourir la liste
		Iterator<Entry<Hero, Flower>> it = set.iterator();
//afficher les paires cle-valeurs
		while (it.hasNext()) {
			Map.Entry<Hero, Flower> mesEntres = it.next();
			System.out.println(mesEntres.getValue() + " : " + mesEntres.getKey());

		}
//*************************
		System.out.println("\nversion entrySet\n");

		for (Map.Entry<Hero, Flower> entry : party.entrySet()) {
			System.out.println(entry.getValue() + " : " + entry.getKey());
		}
		// **********************
//		System.out.println(party);
//		System.out.println("" + party.entrySet().toString());
		// TODO 4 : For each flowers, alphabetically, print the corresponding Hero
		System.out.println("\nparcours avec values triées \n");
//kcartselect		
		System.out.println("🌍+🌕+🏀+🏻+🏿");
//*****************		
	}
}
