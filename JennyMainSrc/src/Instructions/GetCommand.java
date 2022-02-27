package src.Instructions;

import src.Main;

import java.util.Scanner;

public class GetCommand {

    private static Scanner scan = new Scanner(System.in);

    public static void getCommand() {
        try{
            Main.vars.push(Integer.parseInt(scan.nextLine()));
        } catch (Exception e){

        }
    }
}
