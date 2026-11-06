package com.amazon.identity.auth.device.api;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.fireos.sdk.annotations.FireOsSdk;
import com.amazon.identity.auth.device.dg;
import com.amazon.identity.auth.device.gl;
import com.amazon.identity.auth.device.hm;
import com.amazon.identity.auth.device.jg;
import com.amazon.identity.auth.device.jm;
import com.amazon.identity.auth.device.k4;
import com.amazon.identity.auth.device.km;
import com.amazon.identity.auth.device.nq;
import com.amazon.identity.auth.device.t7;
import com.amazon.identity.auth.device.tn;
import com.amazon.identity.auth.device.token.c;
import com.amazon.identity.auth.device.u7;
import java.util.HashSet;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MAPRegulationConfig {

    @FireOsSdk
    public static final String KEY_AGE_CLASSIFICATIONS = "key_age_classifications";

    @FireOsSdk
    public static final String KEY_AGE_GATES = "key_age_gates";

    @FireOsSdk
    public static final String KEY_IS_AGE_VERIFICATION_REQUIRED = "key_is_age_verification_required";

    @FireOsSdk
    public static final String KEY_OBLIGATIONS = "key_obligations";

    /* renamed from: a, reason: collision with root package name */
    private final Context f509a;
    protected km mRegulationLogicDefinition;

    @FireOsSdk
    public MAPRegulationConfig(Context context) {
        this.f509a = context;
    }

    @FireOsSdk
    public MAPFuture<Bundle> getPrivacyRegulations(@Nullable Callback callback) {
        nq nqVar = new nq("MAPRegulationConfig:getPrivacyRegulations");
        jg.b(nqVar.f843a, "getPrivacyRegulations");
        return getRegulationLogicDefinition().a(new dg(jg.a(nqVar, callback, (c) null, tn.a(this.f509a), true), new k4(this.f509a)));
    }

    public synchronized km getRegulationLogicDefinition() {
        km b;
        try {
            if (this.mRegulationLogicDefinition == null) {
                Context context = this.f509a;
                HashSet hashSet = gl.f684a;
                Bundle bundle = new Bundle();
                bundle.putBoolean("checkIsAmazonDevice", true);
                if (gl.a((t7) u7.a(context, bundle).f522a) && !gl.n(context)) {
                    b = new hm();
                    this.mRegulationLogicDefinition = b;
                }
                b = jm.b(context);
                this.mRegulationLogicDefinition = b;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.mRegulationLogicDefinition;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class PrivacyObligation implements Parcelable {

        @FireOsSdk
        public static final Parcelable.Creator<PrivacyObligation> CREATOR = new Parcelable.Creator<PrivacyObligation>() { // from class: com.amazon.identity.auth.device.api.MAPRegulationConfig.PrivacyObligation.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public PrivacyObligation createFromParcel(Parcel parcel) {
                return new PrivacyObligation(parcel, 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public PrivacyObligation[] newArray(int i) {
                return new PrivacyObligation[i];
            }
        };
        private final boolean mApplicable;
        private final String mPrivacyScope;

        private PrivacyObligation(Parcel parcel) {
            this.mApplicable = parcel.readInt() == 1;
            this.mPrivacyScope = parcel.readString();
        }

        @Override // android.os.Parcelable
        @FireOsSdk
        public int describeContents() {
            return 0;
        }

        public String getPrivacyScope() {
            return this.mPrivacyScope;
        }

        public boolean isApplicable() {
            return this.mApplicable;
        }

        @NonNull
        @FireOsSdk
        public String toString() {
            return "PrivacyObligation{applicable=" + this.mApplicable + ", privacyScope=" + this.mPrivacyScope + StringSubstitutor.DEFAULT_VAR_END;
        }

        @Override // android.os.Parcelable
        @FireOsSdk
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mApplicable ? 1 : 0);
            parcel.writeString(this.mPrivacyScope);
        }

        public PrivacyObligation(boolean z, String str) {
            this.mApplicable = z;
            this.mPrivacyScope = str;
        }

        public /* synthetic */ PrivacyObligation(Parcel parcel, int i) {
            this(parcel);
        }
    }
}
