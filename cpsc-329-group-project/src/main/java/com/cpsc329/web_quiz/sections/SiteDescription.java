package com.cpsc329.web_quiz.sections;

import com.cpsc329.web_quiz.MainView;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.router.Route;

@Route(value="site-description", layout= MainView.class)
public class SiteDescription extends Div {
	
	
	public SiteDescription() {
		add(new H1("What this site is about"));
	}
}