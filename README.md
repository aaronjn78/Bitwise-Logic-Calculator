# Bit logic calculator

This app takes 2 binary numbers and outputs the bitwise AND, OR and XOR results. Will be pushing the incremental stages of the development process to Github in order to practice both the usage of command line git and also developing code in stages towards a final product as opposed to everything at once.

Commit 1: 
    - initial code that takes user input and verifies it is a binary number

Commit 2: 
    - accidentally deleted s.close() from previous commit. Adding code
    = added request to user for second binary number
    - moved invalid entry message to method that checks for valid binary number

Commit 3:
    - added function to calculate bitwise AND logic
    - added String variables to hold the validated user input arrays to make it possible to parse the integer values to perform calculations

Commit 4:
    - added functions to calculate OR and XOR
    - planning to add formatting to "pad" start of results with 0's to improve appearance
    - need to add exception handling for out of bound numbers
    
Commit 5: (Major changes)
    - added formtting to result to pad leading 0's to output
    - discovered major issue with methods to calculate AND,OR and XOR values while testing padding
        - added code to resize array of shortest entry and add 0's to the front
        - passed arrays to method instead of strings in order for iterate through both and perform calculations
        - minor variable renaming to match datatypes