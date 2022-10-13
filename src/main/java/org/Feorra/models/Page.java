package org.Feorra.models;

public class Page {
    private String storyName;
    private String storyAuthor;
    private String chapterName;
    private String pageContent;
    private int pageNumber;

    public Page(String storyName, String storyAuthor, String chapterName, String pageContent, int pageNumber) {
        this.storyName = storyName;
        this.storyAuthor = storyAuthor;
        this.chapterName = chapterName;
        this.pageContent = pageContent;
        this.pageNumber = pageNumber;
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

    public String getPageContent() {
        return pageContent;
    }

    public int getPageNumber() {
        return pageNumber;
    }
}
