package com.learning.superadmin;

public class Events {

    private String name;
    private String id;
    private String organiser;
    private String startdate;
    private String enddate;
    private String starttime;
    private String contactinfo;
    private String venue;
    private String status= "Pending";

    public Events() {
    }

    public Events(String name, String id, String organiser, String startdate, String enddate, String starttime, String contactinfo, String venue) {
        this.name = name;
        this.id = id;
        this.organiser = organiser;
        this.startdate = startdate;
        this.enddate = enddate;
        this.starttime = starttime;
        this.contactinfo = contactinfo;
        this.venue = venue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrganiser() {
        return organiser;
    }

    public void setOrganiser(String organiser) {
        this.organiser = organiser;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getContactinfo() {
        return contactinfo;
    }

    public void setContactinfo(String contactinfo) {
        this.contactinfo = contactinfo;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

