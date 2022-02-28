package src.Instructions;

import src.Main;

import java.util.Scanner;

public class GetinCommand {

    private static Scanner scan = new Scanner(System.in);

    public static void getinCommand() {
        try{
            Main.vars.push(Integer.parseInt(scan.nextLine()));
        } catch (Exception e){

        }
    }
}
