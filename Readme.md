# Description
Jenny is an interpreted stack-based procedural programming language.
I was inspired to create Jenny after watching Tsoding's videos on the creation of Porth.

All Jenny source files must use the ".jen" file extension.

# Plans for Jenny (In order of importance)
- [ ] Header files
- [ ] Standalone console app to run interpreter
- [ ] Antlr4 Implementation
- [ ] Compiler
- [ ] Multiple data types
  - [ ] Bytes
  - [ ] Bits
  - [ ] Chars
  - [ ] Floating-pont Numbers
  - [X] Integers
- [ ] Multiple data structures
  - [ ] Arrays
  - [ ] Tuples
  - [ ] Hashmaps 
- [X] User Input

# How to run the Jenny interpreter (as of Alpha v1.2)
1. Download the source code
2. Run the source code in your java IDE with an run configuration for applications
3. Type in the path to the file you want to run
 
After step 3, you will be running a Jenny program

# How to add a new feature to Jenny
1. Add the code for the instruction to the "src.Instructions" package
2. Add the switch-case for the instruction to the Main.java file
3. Add the entry for the amount of tokens need for the instruction to the InstructionValues.tokens hashmap
