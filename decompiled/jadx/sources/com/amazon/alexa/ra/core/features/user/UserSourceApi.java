package com.amazon.alexa.ra.core.features.user;

import com.amazon.alexa.biloba.metrics.MetricsConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0004H&J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\rH&J\b\u0010\u000f\u001a\u00020\rH&R\u001a\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/features/user/UserSourceApi;", "", "getCurrentPersonId", "Lkotlinx/coroutines/flow/StateFlow;", "", "getCurrentUserFirstName", MetricsConstants.OperationalMetrics.GET_PERSON_ID, "getAllProfiles", "", "authToken", "getAuthToken", "()Lkotlinx/coroutines/flow/StateFlow;", "refreshAuthToken", "", "start", "stop", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface UserSourceApi {
    @NotNull
    Map<String, String> getAllProfiles();

    @NotNull
    StateFlow<String> getAuthToken();

    @NotNull
    StateFlow<String> getCurrentPersonId();

    @NotNull
    StateFlow<String> getCurrentUserFirstName();

    @Nullable
    String getPersonId();

    void refreshAuthToken();

    void start();

    void stop();
}
