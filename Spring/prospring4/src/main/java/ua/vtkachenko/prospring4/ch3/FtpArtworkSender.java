package ua.vtkachenko.prospring4.ch3;

/**
 * @author Vladyslav T
 * @version 1.0
 */
public class FtpArtworkSender implements ArtworkSender {
    @Override
    public void sendArtwork(String artworkPath, Recipient recipient) {
//       FTP work logic
    }

    @Override
    public String getFriendlyName() {
        return "File transfer protocol";
    }

    @Override
    public String getShortName() {
        return "ftp";
    }
}
