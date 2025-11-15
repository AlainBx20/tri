import java.util.*;
public class Test {

    public static void main(String[] args) {

        ArrayList list=new ArrayList();

        Integer a=1;
        list.add(1);
        list.add(13);
        list.add("test");
        list.add(1.2);
        list.add(1);
        list.add(13);
        list.add("test");
        System.out.println(list);
        System.out.println(list.size());
        Object val=list.get(3);
        System.out.println(val);
        System.out.println(list.remove(1));
        System.out.println(list.remove(a));
        System.out.println(list.contains("test"));
        System.out.println(list);

        Personne p1=new Personne(1,"nom1","prenom1",12);
        Personne p2=new Personne(2,"nom2","prenom2",15);

        Personne p3=new Personne(3,"nom3","prenom3",18);
        Personne p4=p3;//new Personne(3,"nom3","prenom3",18);

   list.add(p1);
   list.add(p2);
   list.add(p3);


   for (int i=0;i<list.size();i++)
   {Object l=list.get(i);

       System.out.println(l);

   }
        for (int i=0;i<list.size();i++)
        {if(list.get(i) instanceof Personne) {
            Personne l = (Personne) list.get(i);

            System.out.println(l.getNom());
        }
        }
   ArrayList<Personne> list1=new ArrayList<>();
   list1.add(p1);
   list1.add(p2);
   list1.add(p3);
   list1.add(p1);

   for (int i=0;i<list1.size();i++)
   {
       System.out.println(list1.get(i).getNom());
    }

        System.out.println(list1.contains(p1));
   System.out.println(list1.contains(p2));
   System.out.println(list1.contains(p4));
        System.out.println(list1.contains(new Personne(1,"nom1","preno",12)));
        System.out.println(list1.remove(p4));

    //
    }

}
