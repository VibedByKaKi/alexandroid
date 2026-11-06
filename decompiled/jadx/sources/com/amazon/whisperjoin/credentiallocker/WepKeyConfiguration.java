package com.amazon.whisperjoin.credentiallocker;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class WepKeyConfiguration {
    private final int keyIndex;
    private final List<String> wepKeyList;

    public WepKeyConfiguration(List<String> list, int i) {
        this.wepKeyList = list;
        this.keyIndex = i;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof WepKeyConfiguration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WepKeyConfiguration)) {
            return false;
        }
        WepKeyConfiguration wepKeyConfiguration = (WepKeyConfiguration) obj;
        if (!wepKeyConfiguration.canEqual(this) || getKeyIndex() != wepKeyConfiguration.getKeyIndex()) {
            return false;
        }
        List<String> wepKeyList = getWepKeyList();
        List<String> wepKeyList2 = wepKeyConfiguration.getWepKeyList();
        return wepKeyList != null ? wepKeyList.equals(wepKeyList2) : wepKeyList2 == null;
    }

    public int getKeyIndex() {
        return this.keyIndex;
    }

    public List<String> getWepKeyList() {
        return this.wepKeyList;
    }

    public int hashCode() {
        int keyIndex = getKeyIndex() + 59;
        List<String> wepKeyList = getWepKeyList();
        return (keyIndex * 59) + (wepKeyList == null ? 43 : wepKeyList.hashCode());
    }

    public String toString() {
        return "WepKeyConfiguration(wepKeyList=" + getWepKeyList() + ", keyIndex=" + getKeyIndex() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
