package ru.netology.springboot2hw1.repository;

import org.springframework.stereotype.Repository;
import ru.netology.springboot2hw1.Authorities;

import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        return Collections.emptyList();
    }

}