package com.amazon.dee.app.services.branch;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.amazon.alexa.app.notification.branch.BranchSdkClient;
import com.amazon.dee.app.dependencies.ApplicationScope;
import io.branch.referral.Branch;
import io.branch.referral.BranchError;
import io.branch.referral.util.BranchEvent;
import io.branch.referral.validators.IntegrationValidator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\"\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J(\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0016J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\n*\u0004\u0018\u00010 H\u0002¨\u0006!"}, d2 = {"Lcom/amazon/dee/app/services/branch/BranchSdkAdapter;", "Lcom/amazon/alexa/app/notification/branch/BranchSdkClient;", "<init>", "()V", "initialize", "", "context", "Landroid/content/Context;", "setRequestMetadata", "key", "", "value", "setIdentity", "identity", "clearIdentity", "isSessionInitialized", "", "isSessionInitializing", "startSession", "activity", "Landroid/app/Activity;", "data", "Landroid/net/Uri;", "callback", "Lcom/amazon/alexa/app/notification/branch/BranchSdkClient$SessionCallback;", "reinitializeSession", "logEvent", "eventName", "propertyName", "propertyValue", "validateIntegration", "toErrorMessage", "Lio/branch/referral/BranchError;", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
@ApplicationScope
@SourceDebugExtension({"SMAP\nBranchSdkAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BranchSdkAdapter.kt\ncom/amazon/dee/app/services/branch/BranchSdkAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
/* loaded from: classes4.dex */
public final class BranchSdkAdapter implements BranchSdkClient {
    @Inject
    public BranchSdkAdapter() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reinitializeSession$lambda$1(BranchSdkClient.SessionCallback sessionCallback, BranchSdkAdapter branchSdkAdapter, JSONObject jSONObject, BranchError branchError) {
        sessionCallback.onComplete(jSONObject, branchSdkAdapter.toErrorMessage(branchError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startSession$lambda$0(BranchSdkClient.SessionCallback sessionCallback, BranchSdkAdapter branchSdkAdapter, JSONObject jSONObject, BranchError branchError) {
        sessionCallback.onComplete(jSONObject, branchSdkAdapter.toErrorMessage(branchError));
    }

    private final String toErrorMessage(BranchError branchError) {
        if (branchError == null) {
            return null;
        }
        return branchError.getErrorCode() + ": " + branchError.getMessage();
    }

    @Override // com.amazon.alexa.app.notification.branch.BranchSdkClient
    public void clearIdentity() {
        Branch.getInstance().logout();
    }

    @Override // com.amazon.alexa.app.notification.branch.BranchSdkClient
    public void initialize(@NotNull Context context) {
        context.getClass();
        Branch.expectDelayedSessionInitialization(true);
        Branch.getAutoInstance(context);
    }

    @Override // com.amazon.alexa.app.notification.branch.BranchSdkClient
    public boolean isSessionInitialized() {
        return Branch.getInstance().getInitState() == Branch.SessionState.INITIALISED;
    }

    @Override // com.amazon.alexa.app.notification.branch.BranchSdkClient
    public boolean isSessionInitializing() {
        return Branch.getInstance().getInitState() == Branch.SessionState.INITIALISING;
    }

    @Override // com.amazon.alexa.app.notification.branch.BranchSdkClient
    public boolean logEvent(@NotNull Context context, @NotNull String eventName, @NotNull String propertyName, @NotNull String propertyValue) {
        context.getClass();
        eventName.getClass();
        propertyName.getClass();
        propertyValue.getClass();
        return new BranchEvent(eventName).addCustomDataProperty(propertyName, propertyValue).logEvent(context);
    }

    @Override // com.amazon.alexa.app.notification.branch.BranchSdkClient
    public void reinitializeSession(@NotNull Activity activity, @NotNull BranchSdkClient.SessionCallback callback) {
        activity.getClass();
        callback.getClass();
        Branch.sessionBuilder(activity).withCallback(new BranchSdkAdapter$$ExternalSyntheticLambda0(callback, this, 1)).reInit();
    }

    @Override // com.amazon.alexa.app.notification.branch.BranchSdkClient
    public void setIdentity(@NotNull String identity) {
        identity.getClass();
        Branch.getInstance().setIdentity(identity);
    }

    @Override // com.amazon.alexa.app.notification.branch.BranchSdkClient
    public void setRequestMetadata(@NotNull String key, @NotNull String value) {
        key.getClass();
        value.getClass();
        Branch.getInstance().setRequestMetadata(key, value);
    }

    @Override // com.amazon.alexa.app.notification.branch.BranchSdkClient
    public void startSession(@NotNull Activity activity, @Nullable Uri data, @NotNull BranchSdkClient.SessionCallback callback) {
        activity.getClass();
        callback.getClass();
        Branch.InitSessionBuilder withCallback = Branch.sessionBuilder(activity).withCallback(new BranchSdkAdapter$$ExternalSyntheticLambda0(callback, this, 0));
        if (data != null) {
            withCallback.withData(data);
        }
        withCallback.init();
    }

    @Override // com.amazon.alexa.app.notification.branch.BranchSdkClient
    public void validateIntegration(@NotNull Context context) {
        context.getClass();
        IntegrationValidator.validate(context);
    }
}
