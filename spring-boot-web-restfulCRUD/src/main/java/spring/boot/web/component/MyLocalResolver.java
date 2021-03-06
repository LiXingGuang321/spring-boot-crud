package spring.boot.web.component;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

public class MyLocalResolver implements LocaleResolver {

	@Override
	public Locale resolveLocale(HttpServletRequest request) {
		String l =  request.getParameter("l");
		Locale locale = Locale.getDefault();
		if(StringUtils.hasLength(l)) {
			String[] split = l.split("_");
			locale = new Locale(split[0],split[1]);
		}
		return locale;
	}

	@Override
	public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {
		// TODO Auto-generated method stub
		
	}

}
