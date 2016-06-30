package com.mysalesforce;

import org.json.JSONArray;
import org.json.JSONObject;
import org.salesforce.*;

/**
 * Created by ubuntu on 27/5/16.
 */
public class QuerySObject {
    public static void main( String[] args ) {
        org.salesforce.Util util = new org.salesforce.Util();
        SObject sObject = new SObject("Account",util);
        String soql  = "SELECT+name+from+Account";
        String response = sObject.executeSOQL(soql);
        JSONObject obj = new JSONObject(response);
        JSONArray array = obj.getJSONArray("records");
        System.out.println(array.toString(4));
    }
}
