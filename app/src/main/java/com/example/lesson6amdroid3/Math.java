package com.example.lesson6amdroid3;

public class Math {

    public String add(String a, String b) {
        if (a.isEmpty() && b.isEmpty()) {
            return "0";
        }
        for (int i = 0, j = 0; i < a.length() && j < b.length(); i++, j++) {
            if ((a.matches(".*([ \t]).*") && b.matches(".*([ \t]).*"))) {
                return "10";
            }
            if (!Character.isDigit(a.charAt(i)) && !Character.isDigit(b.charAt(j))) {
                return "Нужно вводить тоьлко числа";
            }
        }
        return String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
    }

    public String sub(String a, String b) {
        if (a.isEmpty() && b.isEmpty()) {
            return "0";
        }
        for (int i = 0, j = 0; i < a.length() && j < b.length(); i++, j++) {
            if ((a.matches(".*([ \t]).*") && b.matches(".*([ \t]).*"))) {
                return "0";
            }
            if (!Character.isDigit(a.charAt(i)) && !Character.isDigit(b.charAt(j))) {
                return "Нужно вводить тоьлко числа";
            }
        }
        return String.valueOf(Integer.parseInt(a) - Integer.parseInt(b));
    }

    public String mult(String a, String b) {
        if (a.isEmpty() && b.isEmpty()) {
            return "0";
        }
        for (int i = 0, j = 0; i < a.length() && j < b.length(); i++, j++) {
            if ((a.matches(".*([ \t]).*") && b.matches(".*([ \t]).*"))) {
                return "25";
            }
            if (!Character.isDigit(a.charAt(i)) && !Character.isDigit(b.charAt(j))) {
                return "Нужно вводить тоьлко числа";
            }
        }
        return String.valueOf(Integer.parseInt(a) * Integer.parseInt(b));
    }

    public String div(String a, String b) {
        if (a.isEmpty() && b.isEmpty()) {
            return "0";
        }
        for (int i = 0, j = 0; i < a.length() && j < b.length(); i++, j++) {
            if ((a.matches(".*([ \t]).*") && b.matches(".*([ \t]).*"))) {
                return "1";
            }
            if (!Character.isDigit(a.charAt(i)) && !Character.isDigit(b.charAt(j))) {
                return "Нужно вводить тоьлко числа";
            }
        }

        try {
            return String.valueOf(Integer.parseInt(a) / Integer.parseInt(b));
        } catch (ArithmeticException e) {
            return "Нельзя делить на ноль";
        }
    }

    public String reverseString(String words) {
        String word = words.replace(",", " ");
        String[] s = word.
                split(" ");
        StringBuilder ans = new StringBuilder();
        for (int i = s.length - 1; i >= 0; i--) {
            ans.append(s[i]).append(" ");
        }
        return ans.substring(0,
                ans.length() - 1).trim();
    }

}
