# mongodb-kotlin
A simple Kotlin class to use to connect to a MongoDB collection.

Once you have created a MongoDB project, choose Build a Database:

![image](https://user-images.githubusercontent.com/27728504/147720796-fa08e3c1-6cc3-428c-9350-8d27b8c74d58.png)

Next, choose the free "Shared" option and scroll all the way down:

![image](https://user-images.githubusercontent.com/27728504/147720840-66c880ab-bbb8-4c0a-8f59-30e73236c78f.png)

Expand "Cluster Name" and pick a cool name for your cluster. I'll leave it as the default.
Now, we need to create a seperate username and password so our code can access this database.

![image](https://user-images.githubusercontent.com/27728504/147720874-de8850a0-e644-4f88-97d1-cdc8c9752a08.png)

Click create user once you're done and be sure to select Cloud Environment as your connection location.

![image](https://user-images.githubusercontent.com/27728504/147720943-c91acded-165a-49f1-94cc-fdc80960b5b9.png)

Lastly, add "0.0.0.0/0" as an IP Address.

![image](https://user-images.githubusercontent.com/27728504/147722020-8f9fa246-1aae-466a-9def-32317c572acb.png)

At the bottom, click Finish and Close.
Once it's ready, click Browse Collections and Add My Own Data.
![image](https://user-images.githubusercontent.com/27728504/147722060-aaceca26-1adb-4d20-bf9f-1cbbe37c9d9c.png)

You'll need to pick a name for your database and it's collection. Don't forget them.
Now click overview and then CONNECT:

![image](https://user-images.githubusercontent.com/27728504/147722135-8870ba6b-6f44-4fec-87cf-20ae9a8bb0bd.png)
![image](https://user-images.githubusercontent.com/27728504/147722147-44399d6a-373d-4404-b440-01acc24af2f0.png)

Choose Connect your application:

![image](https://user-images.githubusercontent.com/27728504/147722166-921a8d64-88fa-4209-a9a6-94142e940af7.png)

All you will need from this is the bit of text from the "@" symbol to where it says "mongodb.net" (it should look like "clusterName.random stuff"):

![image](https://user-images.githubusercontent.com/27728504/147722210-02c77b19-1f1e-416e-a2cd-0d162d27e0dd.png)

Now you're ready to write some code.

When you create an instance of the MongoDB class, put in the username and password we just made:

`MongoDB(LoginInfo("myUsername", "mySecurePassword"), "cluster", "MyDatabaseName")`
"cluster" is that string we found in the very last step.
"MyDatabaseName" is the one you chose along with the collection name.
Check the Example.kt for more information.
