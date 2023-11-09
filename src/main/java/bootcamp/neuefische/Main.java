package bootcamp.neuefische;

public class Main {
    public static void main(String[] args) {

        // ich möchte nur die Methoden aus dem Interfaace anwenden,
        // daher kann ich hier das Interface Playable angeben
        Playable musicPlayer1 = new MusicPlayer();
        Playable videoPlayer1 = new VideoPlayer();

        MediaController mediaController1 = new MediaController();

        System.out.println(mediaController1.playMedia(musicPlayer1));
        System.out.println(mediaController1.playMedia(videoPlayer1));

        System.out.println(musicPlayer1.play());
        System.out.println(videoPlayer1.play());

    }
}