package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {
        //counting variable
        int count = 0;

        //created and array to get each word individually in the string
        String[] word = input.split(" ");

        //created for loop to search through each word and if it ends in "y" OR "z" add to the count
        for (int i = 0; i < word.length; i++) {
            if (word[i].endsWith("y") || word[i].endsWith("z"))
                count++;
        }
        return count;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case-sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : removeString("Hello there", "llo") // Should return "He there"
     * removeString("Hello there", "e") //  Should return "Hllo thr"
     * removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove) {
        // .replaceAll replaces a string and the parameters are (being replaced, replaced by)
        return base.replaceAll(remove, "");

    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input) {
        /* split the string into an array using .split to look for "is" and "not" and the -1 is to ensure it goes
         through all substrings including empty ones
        .length the check through the entire length of the array
         */
        return input.split("is",-1).length == input.split("not",-1).length;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {
        //creates a local string and assigned it the value of input
        String Gee = input;
        //created a for loop to run through each character in input
        for (int i = 0; i < Gee.length(); i++) {
            //goes through each character and check if it is 'g' and if the one next to it is 'g' by +1
            if (Gee.charAt(i) == 'g' && Gee.charAt(i + 1) == 'g') {
                return true;
            }
        }
            return false;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     * countTriple("xxxabyyyycd") // Should return 3
     * countTriple("a") // Should return 0
     */
    public Integer countTriple(String input) {
        //need to a variable to keep track of the number of triple counts
        int count =0;
        /*create a for loop for variable i for the length of the variable -3 because were looking for 3 in a row so
          we dont want to go past the 3rd to last character
         */
        for (int i = 0 ; i < input.length() -3; i++ ){
            if (input.charAt(i) == input .charAt(i+1) && input.charAt(i) == input.charAt(i+2))
                //running through each character of the array anf if the i == i+1 and i== 1 +2 then it counts as a triple
                count ++;
        }
        return count;
    }
}

