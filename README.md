# MyAI - Android Application

An intelligent AI assistant application for Android 16 (API level 35).

## Features

- Interactive AI conversation
- Brain-based decision making
- Memory management system
- Material Design 3 UI

## Requirements

- Android 16 (API level 35)
- Minimum SDK: Android 7.0 (API level 24)
- Java 11 or higher
- Android Studio Jellyfish or newer
- Gradle 8.4+

## Installation

### Prerequisites
1. Install [Android Studio](https://developer.android.com/studio)
2. Install Android SDK Platform 35
3. Create an Android Virtual Device (AVD) with API level 35

### Building the Project

1. Clone the repository
```bash
git clone https://github.com/madd131369/Mine131369.git
cd Mine131369
```

2. Build the project
```bash
./gradlew build
```

3. Run on emulator or device
```bash
./gradlew installDebug
./gradlew installRelease
```

## Project Structure

```
Mine131369/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/myai/
│   │   │   │   ├── MainActivity.java
│   │   │   │   ├── Brain.java
│   │   │   │   ├── Memory.java
│   │   │   │   └── Interface.java
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   ├── values/
│   │   │   │   └── mipmap/
│   │   │   └── AndroidManifest.xml
│   │   └── test/
│   ├── build.gradle
│   └── proguard-rules.pro
├── build.gradle
├── settings.gradle
└── gradle.properties
```

## Android 16 Compatibility

This project is configured for:
- ✅ Target API level 35 (Android 16)
- ✅ Material Design 3
- ✅ Modern AndroidX libraries
- ✅ Java 11 source compatibility
- ✅ Dynamic color support

## Permissions

- `INTERNET` - For network operations
- `RECORD_AUDIO` - For voice input (optional)

## Testing

Run unit tests:
```bash
./gradlew test
```

Run instrumented tests:
```bash
./gradlew connectedAndroidTest
```

## Building Release APK

```bash
./gradlew bundleRelease
```

The signed APK will be generated in `app/build/outputs/bundle/release/`

## License

This project is open source.

## Support

For issues and questions, please open an issue on GitHub.
