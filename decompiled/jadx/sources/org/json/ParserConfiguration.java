package org.json;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ParserConfiguration {
    public static final int DEFAULT_MAXIMUM_NESTING_DEPTH = 512;
    public static final int UNDEFINED_MAXIMUM_NESTING_DEPTH = -1;
    protected boolean keepStrings;
    protected int maxNestingDepth;

    public ParserConfiguration() {
        this.keepStrings = false;
        this.maxNestingDepth = 512;
    }

    @Override // 
    public ParserConfiguration clone() {
        return new ParserConfiguration(this.keepStrings, this.maxNestingDepth);
    }

    public int getMaxNestingDepth() {
        return this.maxNestingDepth;
    }

    public boolean isKeepStrings() {
        return this.keepStrings;
    }

    public <T extends ParserConfiguration> T withKeepStrings(boolean z) {
        T t = (T) clone();
        t.keepStrings = z;
        return t;
    }

    public <T extends ParserConfiguration> T withMaxNestingDepth(int i) {
        T t = (T) clone();
        if (i > -1) {
            t.maxNestingDepth = i;
            return t;
        }
        t.maxNestingDepth = -1;
        return t;
    }

    public ParserConfiguration(boolean z, int i) {
        this.keepStrings = z;
        this.maxNestingDepth = i;
    }
}
