import Database.DatabaseConnection;
import Handlers.Handler;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection database = new DatabaseConnection();
        database.getConnection();
        Scanner scanner = new Scanner(System.in);
        Handler handler = new Handler();
        System.out.println("Welcome to BeAPhilosopher!\nType something except for 'stop'");
        String command = scanner.nextLine();
        while(!command.equals("stop")){
            System.out.println("What would you like to do today?\nPsss. Type 'help' so you get information🙂");
            command = scanner.nextLine();
            if(command.equals("help")){
                System.out.println("you can type the following commando's: 'account', ‘philosopher’, ‘quote’, ‘article’, ‘my data’, ‘stop’ , ‘reported’.");
            }
            if(command.equals("account")){
                System.out.println("What would you like to do?\n'register' or 'login'?");
                command = scanner.nextLine();
                if(command.equals("register")){
                    String firstname = "";
                    String lastname = "";
                    String username = "";
                    String email = "";
                    String telephone = "";
                    String password = "";
                    ArrayList<String> data = handler.enterRegister();
                    for(int i = 0; i < data.size(); i++) {
                        switch (i) {
                            case 0:
                                firstname = data.get(i);
                                break;
                            case 1:
                                lastname = data.get(i);
                                break;
                            case 2:
                                username = data.get(i);
                                break;
                            case 3:
                                email = data.get(i);
                                break;
                            case 4:
                                telephone = data.get(i);
                                break;
                            case 5:
                                password = data.get(i);
                                break;
                        }
                    }
                        UserController theUser = new UserController(firstname, lastname, username, email, telephone, password);
//                        Registering user
                        theUser.registerUser(theUser);
                        theUser.displayProfile();
                        }

                }
                else if(command.equals("login")){
                    String username = "";
                    String password = "";
                    ArrayList<String> data = new ArrayList<>();
                    for(int i = 0; i < data.size(); i++) {
                        switch (i){
                            case 0:
                                username = data.get(i);
                                break;
                            case 1:
                                password = data.get(i);
                                break;
                        }
                    }
                    UserController theUser =


                }else{

                }
            }
            if(command.equals("sigma")){
                System.out.println("Sigma Sigma Boy Sigma Boy Sigma Boy");
            }
            //        User user = new User();
        System.out.println("Tạm biệt!");

    }
}