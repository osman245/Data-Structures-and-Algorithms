# This repository is used for coding interview preperation. I will go over all concepts,topics and design patterns in order to adequately prepare for my interviews.



## Algorithms


### Algorithm: follows a certain guideline, set of steps to finish a task

We cultivate algorithmic thinking, choosing the best algorithm for the task.

Main Question: What solution works best for the current problem ?

There are several examples of searching and sorting algorithms such as 

### Linear Search
an example set of steps would be e.g)
1) Start at the beginning
2) Move sequentially 
3) Compare current value to target 
4)  Reach end of List

### Insertion sort
### binary Search
### bubble Sort


## How to tackle Algorithms
1) we define a clear problem statement(how the input is defined, and what the output looks like when the algorithm is done)
2) we have a specific order of steps
3) Each step to be explicitly clear, each step to be distinct(not misinterpreted)
4) Produce a Result
5) Algorithm to be completed in a finite amount of time



Time Complexity: How long it takes the algorithm to run.
Space Complexity: Amount of memory taken.



### How to Tackle problem using binary search algorithm
1) Problem Statement: We are looking to find the target number in an array of numbers 1 --> 100, the input being the target number. The Algorithm is done when we reach the target number.
2) Assuming array is sorted we start at the middle
3) Compare current value to target. If current == value, return value. if current > target , remove all values greater than current and take the middle of the remaining values. If current < target remove all values that are less than current and get the middle number of the remaining values.
4) Algorithm completes when currentValue == target is returned
5)  The Runtime of your algorithm is the least efficient runtime. In this case we have O(1) and O(logn), the least efficient is O(logn), the algorithms worst case is logarithmic runtime.


### Big O 
Big O ===> Order of magnitude of complexity O(n) ==> Upper Bound (How the algorithm acts at the Worst case scenario)
 e.g) Algorithms Like binary search have O(logn) (log is an inverted exponent) , while Linear search has O(n) --> Linear runtime
 O(1) --> If an algorithm runs in constant time O(n^2) --> worst case quadratic runtime.(expensive computationally)
 O(n ^k) --> Polynomial run time where k is an element of k. 
 
 
 51min
 






