package com.amazon.tarazed.registry.component;

import com.amazon.tarazed.registry.component.exception.AccountProviderException;
import com.amazon.tarazed.type.Account;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/tarazed/registry/component/AccountMetadataProvider;", "Lcom/amazon/tarazed/registry/component/TarazedComponent;", "accountMetadata", "Lcom/amazon/tarazed/type/Account;", "getAccountMetadata", "()Lcom/amazon/tarazed/type/Account;", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface AccountMetadataProvider extends TarazedComponent {
    @NotNull
    Account getAccountMetadata() throws AccountProviderException;
}
