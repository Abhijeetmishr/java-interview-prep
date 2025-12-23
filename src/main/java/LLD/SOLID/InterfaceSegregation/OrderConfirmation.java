package LLD.SOLID.InterfaceSegregation;

public class OrderConfirmation implements EmailNotification, PushNotification {
    
    @Override
    public void sendEMail() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void sendPush() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setDeviceToken(String deviceToken) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDeviceToken'");
    }

    @Override
    public void attachFile(String filepath) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'attachFile'");
    }

}
