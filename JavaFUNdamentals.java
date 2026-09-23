import java.util.stream.IntStream;

void main() {
    part1();
    part3(part2());
}

void part1() {
    IO.println("""
    Part 1 (11pts):
    """);

    // TODO: (2pts) Ask the user how many integers they will enter and store that in a constant.
    //  Assume that only a valid integer will be entered.

    // TODO: (1pt) Create an array of that many integers.

    // TODO: (4pts) Ask the user to enter their integers and store them in the array. 
    //  Assume that only valid integers will be entered.

    // TODO: (4pts) Calculate and print the average value of the array.
}

int[] part2() {
    IO.println("""

    Part 2 (12pts):
    """);

    // TODO: (1pt) Create a new Random object and store a reference to it.

    // TODO: (4pts) Create an array of 30 random integers whose values range between 0 and 15 inclusive.
    //  Ensure this function returns this array.

    // TODO: (1pt) Print the contents of the array.

    // TODO: (1pt) Sort your array.

    // TODO: (1pt) Print your array again like above to make sure that it is sorted.

    // TODO: (1pt) Generate a random int between 5 and 10 inclusive and store that result in a constant.

    // TODO: (3pts) Using an indexed-for loop, print the index of the first number in your array greater than the random int.
    //  Can you do so without iterating over the entire array?

    return new int[0]; // TODO: (1pt) This will need to be changed.
}

void part3(int[] ints) {
    IO.print("""
    
    Part 3 (5pts):
    
    [""");

    // TODO: (5pts) For each value in your array:
    //  Print it if it's between 5 and 10 inclusive.
    //  Do not print it if it's 7.
    //  Print it if it's value is 0 or 15.
    //  If you are printing the value, then print the value with a ", " after the value
    //  Don't worry about the extra comma and space that is printed at the end of the array.

    IO.println("]");

    // ??? What is going on here???
    var something = IntStream.range(0, 49).mapToDouble(Math::sqrt).filter(d -> d == (int) d).toArray();
}