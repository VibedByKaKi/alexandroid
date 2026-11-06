package com.amazon.alexa.ra.features.user;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.api.compat.model.AlexaUserProfile;
import com.amazon.alexa.api.compat.model.AlexaUserProfileListener;
import com.amazon.alexa.biloba.metrics.MetricsConstants;
import com.amazon.alexa.ra.core.data.utils.TimeProvider;
import com.amazon.alexa.ra.core.features.user.UserSourceApi;
import com.amazon.alexa.ra.features.user.data.ProfileInfoProvider;
import com.amazon.alexa.ra.sdk.AlexaServicesApis;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u0000 ,2\u00020\u0001:\u0001,B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016H\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016H\u0016J\n\u0010\u001f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010 \u001a\u0004\u0018\u00010\u000eH\u0086@¢\u0006\u0002\u0010!J\u0014\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0#H\u0016J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000eJ\b\u0010'\u001a\u00020%H\u0016J\r\u0010(\u001a\u00020%H\u0000¢\u0006\u0002\b)J\b\u0010*\u001a\u00020%H\u0016J\b\u0010+\u001a\u00020%H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006-"}, d2 = {"Lcom/amazon/alexa/ra/features/user/UserSource;", "Lcom/amazon/alexa/ra/core/features/user/UserSourceApi;", "applicationContext", "Landroid/content/Context;", "alexaServicesApis", "Lcom/amazon/alexa/ra/sdk/AlexaServicesApis;", "profileInfoProvider", "Lcom/amazon/alexa/ra/features/user/data/ProfileInfoProvider;", "timeProvider", "Lcom/amazon/alexa/ra/core/data/utils/TimeProvider;", "<init>", "(Landroid/content/Context;Lcom/amazon/alexa/ra/sdk/AlexaServicesApis;Lcom/amazon/alexa/ra/features/user/data/ProfileInfoProvider;Lcom/amazon/alexa/ra/core/data/utils/TimeProvider;)V", "currentPersonId", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "currentUserFirstName", "tokenExpiration", "", "isFetchingToken", "", "_authToken", "authToken", "Lkotlinx/coroutines/flow/StateFlow;", "getAuthToken", "()Lkotlinx/coroutines/flow/StateFlow;", "profileListener", "Lcom/amazon/alexa/api/compat/model/AlexaUserProfileListener;", "getProfileListener", "()Lcom/amazon/alexa/api/compat/model/AlexaUserProfileListener;", "getCurrentPersonId", "getCurrentUserFirstName", MetricsConstants.OperationalMetrics.GET_PERSON_ID, "awaitPersonId", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllProfiles", "", "setAuthToken", "", "token", "refreshAuthToken", "onAuthTokenFetchFailed", "onAuthTokenFetchFailed$AVSMobileFramework_ra_android_ui_prodRelease", "start", "stop", "Companion", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class UserSource implements UserSourceApi {

    @NotNull
    private static final String EXTRA_PROFILE_ACTION = "profile_action";
    private static final int FETCH_PROFILE_INFO = 1;

    @NotNull
    private static final String INTENT_ACTION_FETCH_PROFILE_INFO = "amazon.intent.action.FETCH_PROFILE_INFO";
    private static final long PERSON_ID_WAIT_MS = 5000;

    @NotNull
    public static final String PROFILE_DATA_KEY = "profileData";
    public static final int SUCCESS_CODE_PROFILE_INFO = 1;

    @NotNull
    private static final String TAG = "UserSource";
    private static final long TOKEN_LIFETIME_MS = 1800000;

    @NotNull
    private final MutableStateFlow<String> _authToken;

    @NotNull
    private final AlexaServicesApis alexaServicesApis;

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final StateFlow<String> authToken;

    @NotNull
    private final MutableStateFlow<String> currentPersonId;

    @NotNull
    private final MutableStateFlow<String> currentUserFirstName;
    private boolean isFetchingToken;

    @NotNull
    private final ProfileInfoProvider profileInfoProvider;

    @NotNull
    private final AlexaUserProfileListener profileListener;

    @NotNull
    private final TimeProvider timeProvider;
    private long tokenExpiration;
    public static final int $stable = 8;

    public UserSource(@NotNull Context context, @NotNull AlexaServicesApis alexaServicesApis, @NotNull ProfileInfoProvider profileInfoProvider, @NotNull TimeProvider timeProvider) {
        context.getClass();
        alexaServicesApis.getClass();
        profileInfoProvider.getClass();
        timeProvider.getClass();
        this.applicationContext = context;
        this.alexaServicesApis = alexaServicesApis;
        this.profileInfoProvider = profileInfoProvider;
        this.timeProvider = timeProvider;
        this.currentPersonId = StateFlowKt.MutableStateFlow("");
        this.currentUserFirstName = StateFlowKt.MutableStateFlow("");
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._authToken = MutableStateFlow;
        this.authToken = FlowKt.asStateFlow(MutableStateFlow);
        this.profileListener = new AlexaUserProfileListener() { // from class: com.amazon.alexa.ra.features.user.UserSource$profileListener$1
            @Override // com.amazon.alexa.api.compat.model.AlexaUserProfileListener
            public void onProfileUpdated(AlexaUserProfile userProfile) {
                MutableStateFlow mutableStateFlow;
                MutableStateFlow mutableStateFlow2;
                ProfileInfoProvider profileInfoProvider2;
                userProfile.getClass();
                userProfile.isChildProfile();
                mutableStateFlow = UserSource.this.currentPersonId;
                mutableStateFlow.setValue(userProfile.getPersonId());
                mutableStateFlow2 = UserSource.this.currentUserFirstName;
                mutableStateFlow2.setValue(userProfile.getFirstName());
                profileInfoProvider2 = UserSource.this.profileInfoProvider;
                profileInfoProvider2.setPersonId(userProfile.getPersonId());
            }
        };
    }

    @Nullable
    public final Object awaitPersonId(@NotNull Continuation<? super String> continuation) {
        return TimeoutKt.withTimeoutOrNull(5000L, new UserSource$awaitPersonId$2(this, null), continuation);
    }

    @Override // com.amazon.alexa.ra.core.features.user.UserSourceApi
    @NotNull
    public Map<String, String> getAllProfiles() {
        return this.profileInfoProvider.getAllProfiles();
    }

    @Override // com.amazon.alexa.ra.core.features.user.UserSourceApi
    @NotNull
    public StateFlow<String> getAuthToken() {
        return this.authToken;
    }

    @Override // com.amazon.alexa.ra.core.features.user.UserSourceApi
    @NotNull
    public StateFlow<String> getCurrentPersonId() {
        return FlowKt.asStateFlow(this.currentPersonId);
    }

    @Override // com.amazon.alexa.ra.core.features.user.UserSourceApi
    @NotNull
    public StateFlow<String> getCurrentUserFirstName() {
        return FlowKt.asStateFlow(this.currentUserFirstName);
    }

    @Override // com.amazon.alexa.ra.core.features.user.UserSourceApi
    @Nullable
    public String getPersonId() {
        return this.profileInfoProvider.getCurrentPersonId();
    }

    @NotNull
    public final AlexaUserProfileListener getProfileListener() {
        return this.profileListener;
    }

    public final void onAuthTokenFetchFailed$AVSMobileFramework_ra_android_ui_prodRelease() {
        this.isFetchingToken = false;
    }

    @Override // com.amazon.alexa.ra.core.features.user.UserSourceApi
    public void refreshAuthToken() {
        if (this._authToken.getValue() != null && this.timeProvider.currentTimeMillis() > this.tokenExpiration) {
            this._authToken.setValue(null);
        }
        if (this._authToken.getValue() == null && !this.isFetchingToken) {
            this.isFetchingToken = true;
            Intent intent = new Intent();
            intent.setPackage(this.applicationContext.getPackageName());
            intent.putExtra("android.intent.extra.RESULT_RECEIVER", new ProfileInfoResultReceiver(new WeakReference(this)));
            intent.putExtra(EXTRA_PROFILE_ACTION, 1);
            intent.setAction(INTENT_ACTION_FETCH_PROFILE_INFO);
            try {
                this.applicationContext.startService(intent);
            } catch (RuntimeException e) {
                this.isFetchingToken = false;
                throw e;
            }
        }
    }

    public final void setAuthToken(@NotNull String token) {
        token.getClass();
        this.tokenExpiration = this.timeProvider.currentTimeMillis() + 1800000;
        this.isFetchingToken = false;
        this._authToken.setValue(token);
    }

    @Override // com.amazon.alexa.ra.core.features.user.UserSourceApi
    public void start() {
        this.alexaServicesApis.registerProfileListener(this.profileListener);
    }

    @Override // com.amazon.alexa.ra.core.features.user.UserSourceApi
    public void stop() {
        this.alexaServicesApis.deregisterProfileListener(this.profileListener);
        this.isFetchingToken = false;
    }

    public /* synthetic */ UserSource(Context context, AlexaServicesApis alexaServicesApis, ProfileInfoProvider profileInfoProvider, TimeProvider timeProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, alexaServicesApis, profileInfoProvider, (i & 8) != 0 ? new TimeProvider() : timeProvider);
    }
}
