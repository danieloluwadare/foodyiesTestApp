package com.ddada.Foodyie.Service;

import com.ddada.Foodyie.Entity.User;

import java.util.List;

public interface UserService {
    public List<User> getAll();

    public User findById(int id);

    public void save(User user);

    public void deleteById(int id);
}
