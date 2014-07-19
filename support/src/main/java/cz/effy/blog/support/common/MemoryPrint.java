package cz.effy.blog.support.common;

/**
 * Created by petr on 27.6.14.
 */
public class MemoryPrint {

	private long memoryTaken;

	public MemoryPrint() {
		Runtime runtime = Runtime.getRuntime();
//		memoryTaken = ((runtime.maxMemory() - runtime.freeMemory()) / 1024 / 1024);
		memoryTaken = ((runtime.totalMemory()) / 1024 / 1024);
	}

	@Override
	public String toString() {
		return "Memory taken " + memoryTaken + "MB";
	}
}
