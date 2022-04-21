package com.company;

public class StrategyPatternExample {
    public static void main(String args[]) {
        Gun snipper = new Snipper();
        Gun machineGun = new MachineGun();
        Gun grenadelauncher = new GrenadeLauncher();


        Soldier commando = new Soldier(snipper);
        commando.fireAtEnemy();

        commando.changeGun(machineGun);
        commando.fireAtEnemy();

        commando.changeGun(grenadelauncher);
        commando.fireAtEnemy();
    }
}