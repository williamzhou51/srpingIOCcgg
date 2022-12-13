package stereotype;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyBean {
	private static int count;

	public LazyBean() {
		System.out.println("start");
		count++;
	}

	public static int getCount() {
		return count;
	}
}
