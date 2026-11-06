package com.amazon.comms.calling.data.network.interceptors;

import androidx.annotation.VisibleForTesting;
import com.amazon.comms.calling.data.network.MetricKey;
import com.amazon.comms.calling.data.network.SiegeEncryption;
import com.amazon.comms.calling.foundation.CallingLogger;
import com.amazon.comms.log.CommsLogger;
import defpackage.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Invocation;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000bH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/amazon/comms/calling/data/network/interceptors/SiegeEncryptionInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "LOG", "Lcom/amazon/comms/log/CommsLogger;", "getLOG", "()Lcom/amazon/comms/log/CommsLogger;", "LOG$delegate", "Lcom/amazon/comms/calling/foundation/CallingLogger;", "siegeAnnotation", "Lcom/amazon/comms/calling/data/network/SiegeEncryption;", "setSiegeAnnotation", "", "siegeEncryption", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "Companion", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSiegeEncryptionInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SiegeEncryptionInterceptor.kt\ncom/amazon/comms/calling/data/network/interceptors/SiegeEncryptionInterceptor\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,59:1\n4135#2,11:60\n4135#2,11:71\n*S KotlinDebug\n*F\n+ 1 SiegeEncryptionInterceptor.kt\ncom/amazon/comms/calling/data/network/interceptors/SiegeEncryptionInterceptor\n*L\n33#1:60,11\n35#1:71,11\n*E\n"})
/* loaded from: classes20.dex */
public final class SiegeEncryptionInterceptor implements Interceptor {

    @NotNull
    public static final String APPLY_FES = "apply_fes";

    @NotNull
    public static final String SIF_PROFILE = "sif_profile";

    @NotNull
    public static final String TRUE_VALUE = "true";

    /* renamed from: LOG$delegate, reason: from kotlin metadata */
    @NotNull
    private final CallingLogger LOG = new CallingLogger();

    @Nullable
    private SiegeEncryption siegeAnnotation;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {a.a(SiegeEncryptionInterceptor.class, "LOG", "getLOG()Lcom/amazon/comms/log/CommsLogger;", 0)};

    @Inject
    public SiegeEncryptionInterceptor() {
    }

    @NotNull
    public final CommsLogger getLOG() {
        return this.LOG.getValue(this, $$delegatedProperties[0]);
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) {
        MetricKey metricKey;
        String str;
        Method method;
        Annotation[] annotations;
        Method method2;
        Annotation[] annotations2;
        chain.getClass();
        Request request = chain.request();
        Invocation invocation = (Invocation) request.tag(Invocation.class);
        SiegeEncryption siegeEncryption = null;
        if (invocation == null || (method2 = invocation.method()) == null || (annotations2 = method2.getAnnotations()) == null) {
            metricKey = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Annotation annotation : annotations2) {
                if (annotation instanceof MetricKey) {
                    arrayList.add(annotation);
                }
            }
            metricKey = (MetricKey) CollectionsKt.firstOrNull((List) arrayList);
        }
        Invocation invocation2 = (Invocation) request.tag(Invocation.class);
        if (invocation2 != null && (method = invocation2.method()) != null && (annotations = method.getAnnotations()) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Annotation annotation2 : annotations) {
                if (annotation2 instanceof SiegeEncryption) {
                    arrayList2.add(annotation2);
                }
            }
            siegeEncryption = (SiegeEncryption) CollectionsKt.firstOrNull((List) arrayList2);
        }
        if (siegeEncryption == null) {
            siegeEncryption = this.siegeAnnotation;
        }
        HttpUrl.Builder newBuilder = request.url().newBuilder();
        if (metricKey == null || (str = metricKey.value()) == null) {
            str = "";
        }
        if (siegeEncryption != null) {
            getLOG().i("SiegeEncryptionInterceptor for method = ".concat(str));
            newBuilder.addQueryParameter(APPLY_FES, "true");
            if (!Intrinsics.areEqual(siegeEncryption.sifProfile(), "NULL")) {
                newBuilder.addQueryParameter(SIF_PROFILE, siegeEncryption.sifProfile());
                siegeEncryption.sifProfile();
            }
        }
        HttpUrl build = newBuilder.build();
        Objects.toString(build);
        return chain.proceed(request.newBuilder().url(build).build());
    }

    @VisibleForTesting
    public final void setSiegeAnnotation(@SiegeEncryption @NotNull SiegeEncryption siegeEncryption) {
        siegeEncryption.getClass();
        this.siegeAnnotation = siegeEncryption;
    }
}
