package com.cpsc329.web_quiz.sections;

import com.cpsc329.web_quiz.MainView;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.router.Route;

@Route(value="site-description", layout= MainView.class)
@CssImport("./styles/shared-styles.css")
public class SiteDescription extends Div {
	
	
	public SiteDescription() {
		Div backgroundDiv = new Div();
		backgroundDiv.addClassName("background");
		
		Div contentDiv = new Div();
		
		contentDiv.addClassName("description-content");
		
		H2 titleLabel = new H2("Your One Stop Shop for Learning about Cybersecurity and Malware");
		
		H4 promo = new H4("Welcome to our site!\n" + 
				"\n" + 
				"With the covid pandemic a lot of offline services have moved online. Now more then ever everyone needs to be safe online. Our site will help you learn about malware and cyber security and our game will help you test your new or reinforced knowledge!");
		
		H4 instructions = new H4("Offered in this site is content on cybersecurity and malware in order to help protect you against the everyday threats that exist on the internet. Most importantly, this site includes a quiz to help reinforce the content provided by this site and apply it for when you are on the web yourself.");
		
		
		Paragraph description = new Paragraph("This site is created as a final project for Computer Science 329: Explorations in Information Security and Privacy; a course offered at the University of Calgary.");
		
		contentDiv.add(titleLabel, promo, instructions, description);
		add(backgroundDiv, contentDiv);
	}
}