package su.javaQuickStart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//1.import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import su.javaQuickStart.entity.User;

//1.@RepositoryRestResource(path = "/users")

//TO  hide the UserRepository from the public
@RestResource(exported = false)
public interface UserRepository extends JpaRepository<User, String> {

}
