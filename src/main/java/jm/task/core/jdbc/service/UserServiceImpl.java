package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserDao userdao = new UserDaoHibernateImpl();

    @Override
    public void createUsersTable() {
        userdao.createUsersTable();
    }

    @Override
    public void dropUsersTable() {
        userdao.dropUsersTable();
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        userdao.saveUser(name, lastName, age);
    }

    @Override
    public void removeUserById(long id) {
        userdao.removeUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userdao.getAllUsers();
    }

    @Override
    public void cleanUsersTable() {
        userdao.cleanUsersTable();
    }
}