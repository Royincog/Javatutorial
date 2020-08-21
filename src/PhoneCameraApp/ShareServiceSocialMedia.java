package PhoneCameraApp;

public class ShareServiceSocialMedia implements Share{
    public void share(){
        shareinfacebook();
        shareinwhatsapp();
    }
    public void shareinfacebook(){
        System.out.println("Share in Facebook");
    }
    public void shareinwhatsapp(){
        System.out.println("Share in whatsapp");
    }
}
