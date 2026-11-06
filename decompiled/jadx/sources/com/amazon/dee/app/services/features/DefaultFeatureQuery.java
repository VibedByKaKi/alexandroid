package com.amazon.dee.app.services.features;

import com.amazon.alexa.client.alexaservice.voicechat.VoiceChatContract;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.identity.api.UserIdentity;
import com.amazon.alexa.protocols.features.FeatureQuery;
import com.dee.app.contacts.common.constants.Constants;
import dagger.Lazy;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated(message = "Use FeatureServiceV2.getTreatmentAndRecordTrigger() from ComponentRegistry instead.")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/dee/app/services/features/DefaultFeatureQuery;", "Lcom/amazon/alexa/protocols/features/FeatureQuery;", "identityService", "Ldagger/Lazy;", "Lcom/amazon/alexa/identity/api/IdentityService;", "<init>", "(Ldagger/Lazy;)V", VoiceChatContract.COLUMN_IS_ACTIVE, "", "featureName", "", "Companion", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultFeatureQuery implements FeatureQuery {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "DefaultFeatureQuery";

    @NotNull
    private final Lazy<IdentityService> identityService;

    public DefaultFeatureQuery(@NotNull Lazy<IdentityService> lazy) {
        lazy.getClass();
        this.identityService = lazy;
    }

    @Override // com.amazon.alexa.protocols.features.FeatureQuery
    public boolean isActive(@NotNull String featureName) {
        featureName.getClass();
        UserIdentity user = this.identityService.get().getUser(TAG);
        return user != null && user.hasFeature(featureName);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/dee/app/services/features/DefaultFeatureQuery$Companion;", "", "<init>", "()V", Constants.LOG_TAG, "", "getTAG", "()Ljava/lang/String;", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getTAG() {
            return DefaultFeatureQuery.TAG;
        }

        private Companion() {
        }
    }
}
