# PopularMovies App
<img align="center" src="https://github.com/RegNex/PopularMovies/blob/master/app/src/main/res/mipmap-xxxhdpi/ic_launcher.png"/>
PopularMovies App is an application that displays movies using themoviedb.org api. This is udacity Android developer nanodegree popularMovies stage 2

## Screenshots
<img align="left" src="https://github.com/RegNex/PopMovies_2/blob/master/screenshots/screen_1.png" width="200" height="400"/>
<img src="https://github.com/RegNex/PopMovies_2/blob/master/screenshots/screen_2.png" width="200" height="400"/>
<img align="left" src="https://github.com/RegNex/PopMovies_2/blob/master/screenshots/screen_3.png" width="200" height="400"/>
<img src="https://github.com/RegNex/PopMovies_2/blob/master/screenshots/screen_4.png" width="200" height="400"/>

## Getting Started

Get your API KEY from themoviedb.org by creating an account and locate your API KEY under settings thus
```
https://themoviedb.org/settings/api
```

To clone this project,

open your terminal or cmd

```
cd folder/to/clone-into/
```

```
git clone https://github.com/RegNex/PopMovies_2.git
```

Then 
locate the project on your system and open with android studio add api key to gradle.properties thus,
```
API_KEY="YOUR_API_KEY_HERE"
```

then add this to build.gradle(app) under android > defaultConfig
```
android {
    compileSdkVersion 27
    defaultConfig {
        applicationId "co.etornam.popmovies_2"
        minSdkVersion 19
        targetSdkVersion 27
        versionCode 1
        versionName "1.0"
        testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"

        // Please ensure you have a valid API KEY for themoviedb.org to use this app
        // A valid key will need to be entered
        
        buildConfigField("String", "API_KEY", API_KEY)
    }
```


## Prerequisites

What things you need to install the software and how to install them

```
* Android Studio
* Java JDK 8+
* Android SDK
* themoviedb.org

```


## How to contribute
Contributing to PopularMovies_2 App is pretty straight forward! Fork the project, clone your fork and start coding!


## Features:

- sort movies
- view movie detail
- UI optimized for phone and tablet
- Add movie to favourite
- watch trailers and teasers


## To set up an emulator
* Select Run > Run 'app'
* Click 'Create New Emulator'
* Select the device you would like to emulate
* Select the API level you would like to run - click 'Download' if not available
* Select configuration settings for emulator
* Click 'Finish' and allow Emulator to run

## To Run on an Android OS Device
* Connect the device to the computer through its USB port
* Make sure USB debugging is enabled (this may pop up in a window when you connect the device or it may need to be checked in the phone's settings)
* Select Run > Run 'app'
* Select the device (If it does not show, USB debugging is probably not enabled)
* Click 'OK'

## Built With

* [Android Studio](https://developer.android.com/studio/install) - How to install Android Studio
* [The Movie Db](https://www.themoviedb.org/) - Getting started with The Movie DB


## Author

* **Sunu Bright Etornam** 


## License

Copywrite 2018 Sunu Bright Etornam

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.


## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc
