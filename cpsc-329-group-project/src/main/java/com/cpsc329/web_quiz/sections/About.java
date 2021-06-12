package com.cpsc329.web_quiz.sections;

import com.cpsc329.web_quiz.MainView;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.router.Route;

@Route(value="about", layout=MainView.class)
@CssImport("./styles/shared-styles.css")
public class About extends Div {
	
	
	public About() {
		
		setClassName("about-background");
		
		Div contentDiv = new Div();
		contentDiv.addClassName("about-content");
		
		H1 label = new H1("ABOUT US");
		
		Div profileContainer = new Div();
		profileContainer.addClassName("profile-container");
		
		String[] names = {"Eduard", "Homa", "Maham", "Moiz"};
		
		for (String name : names) {
			profileContainer.add(CreateProfile(name, "https://dummyimage.com/100x100/000/fff"));
		}
		
		contentDiv.add(label, profileContainer);
		
		add(contentDiv);
		
//		add()
	}
	
	private Div CreateProfile(String name, String resPath) {
		Div profile = new Div();
		
		Image image = new Image(resPath, "DummyImage");
		image.addClassName("profile-image");
		
		H3 nameLabel = new H3(name);
		nameLabel.addClassName("profile-name");
		
		profile.add(image, nameLabel);
		
		return profile;
	}
}