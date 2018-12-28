package webservice.restapi.User;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class UserDaoService {


    private static List<UserEntity> users= new ArrayList<>();
    private static  int usersCount =3;

    static {
        users.add(new UserEntity(1,"darshan", new Date()));
                 users.add( new UserEntity(2,"ashish", new Date()));
        users.add(new UserEntity(3,"Pathik", new Date())); }

        public List<UserEntity> getAllUser()
        {
            return users;
        }

        public UserEntity saveUser(UserEntity userEntity)
        {
            if(userEntity.getId()==null)
                userEntity.setId(++usersCount);

            users.add(userEntity);
            return userEntity;
        }

        public UserEntity findUser(int id)
        {
            for(UserEntity userEntity:users)
            {
                if(userEntity.getId()==id)
                    return userEntity;
            }
            return null;
        }

}
