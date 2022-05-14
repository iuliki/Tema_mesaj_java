import java.util.Objects;

public class Message {

	private String mess;
	public Person sender;
	public Person receiver;

	public Message(String mess, Person sender, Person receiver) {
		super();
		this.mess = mess;
		this.sender = sender;
		this.receiver = receiver;
	}

	public String getMess() {
		return mess;
	}

	public void setMess(String mess) {
		this.mess = mess;
	}

	public Person getSender() {
		return sender;
	}

	public void setSender(Person sender) {
		this.sender = sender;
	}

	public Person getRecever() {
		return receiver;
	}

	public void setRecever(Person recever) {
		this.receiver = recever;
	}

	@Override
	public int hashCode() {
		return Objects.hash(mess, receiver, sender);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Message other = (Message) obj;
		return Objects.equals(mess, other.mess) && Objects.equals(receiver, other.receiver)
				&& Objects.equals(sender, other.sender);
	}

	@Override
	public String toString() {
		return " The Message is " + mess + " ";
	}

}
