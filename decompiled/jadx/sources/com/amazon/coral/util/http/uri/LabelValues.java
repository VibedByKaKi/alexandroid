package com.amazon.coral.util.http.uri;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
class LabelValues {
    private boolean isPathLabel;
    private final Map<String, List<CharSequence>> map = new HashMap();

    private void addLabelValue(String str, CharSequence charSequence, boolean z) {
        List<CharSequence> list = this.map.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.map.put(str, list);
        }
        list.add(charSequence);
        this.isPathLabel = z;
    }

    public void addQueryParamLabelValue(String str, CharSequence charSequence) {
        addLabelValue(str, charSequence, false);
    }

    public void addUriPathLabelValue(String str, CharSequence charSequence) {
        addLabelValue(str, charSequence, true);
    }

    public Iterable<String> getKeys() {
        return this.map.keySet();
    }

    public Iterable<CharSequence> getLabelValues(String str) {
        return this.map.get(str);
    }

    public boolean isPathLabel() {
        return this.isPathLabel;
    }

    public void addLabelValue(String str, CharSequence charSequence) {
        addLabelValue(str, charSequence, false);
    }
}
