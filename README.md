
# Mars Real State App

The Mars Real State app is a simple demonstration application developed as part of the "Developing Android Apps with Kotlin" course at Udacity. 
It showcases the usage of ViewModel & LiveData along with Retrofit, Glide, and Moshi in Kotlin.

The Mars Real State app connects to an internet server (https://mars.udacity.com/) to retrieve and display real estate data from Mars. 
Leveraging community-developed libraries such as Retrofit and Moshi simplifies the fetching of data and images, adhering to Android best practices. 
Additionally, the usage of coroutines facilitates asynchronous operations, ensuring smooth communication with the web services layer.

## Concepts

 - Retrofit is used to make API calls to an HTTP web service. It simplifies the process of fetching data from the internet by providing a high-level interface for defining HTTP requests and handling responses.

 - Moshi is employed to handle the deserialization of the returned JSON data into Kotlin data objects. It facilitates the conversion of JSON strings to Kotlin objects and vice versa.

 - Glide is utilized for loading and caching images by URL. It offers efficient and easy-to-use image loading capabilities, ensuring smooth performance when displaying images in the app.

 - ViewModel & LiveData components from the Jetpack library are used for managing UI-related data in a lifecycle-aware manner. 
ViewModel retains data across configuration changes, while LiveData ensures that UI components update automatically when the underlying data changes.

 - Data Binding is employed along with binding adapters to establish a connection between UI components and data sources in a declarative way. This enhances code readability and reduces boilerplate code.

 - SafeArgs plugin is utilized for parameter passing between fragments during navigation. It enables type-safe argument passing and eliminates the risk of runtime crashes due to invalid argument types.


<img src="https://github.com/LiviaCarv/Mars-Real-State/assets/112710454/2194885b-4e6a-47ba-8292-9df4f3750df5" width="200" />
<img src="https://github.com/LiviaCarv/Mars-Real-State/assets/112710454/db24b755-8f44-4f60-b51f-aff0968f5cf6" width="200" />

If you have any questions or suggestions, don't hesitate to reach out. Thank you for checking out the "About Me" app! :smile: :rocket:
