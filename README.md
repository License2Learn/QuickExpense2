# QuickExpense2
# 
# This app is designed to allow users to register a new account and login via email and password.
# Once logged in the user will be sent to MainActivity and have access to 2 menu buttons, About and ViewUsers.
# About will display a simple message about the app.
# ViewUsers will start a new activity that should display all the users that have registered in the app.
# This feature is intended to be used under strict access, say for an admin, but that functionality isnt there yet.
# Also, the cursor that scans my database to load the users info into the display developed a bug i could not fix so it is commented out.
# You can find it under ViewUser.class line 61.
#
# Back on MainActivity you will see Add Expense, Delete Expense, Bar Graph, Pie Graph, Edit Profile, and Log Out.
# These are all buttons that will take you to their respective classes.
#
# Add Expense will show 5 EditText fields and 1 button. The button is used to submit the users entries into the database.
# The EditText fields are used for recording expenses and incrementing the values in the database to match the new entries.
# 
# Delete Expense will have 5 buttons, each with a expense type on the button. 
# These buttons will reset the expense to zero of the given text field. 
# I had hoped to let the user undo previous commits to their expenses but i couldnt figure out how.
#
# BarGraph and PieGraph will both display graphs of the expenses.
# They have fixed values since i didnt connect them to the database.
#
# EditProfile looks just like the registration page but when you submit it should change the users info.
# When i tested it, however, it did not seem functional.
#
# LogOut will simply take you back to the welcome page.
