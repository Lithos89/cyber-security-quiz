package com.cpsc329.web_quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.textfield.TextField;


public class Quiz extends Div {
	
	//Question Bank
		String[] questionsRaw = {
							"Which of the three malware techniques are self-replicating?",
							"What is a rootkit?",
							"A firewall is... ",
							"Which of the following is not true regarding protecting yourself from malware:",
							"This is a program that is harmful that disguises itself as a legitimate program. Usually, it is downloaded by users onto their computer without them realizing what they have downloaded. When the user runs the program, the program can cause damage.",
							"What is the name of the malware that takes over the user's machine to uses their resources to mine for digital currency for their profits?",
							"Which type of attack uses a botnet to attack a server by pushing it to its limit to deny access to users?",
							"Which of the following is not a method of making yourself safer from malware?",
							"Which type of malware did the ILOVEYOU malware use?",
							"The ILOVEYOUMALWARE turned 20 years old in 2020. The impact it had was very high. In fact, it is estimated that ____% of computers connected to the internet were infected in the world and it resulted in $_____ billion US in the aftermath of the malware. Which numbers correspond to the blanks.",
							"What is adware?",
							"Which of the following are assured ways to know if you have malware?",
	                        "What is an antivirus software?",
	                        "What does a keylogger do?",
	                        "Why is it important to use security patches?",
	                        "What does the CIA Triad stand for?",
	                        "What type of backup does syncing refer to?",
	                        "What makes a virtual drive backup safe?",
	                        "What is the difference between phishing and spear phishing?",
	                        "What are some negative impacts of Identity Theft?",
	                        "What is whaling?",
	                        "What are some important steps to follow when setting up your router?",
	                        "What is an important precautionary measure in case of future data breaches?",
	                        "What is the difference between full system backup and full data backup?",
	                        "Why is it important to install antivirus on your computer systems?",
	                        "What is data interception?",
	                        "What is an example of data interception?",
	                        "What is the man in the middle attack also known as?",
	                        "What are incremental backups?",
	                        "What is the best type of backup?"
							
		};

		
		//Answer Bank
		String[][] optionsRaw = {
							{"Trojan horse", "Virus", "Worm and virus", "Trojan horse and virus"},
							{"A type of malware that completely destroys the computer.", "A type of malware that is downloaded in a kit.", "A type of malware that gives the attacker the privileges of an administrator.", " A type of malware that is downloaded when a user clicks on a malicious link."},
							{"A type of malware that stops items from going into your computer or internal network.", "Is used to monitor what should go in or out of a computer or internal network. It is a 100% safeguard from malware.", "It is a malware that can \"burn\" all of your files and corrupt them.", "Is used to monitor what should go in or out of a computer or internal network. It is not 100% safeguard."},
							{"Don't reuse your password on multiple sites.", "You can't open links from unknown senders", "It is always ok to open links from people you know.", "Both a and c"},
							{"Trojan horse", "Malware", "Virus", "Spider"},
						    {"Bitcoin digger", "Cyrptominer", "MoneyMaker", "CyrptoCoin"}, 
	                        {"DsDO", "DSod", "DDoS", "Dd0S"}, 
	                        {"Security patch", "Firewall", "Keylogger", "Antivirus software"},
	                        {"Trojan", "Virus", "Worm", "All of the above"},
	                        {"20 and 10", "10 and 10", "10 and 20", "14 and 16"},
	                        {"Malware that uses the computers resource for mining cryptocurrency.", "Malware that causes pop up ads to encourage users to download another type of malware or make money for the creator.", "Malware that holds a computer as a hostage by encrypting the user's data and demanding a ransom.","Tricks users into thinking they are hacked and scare them into doing things such as buying a fake application."},
	                        {"Slow computer", "System crashing", "Both of the above", "Neither as these can be cause by other reasons as well."},
	                        {"Viruses that hide inside of legitimate applications.", "Application that is used to try to prevent, detect and remove malware.", "Extremely dangerous form of virus to which there is no removal.", "An update to the code of the operating system to fix bugs."},
	                        {"Secures what you are typing by encrypting what you input on your keyboard.", "Disables the use of your keyboard.", "Program that helps you manage all your passwords.","Type of spyware that keeps track of everything that is typed."},
	                        {"They update the code of applications or the operating system to fix bugs that could have been used by malware or attackers.", "They completely block malware from infecting your device.", "It's the way to remove malware already on your device.","It is not important as security patches are a type of malware."},
	                        {"Canadian Intelligence Association", "Confidentiality, Integrity, Authentication", "California Institute of Algorithms", "Confidentiality, Integrity, Availability"},
	                        {"Partial backups", "Incremental backups", "Continuous backups", "Differential backups"},
	                        {"Encryption", "Strong password", "Secure antivirus", "Malware protection"},
	                        {"Phishing is slow compared to spear phishing", "Phishing targets a wide range of people whereas spear phishing targets a specific individual or business", "Phishing mostly attacks elders whereas spear phishing attacks the youth", "There is no difference between phishing and spear phishing"},
	                        {"Access to your bank account", "Creation of new credit cards under your name", "Setting up new mobile or utility accounts under your name", "All of the above"},
	                        {"It’s a form of phishing that targets the seniors", "It’s a form of phishing that targets smaller businesses", "It’s a form of phishing that targets the fishing industry", "It is a form of phishing that targets executives or government officials"},
	                        {"Create a unique wifi network name and password", "Make a password mandatory for accessing the network", "Create a guest network and never allow remote access to your router", "All of the above"},
	                        {"Regularly backup your data", "Write down your passwords in a private notebook", "Email yourself your important data", "Use the default network passwords to have better protection"},
	                        {"Nothing, they are both full backups", "Full data backup backs up only the data", "Full system backup backs up the operating system, settings, programs and data", "b and c are both correct"},
	                        {"To enable two factor passwords", "To provide protection from external threats", "To keep your computer systems free of infectious viruses and bacteria", "To allow you to use easy passwords without losing protection"},
	                        {"When hackers access your data and make changes that are beneficial to them", "When hackers intercept and listen to your phone calls", "When hackers intercept your data in the middle of being transmitted to the receiver", "Both a and c are correct"},
	                        {"The man in the middle attack", "Eavesdropping attack", "Encryption attack", "Username and password attack"},
	                        {"Syncing", "Proxying", "Installing", "Uploading"},
	                        {"Backups that involve small increments of added security", "Backups that are done in small steps to speed things up", "Backups that are done to include the recently added or changed data", "Backups that are stored as smaller sections of a larger data"},
	                        {"Differential backup as it includes any data that was recently added", "Full system backup as it backs up everything", "Virtual drive backup as it provides encrypted security", "Continuous backup as it is continuously backing up data"}


		};
		
		//Correct Choices
		Character[] answersRaw = {
						'C',
						'C',
						'D',
						'C',
						'A',
						'B',
						'C',
						'C',
						'D',
						'B',
						'B',
						'D',
						'B',
						'D',
						'A',
						'D',
						'C',
						'A',
						'B',
						'D',
						'D',
						'D',
						'A',
						'D',
						'B',
						'D',
						'A',
						'B',
						'C',
						'B'
		};
	
	//Facts
	
	
	char guess;
	char answer;
	int index;
	int right_answers = 0;
	int TQuestions = 10;
	int result;
	
	Div frame = new Div();
	Span textfield = new Span();
	Span textarea = new Span();
	Button chooseA = new Button("A");
	Button chooseB = new Button("B");
	Button chooseC = new Button("C");
	Button chooseD = new Button("D");
	Label answer_labelA = new Label(); 
	Label answer_labelB = new Label();
	Label answer_labelC = new Label();
	Label answer_labelD = new Label();
	Span number_right = new Span();
	Div optionA;
	Div optionB;
	Div optionC;
	Div optionD;
	Button nq = new Button("Next Question");
	
	List<Integer> randomizedIndexes = RandomizeSet.genRandomizedIndexes(questionsRaw.length);
	
	List<String> questions;
	List<String[]> options;
	List<Character> answers;
	
	public Quiz() {
		
		setClassName("game-component");
		
		List<String> cleanQuestions = Arrays.asList(questionsRaw);
		List<String[]> cleanOptions = Arrays.asList(optionsRaw);
		List<Character> cleanAnswers = Arrays.asList(answersRaw);
		
		
		
		
		questions  = RandomizeSet.randomize(cleanQuestions, randomizedIndexes);
		options = RandomizeSet.randomize(cleanOptions, randomizedIndexes);
		answers = RandomizeSet.randomize(cleanAnswers, randomizedIndexes);
		
//		Change frame background in css
//		frame.getContentPane().setBackground(new Color(255,255,255));
		frame.addClassName("game-frame");
		
		textfield.addClassName("question-number--label");
		
		textfield.getElement().setAttribute("contenteditable", false);
		
//		textfield.setWidth("650px");
//		textfield.setHeight("50px");
//		textfield.setBackground(new Color(15, 58, 109));
//		textfield.setForeground(new Color(255,255,255));
//		textfield.setFont(new Font("Tahoma", Font.PLAIN,25));
//		textfield.setBorder(BorderFactory.createBevelBorder(1));
//		textfield.setHorizontalAlignment(JTextField.CENTER);
//		textfield.setEditable(false);
		
		textarea.addClassName("question-label");
		
//		textarea.setBounds(0,50,650,50);
//		textarea.setWidth("650px");
//		textarea.setHeight("50px");
//		textarea.setLineWrap(true);
//		textarea.setWrapStyleWord(true);
//		textarea.setBackground(new Color(59, 89, 182));
//		textarea.setForeground(new Color(255,255,255));
//		textarea.setFont(new Font("Corbel", Font.BOLD,15));
//		textarea.setBorder(BorderFactory.createBevelBorder(1));
//		textarea.setEditable(false);
		
//		chooseA.setBounds(0,100,100,100);
		chooseA.addClickListener(this::actionPerformed);
		chooseA.addClassName("option");
//		chooseA.setBackground(new Color(59, 89, 182));
//        chooseA.setForeground(Color.WHITE);
//        chooseA.setFocusPainted(false);
//        chooseA.setFont(new Font("Corbel", Font.BOLD, 35));
		
//		chooseB.setBounds(0,200,100,100);
		chooseB.addClickListener(this::actionPerformed);
		chooseB.addClassName("option");
//		chooseB.setBackground(new Color(59, 89, 182));
//        chooseB.setForeground(Color.WHITE);
//        chooseB.setFocusPainted(false);
//        chooseB.setFont(new Font("Corbel", Font.BOLD, 35));
		
//		chooseC.setBounds(0,300,100,100);
		chooseC.addClickListener(this::actionPerformed);
		chooseC.addClassName("option");
//		chooseC.setBackground(new Color(59, 89, 182));
//        chooseC.setForeground(Color.WHITE);
//        chooseC.setFocusPainted(false);
//        chooseC.setFont(new Font("Corbel", Font.BOLD, 35));
		
//		chooseD.setBounds(0,400,100,100);
		chooseD.addClickListener(this::actionPerformed);
		chooseD.addClassName("option");
//		chooseD.setBackground(new Color(59, 89, 182));
//        chooseD.setForeground(Color.WHITE);
//        chooseD.setFocusPainted(false);
//        chooseD.setFont(new Font("Corbel", Font.BOLD, 35));
		
		answer_labelA.addClassName("option-label");
//		answer_labelA.setBounds(125,100,500,100);
//		answer_labelA.setBackground(new Color(50,50,50));
//		answer_labelA.setForeground(new Color(51,204,255));
//		answer_labelA.setFont(new Font("Corbel", Font.PLAIN, 20));

		answer_labelB.addClassName("option-label");
//		answer_labelB.setBounds(125,200,500,100);
//		answer_labelB.setBackground(new Color(50,50,50));
//		answer_labelB.setForeground(new Color(51,204,255));
//		answer_labelB.setFont(new Font("Corbel", Font.PLAIN, 20));
//		
		answer_labelC.addClassName("option-label");
//		answer_labelC.setBounds(125,300,500,100);
//		answer_labelC.setBackground(new Color(50,50,50));
//		answer_labelC.setForeground(new Color(51,204,255));
//		answer_labelC.setFont(new Font("Corbel", Font.PLAIN, 20));
//		
		answer_labelD.addClassName("option-label");
//		answer_labelD.setBounds(125,400,500,100);
//		answer_labelD.setBackground(new Color(50,50,50));
//		answer_labelD.setForeground(new Color(51,204,255));
//		answer_labelD.setFont(new Font("Corbel", Font.PLAIN, 20));
//
		number_right.setClassName("score-display");
//		number_right.setBounds(225,225,200,100);
//		number_right.setBackground(new Color(25,25,25));
//		number_right.setForeground(new Color(25,255,0));
//		number_right.setFont(new Font("Corbel",Font.BOLD,50));
//		number_right.setBorder(BorderFactory.createBevelBorder(1));
//		number_right.setHorizontalAlignment(JTextField.CENTER);
//		number_right.setEditable(false);
		
		nq.addClickListener(e -> {
			answer_labelA.setClassName("answer--default");
			answer_labelB.setClassName("answer--default");
			answer_labelC.setClassName("answer--default");
			answer_labelD.setClassName("answer--default");
			
			answer_labelA.addClassName("option-label");
			answer_labelB.addClassName("option-label");
			answer_labelC.addClassName("option-label");
			answer_labelD.addClassName("option-label");
			
			answer = ' ';
			chooseA.setEnabled(true);
			chooseB.setEnabled(true);
			chooseC.setEnabled(true);
			chooseD.setEnabled(true);
			index++;
			nextQuestion();
		});
		
		

		
		frame.add(textfield);
		frame.add(textarea);
		
		optionA = new Div(answer_labelA, chooseA);
		optionA.setClassName("option-container");
		
		optionB = new Div(answer_labelB, chooseB);
		optionB.setClassName("option-container");
		
		optionC = new Div(answer_labelC, chooseC);
		optionC.setClassName("option-container");
		
		optionD = new Div(answer_labelD, chooseD);
		optionD.setClassName("option-container");
		
		frame.add(optionA);
		frame.add(optionB);
		frame.add(optionC);
		frame.add(optionD);
		frame.add(nq);

		frame.setVisible(true);
		
		
		nextQuestion();
		
		add(frame);
		
	}
	public void nextQuestion() {
		
		if(index >= TQuestions) {
			results();
		}
		
		else {
			textfield.setText("QUESTION " + (index+1));
			textarea.setText(questions.get(index));
			answer_labelA.setText(options.get(index)[0]);
			answer_labelB.setText(options.get(index)[1]);
			answer_labelC.setText(options.get(index)[2]);
			answer_labelD.setText(options.get(index)[3]);

		}
	}
	public void actionPerformed(ClickEvent<Button> e) {
		
		chooseA.setEnabled(false);
		chooseB.setEnabled(false);
		chooseC.setEnabled(false);
		chooseD.setEnabled(false);
		
		if(e.getSource() == chooseA) {
			answer = 'A';
			if(answer == answers.get(index)) {
				right_answers++;
				//answer_labelA.setForeground(new Color(255,0,0));
			}
		}

		if(e.getSource() == chooseB) {
			answer = 'B';
			if(answer == answers.get(index)) {
				right_answers++;
			}
		}
		
		if(e.getSource() == chooseC) {
			answer = 'C';
			if(answer == answers.get(index)) {
				right_answers++;
			}
		}
		
		if(e.getSource() == chooseD) {
			answer = 'D';

			if(answer == answers.get(index)) {
				right_answers++;			
				
			}
		}
		showChoice();
	}
	
	public void showChoice() {
		
		chooseA.setEnabled(false);
		chooseB.setEnabled(false);
		chooseC.setEnabled(false);
		chooseD.setEnabled(false);
		
		if(answers.get(index) == 'A')
			answer_labelA.addClassName("answer--correct");
		else if (answers.get(index) != 'A' && answer != answers.get(index))
			answer_labelA.addClassName("answer--incorrect");
		
		if(answers.get(index) == 'B')
			answer_labelB.addClassName("answer--correct");
		else if (answers.get(index) != 'B' && answer != answers.get(index))
			answer_labelB.addClassName("answer--incorrect");
		
		if(answers.get(index) == 'C')
			answer_labelC.addClassName("answer--correct");
		else if (answers.get(index) != 'C' && answer != answers.get(index)) 
			answer_labelC.addClassName("answer--incorrect");
		
		if(answers.get(index) == 'D')
			answer_labelD.addClassName("answer--correct");
		else if (answers.get(index) != 'D' && answer != answers.get(index))
			answer_labelD.addClassName("answer--incorrect");
		
	}
	
	public void results() {
		
		frame.remove(optionA, optionB, optionC, optionD, textarea, nq);
		
		result = (int)((right_answers/(double)TQuestions)*100);
		
		textfield.setText("Your Score");

		number_right.setText("("+right_answers+"/"+TQuestions+")");
		frame.add(number_right);
		
	}
	
	public static class RandomizeSet {
		static List<Integer> genRandomizedIndexes(int n) {
			int[] standardIndex = createIndexArray(n);
			List<Integer> randomizedIndexes = new ArrayList<>(n);
			for ( int i = 0; i < n; i++) {
				int num = (int) Math.floor(Math.random() * (float) (n - i)); 
				int selected = standardIndex[num];
				randomizedIndexes.add(selected);
				if (standardIndex.length > 0)
					standardIndex = Arrays.stream(standardIndex).filter(value -> value != selected).toArray();
				
			}

			return randomizedIndexes;
			
			
		}
		
		public static <T> List<T> randomize(List<T> values, List<Integer> randomizedIndexes) {
			int n = randomizedIndexes.size();
			List<T> randomizedSet = new ArrayList<>(n);
			
			for (int i = 0; i < n; i++) {
				randomizedSet.add(values.get(randomizedIndexes.get(i)));
			}
			
			return randomizedSet;
				
		}
	 
		static int[] createIndexArray(int n) {
		    int[] standardIndex = new int[n];
		    for (int i = 0; i < n; i++) {
		        standardIndex[i] = i;
		    }
		    return standardIndex;
		}
	}
}