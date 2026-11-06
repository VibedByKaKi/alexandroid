package com.amazon.alexa.handsfree.protocols.uservoicerecognition.enrollmenttype;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.protocols.features.HandsFreeComponent;
import com.amazon.alexa.handsfree.protocols.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class EnrollmentTypeResolver {
    public static final String IS_1PSV_DECOUPLING_ENABLED = "is1PSVDecouplingEnabled";
    public static final String IS_SPEAKER_ID_ALREADY_CREATED = "isSpeakerIDCreated";
    public static final String PREFERENCE_FILE_NAME = "com.amazon.alexa.handsfree.uservoicerecognition.SpeakerID";
    private static final String TAG = "EnrollmentTypeResolver";
    private final Context mContext;
    private final EnrollmentStatusManager mEnrollmentStatusManager;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.handsfree.protocols.uservoicerecognition.enrollmenttype.EnrollmentTypeResolver$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$handsfree$protocols$uservoicerecognition$enrollmenttype$EnrollmentStatus;

        static {
            int[] iArr = new int[EnrollmentStatus.values().length];
            $SwitchMap$com$amazon$alexa$handsfree$protocols$uservoicerecognition$enrollmenttype$EnrollmentStatus = iArr;
            try {
                iArr[EnrollmentStatus.SETUP_IN_1PSV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$handsfree$protocols$uservoicerecognition$enrollmenttype$EnrollmentStatus[EnrollmentStatus.SETUP_IN_3PSV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public EnrollmentTypeResolver(@NonNull Context context, @NonNull EnrollmentStatusManager enrollmentStatusManager) {
        this.mContext = context;
        this.mEnrollmentStatusManager = enrollmentStatusManager;
    }

    public abstract void check1PSVDecoupledState();

    public Context getContext() {
        return this.mContext;
    }

    public EnrollmentType getEnrollmentType() {
        String str = TAG;
        Log.i(str, "getEnrollmentType");
        if (getSpeakerVerificationEnrollmentType() != EnrollmentType._1PSV) {
            Log.i(str, "getEnrollmentType _3PSV");
            return EnrollmentType._3PSV;
        }
        if (this.mEnrollmentStatusManager.getEnrollmentStatus() == EnrollmentStatus.SETUP_NOT_SET) {
            check1PSVDecoupledState();
        }
        boolean z = getContext().getSharedPreferences(PREFERENCE_FILE_NAME, 0).getBoolean(IS_1PSV_DECOUPLING_ENABLED, false);
        boolean z2 = getContext().getSharedPreferences(PREFERENCE_FILE_NAME, 0).getBoolean(IS_SPEAKER_ID_ALREADY_CREATED, false);
        if (z) {
            Log.i(str, "getEnrollmentType _1PSV_DECOUPLED");
            return EnrollmentType._1PSV_DECOUPLED;
        }
        if (z2) {
            Log.i(str, "getEnrollmentType _1PSV_ONLY");
            return EnrollmentType._1PSV_ONLY;
        }
        Log.i(str, "getEnrollmentType _1PSV_DUAL");
        return EnrollmentType._1PSV_DUAL;
    }

    public abstract EnrollmentType getNotSetupEnrollmentType();

    public EnrollmentType getSpeakerVerificationEnrollmentType() {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$handsfree$protocols$uservoicerecognition$enrollmenttype$EnrollmentStatus[this.mEnrollmentStatusManager.getEnrollmentStatus().ordinal()];
        return i != 1 ? i != 2 ? getNotSetupEnrollmentType() : EnrollmentType._3PSV : EnrollmentType._1PSV;
    }

    public abstract boolean isComponentEnabled(@NonNull HandsFreeComponent handsFreeComponent);
}
