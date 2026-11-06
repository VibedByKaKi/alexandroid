package com.amazon.tarazed.registry.component;

import com.amazon.tarazed.type.ProfileType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/amazon/tarazed/registry/component/AppMetadataProvider;", "Lcom/amazon/tarazed/registry/component/TarazedComponent;", "activeProfileType", "Lcom/amazon/tarazed/type/ProfileType;", "getActiveProfileType", "()Lcom/amazon/tarazed/type/ProfileType;", "registersNotificationTokenWithTarazed", "", "getRegistersNotificationTokenWithTarazed", "()Z", "screenReaderState", "getScreenReaderState", "tvRemoteType", "", "getTvRemoteType", "()Ljava/lang/String;", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface AppMetadataProvider extends TarazedComponent {
    @NotNull
    ProfileType getActiveProfileType();

    boolean getRegistersNotificationTokenWithTarazed();

    boolean getScreenReaderState();

    @Nullable
    String getTvRemoteType();
}
