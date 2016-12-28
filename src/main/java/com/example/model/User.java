package com.example.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement (name = "user")
@XmlAccessorType(XmlAccessType.NONE)
public class User implements Serializable 
{
    private static final long serialVersionUID = 1L;
 
    @XmlAttribute
    private Integer id;
     
    @XmlElement
    private String firstName;
     
    @XmlElement
    private String lastName;
     
    @XmlElement
    private String emailAddress;
     
    @XmlElement
    private String applicationName;
    
    @XmlElement
    private Boolean isAuthorized;

    @XmlElement
    private String lanId;

    public User(Integer id, String firstName, String lastName, String email, String application, Boolean isAuthorized, String lanId) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = email;
        this.applicationName = application;
        this.lanId = lanId;
        this.isAuthorized = isAuthorized;
        
    }
     
    public User(){
         
    }
 
    //Setters and Getters
 
    @Override
    public String toString() {
        return "User [id=" + id + ", firstName=" + firstName
                + ", lastName=" + lastName + ", email=" + emailAddress + ", applicationName=" + applicationName + ", isAuthorized=" + isAuthorized + ", lanId=" + lanId + "]";
    }
}