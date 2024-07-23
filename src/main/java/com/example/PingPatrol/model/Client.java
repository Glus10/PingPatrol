package com.example.PingPatrol.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "clients")
public class Client {
    @Id
    private String name;
    private String url;
    private String email;
    private String phone;
    private String address;
    private String location;
    private String description;
    private long monitorInterval;   //long is used to store the time in milliseconds
    
// constructor
    public Client(String name, String url, String email, String phone, String address, String location, String description, long monitorInterval) {
        this.name = name;
        this.url = url;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.location = location;
        this.description = description;
        this.monitorInterval = monitorInterval;
    }   

// getters and setters  

public String getName(){
    return name;
}

public void setName(String name){
    this.name = name;

}


public String getUrl(){
    return url; 
}

public void setUrl(String url){
    this.url = url; 
}

public  String getEmail(){
    return email;   
}


public void setEmail(String email){
    this.email = email;     
}


public String getPhone(){
    return phone; 
}

public void setPhone(String phone){
    this.phone = phone; 
}

public String getAddress() {
    return address;
}

public void setAddress(String address) {
    this.address = address;
}

public String getLocation() {
    return location;
}

public void setLocation(String location) {
    this.location = location;
}

public String getDescription() {
    return description;
}

public void setDescription(String description) {
    this.description = description;
}

public long getMonitorInterval(){
    return monitorInterval;
}

public void setMonitorInterval(long monitorInterval){
    this.monitorInterval = monitorInterval;
}



}
