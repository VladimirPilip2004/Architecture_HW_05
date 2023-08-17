package HomeWork_05.DAO;

// Пример использования
public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();
        
        User user1 = new User("Владимир", 30);
        userDao.addUser(user1);
        
        User user2 = userDao.getUser("Петров");
        user2.setAge(35);
        userDao.updateUser(user2);
        
        userDao.deleteUser(user2);
    }
}