package com.sds.icto.mysite.servlet.action.board;

import com.sds.icto.mysite.servlet.action.board.ActionFactory;

import com.sds.icto.web.Action;

public class ActionFactory {
	private static ActionFactory instance;
	static {
		instance = new ActionFactory(); 
	}
	
	private ActionFactory(){
	}
	
	public static ActionFactory getInstance() {
		if( instance == null ) {
			instance = new ActionFactory(); 
		}
		
		return instance;
	}
	
	public Action getAction( String a ) {
		Action action = null;
		
		if( "insert".equals( a )){
			action = new insertAction();
		}else if("read".equals(a)){
			action = new readAction();
		}else if("modify".equals(a)){
			action = new modifyAction();
		}else if("update".equals(a)){
			action = new modifyAction();
		}
		
		
		if(action == null){
			action = new indexAction();
		}
		
		return action;
	}
}
