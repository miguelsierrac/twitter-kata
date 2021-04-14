# twitter-kata

## Rules:
One level of indentation per method
Don’t use the ELSE keyword
Wrap all primitives and Strings
First class collections
One dot per line
Don’t abbreviate
Keep all entities small (50 lines)
No classes with more than two instance variables
No getters/setters/properties
For more information, see: Object Calisthenics pdf

## Social Networking Kata
IMPORTANT: Implement the requirements focusing on writing the best code you can produce.

### First Stage: Core Scenarios

Feature: Publishing
   Scenario: Alice publishes messages to her personal timeline.   
When Alice publishes "I love the weather today." 5 minutes ago
      Then Alice’s timeline has:
         "I love the weather today. (5 minutes ago)"
      
Feature: Reading
   Scenario: Bob can view Alice’s timeline.
      Given Alice has published "I love the weather today." 5 minutes ago
      When Bob views Alice's timeline
      Then Bob sees:
         I love the weather today. (5 minutes ago)

Feature: Following
   Scenario: Charlie can subscribe to Alice’s and Bob’s timelines.
	When Charlie follows Alice
	And Charlie follows Bob
	Then Charlie is a Allice’s follower
	And Charlie is a Bob’s follower

Feature: Wall
   Scenario: Charlie can view on his wall an aggregated list of all subscriptions.
	Given Alice has published "I love the weather today." 5 minutes ago
      And Bob has published "Damn! We lost!" 1 minute ago
      And Bob has published "Good game though." 2 minutes ago
      And Charlie has published "I'm in New York today! Anyone wants to have a coffee?" 15 seconds ago
      And Charlie follows Alice
      And Charlie follows Bob
      When Charlie views his wall
      Then Charlie sees:
         Charlie - I'm in New York today! Anyone wants to have a coffee? (15 seconds ago)     
         Bob - Good game though. (1 minute ago)     
         Bob - Damn! We lost! (2 minutes ago)     
         Alice - I love the weather today (5 minutes ago)

### Second Stage: Add an Android or iOS GUI
Expose the existing features (posting, reading, following and wall) through a very simple Mobile app. No elaborate UI design or animations are needed at all.
Use the code written so far as a library. Put it in its own module/framework and add it as a dependency to the mobile application. You may tweak the existing code before beginning this iteration, but try not to change it in this iteration after you begin.
Use whatever language and frameworks you want. (provide instructions on how to run the application)
