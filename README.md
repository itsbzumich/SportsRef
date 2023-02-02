# Sports Reference Application
Application for Sports Reference Engineer Intern (NOTE UPDATED ON 2/1/2023)

This program takes a JSON file in the format described in the prompt. It creates a table with the format described in the prompt. The current print statement prints the output in the correct locations, but doesn't print it out in a "table". It simply has the values in the correct locations in a 2-D array as if each element were a box in the table.

We accomplish this through JSONParser, JSONArray, and JSONObjects. We initially create a JSONObject and initialize it to the JSONFile. From here, we create a variable that stores the size, which is the total amount of teams. Given the size, we can initialize and 2-D array that represents the table we will put our data in, as well as an array to store our team names.

The next step would be to obtain the name of the teams. To do this, we create an iterator that can iterate through all the JSON objects within the JSON file. We store all the team names in a 1-D array. Taking the key name of each object, we add this to our array. To list the team names in alphabetical order, we sort our array. Then, we add the team names to our table in the correct order. Finally, to know which index on the table each team is, we create a HaspMap that stores an integer representing the index of each team based on the key, a string of the team name.

The next step is to fill our table with the correct values. We first fill in all indexes with team1=team2 with "--," as the same team can't play itself. Then, we run a nested while loop. The first while loops go through all the possible combinations of (team1, results). Based on team1, we know who the results belong to. The results represent another JSON object we must loop through. Thus, we create another iterator to traverse the results. Each result will contain team2 and how many wins/losses team1 had against team2. Now that we have our data, we can use our HashMap to locate the indexes in the table of team1 and team2. Our last step will be to set each value in the table and continue to iterate.

Finally, we print out our table!

Thank you very much. I'm excited for this opportunity!
