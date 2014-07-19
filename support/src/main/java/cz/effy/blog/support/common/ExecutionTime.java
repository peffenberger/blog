package cz.effy.blog.support.common;

import java.util.Date;

public class ExecutionTime {

    protected Date start;

    public ExecutionTime() {
        this.start = new Date();
    }

    public String toString() {
        return getExecutionTime() + "ms";
    }

    public long getExecutionTime() {
        Date finish = new Date();
        return (finish.getTime() - start.getTime());
    }

}