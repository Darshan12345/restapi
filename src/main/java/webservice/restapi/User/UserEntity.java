package webservice.restapi.User;

import java.util.Date;

public class UserEntity {
    private Integer id;
    private String name;
    private Date birthdate;

    public UserEntity(){}
    public UserEntity(Integer id, String name, Date birthdate) {

        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}
