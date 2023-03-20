# Currency Converter

## What it is : 
- Here is a demonstration video : https://www.youtube.com/shorts/lXbsZtbTnCA
- It is a single activity application which allow the user to convert any currency to another thanks to an API.
- It uses : API, MVVM, Retrofit, View Binding, Flow, LiveData, Coroutines (to simplify code that executes asynchronously) and Hilt (to reduce the burden of manually injecting dependencies into your project).

## How to use the app : 
- Clone the app
- Get a Currency API Key at this adress : https://currency.getgeoapi.com/
- Place it at Line 11 in this file : app/src/main/java/com/example/extragrade2/helper/EndPoints.kt
- Connect your phone, build the app and launch it.

## Why is worth grade 5 : 

- The application uses an API service and display data retrieved from the service, the Currency API : https://currency.getgeoapi.com/

- The application uses MVVM architecture and a ViewModel class is implemented for holding state and functionality for UI, see : 
app/src/main/java/com/example/extragrade2/model
app/src/main/java/com/example/extragrade2/view
app/src/main/java/com/example/extragrade2/viewmodel

- The UI is suitable for mobile app. It uses :
-- Custom colors : app/src/main/res/values/colors.xml
-- The Google Roboto font : app/src/main/res/font/roboto.ttf
-- An Icon : app/src/main/res/mipmap
-- A Splash screen : app/src/main/res/values/themes.xml

- It has a Main screen and an Contact Me view

- All the strings are saved under resource file, see :
app/src/main/res/values/strings.xml 

- The code is divided into separate files and packages, see : 
app/src/main/java/com/example/extragrade2

- The errors are handled, see : 
(Line 29) app/src/main/java/com/example/extragrade2/network/BaseDataSource.kt 
(Line 163, 248, 262) app/src/main/java/com/example/extragrade2/view/MainActivity.kt

- A spinner is displayed to the user on UI when data is loaded on the background. see screenshot : 
