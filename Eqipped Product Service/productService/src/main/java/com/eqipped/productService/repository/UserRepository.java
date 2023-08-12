package com.eqipped.productService.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import com.eqipped.productService.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {


}
