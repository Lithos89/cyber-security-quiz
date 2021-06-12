package com.cpsc329.web_quiz.sections;

import com.cpsc329.web_quiz.MainView;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.router.Route;

@Route(value="cybersecurity", layout=MainView.class)
public class CyberSecurity extends Div {
	
	
	public CyberSecurity() {
		add(new H1("Cyber Security"));
	}
}