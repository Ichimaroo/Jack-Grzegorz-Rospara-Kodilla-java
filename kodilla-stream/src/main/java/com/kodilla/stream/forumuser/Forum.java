package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum () {
        userList.add(new ForumUser(1, "John", 21, LocalDate.of(1900,12,03), 'M'));
        userList.add(new ForumUser(3, "Jack", 22, LocalDate.of(2010,11,03), 'M'));
        userList.add(new ForumUser(5, "Jim", 0, LocalDate.of(2000,11,03), 'M'));
        userList.add(new ForumUser(7, "Malcolm", 251, LocalDate.of(1999,10,03), 'M'));
        userList.add(new ForumUser(9, "Malaven", 2100, LocalDate.of(1990,9,03), 'F'));
    }
    public List<ForumUser>getUserList(){
        return new ArrayList<>(userList);
    }
}
