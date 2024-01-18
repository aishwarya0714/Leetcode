/* 
1678. Goal Parser Interpretation

You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.

Given the string command, return the Goal Parser's interpretation of command */

class Replace {
    public static void main(String[] args) {
        String command = "G()(al)";
        String rep1 = command.replace("()","o");
        String rep2 = rep1.replace("(al)","al");
        
        return rep2;
    }
}
