package br.com.stone.tectoy.hal.mylibrary;

public enum StyleText {
    NORMAL(0),
    BOLD(1),
    ITALIC(2),
    BOLD_ITALIC(3);
    public final int type;
    StyleText(int i) {
        this.type = i;
    }
}
