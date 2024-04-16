# Memory

This is a flashcard application. It follows a Tree-Root Graph with subjects at the top that is split into subjects, that is further split into topics. An issue with this project is me not knowing how to add a feature where the user can add more subjects and topics and edit question and answers on a database. However I am lazy. So everything is hard coded. 

**THIS IS A WORK IN PROGRESS APP, ALWAYS UPDATING FROM MAY-AUGUST**

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
   - Be sure to edit the necessary changes such as tag and page link
   ```kotlin
   val sub1BTN =findViewById<Button>(R.id.subject1)
   sub2BTN.setOnClickListener{
               val Page2 = Intent(this, sub1::class.java)
               startActivity(Page2)
           }

4. In the xml file
   - Change to RelativeLayout
   - Copy and Edit this code from previous activity_sub1.xml

## To Add Lessons
1. Setting Up Button
   - Set ID for the button
   - ex: lesson1
2. Create a Page
   - Right click on App
   - New>Activity>Empty Views Activity
   - Name file
   - ex: sub2_lesson1
3. Copy paste this to the subject.kt
- IMPORTS
   ```kotlin
   import android.content.Intent
   import android.os.Bundle
   import android.widget.Button
   import androidx.activity.enableEdgeToEdge
   import androidx.appcompat.app.AppCompatActivity
   import androidx.core.view.ViewCompat
   import androidx.core.view.WindowInsetsCompat```
- CODE - adjust the tag and file name to the correct one
   ```kotlin
   val l1 = findViewById<Button>(R.id.lesson1)
   
           l1.setOnClickListener{
               val Page1 = Intent(this, sub2_lesson1::class.java)
               startActivity(Page1)
           }

4. Adding the Questions and Answers
- Inside the sub2_lesson1 file that you created, copy the code from previous subx_lessonx.kt file
- Change the follows:
  - Database for the Questions and Answer
    ```kotlin
    private val table = arrayOf(
        arrayOf(1, "What is the fullname of PJ?", "Philip Jeremiah Caleon"),
        arrayOf(2, "How old is he right now (2024)?", "23"),
        arrayOf(3, "What is 9 + 10?", "21")
    )

    private val database = mutableListOf("1", "2", "3")
   - The title of the page
     ```kotlin
     topicTitle.text = "Lesson 1" 
     

