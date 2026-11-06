package com.facebook.common.util;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import com.facebook.infer.annotation.Functional;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public enum TriState {
    YES,
    NO,
    UNSET;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.facebook.common.util.TriState$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$common$util$TriState;

        static {
            int[] iArr = new int[TriState.values().length];
            $SwitchMap$com$facebook$common$util$TriState = iArr;
            try {
                iArr[TriState.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$common$util$TriState[TriState.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$common$util$TriState[TriState.UNSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Functional
    public static TriState fromDbValue(int i) {
        return i != 1 ? i != 2 ? UNSET : NO : YES;
    }

    @Functional
    public static TriState valueOf(@Nullable Boolean bool) {
        return bool != null ? valueOf(bool.booleanValue()) : UNSET;
    }

    @Functional
    public boolean asBoolean() {
        int i = AnonymousClass1.$SwitchMap$com$facebook$common$util$TriState[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        if (i != 3) {
            OnnxMap$$ExternalSyntheticBUOutline0.m(this, "Unrecognized TriState value: ");
            return false;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("No boolean equivalent for UNSET");
        return false;
    }

    @Nullable
    @Functional
    public Boolean asBooleanObject() {
        int i = AnonymousClass1.$SwitchMap$com$facebook$common$util$TriState[ordinal()];
        if (i == 1) {
            return Boolean.TRUE;
        }
        if (i == 2) {
            return Boolean.FALSE;
        }
        if (i == 3) {
            return null;
        }
        OnnxMap$$ExternalSyntheticBUOutline0.m(this, "Unrecognized TriState value: ");
        return null;
    }

    @Functional
    public int getDbValue() {
        int i = AnonymousClass1.$SwitchMap$com$facebook$common$util$TriState[ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 3;
            }
        }
        return i2;
    }

    @Functional
    public boolean isSet() {
        return this != UNSET;
    }

    @Functional
    public static TriState valueOf(boolean z) {
        return z ? YES : NO;
    }

    @Functional
    public boolean asBoolean(boolean z) {
        int i = AnonymousClass1.$SwitchMap$com$facebook$common$util$TriState[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        if (i == 3) {
            return z;
        }
        OnnxMap$$ExternalSyntheticBUOutline0.m(this, "Unrecognized TriState value: ");
        return false;
    }
}
