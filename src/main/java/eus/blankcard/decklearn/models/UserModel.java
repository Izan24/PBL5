package eus.blankcard.decklearn.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserModel {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="user_id")
    private Integer id;

    private String username;

    @Column(name="first_name")
    private String name;

    @Column(name="second_name")
    private String surname;

    private String password;

    private String email;

    private String postal_code;

    private String country;

    private String age;

    private String img_path;

    // @ManyToMany(targetEntity=OrderItem.class, fetch=FetchType.LAZY)
    // @Fetch(FetchMode.SUBSELECT)
    // @JoinTable(name = "order_order_item", joinColumns = { @JoinColumn(name = "cod_order") }, 
    // inverseJoinColumns = { @JoinColumn(name = "cod_item") })
    //     public Set<OrderItem> setOrderItem = new HashSet<OrderItem>();

    // @ManyToMany(cascade = { CascadeType.ALL })
    // @JoinTable(
    //     name = "followed", 
    //     joinColumns = { JoinColumns(name = "follower_id") }, 
    //     inverseJoinColumns = { @JoinColumn(name = "project_id") }
    // )
    // Set<UserModel> followers = new HashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSurname() {
        return surname;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPostal_code() {
        return postal_code;
    }
    
    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }
    
    public String getCountry() {
        return country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    
    public String getAge() {
        return age;
    }
    
    public void setAge(String age) {
        this.age = age;
    }

    public String getImg_path() {
        return img_path;
    }

    public void setImg_path(String img_path) {
        this.img_path = img_path;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((username == null) ? 0 : username.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UserModel other = (UserModel) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (username == null) {
            if (other.username != null)
                return false;
        } else if (!username.equals(other.username))
            return false;
        return true;
    }

    // public int getFollowers() {
    //     return followers;
    // }

    // public void setFollowers(int followers) {
    //     this.followers = followers;
    // }

    // public int getFollowing() {
    //     return following;
    // }

    // public void setFollowing(int following) {
    //     this.following = following;
    // }


    
}
