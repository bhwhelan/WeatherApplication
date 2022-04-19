
WeatherApplication:

Developed using Kotlin, Hilt(Dagger 2), Retrofit, Moshi and latest available Jetpack Components.

Application uses a WorkManager worker task to run every 2 hours and make an api call to Weather service
via Retrofit. The weather response is stored in application preferences (using DataStore) as serialized
json. The DataStore Flow is used to alert an observer (i.e. the UI) that an update is available, so
it can refresh the UI accordingly.

Possible improvements for future release:

* Add listeners for location permissions enabled and network connected (and auto-update UI accordingly)
* Add Network/Data Loading indicators
* Could use some more exception condition checking (e.g. show network api call failures, etc.)
* Add all available weather fields to UI (visibility, humidity, etc.)
* Fallback if network calls fails (currently it has to wait 2 hours to try again.)
* Show user date/time weather was last updated