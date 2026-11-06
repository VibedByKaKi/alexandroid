package com.amazon.identity.auth.device.api;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.fireos.sdk.annotations.FireOsSdk;
import com.amazon.identity.auth.device.age.a;
import com.amazon.identity.auth.device.age.c;
import com.amazon.identity.auth.device.gl;
import com.amazon.identity.auth.device.ig;
import com.amazon.identity.auth.device.jg;
import com.amazon.identity.auth.device.k3;
import com.amazon.identity.auth.device.l3;
import com.amazon.identity.auth.device.nq;
import com.amazon.identity.auth.device.t7;
import com.amazon.identity.auth.device.tn;
import com.amazon.identity.auth.device.u7;
import java.util.HashSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class MAPAgeClassificationManager {

    @FireOsSdk
    public static final String KEY_ACTOR_MAPPING = "actor_mapping_key";

    @FireOsSdk
    public static final String KEY_ACTOR_PROGRAM_ID = "key_program_id";

    @FireOsSdk
    public static final String KEY_ERROR_CODE = "com.amazon.dcp.sso.ErrorCode";

    @FireOsSdk
    public static final String KEY_ERROR_MESSAGE = "com.amazon.dcp.sso.ErrorMessage";

    @FireOsSdk
    public static final String KEY_IS_PCA_AWARE = "key_is_pca_aware";

    /* renamed from: a, reason: collision with root package name */
    private final Context f490a;
    private l3 b;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum AgeClassification {
        ADULT,
        TEEN,
        CHILD
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface AgeClassificationListener {
        @FireOsSdk
        void onAgeClassificationChanged(AgeClassification ageClassification, AgeClassification ageClassification2);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum AgeSignalCategory {
        ADULT,
        TEEN,
        CHILD,
        NO_SIGNAL
    }

    @FireOsSdk
    public MAPAgeClassificationManager(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f490a = applicationContext;
        initializeMAP(applicationContext);
    }

    @Deprecated
    public static MAPAgeClassificationManager getInstance(Context context) {
        return new MAPAgeClassificationManager(context);
    }

    @FireOsSdk
    public AgeClassification getAge(@Nullable Bundle bundle) {
        l3 l3Var;
        nq nqVar = new nq("MAPAgeClassificationManager:getAge");
        jg.b(nqVar.f843a, "getAge");
        boolean z = false;
        try {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        Context context = this.f490a;
                        HashSet hashSet = gl.f684a;
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("checkIsAmazonDevice", true);
                        this.b = !gl.a((t7) u7.a(context, bundle2).f522a) ? c.b(context) : gl.n(context) ? new a(context) : new k3();
                    }
                    l3Var = this.b;
                } finally {
                }
            }
            AgeClassification a2 = l3Var.a(bundle);
            if (a2 == null) {
                nqVar.c.c = "NoAge";
                nqVar.a("NoAge");
            } else {
                nqVar.c.c = "WithAge";
                nqVar.a("Success");
                z = true;
            }
            nqVar.a(z);
            nqVar.a();
            return a2;
        } catch (Throwable th) {
            nqVar.a(false);
            nqVar.a();
            throw th;
        }
    }

    @FireOsSdk
    public AgeSignalCategory getAgeSignalCategory() {
        l3 l3Var;
        nq nqVar = new nq("MAPAgeClassificationManager:getAgeSignalCategory");
        jg.b(nqVar.f843a, "getAgeSignalCategory");
        boolean z = false;
        try {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        Context context = this.f490a;
                        HashSet hashSet = gl.f684a;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("checkIsAmazonDevice", true);
                        this.b = !gl.a((t7) u7.a(context, bundle).f522a) ? c.b(context) : gl.n(context) ? new a(context) : new k3();
                    }
                    l3Var = this.b;
                } finally {
                }
            }
            AgeSignalCategory b = l3Var.b();
            if (b == AgeSignalCategory.NO_SIGNAL) {
                nqVar.c.c = "NoAgeSignal";
                nqVar.a("NoAgeSignal");
            } else {
                nqVar.c.c = "WithAgeSignal";
                nqVar.a("Success");
                z = true;
            }
            nqVar.a(z);
            nqVar.a();
            return b;
        } catch (Throwable th) {
            nqVar.a(false);
            nqVar.a();
            throw th;
        }
    }

    @VisibleForTesting
    public void initializeMAP(Context context) {
        MAPInit mAPInit = MAPInit.getInstance(context);
        if (mAPInit != null) {
            mAPInit.initialize();
        }
    }

    @FireOsSdk
    public void registerAgeClassificationListener(@NonNull AgeClassificationListener ageClassificationListener) {
        l3 l3Var;
        nq nqVar = new nq("MAPAgeClassificationManager:registerAgeClassificationListener");
        try {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        Context context = this.f490a;
                        HashSet hashSet = gl.f684a;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("checkIsAmazonDevice", true);
                        this.b = !gl.a((t7) u7.a(context, bundle).f522a) ? c.b(context) : gl.n(context) ? new a(context) : new k3();
                    }
                    l3Var = this.b;
                } catch (Throwable th) {
                    throw th;
                }
            }
            l3Var.a(ageClassificationListener);
        } finally {
            nqVar.a();
        }
    }

    @FireOsSdk
    public void unregisterAgeClassificationListener() {
        l3 l3Var;
        nq nqVar = new nq("MAPAgeClassificationManager:unregisterAgeClassificationListener");
        try {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        Context context = this.f490a;
                        HashSet hashSet = gl.f684a;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("checkIsAmazonDevice", true);
                        this.b = !gl.a((t7) u7.a(context, bundle).f522a) ? c.b(context) : gl.n(context) ? new a(context) : new k3();
                    }
                    l3Var = this.b;
                } catch (Throwable th) {
                    throw th;
                }
            }
            l3Var.a();
        } finally {
            nqVar.a();
        }
    }

    @FireOsSdk
    public MAPFuture<Bundle> updateAge(@Nullable Integer num, @Nullable Integer num2, @Nullable Bundle bundle, @Nullable Callback callback) {
        l3 l3Var;
        nq nqVar = new nq("MAPAgeClassificationManager:updateAge");
        jg.b(nqVar.f843a, "updateAge");
        ig a2 = jg.a(nqVar, callback, (com.amazon.identity.auth.device.token.c) null, tn.a(this.f490a), true);
        synchronized (this) {
            try {
                if (this.b == null) {
                    Context context = this.f490a;
                    HashSet hashSet = gl.f684a;
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("checkIsAmazonDevice", true);
                    this.b = !gl.a((t7) u7.a(context, bundle2).f522a) ? c.b(context) : gl.n(context) ? new a(context) : new k3();
                }
                l3Var = this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return l3Var.a(num, num2, bundle, a2);
    }
}
