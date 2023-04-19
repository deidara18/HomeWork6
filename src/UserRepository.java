import java.util.ArrayList;

public class UserRepository {
    private ArrayList<User> users = new ArrayList<>();

    public void save(User user) {
        users.add(user);
        System.out.println("Save user: " + user.getName());
    }

    public User findById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}