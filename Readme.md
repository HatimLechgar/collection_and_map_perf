# Collection Performance Benchmarking

This project contains two Java classes that benchmark the performance of various operations on common Java collection types: retrieval and insertion. The benchmark measures the time it takes to perform these operations using `ArrayList`, `LinkedList`, `HashSet`, `HashMap`, and `TreeSet`. The main focus is to observe the performance differences based on the underlying data structures.

## Classes

### 1. `CollectionRetrievalTime`
This class benchmarks the time taken to retrieve elements from different collection types:

- **ArrayList**: Indexed retrieval and value-based search.
- **LinkedList**: Indexed retrieval and value-based search.
- **HashSet**: Value-based retrieval.
- **HashMap**: Key-based retrieval.
- **TreeSet**: Value-based retrieval using the natural ordering of the elements.

It adds 1,000,000 unique `Person` objects to the collections and measures the retrieval time for different operations.

#### Key operations tested:
- ArrayList and LinkedList retrieval by index
- ArrayList and LinkedList retrieval by value
- HashSet retrieval by value
- HashMap retrieval by key
- TreeSet retrieval by value (sorted by natural ordering)

### 2. `InsertExample`
This class benchmarks the time taken to insert an element at a specific index in both an `ArrayList` and a `LinkedList`. The insertion happens at the 100th index, and the time taken for each insertion is measured.

- **ArrayList**: Insert at index (which requires shifting elements to the right).
- **LinkedList**: Insert at index (involves traversing the list to the given position).

### Setup

1. The program creates `Person` objects, each with a unique last name in the format "Person" followed by a number (e.g., `Person0`, `Person1`, etc.).
2. The collections are populated with 1,000,000 `Person` objects.
3. The benchmark measures time using `System.nanoTime()` for precision.
4. The results are displayed in microseconds (µs).


## How to Run

1. **Clone the repository** or copy the code into your local Java environment.
2. Make sure you have Java 8 or higher installed on your system.
3. Create a `Person` class with a builder pattern or use your own class for testing.
4. Compile the code using:
   ```bash
    javac CollectionRetrievalTime.java InsertExample.java
    java CollectionRetrievalTime
    java InsertExample
