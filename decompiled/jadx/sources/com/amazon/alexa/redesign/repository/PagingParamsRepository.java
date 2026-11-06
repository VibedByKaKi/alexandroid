package com.amazon.alexa.redesign.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.configservice.api.ConfigService;
import com.amazon.alexa.configservice.api.Domain;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/redesign/repository/PagingParamsRepository;", "", "configService", "Lcom/amazon/alexa/configservice/api/ConfigService;", "<init>", "(Lcom/amazon/alexa/configservice/api/ConfigService;)V", "getConfigService", "()Lcom/amazon/alexa/configservice/api/ConfigService;", "token", "", "updateTokenFromResponse", "", "jsonObject", "Lorg/json/JSONObject;", "limit", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class PagingParamsRepository {
    public static final int $stable = 8;

    @NotNull
    private final ConfigService configService;

    @Nullable
    private String token;

    public PagingParamsRepository(@NotNull ConfigService configService) {
        configService.getClass();
        this.configService = configService;
        this.token = "";
    }

    @NotNull
    public final ConfigService getConfigService() {
        return this.configService;
    }

    public final int limit() {
        Object config = this.configService.getConfig(Domain.AMAX, "limit", 100);
        config.getClass();
        return ((Number) config).intValue();
    }

    @Nullable
    /* renamed from: token, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final void updateTokenFromResponse(@NotNull JSONObject jsonObject) {
        jsonObject.getClass();
        JSONObject optJSONObject = jsonObject.optJSONObject("metadata");
        if (optJSONObject != null) {
            this.token = optJSONObject.optString("token", "");
        }
    }
}
