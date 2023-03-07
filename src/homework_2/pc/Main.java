package homework_2.pc;

//Створити та описати наступну їєрархію
//        PC-Laptop-Ultrabook
//        PC-Laptop- Workstation
//        Загальна кількість вкористаних класів - 4!


public class Main {
    public static void main(String[] args) {
        PC pc = new PC("Intel","ZEVS PC A140", 10.249,"Intel Pentium i3 G620 64-bit 2x2.6 GHz 3 MB SmartCache", "Asus Prime H410M-K","2E KS230 WL Black", "DDR3","Windows 10","HDD 500 GB 5400 rpm");

        Laptop laptop = new Laptop("Intel", "hjhjh", 565.98, "sdfsdf", "nmnmnm", "mnmnm", "cvcv", "fgfgf", "fgfgfg","bvvbv");

        Ultrabook ultrabook = new Ultrabook("Intel", "hjhjh", 565.98, "sdfsdf", "nmnmnm", "mnmnm", "cvcv", "fgfgf", "fgfgfg","bvvbv", 1.3, 24);

        Workstation workstation = new Workstation("Intel","ZEVS PC A140", 10.249,"Intel Pentium i3 G620 64-bit 2x2.6 GHz 3 MB SmartCache", "Asus Prime H410M-K","2E KS230 WL Black", "DDR3","Windows 10","HDD 500 GB 5400 rpm","34*45",2,true);

        System.out.println(pc);
        System.out.println(laptop);
        System.out.println(ultrabook);
        System.out.println(workstation);
    }

}
