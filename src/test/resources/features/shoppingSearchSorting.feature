Feature: Shopping Search Result Sorting
	
	@priceOrder
	Scenario Outline: Ascending price order verification in Search Result
	Given user goes to shopping homepage
	Then user searches for item "<item>"
	Then user verifies a message "<result>"
	And user selects sort by option "<sortByOption>"
	Then user verifies each result is sorted by lowest price first
	
	Examples:
	|item  |result	|sortByOption		 |
	|dress |7       |Price: Lowest first |
#	|short | 4		|Price: Lowest first |
#	|printed dress|5|Price: Lowest first |