package com.uv.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.uv.service.LocaleInfoServiceImpl;

@Controller
public class LocaleOperationController {
	
	@Autowired
	public LocaleInfoServiceImpl service;
	
	
	
	public LocaleOperationController(LocaleInfoServiceImpl service) {
		super();
		this.service = service;
	}

	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String showHome(){
		return "home";
	}
	
/*	@RequestMapping(value="/languages", method=RequestMethod.GET )
	public ModelAndView fetchLanguages(){
		ModelAndView mav=null;
		Set<String> languageList=null;
		
		mav=new ModelAndView();
		languageList=service.getAllLanguages();
		
		mav.addObject("listInfo", languageList);
		mav.addObject("operation", "Languages");
		mav.addObject("languageCount", languageList.size());
		
		//set lvn
		mav.setViewName("show_results");
		return mav;
	}*/
		
	/*
	  @RequestMapping(value="/languages", method=RequestMethod.GET) 
	  public String FetchLanguages(Map<String, Object> map) { 
	  	Set<String> languagesList=null;
	  //use Service 
	   	languagesList=service.getAllLanguages();
	  
	  //adding multiple model attributes map.put("listInfo", languagesList);
	  	map.put("operation", "Languages"); map.put("languageCount",
	  	languagesList.size());
	  
	  //return lvn 
	   	return "show_results";
	  
	  }
	 */ 
	
/*	  @RequestMapping(value="/languages", method=RequestMethod.GET)
	  public String FetchLanguages(ModelMap map) { 
		  Set<String> languagesList=null; 
		  //use service
	  countriesList=service.getAllLanguages();
	  //adding multiple model attributes
	  map.put("listInfo", languagesList); 
	  map.put("operation", "languages");
	  map.put("countrieCount", languagesList.size());
	  
	  //return lvn 
	  return "show_results"; 
	  
	  }
	 */
	
/*	@RequestMapping(value="/languages", method=RequestMethod.GET)
  	public String FetchLanguages(Model model) {
		Set<String> languagesList=null;    //Best
		//use Service
		languagesList=service.getAllLanguages();
		//adding multiple model attributes
		model.addAttribute("listInfo", languagesList);
		model.addAttribute("operation", "Languages");
		model.addAttribute("languageCount", languagesList.size());
		//return lvn
		return "show_results";
		
	}  */
	
/*	@RequestMapping(value="/languages", method=RequestMethod.GET)
  	public void FetchLanguages(Model model) {
		Set<String> languagesList=null;    //Best
		//use Service
		languagesList=service.getAllLanguages();
		//adding multiple model attributes
		model.addAttribute("listInfo", languagesList);
		model.addAttribute("operation", "Languages");
		model.addAttribute("languageCount", languagesList.size());
		
	}
	*/
 /*	@RequestMapping(value="/languages", method=RequestMethod.GET )
	public void fetchLanguages(ModelAndView mav){
		Set<String> languageList=null;
		//use service
		languageList=service.getAllLanguages();
		
		mav.addObject("listInfo", languageList);
		mav.addObject("operation", "Languages");
		mav.addObject("languageCount", languageList.size());
		
		//set lvn
		mav.setViewName("show_results");
	} */ 
	
	
	/*@RequestMapping(value="/countries/add",method=RequestMethod.GET)
	public Map<String,Object>  fetchCountries() {
		Set<String> countriesList=null;
		Map<String,Object> map=new HashMap();
		//use Service
		countriesList=service.getAllCountries();
		//adding multiple model attribues
		map.put("listInfo", countriesList);
		map.put("operation", "countries");
		map.put("countriesCount", countriesList.size());
		return map;
	}//method
	*/
	
	
	@RequestMapping(value="/languages",method=RequestMethod.GET)
	public Model  fetchLanguages() {
		Set<String> languagesList=null;
		Model model=null;
		//use Service
		languagesList=service.getAllLanguages();
		//adding multiple model attribues
		model=new  ExtendedModelMap();
		model.addAttribute("listInfo", languagesList);
		model.addAttribute("operation", "countries");
		model.addAttribute("countriesCount", languagesList.size());
		return model;
	}//method
	
}
