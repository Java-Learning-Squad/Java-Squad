# Animal Quiz  

A player is asked by computer to type in several animal names such as "dog," "cat," etc., in the beginning of the game session. There is no limit to the count of the names but these names must be **space delimited**. When entering a **return** key without typing anything (i.e., empty line), process of input cycle ends. (Ecamine the beginning of [Eample Output](#Exampple_Output))
 
The computer will pick up 1 to 3 names from those entered by the player.   
  - They are **shuffled** to produce a random word. 
  - The player will be asked to identify the names, given a hint of how many animals in that word. 
  - The player needs to type in names (or a name if asked one).   
  - Typing `?` will show the name list.
  - Typing `quit` will end the game.

Here is the challenging part 😀.  
When getting correct answer in two consecutive rounds, the computer's challenge becomes harder by striking out a character one by one.   
**Here the terms:**
  - The position to strike out is chosen at **random**. So, succeeding 4 consecutive times, the random word would have two strikes out shown by underscore `"_"` characters. 
  - On the other hand, failing to answer in two consecutive rounds, the computer's challenge becomes easier by reducing the count of strikes out. (removing the "_" if any).


Example Output:<a name="Exampple_Output"></a>

```
Enter at least five animal names, e.g., cat, dog, etc...
> dog cat
> snake zebra
> tiger 


What are 2 animals in "gbzeoard" ? zebra dog
Yes!

What are 2 animals in "dgaoct" ? dog cat
Yes!
Succeeded two consecutive times, challenge goes up!

What are 1 animal in "ezar_" ? zebra
Yes!

What are 1 animal in "do_" ? dog
Yes!
Succeeded two consecutive times, challenge goes up!

What are 1 animal in "z__ae" ? zebra
Yes!

What are 2 animals in "okadg__n" ? dog snake
Yes!
Succeeded two consecutive times, challenge goes up!

What are 1 animal in "_ke__" ? snake
Yes!

What are 2 animals in "e_d_g_ir" ? tiger dog
Yes!
Succeeded two consecutive times, challenge goes up!

What are 3 animals in "et_s__era_ngk" ? cat zebra snake
Nope!

What are 1 animal in "__i__" ? dog snake
Your number of input is incorrect. Enter again: dog
Nope!
Missed two consecutive times, challenge goes down!

What are 1 animal in "___" ? cat
Yes!

What are 3 animals in "koge__zsaa_db" ? ?
1: dog
2: cat
3: snake
4: zebra
5: tiger
Your number of input is incorrect. Enter again: quit
Bye...
```