package PhoneCameraApp;

public class BeautyCam extends CameraApp {
    public void edit(){
        System.out.println("Edit ..");
    }
    public BeautyCam(){
        share  =  new ShareServiceSocialMedia();
        share = new SharewithEmailsAndSms();
    }
}
