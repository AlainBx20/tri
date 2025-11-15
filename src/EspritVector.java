import java.util.*;

public class EspritVector implements University {
    private Vector<Etudiant> etudiants;

    public EspritVector() {
        this.etudiants = new Vector<>();
    }

    @Override
    public void ajouterEtudiant(Etudiant e) {
        etudiants.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return etudiants.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        for (Etudiant etudiant : etudiants) {
            if (etudiant.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        etudiants.remove(e);
    }

    @Override
    public void displayEtudiants() {
        for (Etudiant etudiant : etudiants) {
            System.out.println(etudiant);
        }
    }

    @Override
    public void trierEtudiantsParId() {
        Collections.sort(etudiants, new Comparator<Etudiant>() {
            public int compare(Etudiant e1, Etudiant e2) {
                return Integer.compare(e1.getId(), e2.getId());
            }
        });
    }

    @Override
    public void trierEtudiantsParNom() {
        Collections.sort(etudiants, new Comparator<Etudiant>() {
            public int compare(Etudiant e1, Etudiant e2) {
                return e1.getNom().compareTo(e2.getNom());
            }
        });
    }
}

