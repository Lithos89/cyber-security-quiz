package com.cpsc329.web_quiz.sections;

import com.cpsc329.web_quiz.MainView;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.router.Route;

@Route(value="created-by", layout=MainView.class)
@CssImport("./styles/shared-styles.css")
public class About extends Div {
	
	
	public About() {
		Div background = new Div();
		
		background.setClassName("about-background");
		
		Div contentDiv = new Div();
		contentDiv.addClassName("about-content");
		
		H1 label = new H1("CREATED BY");
		
		Div profileContainer = new Div();
		profileContainer.addClassName("profile-container");
		
		String[][] creatorInfo = {{"Eduard", "https://source.unsplash.com/random/100x100/?jungle"}, {"Homa", "https://source.unsplash.com/random/100x100/?mountain"}, {"Maham", "https://source.unsplash.com/random/100x100/?river"}, {"Moiz", "https://source.unsplash.com/random/100x100/?beach"}};
		
		
		for (String[] info : creatorInfo) {
			profileContainer.add(CreateProfile(info[0], info[1]));
		}
		
		contentDiv.add(label, profileContainer);
		
		add(background, contentDiv);
		
//		add()
	}
	
	private Div CreateProfile(String name, String resPath) {
		Div profile = new Div();
		
		Image image = new Image(resPath, "Image");
		image.addClassName("profile-image");
		
		H3 nameLabel = new H3(name);
		nameLabel.addClassName("profile-name");
		
		profile.add(image, nameLabel);
		
		return profile;
	}
}