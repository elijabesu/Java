# Java

## Programming tips
### Proceed with small steps
- Try to separate the program into several sub-problems and **work on only one sub-problem at a time**.
- Always test that the program code is advancing in the right direction, in other words: test that the solution to the
sub-problem is correct.
- Recognize the conditions that require the program to work differently. In the example above, we needed a different
functionality to test whether a word had been already entered before.

### Write as "clean" code as possible
- Indent your code.
- Use descriptive method and variable names.
- Don't make your methods too long, not even the main method.
- Do only one thing inside one method.
- **Remove all copy-paste code.**
- Replace the "bad" and unclean parts of your code with clean code.

If needed, take a step back and assess the program as a whole. If it doesn't work, it might be a good idea to return into a previous state where the code still worked. As a corollary, we might say that a program that's broken is rarely fixed by adding more code to it.

## Checklist for Troubleshooting
1. Indent your code properly and find out if there are any missing parentheses.
2. Verify that the variables used are correctly named.
3. Test the program flow with different inputs and find out the sort of input that causes the program to not work as desired. If you received an error in the tests, the tests may also indicate the input used.
4. Add print commands to the program in which you print out the values of the variables used at various stages of the program's execution.
5. Verify that all variables you are using are initialized. If they aren't, a NullPointerException error will occur.
6. If your program causes an exception, you should definitely pay attention to the stack trace associated with the exception, which is the list of method calls that resulted in the situation that caused the exception.
7. Learn how to use the debugger. The earlier video will get you started.