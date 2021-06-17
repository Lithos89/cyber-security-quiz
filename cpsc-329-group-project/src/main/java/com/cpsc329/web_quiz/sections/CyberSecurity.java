package com.cpsc329.web_quiz.sections;

import com.cpsc329.web_quiz.MainView;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.ListItem;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.UnorderedList;
import com.vaadin.flow.router.Route;

@Route(value="cybersecurity", layout=MainView.class)
@CssImport("./styles/shared-styles.css")
public class CyberSecurity extends Div {
	
	
	public CyberSecurity() {
		
		add(
		new H1("Cybersecurity"),
		new H3("What is Cybersecurity"),
		
		new Paragraph("Cybersecurity is the means of protecting your personal electronic data and making sure that it is not accessible by any unauthorized individuals. This is achieved through having properly functional and secure computer devices that are malware free"),
		
		new H3("What is the role of Cybersecurity?"),
		
		new Paragraph("The main role of Cybersecurity is to ensure the Confidentiality, Integrity and Availability (CIA) of electronic data. This is commonly referred to as the CIA Triad. A computer system is considered “secure” if these three objectives are met."),
		
		new H4("Confidentiality"),
		
		new Paragraph("The process of making sure that information is not disclosed to any unauthorized individuals. This may include individual people, organizations or even other computer processes."),
		
		new H4("Integrity"),
		
		new Paragraph("The process of making sure that data is accurate (no modifications by unauthorized individuals) and complete (no portion has been removed by unauthorized individuals)."),
		
		new H4("Availability"),
		
		new Paragraph("The process of making sure of the access and use of data in a timely and reliable manner."),
		
		new H3("How does Cybersecurity affect us?"),
		
		new Paragraph("In today’s ever evolving world of advanced technology, it is very important to protect our online activity. Cybersecurity is important as being active online is now a prominent part of our everyday lives. From accessing our emails, bank accounts, and making online purchases to online employment and accessing federal agencies, for example the CRA , it has become more and more paramount to protect our personal identifiable information."),
		
		new Paragraph("Having everything at the touch of our fingertips has made life easier, but with that comes many shortcomings. The more online activity we have, the more vulnerable we are to attackers. As individuals this puts us at great risk for having our personal information stolen and possibly becoming victims to identity theft. Attackers use stolen information for fraudulent activities. Sometimes when information is leaked from people’s personal social platforms it can cause problems in people's relationships and social circles."),
		
		new Image("https://www.thebeijinger.com/sites/default/files/thebeijinger/blog-images/345221/internet-of-things.jpg", "Retrieved from https://www.thebeijinger.com/blog/2018/07/02/chinas-internet-things-manufacturers-are-reducing-costs-expense-our-privacy-and"),
		
		new H3("Learning about Impersonation, Data Interception and Data Theft"),
		
		new H4("Impersonation"),
		
		new Paragraph("With the powerful tool, the internet, attackers can easily impersonate any individual, company, organization or government agencies just to name a few. Attackers can easily mimic legitimate emails and websites and trick people into believing they are the actual people they claim to be. Criminals apply impersonation to attack people through the following ways."),
	
		new H4("Phishing"),
		
		new Paragraph("Sending emails impersonating legitimate parties and asking the individual to click on links. The links bring you to a website that mimics the legitimate website and whatever information you enter here, such as your SIN, bank account and password, etc, the attackers gain access to all that information. They use these harmful links to steal your usernames and passwords and commit fraudulent activities on your behalf."),
		
	
		new H4("Spear Phishing"),
		
		new Paragraph("This is a form of phishing that is targeted at a specific individual, organization or business. The criminals conduct research on their target based on their online activity and/or social media platform to create legitimate looking emails to fool the target."),
		
		//Potentially add the image here that's cropped for phishing
		
		new H4("Smishing"),
		
		new Paragraph("This is another form of phishing where the harmful message is delivered via text messages. Again, the goal is to trick the individuals to enter their usernames and passwords which are then used by the attackers for their own benefit."),
		
		new Image("https://www.social-engineer.com/wp-content/uploads/2020/12/smishing..jpg", "Retrieved from https://securityboulevard.com/2020/12/smishing-is-it-really-a-threat/"),
		
		new H4("Vishing"),
		
		new Paragraph("This is another form of phishing that is voice-based via POTS (plain old telephone service). There are attackers who still use the telephone as a means of illegally gaining access to people’s personal information such as SIN, bank account, usernames and passwords."),
		
		new H4("Whaling"),
		
		new Paragraph("This is a form of spear phishing that targets government officials or high profile executives to reveal sensitive information or send money transfers to fraudulent accounts."),
		
		new H4("Data Interception"),
		
		new Paragraph("As the name states, data interception is when the attackers intercept and gain access to information in the middle of data transmission between computer devices. Attackers achieve this by successfully decrypting data or at times if the data has not been encrypted adequately."),
		
		new Paragraph("A form of interception is known as “man in the middle attack”. The attacker acts as the man in the middle of the sender of data and the receiver of data. Once the sender sends the data, the man in the middle will receive the data and modify it to his benefit and then send it to the receiver. Subsequently, the sender relieves the data and wishes to reply to the sender. Once again, the attacker in the middle relieves that reply, modifies it to his/her benefit and then sends it to the original sender. This is known as proxying, where the attacker in the middle makes changes for his own benefit, all the while continuing to send and receive messages between the two parties. This gives the sender and receiver the false illusion that what they are sending and receiving are accurate and complete."),
		
		new Image("https://phoenixnap.com/blog/wp-content/uploads/2019/03/example-of-mitm-attack-min.png", "Retrieved from https://phoenixnap.com/blog/man-in-the-middle-attacks-prevention"),
		
		new H4("Data Theft"),
		
		new Paragraph("A lot of cyberattacks are driven to steal valuable personal information. The attackers main goal is to use that stolen information to steal or make money out of it. Personal stolen information can be used for identity theft or to sell identities. Attackers usually commit fraudulent activities such as accessing your bank accounts, creating new credit card and mobile phone accounts under you rname. Also, attackers often use personal information such as health related information or sensitive photos to blackmail people for money. Important stolen data that is completely erased from the owner’s computer are used for monetary gains through demanding ransom for the return of the compromised data."),
		
		new H3("Cybersecurity Defenses"),
		
		new Paragraph("Here are some basic components for optimal personal protection."),
		
		new H4("Perimeter Defense via Firewall and Router"),
		
		new Paragraph("It is important to note that your computer devices should never be directly connected to your internet modem. Instead, the internet modem should be connected to a firewall and router, and then all of your computer devices should be connected to the firewall and router. This acts as a cyber-perimeter protection for all of your devices. The function of the firewall is to act as a barrier to anyone trying to access your internal devices such as computers, mobile phone, tablets, etc. However, it allows you as an internal user to request information from external sources and will not block those requests. It is important to regularly update your router or have it set up for automatic updates to have better protection."),
		
		new Image("https://technoadvantage.com/wp-content/uploads/2020/08/Firewalls.jpg", "Retrieved from https://technoadvantage.com/firewalls-101-hows-and-whys/"),
	
		new H4("Some tips for better protection when setting up your router:"),
		
		new UnorderedList(
			new ListItem("Always change the default administrative password that is provided for your router"),
			new ListItem("Create a new and unique name for your router"),
			new ListItem("Make a strong password that is mandatory for any devices that wish to connect to your wifi"),
			new ListItem("Do not enable remote access to your router as this will expose you to risks"),
			new ListItem("Create a guest wifi network with a strong password for guests")),
		
		new H4("Security Software"),
		
		new Paragraph("It is critical to use antivirus software on all of your devices and to remember to update that software regularly. The antivirus will conduct real time scans of your computer devices to detect any possible malware. If any harmful malware is detected then the antivirus will either remove, quarantine or delete it, based on your settings. When accessing your devices make sure to create strong and unique passwords, not only to access your devices but also for all of your online activities such as email, online banking, e-commerce, etc. This will further help provide better protection of your data."),
		
		new Image("https://blog.reasonsecurity.com/wp-content/uploads/2020/01/shutterstock_233997115-e1578907208622.jpg", "Retrieved from https://blog.reasonsecurity.com/2020/01/13/how-antivirus-protect-your-data/"),
		
		new H4("Backup"),
		
		new Paragraph("This may not seem obvious but it is highly recommended to back up your data regularly. If at any time you are exposed to external threats you will have a piece of mind knowing you have a backup copy. Remember to keep the external harddrive storing your backup in a secure place to prevent theft or loss."),
		
		new Image("https://www.bluechipgulf.ae/wp-content/uploads/2020/01/img-data-backup-solutions.jpg", "Retrieved from https://www.bluechipgulf.ae/ups-generator-and-pdu-services-dubai/"),
		
		new H3("Different Types of Backup"),
		
		new H4("Full Backups of Systems"),
		
		new Paragraph("This is a complete backup of the entire computer system, including the data, settings, programs and the operation system. This backs up everything."),
		
		new H4("Full Backups of Data"),
		
		new Paragraph("This is a full backup of only the data from a computer system. It does not include a backup of the operation system or any softwares."),
		
		new H4("Incremental Backups"),
		
		new Paragraph("This is a backup of any recent data on the computer device that was not included in the last full backup of data. To access a complete backup of all the data, the restoration has to be done from the most recent backup."),
		
		new H4("Differential Backups"),
		
		new Paragraph("This is a backup of any files that were changed or added since the last full backup."),
		
		new H4("Continuous Backups"),
		
		new Paragraph("This is a form of back that is conducted continuously every time a change is made in the data. This is also known as synching."),
		
		new H4("Partial Backups"),
		
		new Paragraph("This is a backup of only certain portions of data."),
		
		new H4("Virtual Drive Backups"),
		
		new Paragraph("This is a backup where the data is stored on an encrypted virtual drive. Encryption is a process that makes the data unreadable and can only be accessed with a key."),
		
		//Citations
		new H2("Citations"),
		
		new Paragraph("Steinberg, Joseph. Cybersecurity for Dummies. Newark: Wiley, 2019. O’Reilly. https://learning.oreilly.com/library/view/cybersecurity-for-dummies/9781119560326/?sso_link=yes&sso_link_from=university-of-calgary"),
		
		new Paragraph("Rei Safavi-Naini. “Explorations in Information Security and Privacy”. CPSC329. June 2021. University of Calgary."));
		
		setClassName("centered-content");
	}
}