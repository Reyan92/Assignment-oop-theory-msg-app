import java.time.LocalDateTime;
public class Message {
    String sender;
    String receiver;
    String content;
    int msgId;
    boolean status;
    LocalDateTime timestamp;
    Testtime t = new Testtime();

 

    public Message(String sender, String receiver, String content,int msgId, boolean status) {
        this.sender = sender;
        this.receiver = receiver;
        this.msgId=msgId;
        this.content = content;
        this.status = status;
        this.timestamp = LocalDateTime.now();
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getContent() {
        return content;
    }

    public int getMsgId() {
        return msgId;
    }

    public boolean isStatus() {
        return status;
    }

    public String getTimestamp() {
        if (this.timestamp != null) {
            return t.returnTime(this.timestamp);
        } else {
            return "timestamp is null";
        }

    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    public void setMsgId(int msgId) {
        this.msgId = msgId;
    }


   
    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "msg [sender=" + sender + ", receiver=" + receiver + ", content=" + content + ", msgId=" + msgId
                + ", status=" + status + ", timestamp=" + getTimestamp() + "]";
    }
    // public void display(){
    // System.out.println(getTimestamp());
    // }

}
