public class Main{
    public static void main(String[] args){
        UserRepository userRepository = new InMemoryUserRepository();
        User user = new User("Bob");
        userRepository.save(user);
        User savedUser = userRepository.findById(user.getId());
        savedUser.report();
    }
}