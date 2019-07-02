package main.java.lesson8;

public class CallLog {
    /**
     * String Sender phone number like '+3809998765432'
     */
    private String iSenderPhoneNumber;
    /**
     * String Recipient phone nummer like '+3809998765432'
     */
    private String iRecipientPhoneNummer;
    /**
     * Int call duration in seconds like 90
     */
    private int iСallDuration;
    /**
     * Long timestapm
     */
    private long iTimestamp;

    /**
     *
     * @param iSenderPhoneNumber
     * @param iRecipientPhoneNumber
     * @param iСallDuration
     * @param iTimestamp
     */
    public CallLog(String iSenderPhoneNumber, String iRecipientPhoneNumber, int iСallDuration, long iTimestamp) {
        this.iSenderPhoneNumber = iSenderPhoneNumber;
        this.iRecipientPhoneNummer = iRecipientPhoneNumber;
        this.iСallDuration = iСallDuration;
        this.iTimestamp = iTimestamp;
    }

    public String getiSenderPhoneNumber() {
        return iSenderPhoneNumber;
    }

    public String getiRecipientPhoneNummer() {
        return iRecipientPhoneNummer;
    }

    public int getiСallDuration() {
        return iСallDuration;
    }

    public long getiTimestamp() {
        return iTimestamp;
    }
}
