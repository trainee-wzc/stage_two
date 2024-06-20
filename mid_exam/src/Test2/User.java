package Test2;

import java.time.LocalDate;

public class User {
    private Long id;  // 用户id 名
    private String userName; // 用户姓名
    private String gender;  //性别
    private LocalDate birthday;  //生日

    public User() {
    }

    public User(Long id, String username, String gender, LocalDate birthday) {
        this.id = id;
        this.userName = username;
        this.gender = gender;
        this.birthday = birthday;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}

