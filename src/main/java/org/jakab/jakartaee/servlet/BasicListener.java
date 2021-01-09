package org.jakab.jakartaee.servlet;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class BasicListener
 *
 */
@WebListener(value = "BasicListener")
public class BasicListener implements HttpSessionListener, 
										ServletRequestListener, ServletContextListener {

    /**
     * Default constructor. 
     */
    public BasicListener() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
    	// TODO Auto-generated method stub
    	System.out.println("BasicListener requestInitialized -> ");
    	ServletRequestListener.super.requestInitialized(sre);
    }
    
    @Override
    public void sessionCreated(HttpSessionEvent se) {
    	// TODO Auto-generated method stub
    	System.out.println("BasicListener sessionCreated -> ");
    	HttpSessionListener.super.sessionCreated(se);
    }
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
    	// TODO Auto-generated method stub
    	System.out.println("BasicListener contextInitialized -> "+sce.getServletContext().getContextPath());
    	ServletContextListener.super.contextInitialized(sce);
    }
    
    
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    	// TODO Auto-generated method stub
    	System.out.println("BasicListener contextDestroyed -> "+sce.getServletContext());
    	ServletContextListener.super.contextDestroyed(sce);
    }
	
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
    	// TODO Auto-generated method stub
    	System.out.println("BasicListener sessionDestroyed -> ");
    	HttpSessionListener.super.sessionDestroyed(se);
    }
    
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
    	// TODO Auto-generated method stub
    	System.out.println("BasicListener requestDestroyed -> ");
    	ServletRequestListener.super.requestDestroyed(sre);
    }
}
