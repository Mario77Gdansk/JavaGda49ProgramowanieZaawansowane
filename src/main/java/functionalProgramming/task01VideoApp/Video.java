package functionalProgramming.task01VideoApp;

public class Video {
    public String title, url;
    public VideoType videoType;

    public Video(String title, String url, VideoType videoType) {
        this.title = title;
        this.url = url;
        this.videoType = videoType;
    }
}
