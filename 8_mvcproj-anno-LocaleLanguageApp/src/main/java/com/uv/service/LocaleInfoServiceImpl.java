package com.uv.service;

import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.stereotype.Service;

@Service("localeService")
public class LocaleInfoServiceImpl implements ILocaleInfoService {

	@Override
	public Set<String> getAllLanguages() {
		Locale locales[]=null;
		Set<String> languageList=null;
		
		locales=Locale.getAvailableLocales();
		languageList=new TreeSet();
		for(Locale l:locales) {
			if(!l.getDisplayLanguage().equals("")) {
				languageList.add(l.getDisplayLanguage());
			}
		}
		return languageList;
	}

}
