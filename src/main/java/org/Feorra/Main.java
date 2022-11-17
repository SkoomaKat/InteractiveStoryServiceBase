package org.Feorra;

import org.Feorra.models.Page;
import org.Feorra.models.Chapter;

public class Main {
    public static void main(String[] args) {
            Page page1 = new Page("Awesome Story", "Andrew", "Chapter 1",
                    "This is page content", 2);

            Chapter chapter1 = new Chapter("kid", "kid2", "kid3");

            System.out.println(chapter1);
            System.out.println(page1);
    }
}