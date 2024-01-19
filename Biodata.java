package tugas3;

public class Biodata {
    String Nama;
    double Health;
    String Weapon;
    double Attack;
    String Armor;
    double Defence;

    public Biodata(String inpNama, double inpHealth, String inpWeapon, double inpAttack, String inpArmor, double inpDefence) {
        this.Nama = inpNama;
        this.Health = inpHealth;
        this.Weapon = inpWeapon;
        this.Attack = inpAttack;
        this.Armor = inpArmor;
        this.Defence = inpDefence;
    }

    public void setNama(){
        System.out.println("Nama   : " + Nama);
        System.out.println("Health : " + Health + " hp");
        System.out.println("Weapon : " + Weapon + " , attack : " + Attack);
        System.out.println("Armor  : " + Armor + " , defence " + Defence);
        System.out.println();
    }

}
