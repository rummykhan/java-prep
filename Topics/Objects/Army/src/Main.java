class Army {

    public static void createArmy() {
        Unit u1 = new Unit("A");
        Unit u2 = new Unit("B");
        Unit u3 = new Unit("C");
        Unit u4 = new Unit("D");
        Unit u5 = new Unit("E");

        Knight k1 = new Knight("A");
        Knight k2 = new Knight("B");
        Knight k3 = new Knight("C");

        General g1 = new General("A");

        Doctor d1 = new Doctor("A");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}