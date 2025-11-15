import java.util.*;

public class ListeTri {

    public static void main(String[] args) {

        ArrayList<Integer> listeEntiers = new ArrayList<>();
        listeEntiers.add(5);
        listeEntiers.add(2);
        listeEntiers.add(8);
        listeEntiers.add(1);
        listeEntiers.add(9);
        listeEntiers.add(3);

        System.out.println("Liste entiers avant tri: " + listeEntiers);

        Collections.sort(listeEntiers);
        System.out.println("Liste entiers tri croissant: " + listeEntiers);

        Collections.sort(listeEntiers, Collections.reverseOrder());
        System.out.println("Liste entiers tri decroissant: " + listeEntiers);

        ArrayList<String> listeStrings = new ArrayList<>();
        listeStrings.add("zebra");
        listeStrings.add("apple");
        listeStrings.add("banana");
        listeStrings.add("cherry");
        listeStrings.add("date");

        System.out.println("\nListe strings avant tri: " + listeStrings);

        Collections.sort(listeStrings);
        System.out.println("Liste strings tri croissant: " + listeStrings);

        Collections.sort(listeStrings, Collections.reverseOrder());
        System.out.println("Liste strings tri decroissant: " + listeStrings);

        ArrayList<Personne> listePersonnes = new ArrayList<>();
        listePersonnes.add(new Personne(1, "Dupont", "Jean", 25));
        listePersonnes.add(new Personne(2, "Martin", "Marie", 30));
        listePersonnes.add(new Personne(3, "Bernard", "Pierre", 22));
        listePersonnes.add(new Personne(4, "Thomas", "Sophie", 28));

        System.out.println("\nListe personnes avant tri: " + listePersonnes);

        Collections.sort(listePersonnes, new Comparator<Personne>() {
            public int compare(Personne p1, Personne p2) {
                return p1.getNom().compareTo(p2.getNom());
            }
        });
        System.out.println("Liste personnes tri croissant: " + listePersonnes);

        Collections.sort(listePersonnes, new Comparator<Personne>() {
            public int compare(Personne p1, Personne p2) {
                return p2.getNom().compareTo(p1.getNom());
            }
        });
        System.out.println("Liste personnes tri decroissant: " + listePersonnes);
    }
}

