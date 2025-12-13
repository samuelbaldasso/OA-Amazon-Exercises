# 🚀 OA-Amazon-Exercises

A comprehensive collection of **Data Structures and Algorithms (DSA)** solutions in Java, focused on common Amazon Online Assessment (OA) coding challenges. This repository demonstrates problem-solving skills using efficient algorithms and optimal data structures.

---

## 📋 Table of Contents

- [Overview](#overview)
- [Problems & Solutions](#problems--solutions)
- [Getting Started](#getting-started)
- [Running the Code](#running-the-code)
- [Technologies](#technologies)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)

---

## 🎯 Overview

This repository contains solutions to algorithmic problems commonly encountered in technical interviews and online assessments, particularly for Amazon. Each solution is implemented with:

- ✅ **Optimal time and space complexity**
- ✅ **Clean, readable code**
- ✅ **Test cases included**
- ✅ **Well-documented logic**

---

## 💡 Problems & Solutions

### 1. **DSA1: Optimal File Merge Cost** 
**File:** [`DSA1.java`](src/DSA1.java)

**Problem:** Calculate the minimum cost to merge multiple files using a greedy approach with a priority queue.

**Algorithm:** Huffman Coding / Greedy  
**Time Complexity:** O(n log n)  
**Space Complexity:** O(n)

**Key Concepts:**
- Priority Queue (Min Heap)
- Greedy Algorithm
- Optimal Substructure

**Example:**
```java
Input: [8, 4, 6, 12]
Output: 58
```

---

### 2. **DSA2: Largest Item Association**
**File:** [`DSA2.java`](src/DSA2.java)

**Problem:** Find the largest group of associated items using graph traversal. Given pairs of associated items, determine the largest connected component.

**Algorithm:** Depth-First Search (DFS) / Graph Traversal  
**Time Complexity:** O(V + E)  
**Space Complexity:** O(V + E)

**Key Concepts:**
- Graph representation using adjacency list
- DFS traversal
- Connected components
- Lexicographic ordering

**Example:**
```java
Input: [["item1", "item2"], ["item3", "item4"], ["item4", "item5"]]
Output: ["item3", "item4", "item5"]
```

---

### 3. **DSA3: Longest Substring Without Repeating Characters**
**File:** [`DSA3.java`](src/DSA3.java)

**Problem:** Find the length of the longest substring without repeating characters using the sliding window technique.

**Algorithm:** Sliding Window / Two Pointers  
**Time Complexity:** O(n)  
**Space Complexity:** O(min(n, m)) where m is the character set size

**Key Concepts:**
- Sliding window technique
- HashSet for O(1) lookups
- Two-pointer approach

**Example:**
```java
Input: "abcabcbb"
Output: 3 (substring "abc")
```

---

### 4. **DSA4: Coin Change Problem**
**File:** [`DSA4.java`](src/DSA4.java)

**Problem:** Find the minimum number of coins needed to make a given amount using dynamic programming.

**Algorithm:** Dynamic Programming (Bottom-Up)  
**Time Complexity:** O(amount × coins)  
**Space Complexity:** O(amount)

**Key Concepts:**
- Dynamic programming
- Optimal substructure
- Memoization approach

**Example:**
```java
Input: coins = [1, 2, 5], amount = 11
Output: 3 (5 + 5 + 1)
```

---

## 🚀 Getting Started

### Prerequisites

- **Java Development Kit (JDK)** 11 or higher
- **IDE** (IntelliJ IDEA, Eclipse, VS Code, or any Java-compatible IDE)
- **Git** (for cloning the repository)

### Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/samuelbaldasso/OA-Amazon-Exercises.git
   cd OA-Amazon-Exercises
   ```

2. **Open in your IDE:**
   - For IntelliJ IDEA: Open the project folder
   - For Eclipse: Import as existing Java project
   - For VS Code: Open folder and ensure Java extensions are installed

---

## ▶️ Running the Code

Each Java file contains a `main` method with test cases. You can run them individually:

### Using Command Line:

```bash
# Compile
javac src/DSA1.java

# Run
java -cp src DSA1
```

### Using IDE:

1. Navigate to the desired file (e.g., `DSA1.java`)
2. Right-click and select **Run 'DSA1.main()'**
3. View output in the console

### Expected Outputs:

- **DSA1:** `58`
- **DSA2:** `[item3, item4, item5]`
- **DSA3:** `3`, `1`, `3`
- **DSA4:** `3`, `-1`

---

## 🛠️ Technologies

- **Language:** Java 11+
- **Data Structures:** 
  - PriorityQueue (Min Heap)
  - HashMap / HashSet
  - ArrayList
  - Arrays
- **Algorithms:**
  - Greedy Algorithms
  - Graph Traversal (DFS)
  - Sliding Window
  - Dynamic Programming

---

## 📁 Project Structure

```
OA-Amazon-Exercises/
├── src/
│   ├── DSA1.java          # Optimal File Merge Cost
│   ├── DSA2.java          # Largest Item Association
│   ├── DSA3.java          # Longest Substring Without Repeating Characters
│   └── DSA4.java          # Coin Change Problem
| ...
├── out/                   # Compiled classes (generated)
├── .gitignore            # Git ignore rules
├── Java1.iml             # IntelliJ project file
└── README.md             # This file
```

---

## 🤝 Contributing

Contributions are welcome! If you'd like to add more problems or improve existing solutions:

1. **Fork** the repository
2. **Create** a feature branch (`git checkout -b feature/new-problem`)
3. **Commit** your changes (`git commit -m 'Add new DSA problem'`)
4. **Push** to the branch (`git push origin feature/new-problem`)
5. **Open** a Pull Request

### Contribution Guidelines:
- Follow existing code style and naming conventions
- Include test cases in the `main` method
- Add problem description and complexity analysis
- Update this README with the new problem

---

## 📝 License

This project is open source and available under the [MIT License](LICENSE).

---

## 📧 Contact

For questions, suggestions, or collaboration:

- **GitHub:** [@samuelbaldasso](https://github.com/samuelbaldasso)

---

## 🌟 Acknowledgments

- Problems inspired by Amazon Online Assessment challenges
- Solutions optimized for interview preparation
- Built with ❤️ for the coding community

---

**Happy Coding! 🎉**