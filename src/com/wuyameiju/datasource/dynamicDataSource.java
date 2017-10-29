package com.wuyameiju.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class dynamicDataSource extends AbstractRoutingDataSource{

	 public static final String DATASOURCE_WUYAMEIJU = "wuyameijuDS";  
     public static final String DATASOURCE_LOG = "logDS";  
	
     /**
      * 本地线程，获取当前正在执行的currentThread  
      */
     public static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();   
     public static void setCustomerType(String customerType) {  
    	  
         contextHolder.set(customerType);  
           
     }  
   
     public static String getCustomerType() {  
   
         return contextHolder.get();  
            
     }  
   
     public static void clearCustomerType() {  
   
         contextHolder.remove();  
       
     }  
     @Override
	protected Object determineCurrentLookupKey() {
		// TODO Auto-generated method stub
    	 return getCustomerType();
	}

}
