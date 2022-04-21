package com.company;

public class Soldier {
    private Gun gun;

    public Soldier(Gun gun){
        this.gun = gun;
    }

    public void changeGun(Gun gun){
        this.gun = gun;
    }

    public void fireAtEnemy(){
        gun.fire();
    }
}
