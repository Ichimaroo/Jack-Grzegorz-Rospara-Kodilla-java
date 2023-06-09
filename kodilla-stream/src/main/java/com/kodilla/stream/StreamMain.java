package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> resultMapOfUsers = forum.getUserList().stream()
                .filter(user -> user.getGender() == 'M')
                .filter(user -> LocalDate.now().getYear() - user.getBirthDate().getYear() > 20)
                .filter(user -> user.getNumberOfPosts() > 1)
                .collect(Collectors.toMap(user-> user.getUniqID(),user -> user));


        System.out.println("# elements: " + resultMapOfUsers.size());
        resultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}