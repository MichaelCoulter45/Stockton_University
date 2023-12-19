/*
 * 1. Display "start game"
2. Display "welcome to level 1"
        score = 0
        
	3. num1 = random number generator (1-9)
	4. num2 = random number generator (1-9)
	5. answer = num1 +num2
	6. Check is answer < 10? Yes or No
		7-1. if yes, Display question 
        example: what is num1+num2?
		8. response = student's answer
		9  if(response == answer)?
		10. if yes, score++, attempt =0
				if (score < 5)
					repeat 3 to 9
				else
				move to level 2	
		11. if no: 
				display wrong 
				attempt++ 
				if (attempt < 2)
                        repeat 7-1 to 9	     	
                                else
					end game
                7-2. if no, repeat step 3 to 6

2. Display "welcome to level 2"
        score = 0
        
	3. num1 = random number generator (1-9)
	4. num2 = random number generator (1-9)
	5. answer = num1 +num2
	//6. Check is answer < 10? Yes or No
	7(//-1. if yes, )Display question 
        example: what is num1+num2?
		8. response = student's answer
		9  if(response == answer)?
	10. if yes, score++, attempt =0
				if (score < 5)
					repeat 3 to 9
				else
				move to level 3	
		11. if no: 
				display wrong 
				attempt++ 
				if (attempt < 2)
                        repeat 7-1 to 9	     	
                                else
					end game
              //  7-2. if no, repeat step 3 to 6

2. Display "welcome to level 3"
        score = 0
        
	3. num1 = random number generator (1-9)
	4. num2 = random number generator (1-9)
	5. answer = num1 - num2
	6. Check is answer >= 0? Yes or No
		7-1. if yes, Display question 
        example: what is num1+num2?
		8. response = student's answer
		9  if(response == answer)?
	10. if yes, score++, attempt =0
				if (score < 5)
					repeat 3 to 9
				else
				end game	
		11. if no: 
				display wrong 
				attempt++ 
				if (attempt < 2)
                        repeat 7-1 to 9	     	
                                else
					end game
                7-2. if no, repeat step 3 to 6
 */