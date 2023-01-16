# Homework Answers

1. What is responsible for defining the routes of the games resource? - **The 'helpers.create_router.js' file**
2. What do you notice about the folder structure? Whats the client responsible for? Whats the server responsible for? - **The client part of the folder structure is responsible for everything that would be shown on screen, and the server part seems to be more focused on data persistance**
3. What are the the responsibilities of server.js? - **Connecting to the MongoDB database, handling CORS errors, and instantiating the gamesRouter, and ensuring it perpetually listens to the server.**
4. What are the responsibilities of the gamesRouter? - **Creating the default API end point and connecting all of the api end-points to the rest of the app**
5. What process does the the client (front-end) use to communicate with the server? - **An API fetch request method**
6. What optional second argument does the fetch method take? And what is it used for in this application? Hint: See Using Fetch on the MDN docs - **It is an init object that allows you to control various settings, such as the method type, any headers required, and a json body**
7. Which of the games API routes does the front-end application consume (i.e. make requests to)? - **Get all (getGames), Post (postGame) and Delete (deleteGame)**
8. What are we using the MongoDB Driver for? = **It allows the application to connect to MongoDB and work with data**