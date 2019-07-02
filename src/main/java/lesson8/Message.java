package main.java.lesson8;

public class Message {
    private String iSender;
    private String iRecipient;
    private String iMessageText;
    private long iTimestamp;

    /**
     *
     * @param iSender
     * @param iRecipient
     * @param iMessageText
     * @param iTimestamp
     */
    public Message(String iSender, String iRecipient, String iMessageText, long iTimestamp) {
        this.iSender = iSender;
        this.iRecipient = iRecipient;
        this.iMessageText = iMessageText;
        this.iTimestamp = iTimestamp;
    }


    public String getiSender() {
        return iSender;
    }

    public String getiRecipient() {
        return iRecipient;
    }

    public String getiMessageText() {
        return iMessageText;
    }

    public long getiTimestamp() {
        return iTimestamp;
    }
}
