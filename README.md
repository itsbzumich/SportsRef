# SportsRef
Application for Sports Reference Engineer Intern

This program takes a JSON file in the format described in the prompt. It creates a table with the format described in the prompt. The current print statement prints the output in the correct locations, but doesn't print it out in a "table". It simply has the values in the correct locations in a 2-D array as if each element were a box in the table.

We accomplish this through JSONParser, JSONArray, and JSONObjects. We initially create a JSONObject and initialize it to the JSONFile. From here, we can take the size, which is the total amount of teams. Given the size, we can initialize and 2-D array that represents the table we will put our data in, as well as an array to store our team names.

The next step would be to obtain the name of the teams. To do this, we create an iterator that can iterate through all the JSON objects within the JSON file. Taking the key name of each object, we add this to our array. To have the team names in alphabetical order, we sort our array. Finally, to know where on the table each team is, we create a HaspMap that stores an integer representing the index of each team based on the key, a string of the team name.

