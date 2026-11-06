package com.amazonaws.internal;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class ListWithAutoConstructFlag<T> extends ArrayList<T> {
    private static final long serialVersionUID = 1;
    private boolean autoConstruct;

    public ListWithAutoConstructFlag() {
    }

    public boolean isAutoConstruct() {
        return this.autoConstruct;
    }

    public void setAutoConstruct(boolean z) {
        this.autoConstruct = z;
    }

    public ListWithAutoConstructFlag(Collection<? extends T> collection) {
        super(collection);
    }

    public ListWithAutoConstructFlag(int i) {
        super(i);
    }
}
