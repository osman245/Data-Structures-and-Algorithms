# This repository is used for coding interview preperation. I will go over all concepts,topics and design patterns in order to adequately prepare for my interviews.

## Algorithms

### Algorithm: follows a certain guideline, set of steps to finish a task

We cultivate algorithmic thinking, choosing the best algorithm for the task.

Main Question: What solution works best for the current problem ?

There are several examples of searching and sorting algorithms such as

### Linear Search

an example set of steps would be e.g)

1. Start at the beginning
2. Move sequentially
3. Compare current value to target
4. Reach end of List

### Insertion sort

### binary Search

### bubble Sort

## How to tackle Algorithms

1. we define a clear problem statement(how the input is defined, and what the output looks like when the algorithm is done)
2. we have a specific order of steps
3. Each step to be explicitly clear, each step to be distinct(not misinterpreted)
4. Produce a Result
5. Algorithm to be completed in a finite amount of time

Time Complexity: How long it takes the algorithm to run.
Space Complexity: Amount of memory taken.

### How to Tackle problem using binary search algorithm

1. Problem Statement: We are looking to find the target number in an array of numbers 1 --> 100, the input being the target number. The Algorithm is done when we reach the target number.
2. Assuming array is sorted we start at the middle
3. Compare current value to target. If current == value, return value. if current > target , remove all values greater than current and take the middle of the remaining values. If current < target remove all values that are less than current and get the middle number of the remaining values.
4. Algorithm completes when currentValue == target is returned
5. The Runtime of your algorithm is the least efficient runtime. In this case we have O(1) and O(logn), the least efficient is O(logn), the algorithms worst case is logarithmic runtime.

### Big O

Big O ===> Order of magnitude of complexity O(n) ==> Upper Bound (How the algorithm acts at the Worst case scenario)
e.g) Algorithms Like binary search have O(logn) (log is an inverted exponent) , while Linear search has O(n) --> Linear runtime
O(1) --> If an algorithm runs in constant time O(n^2) --> worst case quadratic runtime.(expensive computationally)
O(n ^k) --> Polynomial run time where k is an element of k.

## Data Structures

the data structures our programs use can determine whether our code will scale as the amount of data grows, or whether we’ll need to rewrite everything from scratch every six months.

### Arrays

Arrays are one of the most important fundamental data structures in computer science. An array is a group of elements of the same type, like [5, 8, -1] or ['a', 'b', 'c'], located on a contiguous slice of computer memory. We can access any array index in O(1) time, since there physically next to each other.

![This is an image](https://d1m75rqqgidzqn.cloudfront.net/wp-data/2021/08/05170011/0.png)

### Linked Lists

Linked lists are another key data structure in computer science. Like arrays, a linked list is a group of values. But unlike arrays, the values in a linked list don’t have to be the same type, and we don’t need to specify the list size ahead of time.

Core element of a linked list is a node , which has 1) some data 2) a pointer to its location in memory.

![This is an image](https://media.geeksforgeeks.org/wp-content/cdn-uploads/gq/2013/03/Linkedlist.png)

pros: lack of restriction on data and list length
cons: only had of list is exposed to a program, we have to traverse to find the other nodes. Thus if your node isnt at the head of the linked list, you are not going to have O(1) time , in finding the element of your choice.

### Trees

Trees extend the idea of a linked list by allowing for nodes to have more than one “next” node. Tree nodes can have one, two, or many child nodes, allowing for data to be represented in a flexible branching pattern. By setting rules on how data is organized, we can store and retrieve data very efficiently.
One type of tree is a binary search tree (BST); at the start of this post we briefly mentioned how efficiently BSTs can retrieve data. This efficiency stems from two important rules governing a BST’s structure:
A node can have at most two children.
Every node in the left subtree must contain a smaller value, and every node in the right subtree must contain a larger value.

Start at the root of the tree.
If x = the node value: stop.
If x < the node value: go to the left child.
If x > the node value: go to the right child.
Go to Step 2.

![This is an image](https://media.geeksforgeeks.org/wp-content/uploads/BSTSearch.png)

Graphs
