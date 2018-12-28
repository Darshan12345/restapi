package webservice.restapi.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserDaoService userDaoService;

    @GetMapping(path = "/users")
    public List<UserEntity> getAllUser()
    {
      return   userDaoService.getAllUser();
    }
    @GetMapping(path = "/users/{id}")
    private UserEntity getSpecificUser(@PathVariable int id)
    {
        return userDaoService.findUser(id);
    }
    @PostMapping(path = "/users")
    public ResponseEntity<Object> createUser(@RequestBody UserEntity userEntity) {
        UserEntity user=userDaoService.saveUser(userEntity);

        URI uri=ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(uri).build();


    }
}

