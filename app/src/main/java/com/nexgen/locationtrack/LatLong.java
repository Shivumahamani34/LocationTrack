package com.nexgen.locationtrack;

public class LatLong {

    //private variables
    int _id;
    String _lat;
    String _long;


    // Empty constructor
    public LatLong(){

    }
    // constructor
    public LatLong(int id, String latitude, String longitude){
        this._id = id;
        this._lat = latitude;
        this._long = longitude;
    }

    // constructor
    public LatLong(String latitude, String longitude){
        this._lat = latitude;
        this._long = longitude;
    }
    // getting ID
    public int getID(){
        return this._id;
    }

    // setting id
    public void setID(int id){
        this._id = id;
    }

    public String get_lat() {
        return _lat;
    }
    public void set_lat(String _lat) {
        this._lat = _lat;
    }
    public String get_long() {
        return _long;
    }
    public void set_long(String _long) {
        this._long = _long;
    }
}
