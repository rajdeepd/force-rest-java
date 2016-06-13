package com.mysalesforce;

import org.salesforce.*;
import org.salesforce.Util;

/**
 * Created by ubuntu on 27/5/16.
 */
public class CreateSObject {
    public static void main( String[] args ){
        Util util = new Util();
        SObject sObject = new SObject("Account",util.getBaseUrl());
        String json = "{\"name\":\"TestAccountOne\"}";
        sObject.createSObject(json);
    }
}
