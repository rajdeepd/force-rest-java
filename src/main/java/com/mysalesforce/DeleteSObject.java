package com.mysalesforce;

import org.salesforce.SObject;
import org.salesforce.Util;

/**
 * Created by ubuntu on 27/5/16.
 */
public class DeleteSObject {
    public static void main( String[] args ){
        Util util = new Util();
        SObject sObject = new SObject("Account",util.getBaseUrl());
        String objectId = "0012800000DR2Ko";
        sObject.deleteSObject(objectId);
    }
}
