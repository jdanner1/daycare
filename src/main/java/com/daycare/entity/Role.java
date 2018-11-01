package com.daycare.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;



@Entity(name = "Role")
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO, generator="native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name = "roleId")
    private int roleId;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "user_name")
    private String userName;

    @ManyToOne
    @JoinColumn(name = "userId",
            foreignKey = @ForeignKey(name = "role_user_userId"))
    private User user;

    public Role(String roleName, String userName, User user) {
        this.roleName = roleName;
        this.userName = userName;
        this.user = user;
    }

    public Role() {
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getRoleId() {
        return roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Role role = (Role) o;

        if (roleId != role.roleId) return false;
        if (!roleName.equals(role.roleName)) return false;
        if (!userName.equals(role.userName)) return false;
        return user.equals(role.user);
    }

    @Override
    public int hashCode() {
        int result = roleId;
        result = 31 * result + roleName.hashCode();
        result = 31 * result + userName.hashCode();
        result = 31 * result + user.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", userName='" + userName + '\'' +
                ", user=" + user +
                '}';
    }
}

