# Jenny
Jenny is an interpreted stack-based procedural programming language.
I was inspired to create Jenny after watching Tsoding's videos on the creation of Porth.

All Jenny source files must use the ".jen" file extension.

## Notice!
Currently, Jenny is undergoing a rewrite that utilizes Antlr4 as the parser and lexer, replacing the current method of using
the StringTokenizer method of java.

## Plans for Jenny (In order of importance)
See also: [Todo.md](Todo.md)
- [X] Code Comments
- [ ] Header files
- [X] Standalone console app to run interpreter
  - [ ] GUI App to run the interpreter
- [ ] Antlr4 Implementation/Complete Rewrite
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

## How to run the Jenny interpreter (as of Alpha v2.0)
1. Download the correct zip file from the releases menu
2. Run either "run.sh" (if you're on mac) or "run.bat" (if you're on Windows)
  - 2.1 To run on mac, set the directory of the terminal to the folder where you saved the build for Jenny, then run the command "sh run.sh"
  - 2.2 To run on windows, set the directory of the command prompt to the folder where you saved the build for Jenny, then run the command "run.bat"
4. You will be greeted with a blinking cursor once you run the startup file. Enter the file path of the ".jen" file you wish to run, then press enter
5. You will now be running the program the you specified
 
After step 3, you will be running a Jenny program

## How to add a new feature to Jenny
1. Add the code for the instruction to the "src.Instructions" package
2. Add the switch-case for the instruction to the Main.java file
3. Add the entry for the amount of tokens needed for the instruction to the InstructionValues.tokens hashmap
