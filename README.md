This repository contains the final project for the Object Oriented Programming class in my Computer Engineering course made in the 2022/2023 school year.

The objective was to create a database system, using Java object principles (with a heavy focus on polymorfism), to aid a fictional company, "StarThrive", in it's work of managing other companies' profits, losses etc...

## Preview

![Menu Panel](/screenshots/menu.png)
![List Panel](/screenshots/list.png)
![Edit Panel](/screenshots/edit.png)

## Get Started

Make sure you have the JDK (Java Development Kit) installed, this project was created and tested on version 17.0.4.1 so check if you have a compatible version.

Download the code files and and extract the "src" folder, then run the [main.java](/src/Main.java) inside.

## How to use

Upon running the code the program will load the options and array save files from the [data](/src/data) folder. If no option save file is found, the defaults will be created and used, if there is no array object file (StarThive.dat) it's .txt version will be searched for and parsed, if also not found an empty one will be created.

After the save load you will find yourself in the main menu. From here you can go to options panel, access the database itself, or simply exit the program.

In the database panel you can perfom a large variety of operations to the companies stored in the system. In the center you will find the table containing all of the saved and currently editable entries. On the top you will find two combo boxes, the left one let's you sort the entries by their types and subtypes while the right one let's you sort them based on a varierty of each one's attributes. On the left you can see four buttons, the first one let's you create a new entry, the second one let's you edit a selected entry from the table, the third one deletes the selected entry and the last one shows details for the attributes of the selected entry.

In the options panel you can change the theme and style of the aplication as well as toggle the fullscreen mode on or off. You can also enable/disable autosaving and exit confirmation.

## Asset credits

The gifs included were made by [Pixel perfect](https://www.flaticon.com/authors/pixel-perfect) from [www.flaticon.com](http://www.flaticon.com/)
