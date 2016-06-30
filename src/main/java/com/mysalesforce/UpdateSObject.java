package com.mysalesforce;

import org.salesforce.SObject;
import org.salesforce.Util;

/**
 * Created by Rajdeep Dua on 27/5/16.
 */
public class UpdateSObject {
    public static void main( String[] args ){
        Util util = new Util();
        SObject sObject = new SObject("Account",util);
        String id = "00128000003L9tgAAC";
        String jsonData = "{\"name\":\"sForce_One\"}";
        sObject.patchSObject(id,jsonData);
    }
}
