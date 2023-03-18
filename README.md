# CloudWatch
> The weather app is a simple, yet functional Android application built using Kotlin programming language. It uses the OpenWeather API to fetch the current temperature and weather description for a given city. The app is designed following the MVVM architecture pattern, utilizing Dagger for dependency injection and Retrofit for network requests. The app provides a clear separation of concerns, making it easy to modify and extend.

## Prerequisites
To use this app, you'll need to obtain an API key from OpenWeather. You can get a free API key by signing up for an account.

## Installing
Clone this repository to your local machine.
In Android Studio, open the project by selecting "Open an existing Android Studio project" and choosing the directory where you cloned the repository.
In the WeatherApiService file, replace YOUR_API_KEY_HERE with your actual API key.
Build and run the app on an Android device or emulator.
Features
This app allows you to enter the name of a city and get the current weather temperature and description for that city using the OpenWeather API.

## Architecture
This app uses MVVM (Model-View-ViewModel) architecture, which separates concerns by organizing the code into three distinct layers:

- **Model**: Contains the data and business logic.
- **View**: Contains the UI components and handles user interactions.
- **ViewModel**: Acts as a mediator between the Model and View layers, providing data to the View and handling user actions.

## Code Structure
The app consists of the following files:

1. **MainActivity.kt**: The main activity that displays the UI and handles user interactions.
2. **WeatherViewModel.kt**: The ViewModel that communicates with the WeatherRepository to get the weather data and provides it to the UI.
3. **WeatherRepository.kt**: The repository that handles the API requests and provides the weather data to the ViewModel.
4. **WeatherApiService.kt**: The interface that defines the API requests using Retrofit.
5. **Weather.kt**: The data class that holds the weather information returned by the API.
6. **AppModule.kt**: The Dagger module that provides the application context.
7. **ApiModule.kt**: The Dagger module that provides the WeatherApiService.
8. **ViewModelModule.kt**: The Dagger module that provides the ViewModels.
9. **ViewModelFactory.kt**: The ViewModelProvider.Factory that creates the ViewModels.
