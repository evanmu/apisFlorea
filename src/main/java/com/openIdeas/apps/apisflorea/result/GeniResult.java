package com.openIdeas.apps.apisflorea.result;

/**
 * 泛型结果
 * 
 * @author 13010158
 */
public class GeniResult<T> extends Result {

    /**
     */
    private static final long serialVersionUID = 8454323252510659148L;

    /** 泛型数据 */
    private T object;

    /*
     * (non-Javadoc)
     * @see com.suning.framework.lang.Result#copy(com.suning.framework.lang.Result)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Result copy(Result result) {
        super.copy(result);

        if (result instanceof GeniResult) {
            GeniResult<T> collRet = (GeniResult<T>) result;
            this.object = collRet.getObject();
        }

        return this;
    }
    
    /**
     * @return the object
     */
    public T getObject() {
        return object;
    }

    /**
     * @param object the object to set
     */
    public void setObject(T object) {
        this.object = object;
    }

}
