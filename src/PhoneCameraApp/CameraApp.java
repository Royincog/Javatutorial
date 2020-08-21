package PhoneCameraApp;

public abstract class CameraApp {
    Share share;
    public abstract void edit();
    public void shareme(){
        share.share();
    }

}
