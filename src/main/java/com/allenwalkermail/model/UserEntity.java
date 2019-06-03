/**
 * Coypright (C),2017-2018,PENGZHOU
 * FileName: UserEntity
 * Author:   zhoupeng
 * Date:     2018/10/25 2:27 PM
 * Description:
 * History:
 * <author>       <time>        <version>
 * 周鹏
 */

package com.allenwalkermail.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "user", schema = "MyFirstWebApp", catalog = "")
public class UserEntity {
    private int uid;
    private String nickname;
    private String password;
    private String firstName;
    private String lastName;
    private String usercol;
    private Collection<BlogEntity> blogsByUid;

    @Id
    @Column(name = "uid", nullable = false)
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "nickname", nullable = false, length = 45)
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 45)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "first_name", nullable = false, length = 45)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name", nullable = false, length = 45)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "usercol", nullable = false, length = 45)
    public String getUsercol() {
        return usercol;
    }

    public void setUsercol(String usercol) {
        this.usercol = usercol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (uid != that.uid) return false;
        if (nickname != null ? !nickname.equals(that.nickname) : that.nickname != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (usercol != null ? !usercol.equals(that.usercol) : that.usercol != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uid;
        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (usercol != null ? usercol.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<BlogEntity> getBlogsByUid() {
        return blogsByUid;
    }

    public void setBlogsByUid(Collection<BlogEntity> blogsByUid) {
        this.blogsByUid = blogsByUid;
    }
}
