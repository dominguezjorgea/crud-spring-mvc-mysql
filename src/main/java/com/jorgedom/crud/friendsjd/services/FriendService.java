package com.jorgedom.crud.friendsjd.services;


import com.jorgedom.crud.friendsjd.model.Friend;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendService extends CrudRepository<Friend, Integer> {
    Iterable<Friend> findByFirstNameAndLastName(String firstName, String lastName);
    Iterable<Friend> findByFirstName(String firstName);
    Iterable<Friend> findByLastName(String lastName);


}

