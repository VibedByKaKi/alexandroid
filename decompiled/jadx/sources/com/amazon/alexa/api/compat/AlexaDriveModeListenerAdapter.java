package com.amazon.alexa.api.compat;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/api/compat/AlexaDriveModeListenerAdapter;", "Lcom/amazon/alexa/api/AlexaDriveModeListener;", "compatListener", "Lcom/amazon/alexa/api/compat/AlexaDriveModeListener;", "<init>", "(Lcom/amazon/alexa/api/compat/AlexaDriveModeListener;)V", "getCompatListener", "()Lcom/amazon/alexa/api/compat/AlexaDriveModeListener;", "onDriveModeEnabled", "", "enabled", "", "onDriveModeState", "drivemodeState", "Lcom/amazon/alexa/api/DriveModeState;", "onDriveModeThemeChanged", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAlexaDriveModeListenerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlexaDriveModeListenerAdapter.kt\ncom/amazon/alexa/api/compat/AlexaDriveModeListenerAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,20:1\n1#2:21\n*E\n"})
/* loaded from: classes16.dex */
public final class AlexaDriveModeListenerAdapter implements com.amazon.alexa.api.AlexaDriveModeListener {

    @NotNull
    private final AlexaDriveModeListener compatListener;

    public AlexaDriveModeListenerAdapter(@NotNull AlexaDriveModeListener alexaDriveModeListener) {
        alexaDriveModeListener.getClass();
        this.compatListener = alexaDriveModeListener;
    }

    @NotNull
    public final AlexaDriveModeListener getCompatListener() {
        return this.compatListener;
    }

    @Override // com.amazon.alexa.api.AlexaDriveModeListener
    public void onDriveModeEnabled(boolean enabled) {
        this.compatListener.onDriveModeEnabled(enabled);
    }

    @Override // com.amazon.alexa.api.AlexaDriveModeListener
    public void onDriveModeState(@Nullable com.amazon.alexa.api.DriveModeState drivemodeState) {
        this.compatListener.onDriveModeState(drivemodeState != null ? DriveModeState.INSTANCE.convertToCompat(drivemodeState) : null);
    }

    @Override // com.amazon.alexa.api.AlexaDriveModeListener
    public void onDriveModeThemeChanged(boolean enabled) {
        this.compatListener.onDriveModeThemeChanged(enabled);
    }
}
