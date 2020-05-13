package oop.inheritance;

public class Son extends Father{

public String favoriteFood = "pizza";
public String favoriteGame = "Basket Ball";
public String favoriteTeam = "NZ";
private String accountNumber = "4954464936";
private String ssn = "847474833";

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteGame() {
        return favoriteGame;
    }

    public void setFavoriteGame(String favoriteGame) {
        this.favoriteGame = favoriteGame;
    }

    public String getFavoriteTeam() {
        return favoriteTeam;
    }

    public void setFavoriteTeam(String favoriteTeam) {
        this.favoriteTeam = favoriteTeam;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Son() {

    }

    public Son(String favoriteFood, String favoriteGame, String favoriteTeam, String accountNumber, String ssn) {
        this.favoriteFood = favoriteFood;
        this.favoriteGame = favoriteGame;
        this.favoriteTeam = favoriteTeam;
        this.accountNumber = accountNumber;
        this.ssn = ssn;
    }
    public void eyeColor(){

        System.out.println("son eye color is brown");
    }
}
