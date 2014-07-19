package cz.effy.blog.logging.vo;

/**
 * Created by Petr Effenberger on 20.7.14.
 */
public class SimpleObject {

	@Override
	public String toString() {
		return "Object" + this.hashCode();
	}
}
