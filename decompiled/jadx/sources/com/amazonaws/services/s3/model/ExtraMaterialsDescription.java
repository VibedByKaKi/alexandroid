package com.amazonaws.services.s3.model;

import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okio.Path$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ExtraMaterialsDescription implements Serializable {
    public static final ExtraMaterialsDescription NONE = new ExtraMaterialsDescription(Collections.EMPTY_MAP);
    private final Map<String, String> extra;
    private final ConflictResolution resolve;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazonaws.services.s3.model.ExtraMaterialsDescription$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazonaws$services$s3$model$ExtraMaterialsDescription$ConflictResolution;

        static {
            int[] iArr = new int[ConflictResolution.values().length];
            $SwitchMap$com$amazonaws$services$s3$model$ExtraMaterialsDescription$ConflictResolution = iArr;
            try {
                iArr[ConflictResolution.FAIL_FAST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazonaws$services$s3$model$ExtraMaterialsDescription$ConflictResolution[ConflictResolution.OVERRIDDEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazonaws$services$s3$model$ExtraMaterialsDescription$ConflictResolution[ConflictResolution.OVERRIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ConflictResolution {
        FAIL_FAST,
        OVERRIDE,
        OVERRIDDEN
    }

    public ExtraMaterialsDescription(Map<String, String> map, ConflictResolution conflictResolution) {
        if (map == null || conflictResolution == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
        this.extra = Collections.unmodifiableMap(new HashMap(map));
        this.resolve = conflictResolution;
    }

    public ConflictResolution getConflictResolution() {
        return this.resolve;
    }

    public Map<String, String> getMaterialDescription() {
        return this.extra;
    }

    public Map<String, String> mergeInto(Map<String, String> map) {
        if (this.extra.size() == 0) {
            return map;
        }
        if (map == null || map.size() == 0) {
            return this.extra;
        }
        int i = AnonymousClass1.$SwitchMap$com$amazonaws$services$s3$model$ExtraMaterialsDescription$ConflictResolution[this.resolve.ordinal()];
        if (i == 1) {
            int size = this.extra.size() + map.size();
            HashMap hashMap = new HashMap(map);
            hashMap.putAll(this.extra);
            if (size == hashMap.size()) {
                return Collections.unmodifiableMap(hashMap);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("The supplemental material descriptions contains conflicting entries");
            return null;
        }
        if (i == 2) {
            HashMap hashMap2 = new HashMap(this.extra);
            hashMap2.putAll(map);
            return Collections.unmodifiableMap(hashMap2);
        }
        if (i != 3) {
            Duration$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        HashMap hashMap3 = new HashMap(map);
        hashMap3.putAll(this.extra);
        return Collections.unmodifiableMap(hashMap3);
    }

    public ExtraMaterialsDescription(Map<String, String> map) {
        this(map, ConflictResolution.FAIL_FAST);
    }
}
