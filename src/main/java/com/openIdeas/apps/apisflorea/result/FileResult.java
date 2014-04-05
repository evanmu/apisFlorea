package com.openIdeas.apps.apisflorea.result;

public class FileResult extends Result {
    /**
     */
    private static final long serialVersionUID = 7640432698445111900L;
    /** 成功记录数 */
    private long sucdCount;

    /**
     * @param sucdCount the sucdCount to set
     */
    public void setSucdCount(long sucdCount) {
        this.sucdCount = sucdCount;
    }

    /**
     * @return the sucdCount
     */
    public long getSucdCount() {
        return sucdCount;
    }
}
