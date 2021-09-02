# Westfield State University Dining App Project

This was an app made with a team of 5 in one of my classes for the campus's cafeteria. 
Requirements were to list the menues for the different dining locations.
Since the menues were updated every week, we had a back-end app hosted in AWS that parsed the HTML of the official cafeteria website and uploaded it to an AWS bucket in json format for us to use.
The team used the Agile development methodoloy and rotated scrum masters every 2 weeks, so that everyone had a chance. 
Due to the COVID lockdown, the cafeterias stopped updating their menus, causing our application to not have any data. 
To prevent the application from crashing, we made a fake menu with sample data which was tied to a specific date. This is why the application will probably crash if loaded.

## Main Menu

The main menu of the application is a list of cards that displays an image of the location, along with a brief description. 
Two buttons are also visible, one taking the user to the menu, and the other to a map of the campus with directions to the location. This was facilitated using the Google Maps API.

![](https://camo.githubusercontent.com/0f857c51e866029453575a7799f5c0cf7de3a75b7be87d53280f21ebe7f57306/68747470733a2f2f692e696d6775722e636f6d2f5a3661753673632e706e67)
![](https://camo.githubusercontent.com/315cc74982e01ded5b5f4ff47d526d0a68dee4ddbea6101eba14ed24495374d1/68747470733a2f2f692e696d6775722e636f6d2f57334c566478462e706e67)

## Events Screen

The events page lists the upcoming cafeteria events along with a brief description.

![](https://camo.githubusercontent.com/643176545d15182539dc1d5c78865fe6802439b68092da974d7f5589dedf6f9f/68747470733a2f2f692e696d6775722e636f6d2f4f52694b66774a2e706e67)

## Feedback Screen

The feedback screen allows the user to select the location for their feedback and enter a message. 
Pressing the `Send Email` button will open the user's default email application and input the location as the subject line, and their complaint into the message box.

![](https://camo.githubusercontent.com/e01802883ae4600f3388d642985d5207c744b9334654fbc058c3031a8031818f/68747470733a2f2f692e696d6775722e636f6d2f6a4b45525758532e706e67)

## Cafeteria Menu

This section displays the menu of the selected location based on a set of filters provided by the user. Possible filters are: date, time of day, nutritional information, and name.
Clicking on an item will display its nutritional information such as calories.

![](https://camo.githubusercontent.com/7b481596ddd7a5bb97a95b025c5cdc99b50cbbc15c62b554d227012354964d09/68747470733a2f2f692e696d6775722e636f6d2f764547424b4a432e706e67)
![](https://camo.githubusercontent.com/cad34e1cb5c489fd8865dcb7d19a6fbedb36ccbbf24a3054569582a762be191d/68747470733a2f2f692e696d6775722e636f6d2f526665315166482e706e67)
![](https://camo.githubusercontent.com/9e2a9506e793466728928e66db8ae4a3f695289cb52f53428127de85b9cd5956/68747470733a2f2f692e696d6775722e636f6d2f356e536b4130572e706e67)
![](https://camo.githubusercontent.com/9e2a9506e793466728928e66db8ae4a3f695289cb52f53428127de85b9cd5956/68747470733a2f2f692e696d6775722e636f6d2f356e536b4130572e706e67)

