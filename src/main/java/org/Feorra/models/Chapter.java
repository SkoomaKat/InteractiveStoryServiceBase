package org.Feorra.models;

public class Chapter {
    private String storyName;
    private String storyAuthor;
    private String chapterName;

    public Chapter(String storyName, String storyAuthor, String chapterName) {
        this.storyName = storyName;
        this.storyAuthor = storyAuthor;
        this.chapterName = chapterName;
    }

    public String getStoryName() {
        return storyName;
    }

    public String getStoryAuthor() {
        return storyAuthor;
    }

    public String getChapterName() {
        return chapterName;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "storyName='" + storyName + '\'' +
                ", storyAuthor='" + storyAuthor + '\'' +
                ", chapterName='" + chapterName + '\'' +
                '}';
    }
}
