package com.amazon.alexa.assistant.capability.discovery;

import android.os.Build;
import com.amazon.alexa.assistant.capability.discovery.model.Endpoint;
import com.amazon.alexa.assistant.capability.discovery.model.LegacyIdentifier;
import com.amazon.alexa.assistant.foundation.model.AlexaProduct;
import com.amazon.alexa.assistant.foundation.model.Capability;
import com.amazon.alexa.assistant.foundation.model.CapabilityAgent;
import com.amazon.alexa.assistant.session.directive.CapabilityAgentRegistry;
import com.amazon.alexa.assistant.toolkit.session.model.AuthorizationSessionState;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0002J\b\u0010\u0015\u001a\u00020\u000eH\u0002J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0017H\u0002J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0017H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/assistant/capability/discovery/EndpointInformationProvider;", "", "alexaProduct", "Lcom/amazon/alexa/assistant/foundation/model/AlexaProduct;", "authorizationSessionStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/amazon/alexa/assistant/toolkit/session/model/AuthorizationSessionState;", "capabilityAgentRegistry", "Lcom/amazon/alexa/assistant/session/directive/CapabilityAgentRegistry;", "<init>", "(Lcom/amazon/alexa/assistant/foundation/model/AlexaProduct;Lkotlinx/coroutines/flow/StateFlow;Lcom/amazon/alexa/assistant/session/directive/CapabilityAgentRegistry;)V", "collectEndpointInformation", "Lcom/amazon/alexa/assistant/capability/discovery/model/Endpoint;", "generateEndpointId", "", "getDeviceType", "getDeviceSerialNumber", "collectLegacyIdentifier", "Lcom/amazon/alexa/assistant/capability/discovery/model/LegacyIdentifier;", "collectDescription", "collectFriendlyName", "collectManufacturerName", "collectDisplayCategories", "", "collectCapabilities", "Lcom/amazon/alexa/assistant/foundation/model/Capability;", "Companion", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEndpointInformationProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EndpointInformationProvider.kt\ncom/amazon/alexa/assistant/capability/discovery/EndpointInformationProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,95:1\n1563#2:96\n1634#2,3:97\n*S KotlinDebug\n*F\n+ 1 EndpointInformationProvider.kt\ncom/amazon/alexa/assistant/capability/discovery/EndpointInformationProvider\n*L\n93#1:96\n93#1:97,3\n*E\n"})
/* loaded from: classes15.dex */
public final class EndpointInformationProvider {

    @NotNull
    private static final String ALEXA_VOICE_ENABLED_CATEGORY = "ALEXA_VOICE_ENABLED";

    @NotNull
    private static final String APPLICATION_CATEGORY = "APPLICATION";

    @NotNull
    private static final String DEFAULT_VALUE = "";

    @NotNull
    private final AlexaProduct alexaProduct;

    @NotNull
    private final StateFlow<AuthorizationSessionState> authorizationSessionStateFlow;

    @NotNull
    private final CapabilityAgentRegistry capabilityAgentRegistry;

    /* JADX WARN: Multi-variable type inference failed */
    public EndpointInformationProvider(@NotNull AlexaProduct alexaProduct, @NotNull StateFlow<? extends AuthorizationSessionState> stateFlow, @NotNull CapabilityAgentRegistry capabilityAgentRegistry) {
        alexaProduct.getClass();
        stateFlow.getClass();
        capabilityAgentRegistry.getClass();
        this.alexaProduct = alexaProduct;
        this.authorizationSessionStateFlow = stateFlow;
        this.capabilityAgentRegistry = capabilityAgentRegistry;
    }

    private final List<Capability> collectCapabilities() {
        List<CapabilityAgent> capabilityAgents = this.capabilityAgentRegistry.getCapabilityAgents();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(capabilityAgents, 10));
        Iterator<T> it2 = capabilityAgents.iterator();
        while (it2.hasNext()) {
            arrayList.add(((CapabilityAgent) it2.next()).getCapability());
        }
        return arrayList;
    }

    private final String collectDescription() {
        return this.alexaProduct.getHostAppName();
    }

    private final List<String> collectDisplayCategories() {
        return CollectionsKt.listOf((Object[]) new String[]{ALEXA_VOICE_ENABLED_CATEGORY, APPLICATION_CATEGORY});
    }

    private final String collectFriendlyName() {
        return this.alexaProduct.getHostAppName();
    }

    private final LegacyIdentifier collectLegacyIdentifier() {
        return new LegacyIdentifier(getDeviceType(), getDeviceSerialNumber());
    }

    private final String collectManufacturerName() {
        String str = Build.MANUFACTURER;
        return str == null ? "Unknown" : str;
    }

    private final String generateEndpointId() {
        return a$$ExternalSyntheticOutline0.m$1(getDeviceType(), "@", getDeviceSerialNumber());
    }

    private final String getDeviceSerialNumber() {
        AuthorizationSessionState value = this.authorizationSessionStateFlow.getValue();
        return value instanceof AuthorizationSessionState.SignedIn ? ((AuthorizationSessionState.SignedIn) value).getUser().getDeviceSerialNumber() : "";
    }

    private final String getDeviceType() {
        AuthorizationSessionState value = this.authorizationSessionStateFlow.getValue();
        return value instanceof AuthorizationSessionState.SignedIn ? ((AuthorizationSessionState.SignedIn) value).getUser().getDeviceType() : "";
    }

    @NotNull
    public final Endpoint collectEndpointInformation() {
        return new Endpoint(generateEndpointId(), collectLegacyIdentifier(), collectManufacturerName(), collectDescription(), collectFriendlyName(), collectDisplayCategories(), collectCapabilities());
    }
}
