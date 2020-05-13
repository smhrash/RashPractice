package oop.inheritance;

import java.sql.SQLOutput;

public class Father extends GrandFather{

    public String favoriteGame = "Football";
    public String favoriteTeam = "RM";
    public String favoriteDress = "Pant and shirt";
    public String favoriteColour = "Blue";
    private String bankAccount = "466432678643";
    private String ssn = "866432643";

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

    public String getFavoriteDress() {
        return favoriteDress;
    }

    public void setFavoriteDress(String favoriteDress) {
        this.favoriteDress = favoriteDress;
    }

    public String getFavoriteColour() {
        return favoriteColour;
    }

    public void setFavoriteColour(String favoriteColour) {
        this.favoriteColour = favoriteColour;
    }

    @Override
    public String getBankAccount() {
        return bankAccount;
    }

    @Override
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String getSsn() {
        return ssn;
    }

    @Override
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Father() {
        this.favoriteGame = favoriteGame;
        this.favoriteTeam = favoriteTeam;
        this.favoriteDress = favoriteDress;
        this.favoriteColour = favoriteColour;
        this.bankAccount = bankAccount;
        this.ssn = ssn;
    }

    public void education(){
        System.out.println("Father education is MBA");
    }
    public  void  drive(){
        System.out.println("father can drive");
    }


}
