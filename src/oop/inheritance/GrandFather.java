package oop.inheritance;

public class GrandFather {

    public  String favouriteDish = "Beef Curry";
    public  String cricketTeam = "Bangladesh team";
    public  String favouritePlayer = "Mashrafee";
    private String bankAccount = "34568944560";
    private String ssn = "86894774";

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public GrandFather() {

    }

    public GrandFather(String favouriteDish, String cricketTeam, String favouritePlayer) {
        this.favouriteDish = favouriteDish;
        this.cricketTeam = cricketTeam;
        this.favouritePlayer = favouritePlayer;
    }

    public GrandFather(String favouriteDish, String cricketTeam, String favouritePlayer, String bankAccount, String ssn) {
        this.favouriteDish = favouriteDish;
        this.cricketTeam = cricketTeam;
        this.favouritePlayer = favouritePlayer;
        this.bankAccount = bankAccount;
        this.ssn = ssn;
    }
    public void height(){

        System.out.println("Grand father height is 5'11");

    }
    public void hobby(){

        System.out.println("Grand father hobby is playing chess");
    }

}
