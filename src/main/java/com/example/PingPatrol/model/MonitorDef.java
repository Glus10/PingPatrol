package com.example.PingPatrol.model;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;



public class MonitorDef {
    private String protocol;
    private long interval;
    private String location;
    private String address;


    public MonitorDef(String protocol, long interval, String location, String address) {
        this.protocol = protocol;
        this.interval = interval;
        this.location = location;
        this.address = address;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public long getInterval() {
        return interval;
    }

    public void setInterval(long interval) {
        this.interval = interval;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // additonal methods

    @Override
    public String toString() {
        return "MonitorDef{" +
                "protocol='" + protocol + '\'' +
                ", interval=" + interval +
                ", location='" + location + '\'' +
                ", address='" + address + '\'' +
                '}';
    }   

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MonitorDef monitorDef = (MonitorDef) obj;
        return interval == monitorDef.interval && protocol.equals(monitorDef.protocol) && location.equals(monitorDef.location) && address.equals(monitorDef.address);
    }   

    @Override
    public int hashCode() {
        int result = protocol.hashCode();
        result = 31 * result + (int) (interval ^ (interval >>> 32));
        result = 31 * result + location.hashCode();
        result = 31 * result + address.hashCode();
        return result;
    }   

    public MonitorDef clone() {
        return new MonitorDef(protocol, interval, location, address);
    }

    public MonitorDef copy() {
        return new MonitorDef(protocol, interval, location, address);
    }

    //


    
}
