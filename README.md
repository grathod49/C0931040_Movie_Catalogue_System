# 🎬 Movie Catalogue System

A Java Spring Boot web application that integrates with [The Movie Database (TMDb)](https://www.themoviedb.org/) API to fetch real movie data, display it using Thymeleaf, and allow users to favorite movies using an in-memory H2 database.

---

## 📌 Features

- 🌟 View trending/popular movies on the homepage
- 🔍 Search for movies by title
- 📄 View detailed movie information (title, poster, overview, release date, and rating)
- ❤️ Add or Remove movies from favorites with dynamic button toggling
- ⭐ Ratings are shown with one decimal (e.g., 8.3 / 10)
- 🧠 Favorites are stored in-memory using H2 Database
- 🎨 Nice UI using Thymeleaf and Bootstrap

---

## 🚀 Getting Started

### ✅ Prerequisites

- Java 17 or later
- Gradle
- VS Code / IntelliJ or any Java IDE
- TMDb API Key (free) — get yours from: [https://www.themoviedb.org](https://www.themoviedb.org)

---

## 🔧 Setup Instructions

### 1. Clone the Repo

```bash
git clone https://github.com/grathod49/Movie_Catalogue_System_C0931040
cd movie-catalogue-system
```

### 2. Add Your TMDb API Key

- Edit the file

```bash
src/main/resources/application.properties
```
- Add your API key like this:
```bash
tmdb.api.key=your_tmdb_api_key_here
```

### 3. Run the application

```bash
./gradlew bootRun
```

- Or in VS Code:
- Click Run > Start Debugging or use the terminal with bootRun.

- Then Open,

```bash
http://localhost:8080
```

## 🙋 Author
- Student Name: Grishmkumar Rathod
- Student Id: C0931040