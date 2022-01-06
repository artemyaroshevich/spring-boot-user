package by.tms.springbootuser.service;

import by.tms.springbootuser.entity.User;
import by.tms.springbootuser.storage.InMemoryUserStorage;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public InMemoryUserStorage storage;
    public UserService(InMemoryUserStorage storage) {
        this.storage = storage;
    }

    public void save(User user) {
        storage.save(user);
    }

    public User existByUsername( String username) {
        return storage.existByUsername(username);
    }
}
