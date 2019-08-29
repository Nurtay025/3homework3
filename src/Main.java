public class Main {

    public static void main(String[] args) {


        String nAll = "Nurbek, Nurkai, Nurtai";
        String [] names = new String[3];
        names[0] = "Nurbek";
        names[1] = "Nurkai";
        names[2] = "Nurtai";

        System.out.println("Good morning " + names [0]);
        System.out.println("Good afternoon " + names [1]);
        System.out.println("Good evening " + names [2]);
        System.out.println("Hello everybody " + nAll);



        for (String n : names) {


            switch (n) {
                case "Nurbek":
                    System.out.println("Good morning" + " Nurbek");
                    break;
                case "Nurkai":
                    System.out.println("Good afternoon" + " Nurkai");
                    break;
                case "Nurtai":
                    System.out.println("Good evening" + " Nurtai");
                    System.out.println("Здравствуйте " + "Nurbek,Nurkai,Nurtai" );

            }
        }
    }
}
