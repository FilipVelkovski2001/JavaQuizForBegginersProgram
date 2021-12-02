import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		int score = 0;
		
		System.out.println("Welcome to a quick Java Begginers Quiz!");
		
		System.out.println("");
		
		System.out.println("Here is the grading system:");
		
		System.out.println("");
		
		System.out.println("0 points = F");
		System.out.println("1 - 3 points = D");
		System.out.println("4 - 5 points = E");
		System.out.println("6 - 7 points = C");
		System.out.println("8 - 10 points = B");
		System.out.println("11 - 12 points = A");
		
		System.out.println("");
		
		System.out.println("Are you ready? Yes or No");
		
		Scanner s1 = new Scanner(System.in);
		String start = s1.nextLine();
		
		while(!start.equalsIgnoreCase("yes") && !start.equalsIgnoreCase("no")) {
			
			System.err.println("Choose yes or no!");
			start = s1.nextLine();
		}
		
		if(start.equalsIgnoreCase("Yes")) {
			
			System.out.println("");
			
			Questions q = new Questions();
			q.questionOne();
			
			String q1 = s1.nextLine();
			
			while(!q1.equalsIgnoreCase("A") && !q1.equalsIgnoreCase("B") && !q1.equalsIgnoreCase("C") && !q1.equalsIgnoreCase("D")) {
				
				System.err.println("You have to choose between A, B, C and D!");
				
				q1 = s1.nextLine();
				
			}
			
			while(q1.equalsIgnoreCase("B")) {
	
				score++;
				break;
			}
			
			q.questionTwo();
			
           String q2 = s1.nextLine();
			
			while(!q2.equalsIgnoreCase("A") && !q2.equalsIgnoreCase("B") && !q2.equalsIgnoreCase("C") && !q2.equalsIgnoreCase("D")) {
				
				System.err.println("You have to choose between A, B, C and D!");
				
				q2 = s1.nextLine();
				
			}
			
			while(q2.equalsIgnoreCase("B")) {
	
				score++;
				break;
			}
			
			q.questionThree();
			
			String q3 = s1.nextLine();
			
           while(!q3.equalsIgnoreCase("A") && !q3.equalsIgnoreCase("B") && !q3.equalsIgnoreCase("C") && !q3.equalsIgnoreCase("D")) {
				
				System.err.println("You have to choose between A, B, C and D!");
				
				q3 = s1.nextLine();
				
			}
			
			while(q3.equalsIgnoreCase("D")) {
	
				score++;
				break;
			}
			
         q.questionFour();
			
         String q4 = s1.nextLine();
			
         while(!q4.equalsIgnoreCase("A") && !q4.equalsIgnoreCase("B") && !q4.equalsIgnoreCase("C") && !q4.equalsIgnoreCase("D")) {
				
				System.err.println("You have to choose between A, B, C and D!");
				
				q2 = s1.nextLine();
				
			}
			
			while(q4.equalsIgnoreCase("A")) {
	
				score++;
				break;
			}
			
			q.questionFive();
			
	         String q5 = s1.nextLine();
				
	         while(!q5.equalsIgnoreCase("A") && !q5.equalsIgnoreCase("B") && !q5.equalsIgnoreCase("C") && !q5.equalsIgnoreCase("D")) {
					
					System.err.println("You have to choose between A, B, C and D!");
					
					q5 = s1.nextLine();
					
				}
				
				while(q5.equalsIgnoreCase("A")) {
		
					score++;
					break;
				}
				
				q.questionSix();
				
		         String q6 = s1.nextLine();
					
		         while(!q6.equalsIgnoreCase("A") && !q6.equalsIgnoreCase("B") && !q6.equalsIgnoreCase("C") && !q6.equalsIgnoreCase("D")) {
						
						System.err.println("You have to choose between A, B, C and D!");
						
						q6 = s1.nextLine();
						
					}
					
					while(q6.equalsIgnoreCase("C")) {
			
						score++;
						break;
					}
					
					q.questionSeven();
					
			         String q7 = s1.nextLine();
						
			         while(!q7.equalsIgnoreCase("A") && !q7.equalsIgnoreCase("B")) {
							
							System.err.println("You have to choose between A and B!");
							
							q7 = s1.nextLine();
							
						}
						
						while(q7.equalsIgnoreCase("B")) {
				
							score++;
							break;
						}
						
						q.questionEight();
						
				         String q8 = s1.nextLine();
							
				         while(!q8.equalsIgnoreCase("A") && !q8.equalsIgnoreCase("B") && !q8.equalsIgnoreCase("C") && !q8.equalsIgnoreCase("D")) {
								
								System.err.println("You have to choose between A, B, C and D!");
								
								q8 = s1.nextLine();
								
							}
							
							while(q8.equalsIgnoreCase("D")) {
					
								score++;
								break;
							}
							
							q.questionNine();
							
					         String q9 = s1.nextLine();
								
					         while(!q9.equalsIgnoreCase("A") && !q9.equalsIgnoreCase("B") && !q9.equalsIgnoreCase("C") && !q9.equalsIgnoreCase("D")) {
									
									System.err.println("You have to choose between A, B, C and D!");
									
									q9 = s1.nextLine();
									
								}
								
								while(q9.equalsIgnoreCase("D")) {
						
									score++;
									break;
								}
								
								q.questionTen();
								
						         String q10 = s1.nextLine();
									
						         while(!q10.equalsIgnoreCase("A") && !q10.equalsIgnoreCase("B")) {
										
										System.err.println("You have to choose between A and B!");
										
										q10 = s1.nextLine();
										
									}
									
									while(q10.equalsIgnoreCase("A")) {
							
										score++;
										break;
									}
									
									q.questionEleven();
									
							         String q11 = s1.nextLine();
										
							         while(!q11.equalsIgnoreCase("A") && !q11.equalsIgnoreCase("B") && !q11.equalsIgnoreCase("C")) {
											
											System.err.println("You have to choose between A, B and C!");
											
											q11 = s1.nextLine();
											
										}
										
										while(q11.equalsIgnoreCase("C")) {
								
											score++;
											break;
										}
										
										q.questionTwelve();
										
								         String q12 = s1.nextLine();
											
								         while(!q12.equalsIgnoreCase("A") && !q12.equalsIgnoreCase("B") && !q12.equalsIgnoreCase("C")) {
												
												System.err.println("You have to choose between A, B and C!");
												
												q12 = s1.nextLine();
												
											}
											
											while(q12.equalsIgnoreCase("B")) {
									
												score++;
												break;
											}
											
											if(score == 0) {
												
												System.out.println("");
												System.out.println("Your score is: " + score + " Your grade is a F wow :O" );
												
											}
											else if(score == 1 || score == 2 || score == 3) {
											
												System.out.println("");
												System.out.println("Your score is: " + score + " Your grade is a E you barely studied" );
												
											}
											else if(score == 4 || score == 5) {
											
												System.out.println("");
												System.out.println("Your score is: " + score + " Your grade is a D you should study more" );
											}
											else if(score == 6 || score == 7) {
											
												System.out.println("");
												System.out.println("Your score is: " + score + " Your grade is a C average :)" );
											}
											else if(score == 8 || score == 9 || score == 10) {
											
												System.out.println("");
												System.out.println("Your score is: " + score + " Your grade is a B you are very good :D ");
											}
											else if(score == 11) {
											
												System.out.println("");
												System.out.println("Your score is: " + score + " Your grade is a A you are excellent! :D ");
											}
											else if(score == 12) {
											
												System.out.println("");
												System.out.println("Your score is: " + score + " Your grade is a A you also got all the questions right wow you are amazing! :D");
											}
											
											
											

												
												

												
						
					


			
			
			
			
			
			
		}
		
		else {
			
			System.out.println("");
			System.err.println("ok bye :(");
			
		}
		
		
		
		
		
		

	}

}
