package beans;

public class Wrapper {
	private User user;
	private Person p;

	public Wrapper() {
		super();
	}

	public Wrapper(Person p) {
		super();
		this.p = p;
	}

	public Wrapper(User user) {
		super();
		this.user = user;
	}

	public Wrapper(User user, Person p) {
		super();
		this.user = user;
		this.p = p;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Person getP() {
		return p;
	}

	public void setP(Person p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "Wrapper [user=" + user + ", p=" + p + "]";
	}
}
