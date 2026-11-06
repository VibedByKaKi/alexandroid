package com.amazon.coral.org.json;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class JSONMLParserConfiguration {
    public static final int DEFAULT_MAXIMUM_NESTING_DEPTH = 512;
    public static final int UNDEFINED_MAXIMUM_NESTING_DEPTH = -1;
    private boolean keepStrings;
    private int maxNestingDepth;
    public static final JSONMLParserConfiguration ORIGINAL = new JSONMLParserConfiguration();
    public static final JSONMLParserConfiguration KEEP_STRINGS = new JSONMLParserConfiguration().withKeepStrings(true);

    public JSONMLParserConfiguration() {
        this.maxNestingDepth = 512;
        this.keepStrings = false;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public JSONMLParserConfiguration m21221clone() {
        return new JSONMLParserConfiguration(this.keepStrings, this.maxNestingDepth);
    }

    public int getMaxNestingDepth() {
        return this.maxNestingDepth;
    }

    public boolean isKeepStrings() {
        return this.keepStrings;
    }

    public JSONMLParserConfiguration withKeepStrings(boolean z) {
        JSONMLParserConfiguration m21221clone = m21221clone();
        m21221clone.keepStrings = z;
        return m21221clone;
    }

    public JSONMLParserConfiguration withMaxNestingDepth(int i) {
        JSONMLParserConfiguration m21221clone = m21221clone();
        if (i > -1) {
            m21221clone.maxNestingDepth = i;
            return m21221clone;
        }
        m21221clone.maxNestingDepth = -1;
        return m21221clone;
    }

    private JSONMLParserConfiguration(boolean z, int i) {
        this.keepStrings = z;
        this.maxNestingDepth = i;
    }
}
