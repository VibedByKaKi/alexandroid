package com.amazon.alexa.client.alexaservice.base.componentstate;

import com.amazon.alexa.client.core.componentstate.ExternalComponentStateEntity;
import com.amazon.alexa.client.core.messages.Namespace;
import com.amazon.alexa.client.core.messages.PackageName;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface ExternalComponentStateDao {
    void deleteExternalComponentStateByNamespace(Set<Namespace> set);

    void deleteExternalComponentStateByPackageName(Set<PackageName> set);

    void deleteExternalComponentStateCachingPreference(Set<Namespace> set);

    Set<ExternalComponentStateEntity> getAllExternalComponentState();

    Set<ExternalComponentStateEntity> getExternalComponentState(Set<Namespace> set);

    Set<ExternalComponentStateCachingPreference> getExternalComponentStateCachingPreference(Set<Namespace> set);

    void putExternalComponentState(Set<ExternalComponentStateEntity> set);

    void putExternalComponentStateCachingPreference(Set<ExternalComponentStateCachingPreference> set);

    void teardown();
}
