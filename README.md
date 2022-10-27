# Lab2_Q1_COSC341
Lab 2: Multiview Applications (20 marks + 2 bonus marks)  
 
The purpose of this lab is to learn how to create Android multi-view applications and Android Intents.  
Configuration note: 
When  you  create  your  app  on  Android  Studio,  be  sure  to  select  the  option  "Phone  and  Tablet". 
Assignments will be marked using an Android Virtual Device (AVD) running a  Pixel 3a with API 33. 
You must use Android Studio (with Java as the programming language), this is what the TAs will use 
to load, build, and run your code. 
Submission note: 
Upload a zip file containing the following folders to Canvas: Code and APK.  
- The  Code  folder  should  include two  subfolders:  Question  1  and  Question  2  with  the 
corresponding Android code.  
- APK folder should only contain two .apk files.  

Question 1 (15 marks): 

Create  two  blank/empty  activities.  In  the  first  activity,  add  the  following  UI  components  to  allow  a 
student to enter their information: 
- A logo of the University of British Columbia at the top of the activity. Use the Narrow Signature logo 
- An edit text widget to enter an 8-digit student number  
- An edit text widget to enter the last name  
- Another edit text widget to enter the first name  
- Radio buttons to enter gender information (At least two radio buttons) 
- A dropdown list to select a division (at least three names, e.g., COSC, DATA, MATH) 
- A checkbox with a text “I am not a robot” 
Add  a  “Submit”  button  in  this  activity.  If  the  student  doesn’t provide an  8-digit  student  number  or 
doesn’t enter the first and last name, show a Toast message asking to provide the correct information. 
Show only one toast message if multiple fields are empty. For instance, if none of the information is 
provided, only show a toast message asking to provide an 8-digit student number. Additionally, the 
checkbox  must  be  checked  before  the  student  can  navigate  to  the  second  activity.  Show  a  toast 
message if the checkbox is not checked. When the student enters all the information and presses the 
submit button, the application opens the second activity.  
The second activity shows the previously entered information (e.g., student number, student name, 
gender,  and  division)  with  multiple  text  views.  The  second  activity  also  includes  a  button  called 
“Done”. When the student presses the button, the application takes the student to the first activity. 
Note  that  the  first  activity  shouldn’t  show  any  previously  entered  information  when  the  student 
returns from the second activity. 
Note: Android drawables should be in the drawable folder under resources and become variables 
based on the name. Make sure the image name does not start with a number. 

Grading Criteria 

[1 mark] University logo at the top of the first activity 

[1 mark] Three edit text widgets to enter student name and student number 

[1 mark] Radio buttons to capture gender information 

[1 mark] A spinner showing faculty information 

[6 marks] Input validations with toast message for student number, name and the checkbox 

[1 mark] Functional “Submit” button 

[2 marks] Second activity showing all the information entered in the first activity.  

[1 mark] Functional “Done” button 

[1 mark] Clearing previously entered information when returning from the second activity  
