# XebiaAssignment

#To Run:

java YakShop herd.xml 13


#Assignment Input and Output

Input herd.xml:

	<herd>
		<labyak name="Betty-1" age="4" sex="f"/>
		<labyak name="Betty-2" age="8" sex="f"/>
		<labyak name="Betty-3" age="9.5" sex="f"/>
	</herd>

N.B. The age is given in standard Yak years

Your program should take 2 parameters:

1.	The XML file to read
2.	An integer T, representing the elapsed time in days. 
N.B. T=13 means that day 12 has elapsed, but day 13 has yet to begin

Output for T = 13:
	
	In Stock:
	    1104.480 liters of milk
	    3 skins of wool
	Herd:
	    Betty-1 4.13 years old
	    Betty-2 8.13 years old
	    Betty-3 9.63 years old

Output for T = 14:

	In Stock:
	    1188.810 liters of milk
	    4 skins of wool
	Herd:
	    Betty-1 4.14 years old
	    Betty-2 8.14 years old
	    Betty-3 9.64 years old

