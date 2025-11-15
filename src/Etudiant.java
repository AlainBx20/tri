public class Etudiant {
    private int id;
    private String nom;
    private String prenom;

    public Etudiant() {
    }

    public Etudiant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant etudiant = (Etudiant) o;
        return id == etudiant.id;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Etudiant e1 = new Etudiant();
        System.out.println("Etudiant sans paramètres: " + e1);
        
        e1.setId(1);
        e1.setNom("Dupont");
        e1.setPrenom("Jean");
        System.out.println("Après setters: " + e1);
        System.out.println("getId(): " + e1.getId());
        System.out.println("getNom(): " + e1.getNom());
        System.out.println("getPrenom(): " + e1.getPrenom());

        Etudiant e2 = new Etudiant(2, "Martin", "Marie");
        System.out.println("\nEtudiant avec paramètres: " + e2);

        Etudiant e3 = new Etudiant(1, "Autre", "Nom");
        System.out.println("\ne1.equals(e3): " + e1.equals(e3));
        System.out.println("e1.equals(e2): " + e1.equals(e2));

        Etudiant e4 = new Etudiant(2, "Different", "Prenom");
        System.out.println("e2.equals(e4): " + e2.equals(e4));
    }
}

