package com.spe.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.spe.forms.UserForm;

public class LoginAction extends Action {
	int num=0;
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		UserForm userForm=(UserForm)form;
		num++;
		if("123".equals(userForm.getPassword())) {
			request.setAttribute("username", userForm.getUsername());
			System.out.println(num);
			return mapping.findForward("ok");
		}else {
			return mapping.findForward("err");
			
		}
		
	
	}

}
