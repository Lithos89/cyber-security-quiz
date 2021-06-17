package com.cpsc329.web_quiz;

import com.vaadin.flow.component.Key;
import com.cpsc329.web_quiz.sections.About;
import com.cpsc329.web_quiz.sections.CyberSecurity;
import com.cpsc329.web_quiz.sections.Home;
import com.cpsc329.web_quiz.sections.Malware;
import com.cpsc329.web_quiz.sections.SiteDescription;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.RouterLink;

public class NavigationBar extends Tabs {
	
	
	public NavigationBar() {
		
    	setWidth("100%");
    	
    	Tab gameTab = new Tab(new RouterLink("CYBERSECURITY", Home.class));
    	gameTab.addClassName("main-tab");
    	Tab sitePurposeTab = new Tab(new RouterLink("What is this site?", SiteDescription.class));
    	sitePurposeTab.addClassName("secondary-tab");
    	Tab cybersecurityContentTab = new Tab(new RouterLink("What is Cybersecurity?", CyberSecurity.class));
    	cybersecurityContentTab.addClassName("secondary-tab");
    	Tab malwareContentTab = new Tab(new RouterLink("What is Malware?", Malware.class));
    	malwareContentTab.addClassName("secondary-tab");
    	Tab aboutTab = new Tab(new RouterLink("Creators", About.class));
    	aboutTab.addClassName("secondary-tab");
    	setOrientation(Tabs.Orientation.HORIZONTAL);
    	add(gameTab, sitePurposeTab, cybersecurityContentTab, malwareContentTab, aboutTab);
    	
		
	}
}