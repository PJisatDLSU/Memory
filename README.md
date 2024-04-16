# Memory

This is a flashcard application. It follows a Tree-Root Graph with subjects at the top that is split into subjects, that is further split into topics. An issue with this project is me not knowing how to add a feature where the user can add more subjects and topics and edit question and answers on a database. However I am lazy. So everything is hard coded. 

THIS IS A WORK IN PROGRESS APP, ALWAYS UPDATING FROM MAY-AUGUST

## To Add Subjects
1. Setting Up Button
   - Set ID tag for the button
   - ex: subject1
2. Create a Page
   - Right click on App
   - New>Activity>Empty Views Activity
   - Name file
   - ex: sub1
3. Copy paste this to the MainActivity.kt
```kotlin
val sub1BTN =findViewById<Button>(R.id.subject1)
sub2BTN.setOnClickListener{
            val Page2 = Intent(this, sub1::class.java)
            startActivity(Page2)
        }'''
- Be sure to edit the necessary changes such as tag and page link


