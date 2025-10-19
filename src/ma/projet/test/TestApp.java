package ma.projet.test;



import ma.projet.bean.Article;
import ma.projet.bean.Categorie;

public class TestApp {
    public static void main(String[] args) {
        Categorie[] categories = {
            new Categorie("Ordinateur Portable", "O PR"),
            new Categorie("Ordinateur Poste", "O PO")
        };

        Article[] articles = {
            new Article(14, "DELL INSPIRON", categories[0]),
            new Article(4, "SONY VAIO", categories[0]),
            new Article(74, "TERRA", categories[1]),
            new Article(785, "HP Compaq", categories[1])
        };

        for (Categorie c : categories) {
            System.out.println(c.getLibelle() + " :");
            for (Article a : articles) {
                if (a.getCategorie().getId() == c.getId()) {
                    System.out.println("  - " + a);
                }
            }
            System.out.println();
        }
    }
}
