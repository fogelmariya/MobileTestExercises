1.	For existing native mobile autotest try to use another locator (xpath, classname, ?). Define these locators using 
Appium Inspector. Are there any difference with id version?

No, all work same

2.	Modify existing tests to run on a real device. What should be changed? 
deviceName should be changed

3.	Connect a real device to Appium (describe required actions) and run tests. 
Are there any difference with run on emulator?

I didn't see any difference, may be it is slower. But device must be unlocked

4.	What should be improved/changed in existing test code? Why, for what?

We should use Page Object. And we should check something: that new page have opened after clicking.