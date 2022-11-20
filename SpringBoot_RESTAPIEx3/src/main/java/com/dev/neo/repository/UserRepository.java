package com.dev.neo.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dev.neo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	@Query("SELECT u FROM User u WHERE " + "u.firstname LIKE CONCAT('%',:query, '%')"
			+ "Or u.address LIKE CONCAT('%', :query, '%')")
	List<User> searchUsers(String query);

	static List<User> searchUsersSQL(String query) {

		return null;
	}
}// end class
