# WordWise

### Advanced Java Topics With Android Studio
#### 10/04/2019

> The Congressional App Challenge is a Congress authorized competition, where districts in the states take part in creating or presenting a technological artifacts. Your submission will include this, a demostration video, and a few short answer responses within the application.

Development in **Android Studio**

## Congressional App Challenge

###### 1. Explain the app’s purpose in ONE sentence (140 characters max).

> To assist students in studying terms, ideas, or concepts. 

###### 2. What inspired you to create this app? (200 characters max)

> From my perspective, my fellow classmates have a lot to do and not much time to do it. They mostly use their phones for communication, checking grades, or view teacher's posts and assignments. Sometimes, instead of revising notes or rereading a chapter, you can create flashcards with a few terms or ideas at a time to study in short sessions. I thought of how most people have a phone and simply use an app to do so.  With all these factors combined, I ended up creating this app!

###### 3. What is your app trying to accomplish? (200 characters max)

> WordWise is studying tool that allows for five terms or definitions etc. and creates flash cards to study from. The app asks for user input and progressively displays information to confirm. Once everything has been placed and confirmed, the program will store that and pass it to the next activity. Then finally, all the data will be stored in order and displayed for the user on screen. You have the choose to continue studying or reset and add into a new set of words. 

###### 4. What technical/coding difficulty did you face in programming your app, and how did you address this technical challenge? (1500 characters max.) 

> Most of my problems stem from organizing its functionality and transfer of data. I had originally planned to include a single EditText to take in information. However, when I manipulated multiple sets in an array with just one, my program crashed. I continued to play with different possibilities but to no avail. A small change to include more EditTexts fixed this problem, however, it's not something I find favorable. Also, the transfer of information was tough. Initially, it was simple. I had to create an Intent, which I did anyways to change screens. But now, I had to add a method to that new intent that places my array into a library and is then retrieved in the next activity. I tried to pass two arrays with the same method but everything crashed. I figured I could add the two arrays together and create just one to transfer over. It would also make it easier for me cycle through the values.
