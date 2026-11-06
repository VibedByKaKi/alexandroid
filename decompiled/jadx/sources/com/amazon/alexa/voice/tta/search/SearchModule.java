package com.amazon.alexa.voice.tta.search;

import com.amazon.alexa.voice.ui.tta.search.TtaResultHandler;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\u0007H\u0007J\b\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/voice/tta/search/SearchModule;", "", "<init>", "()V", "providesTtaResultHandler", "Lcom/amazon/alexa/voice/ui/tta/search/TtaResultHandler;", "ttaResultHandler", "Lcom/amazon/alexa/voice/tta/search/DefaultTtaResultHandler;", "providesDefaultTtaResultHandler", "providesFrictionHelper", "Lcom/amazon/alexa/voice/tta/search/FrictionHelper;", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Module
/* loaded from: classes19.dex */
public final class SearchModule {
    @Provides
    @Singleton
    @NotNull
    public final DefaultTtaResultHandler providesDefaultTtaResultHandler() {
        return new DefaultTtaResultHandler();
    }

    @Provides
    @Singleton
    @NotNull
    public final FrictionHelper providesFrictionHelper() {
        return new FrictionHelper();
    }

    @Provides
    @Singleton
    @NotNull
    public final TtaResultHandler providesTtaResultHandler(@NotNull DefaultTtaResultHandler ttaResultHandler) {
        ttaResultHandler.getClass();
        return ttaResultHandler;
    }
}
