package src.Instructions;

import src.Main;

public class PrintCommand {
    public static void printCommand() {
        Main.PC++;
        Main.OPC++;
        try{
            String msg = Main.st.nextToken();
            if (msg.endsWith("^")) {
                msg = msg.stripLeading();
                msg = msg.replace('^',' ');
                msg = msg.strip();
                msg = msg.replace("_"," ");
                System.out.println(msg);
            } else {
                msg = msg.stripLeading();
                msg = msg.replace("_"," ");
                System.out.print(msg);
            }
        } catch (Exception e){
            System.out.println(Main.PC+": Non-Existent Element");
            System.exit(254);
        }

    }
}
