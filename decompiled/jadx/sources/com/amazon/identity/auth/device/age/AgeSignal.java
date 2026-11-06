package com.amazon.identity.auth.device.age;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.identity.auth.device.api.MAPAgeClassificationManager;
import com.amazon.identity.auth.device.h3;
import com.amazon.identity.auth.device.yf;
import org.json.JSONObject;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ADULT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class AgeSignal {
    private static final /* synthetic */ AgeSignal[] $VALUES;
    public static final AgeSignal ADULT;
    private static final String KEY_THIRD_PARTY_AGE_CATEGORY = "third_party_age_category";
    public static final AgeSignal NO_SIGNAL;
    private static final String TAG = "AgeSignal";
    private final MAPAgeClassificationManager.AgeSignalCategory mCategory;
    private final MAPAgeClassificationManager.AgeClassification mClassification;
    public static final AgeSignal CHILD = new AgeSignal("CHILD", 0, MAPAgeClassificationManager.AgeClassification.CHILD, MAPAgeClassificationManager.AgeSignalCategory.CHILD);
    public static final AgeSignal TEEN = new AgeSignal("TEEN", 1, MAPAgeClassificationManager.AgeClassification.TEEN, MAPAgeClassificationManager.AgeSignalCategory.TEEN);

    private static /* synthetic */ AgeSignal[] $values() {
        return new AgeSignal[]{CHILD, TEEN, ADULT, NO_SIGNAL};
    }

    static {
        MAPAgeClassificationManager.AgeClassification ageClassification = MAPAgeClassificationManager.AgeClassification.ADULT;
        ADULT = new AgeSignal("ADULT", 2, ageClassification, MAPAgeClassificationManager.AgeSignalCategory.ADULT);
        NO_SIGNAL = new AgeSignal("NO_SIGNAL", 3, ageClassification, MAPAgeClassificationManager.AgeSignalCategory.NO_SIGNAL);
        $VALUES = $values();
    }

    private AgeSignal(String str, int i, MAPAgeClassificationManager.AgeClassification ageClassification, MAPAgeClassificationManager.AgeSignalCategory ageSignalCategory) {
        this.mClassification = ageClassification;
        this.mCategory = ageSignalCategory;
    }

    @VisibleForTesting
    public static AgeSignal fromAgeClassification(@NonNull MAPAgeClassificationManager.AgeClassification ageClassification) {
        for (AgeSignal ageSignal : values()) {
            if (ageSignal.mClassification == ageClassification && ageSignal != NO_SIGNAL) {
                return ageSignal;
            }
        }
        Log.w(yf.a(TAG), "Unknown age classification");
        return NO_SIGNAL;
    }

    public static AgeSignal fromString(String str) {
        try {
            return valueOf(str);
        } catch (Exception unused) {
            Log.i(yf.a(TAG), "Unable to parse age signal from string");
            return NO_SIGNAL;
        }
    }

    public static AgeSignal getAgeSignalForBoundary(@Nullable Integer num, @Nullable Integer num2, @NonNull h3 h3Var) {
        if (num != null || num2 != null) {
            return fromAgeClassification(h3Var.a(num, num2));
        }
        Log.w(yf.a(TAG), "Both lower and upper bounds are null, returning NO_SIGNAL");
        return NO_SIGNAL;
    }

    public static AgeSignal valueOf(String str) {
        return (AgeSignal) Enum.valueOf(AgeSignal.class, str);
    }

    public static AgeSignal[] values() {
        return (AgeSignal[]) $VALUES.clone();
    }

    public MAPAgeClassificationManager.AgeClassification getAgeClassification() {
        return this.mClassification;
    }

    public MAPAgeClassificationManager.AgeSignalCategory getAgeSignalCategory() {
        return this.mCategory;
    }

    public JSONObject getAgeSignalJson() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt(KEY_THIRD_PARTY_AGE_CATEGORY, toString());
            return jSONObject;
        } catch (Exception unused) {
            Log.e(yf.a(TAG), "Unable to construct ageInfo Json, just returning null");
            return new JSONObject();
        }
    }
}
