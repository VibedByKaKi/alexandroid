package com.amazon.alexa.digitalcommerce.api;

import androidx.exifinterface.media.ExifInterface;
import com.dee.app.http.CoralService;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/digitalcommerce/api/ADCMSOperationStrategy;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "path", "", "getPath", "()Ljava/lang/String;", "execute", "client", "Lcom/dee/app/http/CoralService;", "(Lcom/dee/app/http/CoralService;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMapClient", "Lcom/dee/app/http/CoralService$Request;", "token", "AlexaMobileAndroidDigitalCommerce_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class ADCMSOperationStrategy<T> {
    @Nullable
    public abstract Object execute(@NotNull CoralService coralService, @NotNull Continuation<? super T> continuation);

    @NotNull
    public final CoralService.Request getMapClient(@NotNull CoralService client, @Nullable String token) {
        client.getClass();
        CoralService.Request withHeader = client.request(getPath()).withHeader("Accept", "application/json").withHeader("Content-Type", "application/json").withHeader("X-Request-ID", UUID.randomUUID().toString()).withHeader("Authorization", "Bearer " + token).withHeader("Accept-Language", Locale.getDefault().toLanguageTag());
        withHeader.getClass();
        return withHeader;
    }

    @NotNull
    public abstract String getPath();
}
