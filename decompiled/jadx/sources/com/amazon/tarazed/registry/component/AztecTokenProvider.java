package com.amazon.tarazed.registry.component;

import com.amazon.tarazed.registry.component.exception.NoAuthenticatedUserException;
import com.amazon.tarazed.registry.component.exception.TarazedAuthenticationException;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/amazon/tarazed/registry/component/AztecTokenProvider;", "Lcom/amazon/tarazed/registry/component/TarazedComponent;", "provideAztecToken", "", "isSessionActive", "", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface AztecTokenProvider extends TarazedComponent {
    @Nullable
    String provideAztecToken(boolean isSessionActive) throws NoAuthenticatedUserException, TarazedAuthenticationException;
}
