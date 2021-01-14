# Averages

In this assignment, you'll be writing three different methods to practice working with 2D arrays. 

For this assignment, you should assume that the 2D arrays are "sorted" 2D (that is, each individual row is in increasing order, and lower rows contain higher values than upper rows). Look at the arrays in the example below for clarification.
```shell script
double[][] m1 = {
    {1,  2,  4,  6},
    {7,  9,  10, 12},
    {14, 15, 17, 18},
    {22, 23, 27, 30}
};

double[][] m2 = {
    {1,  2,  4,  5,  6},
    {7,  9,  10, 12, 13},
    {14, 15, 17, 18, 20},
    {22, 23, 27, 30, 32},
    {33, 37, 38, 42, 44}
};

double[][] m3 = { 
    {1,  3,  4,  5},
    {7,  9,  10, 12},
    {14, 15, 17, 18} 
};

double[][] m4 = {
    {1,  2,  2,  2,  6},
    {7,  9,  10, 11, 11},
    {11, 11, 17, 18, 20}
};
```

You will be writing methods to find different types of "averages" of the array. 

[1] The first method is **mean()**. This method takes a 2D double array as input and returns the mean average of the 2D array. As a reminder, the mean is where you add up all the numbers and then divide by the number of numbers. 

The method should have the following signature:
```shell script
public static double mean(double[][] mat) { }
```
<br />

[2] The second method is **median()**. This method takes a 2D double array as input and returns the median of the 2D array. As a reminder, the median is "middle" number of a set of numbers. 

The method should have the following signature:
```shell script
public static double median(double[][] mat) { }
```

<br />

[3] The third method is **mode()**. This method takes a 2D double array as input and returns the mode of the 2D array. As a reminder, the mode is the value that occurs the most often. You can assume that there won't be a tie.  

The method should have the following signature:
```shell script
public static double mode(double[][] mat) { }
```

<br />

## Run your code with:
```shell script
make run
```

## Run your tests with:
```shell script
make test
```