import org.mindrot.jbcrypt.BCrypt;
import Database.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserController extends Person {
    private String username;
    private String email;
    private String telephone;
    private String password;

    public UserController(String firstName, String lastName, String username, String email, String telephone, String password){
        super(firstName, lastName);
        this.username = username;
        this.email = email;
        this.telephone = telephone;
        this.username = username;
    }

    public void registerUser(UserController user) {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection connection = databaseConnection.getConnection();

        String insertQuery = "INSERT INTO user (firstName, lastName, username, email, password, telephone) VALUES (?, ?, ?, ?, ?, ?)";

        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());

        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setString(3, username);
            preparedStatement.setString(4, email);
            preparedStatement.setString(5, hashedPassword);
            preparedStatement.setString(6, telephone);

            int rowsInserted = preparedStatement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("User registered successfully!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error registering user.");
        }
    }

    public void login(String username, String password){
        DatabaseConnection connectionNow = new DatabaseConnection();
        Connection connectDB = connectionNow.getConnection();


        String verifyLoginQuery = "SELECT username, wachtwoord FROM user WHERE username = ?";
    }

    public void reportUser(UserController reportedUser, String reason){

    }

//    Quote
    public void likeQuote(Quote quote){
//        Properly Sql statement and UPDATE function increment plus 1
    }

    public void dislikeQuote(Quote quote){
//        Properly Sql statement and UPDATE function increment plus 1
    }

    public void commentOnQuote(Quote quote, String text){

    }

//    Article
    public void likeArticle(Article article){
//        Properly Sql statement and UPDATE function increment plus 1
}

    public void dislikeArticle(Article article){
//        Properly Sql statement and UPDATE function increment plus 1
    }

    public void commentOnArticle(Article article, String text){

    }
    @Override
    public void displayProfile(){
        System.out.println(
        "Firstname: "+ this.firstName + "\n"+
        "Lastname:"+ this.lastName + "\n"+
        "Username: "+ this.username + "\n"+
        "email: "+ this.email + "\n"+
        "telephone: "+ this.telephone + "\n"+
        "ID-Number: "+ this.id+ "\n"

        );

    }

}
