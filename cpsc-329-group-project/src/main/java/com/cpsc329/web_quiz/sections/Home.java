package com.cpsc329.web_quiz.sections;

import com.cpsc329.web_quiz.MainView;
import com.cpsc329.web_quiz.Quiz;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.router.Route;

@Route(value = "", layout=MainView.class)
public class Home extends Div {
	
	public Home() {
		Div background = new Div();
		
		background.setClassName("about-background");
		
		add(background);
		add(new Quiz());
	}
}