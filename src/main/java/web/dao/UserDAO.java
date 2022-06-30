package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {

    void saveUser(User user);

    User getUser(Long id);

    void updateUser(User user);

    void deleteUser(Long id);

    List<User> getUsers();
}