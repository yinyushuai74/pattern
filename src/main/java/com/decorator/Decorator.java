package com.decorator;

/**
 * @author luobo.cs@raycloud.com
 * @since 2018/8/15
 */
public abstract class Decorator implements PrettyGirl {

    private PrettyGirl prettyGirl;

    protected Decorator(PrettyGirl prettyGirl) {
        this.prettyGirl = prettyGirl;
    }


    @Override
    public void traver() {
        prettyGirl.traver();
    }

    @Override
    public void back() {
        prettyGirl.back();
    }
}
