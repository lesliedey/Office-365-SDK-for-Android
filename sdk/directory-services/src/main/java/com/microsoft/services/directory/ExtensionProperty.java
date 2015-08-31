/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/
package com.microsoft.services.directory;



/**
 * The type Extension Property.
*/
public class ExtensionProperty extends DirectoryObject {

    public ExtensionProperty(){
        setODataType("#Microsoft.DirectoryServices.ExtensionProperty");
    }
            
    private String appDisplayName;
     
    /**
    * Gets the app Display Name.
    *
    * @return the String
    */
    public String getAppDisplayName() {
        return this.appDisplayName; 
    }

    /**
    * Sets the app Display Name.
    *
    * @param value the String
    */
    public void setAppDisplayName(String value) { 
        this.appDisplayName = value; 
        valueChanged("appDisplayName", value);

    }
            
    private String name;
     
    /**
    * Gets the name.
    *
    * @return the String
    */
    public String getName() {
        return this.name; 
    }

    /**
    * Sets the name.
    *
    * @param value the String
    */
    public void setName(String value) { 
        this.name = value; 
        valueChanged("name", value);

    }
            
    private String dataType;
     
    /**
    * Gets the data Type.
    *
    * @return the String
    */
    public String getDataType() {
        return this.dataType; 
    }

    /**
    * Sets the data Type.
    *
    * @param value the String
    */
    public void setDataType(String value) { 
        this.dataType = value; 
        valueChanged("dataType", value);

    }
            
    private Boolean isSyncedFromOnPremises;
     
    /**
    * Gets the is Synced From On Premises.
    *
    * @return the Boolean
    */
    public Boolean getIsSyncedFromOnPremises() {
        return this.isSyncedFromOnPremises; 
    }

    /**
    * Sets the is Synced From On Premises.
    *
    * @param value the Boolean
    */
    public void setIsSyncedFromOnPremises(Boolean value) { 
        this.isSyncedFromOnPremises = value; 
        valueChanged("isSyncedFromOnPremises", value);

    }
    
        
    private java.util.List<String> targetObjects = null;
    
    
     
    /**
    * Gets the target Objects.
    *
    * @return the java.util.List<String>
    */
    public java.util.List<String> getTargetObjects() {
        return this.targetObjects; 
    }

    /**
    * Sets the target Objects.
    *
    * @param value the java.util.List<String>
    */
    public void setTargetObjects(java.util.List<String> value) { 
        this.targetObjects = value; 
        valueChanged("targetObjects", value);

    }
}

