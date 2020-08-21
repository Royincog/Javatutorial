package PhoneCameraApp;

public class SharewithEmailsAndSms implements Share{
    public void share(){
        inEmail();
        inSms();
    }
    public void inEmail(){
        System.out.println("Share in Email");
    }
    public void inSms(){
        System.out.println("Share in inSms");
    }
}
