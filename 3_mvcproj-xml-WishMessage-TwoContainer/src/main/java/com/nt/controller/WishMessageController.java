package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.service.IWishMessageService;

public class WishMessageController extends AbstractController {
	private IWishMessageService service=null;
	
	public WishMessageController(IWishMessageService service) {
		super();
		this.service = service;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
			String msg=null;
			msg=service.generateWishMessage();
		return new ModelAndView("result","wmsg",msg);
	}

}
