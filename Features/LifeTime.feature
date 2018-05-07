Feature: LifeTime website Cross browser automation 
Scenario Outline: Verifying text in basket ball tab  

	Given user selects "<browserName>","<browserDescription>" and "<driverLocation>" and navigates to Lifetime website 
	When user navigates to basketball tab under the sports tab 
	
	Then user verifies the message 'premier Basketball Court' is available or not 
	
	Examples: 
		|browserName|browserDescription|driverLocation|
		|Chrome|webdriver.chrome.driver|./browserDrivers/chromedriver.exe|
		|Firefox|webdriver.gecko.driver|./browserDrivers/geckodriver.exe|
		|IE|webdriver.ie.driver|./browserDrivers/IEDriverServer.exe|