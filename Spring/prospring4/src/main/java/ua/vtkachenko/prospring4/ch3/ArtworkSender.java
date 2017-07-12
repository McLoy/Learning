package ua.vtkachenko.prospring4.ch3;

/**
 * @author Vladyslav T
 * @version 1.0
 */
public interface ArtworkSender {
    void sendArtwork(String artworkPath, Recipient recipient);
    String getFriendlyName();
    String getShortName();
}
