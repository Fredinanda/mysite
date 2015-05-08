package com.sds.icto.mysite.servlet.action.guestbook;

import java.sql.SQLException;

import com.sds.icto.mysite.servlet.action.guestbook.ActionFactory;
import com.sds.icto.web.Action;

public class ActionFactory {
	
	private static ActionFactory instance;
	static {
		instance = new ActionFactory(); 
	}
	
	private ActionFactory(){
	}
	
	public static ActionFactory getInstance() {
	//	if( instance == null ) {
	//		instance = new ActionFactory(); 
	//	}
		
		return instance;
	}
	
	public Action getAction( String a ) {
		Action action = null;
		
		if( "delete".equals( a )){
			action = new deleteAction();
		}else if("insert".equals(a)){
			action = new insertAction();
		}
		
		if(action == null){
			action = new indexAction();
		}
		
		return action;
	
}
}
