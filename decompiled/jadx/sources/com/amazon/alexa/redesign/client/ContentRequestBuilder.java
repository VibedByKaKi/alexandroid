package com.amazon.alexa.redesign.client;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.assistant.transport.MissingTokenPull;
import com.dee.app.http.CoralService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/redesign/client/ContentRequestBuilder;", "", "<init>", "()V", "buildUri", "Landroid/net/Uri;", MissingTokenPull.TRIGGER_REQUEST, "Lcom/amazon/alexa/redesign/client/GetContentRequest;", "buildCoralRequest", "Lcom/dee/app/http/CoralService$Request;", "coralService", "Lcom/dee/app/http/CoralService;", "url", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public abstract class ContentRequestBuilder {
    public static final int $stable = 0;

    @NotNull
    public abstract CoralService.Request buildCoralRequest(@NotNull CoralService coralService, @NotNull String url, @NotNull GetContentRequest request);

    @NotNull
    public abstract Uri buildUri(@NotNull GetContentRequest request);
}
