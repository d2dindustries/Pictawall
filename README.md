Solarized dark                    |  Solarized Ocean
:--------------------------------:|:--------------------------------:
![](https://www.dropbox.com/s/e8o6hqi56875gai/Screenshot_2017-01-23-10-25-26.png?raw=1)  |  ![](https://www.dropbox.com/s/87dvvhtwsrd9stp/Screenshot_2017-01-23-10-25-40.png?raw=1)


This is an Android Excercise that, as a challenge to myself, took me 2 days to complete. The requirements were to build a mobile app that allows users to view a
collection of photos. The photos needed to be from any online photo site that exposes an API (Instagram, Flickr, Google Picasa, Smugmug etc). I decided to allow the user to be able to select from a variety of photo sources, instead of just one.

### Excercise Task

Build a native mobile app based on the description provided

- Reusable SDK that contains the core model and exposes a well-defined API.

- App which utilizes the SDK and delivers the requested user experience.

### App UI Guidelines

The photos were required to be in a scrollable 3 column grid that would function smoothly for any data size.

Another requirement was that selecting a photo would trigger a detail view. This would show the photo larger and also show optional associated meta data.

### Functionality

The project current functions for both the Pixabay API, as well as a generic form of JSON data. In order to add any addition API support, you would just need to include the appropriate Photo Source Data Model/Wrapper under the models folder, and then integrate it into GalleryGridFragment.java.

***

### Photo Sources

- [Pixabay](https://pixabay.com/) - Official website for Pixabay API.

### Other

- [d2dindustries](https://d2dindustries.rocks/)