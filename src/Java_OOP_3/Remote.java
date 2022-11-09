package Java_OOP_3;
import java.util.Scanner;

public class Remote {

    public void tvProgram (){

        String [] tv_program = new String [100];
        int channel;

        for (int i = 1; i < tv_program.length; i++){
            tv_program[i] = "Channel " + i;
        }

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Hello! Please, enter number of channel from 1 to 100: ");
            channel = input.nextInt();
        } while (channel < 1 || channel > 100);

        for (int i = 1; i <= 100; i++){
           if(i == channel){
               System.out.println("You watching " + tv_program[i]);
           }
        }
    }
}
