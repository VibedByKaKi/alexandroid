package com.typesafe.config.impl;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
final class ResolveMemos {
    private final Map<MemoKey, AbstractConfigValue> memos;

    public ResolveMemos() {
        this(new HashMap());
    }

    public AbstractConfigValue get(MemoKey memoKey) {
        return this.memos.get(memoKey);
    }

    public ResolveMemos put(MemoKey memoKey, AbstractConfigValue abstractConfigValue) {
        HashMap hashMap = new HashMap(this.memos);
        hashMap.put(memoKey, abstractConfigValue);
        return new ResolveMemos(hashMap);
    }

    private ResolveMemos(Map<MemoKey, AbstractConfigValue> map) {
        this.memos = map;
    }
}
