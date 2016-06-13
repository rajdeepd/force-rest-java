package com.mysalesforce;

import org.json.JSONArray;
import org.salesforce.SObject;
import org.salesforce.Util;
import org.json.JSONObject;
/**
 *
 *
 */
public class SObjectList
{
    public static void main( String[] args )
    {
        Util util = new Util();
        SObject sObject = new SObject("Account",util.getBaseUrl());
        String body = sObject.getList();
        System.out.println(body);
        JSONObject obj = new JSONObject(body);
        JSONArray array = obj.getJSONArray("recentItems");
        System.out.println(array.toString(4));
    }
}
