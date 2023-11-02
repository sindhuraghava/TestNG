Feature: blog

	Scenario: Validate blog entering functionality
		Given user is in blog page
		When user enters data in search field
		Then data should appear in search field