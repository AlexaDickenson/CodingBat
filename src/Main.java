public boolean sleepIn(boolean weekday, boolean vacation) {
        // If it's not a weekday (!weekday) or you are on vacation (vacation),
        // return true indicating that you can sleep in
        if (!weekday || vacation) {
        return true;
        }

        // If it's a weekday and you are not on vacation, return false
        // indicating that you cannot sleep in
        return false;
        }
-------------------------------------------------------------------------------------------------
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        // If both monkeys are smiling (aSmile and bSmile are both true) or
        // if both monkeys are not smiling (aSmile and bSmile are both false),
        // we are in trouble. Return true in such cases.
        if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
        return true;
        }

        // If one monkey is smiling and the other is not, we are not in trouble.
        // Return false in this case.
        return false;
        }
------------------------------------------------------------------------------------------------
public String helloName(String name) {
        // Concatenate the string "Hello " with the provided name and "!"
        // to form the greeting. Return the resulting string.
        return "Hello " + name + "!";
        }
-------------------------------------------------------------------------------------------------
public String makeAbba(String a, String b) {
        // Return the string as abba.
        return a + b + b + a;
        }
----------------------------------------------------------------------------------------------
public String stringTimes(String str, int n) {
        // Create an empty string variable to store the result
        String result = "";

        // Concatenate the original string to the result 'n' times
        for (int i = 0; i < n; i++) {
        result += str;
        }

        // Return the resulting string
        return result;
        }
--------------------------------------------------------------------------------------------------
public boolean doubleX(String str) {
        // Find the index of the first occurrence of "x" in the string
        int firstXIndex = str.indexOf("x");

        // Check if the index is within bounds and there is another "x" immediately after
        if (firstXIndex >= 0 && firstXIndex + 1 < str.length() && str.charAt(firstXIndex + 1) == 'x') {
        return true;
        }

        // If the conditions are not met, return false
        return false;
        }
---------------------------------------------------------------------------------------------------
public boolean firstLast6(int[] nums) {
        // Check if the first or last element of the array is equal to 6
        return nums[0] == 6 || nums[nums.length - 1] == 6;
        }
----------------------------------------------------------------------------------------------------
public boolean commonEnd(int[] a, int[] b) {
        // Check if the first element of both arrays or the last element of both arrays are equal
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
        }
        ---------------------------------------------------------------------------------------------
public Map<String, String> mapBully(Map<String, String> map) {
        // Check if the key "a" exists in the map and has a value
        if (map.containsKey("a") && map.get("a") != null) {
        // Set the value of key "b" to the value of key "a"
        map.put("b", map.get("a"));

        // Set the value of key "a" to an empty string
        map.put("a", "");
        }

        // Return the modified map
        return map;
        }
---------------------------------------------------------------------------------------------------
public List<Integer> doubling(List<Integer> nums) {
        // Create a new list to store the doubled values
        List<Integer> doubledNums = new ArrayList<>();

        // Iterate over the input list and multiply each integer by 2
        for (int num : nums) {
        doubledNums.add(num * 2);
        }

        // Return the new list with doubled values
        return doubledNums;
        }
