# MyAI - AI Assistant for Android 16

An intelligent AI assistant application built natively for Android 16 (API 35) with Material Design 3.

## ✨ Features

- **Intelligent Decision Making** - AI-powered decision engine
- **Memory Management** - Persistent data storage system  
- **Material Design 3** - Modern responsive UI
- **Fast Performance** - Optimized for Android 16
- **ProGuard Optimization** - Code shrinking for smaller APK size

## 📋 Requirements

| Requirement | Version |
|---|---|
| **Android** | 7.0+ (API 24) minimum |
| **Target Android** | 16 (API 35) |
| **Java** | 11+ |
| **Gradle** | 8.4+ |
| **Android Studio** | 2024.1+ |

## 🚀 Installation

### Quick Start

```bash
# Clone repository
git clone https://github.com/madd131369/Mine131369.git
cd Mine131369

# Build Debug APK
./gradlew assembleDebug

# Install on device
./gradlew installDebug
```

### From Source

1. Clone the repository
2. Open in Android Studio
3. Sync Gradle files
4. Run on emulator or physical device (Android 7.0+)

### Release Build

```bash
# Create signed App Bundle for Play Store
./gradlew bundleRelease

# Output: app/build/outputs/bundle/release/app-release.aab
```

## 📦 Project Structure

```
Mine131369/
├── app/
│   ├── src/main/
│   │   ├── java/com/myai/
│   │   │   ├── MainActivity.java      (UI entry point)
│   │   │   ├── Brain.java             (AI logic)
│   │   │   ├── Memory.java            (Data storage)
│   │   │   └── Interface.java         (Component coordinator)
│   │   ├── res/
│   │   │   ├── layout/activity_main.xml
│   │   │   ├── values/strings.xml
│   │   │   └── mipmap/                (Icons)
│   │   └── AndroidManifest.xml
│   ├── build.gradle
│   └── proguard-rules.pro
├── build.gradle
├── settings.gradle
└── gradle.properties
```

## 🏗️ Architecture

### Brain.java
- Decision-making logic
- Problem solving algorithms
- Learning capabilities

### Memory.java
- Data storage management
- Data retrieval system
- Persistent storage

### Interface.java
- Coordinates Brain and Memory
- Generates AI responses
- Handles user input

### MainActivity.java
- Material Design 3 UI
- User interaction handling
- Activity lifecycle management

## 🎯 Android 16 Compatibility

✅ * *API Level 35** (Android 16) target  
✅ **Material Design 3** with dynamic colors  
✅ **AndroidX libraries** latest versions  
✅ **Java 11** source compatibility  
✅ **ProGuard optimization** for release builds  
✅ **Modern permissions** handling  

## 📱 Permissions

```xml
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
```

## 🧪 Testing

```bash
# Unit tests
./gradlew test

# Instrumented tests (Android device required)
./gradlew connectedAndroidTest
```

## 📊 Build Configuration

| Setting | Value |
|---|---|
| Compile SDK | 35 |
| Target SDK | 35 |
| Min SDK | 24 |
| Version Code | 1 |
| Version Name | 1.0 |
| Java Compatibility | 11 |

## 📝 Dependencies

- androidx.appcompat:appcompat:1.7.0
- com.google.android.material:material:1.12.0
- androidx.constraintlayout:constraintlayout:2.1.4
- androidx.core:core:1.13.1

## 🔄 Build Commands Reference

```bash
# Clean build
./gradlew clean

# Build debug APK
./gradlew assembleDebug

# Build release APK
./gradlew assembleRelease

# Install debug build
./gradlew installDebug

# Run tests
./gradlew test

# Generate documentation
./gradlew javadoc

# View dependency tree
./gradlew dependencies
```

## 📄 License

Open source project - MIT License

## 👨‍💻 Author
Vibe Build - [AI Assisted]
Erik Williamson - [@madd131369](https://github.com/madd131369)

## 💬 Support

- 📧 Email: erikwilliamson1313@gmail.com
- 🐛 Issues: [GitHub Issues](https://github.com/madd131369/Mine131369/issues)
- 📚 Documentation: Check the Wiki

## 🔄 Version History

### v1.0 (2026-05-21)
- Initial release
- Full Android 16 (API 35) support
- Material Design 3 implementation
- AI assistant core features
