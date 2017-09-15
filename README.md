Initial Page                      |  Gallery Photo Grid
:--------------------------------:|:--------------------------------:
![](https://www.dropbox.com/s/e8o6hqi56875gai/Screenshot_2017-01-23-10-25-26.png?raw=1)  |  ![](https://www.dropbox.com/s/t8gl64d454odl6g/Screenshot_2017-01-23-10-25-52.png?raw=1)


This is an Android Excercise that, as a challenge to myself, took me 2 days to complete. The requirements were to build a mobile app that allows users to view a collection of photos. The photos needed to be from any online photo site that exposes an API (Instagram, Flickr, Google Picasa, Smugmug etc). I decided to allow the user to be able to select from a variety of photo sources, instead of just one.

### Project Initial Setup

1. Go to /utils/SharedPhotoSourceStrings.java
2. Add your Pixabay API Key to
 ```
 private static final String SOCIAL_PIXABAY_GET = "";
 ```
 
 For Example:
 ```
 private static final String SOCIAL_PIXABAY_GET = "api/?key={REPLACE_THIS_AND_BRACKETS_WITH_API KEY}&q=dawn&per_page=100&image_type=photo&pretty=true";
 ```

### Excercise Task

Build a native mobile app based on the description provided

- Reusable SDK that contains the core model and exposes a well-defined API.

- App which utilizes the SDK and delivers the requested user experience.

### App UI Guidelines

The photos were required to be in a scrollable 3 column grid that would function smoothly for any data size.

Another requirement was that selecting a photo would trigger a detail view. This would show the photo larger and also show optional associated meta data.

### Functionality

The project currently functions for both the Pixabay API and a generic form of JSON data. In order to add any additional API support, you would need to include the appropriate Photo Source Data Model + Wrapper under the models folder, and then integrate it into GalleryGridFragment.java to make the apprporiate API calls.

***

### Photo Sources

- [Pixabay](https://pixabay.com/) - Official website for Pixabay API.
- Currently Only Supports Pixabay API but code is in place for future API support.

## License

This project is licensed under the GNU General Public License - see the [LICENSE.md](LICENSE.md) file for details

### Authors

- [d2dindustries](https://d2dindustries.rocks/)
