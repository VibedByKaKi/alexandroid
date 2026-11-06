package com.dee.app.contacts.common.utils;

import com.amazon.commscore.api.metrics.AlexaCommsCoreMetricsService;
import java.util.HashMap;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ContactsMetricsRecorder {
    private static final String ALEXA_COMMS_CONTACTS_IDENTIFIER = "8201f513-a533-4d6f-866f-540aba3e907d";
    private final AlexaCommsCoreMetricsService metricsService;

    @Inject
    public ContactsMetricsRecorder(AlexaCommsCoreMetricsService alexaCommsCoreMetricsService) {
        this.metricsService = alexaCommsCoreMetricsService;
    }

    public void recordCounter(String str, Class cls) {
        this.metricsService.recordCounter(this.metricsService.createCounter(str, cls.getSimpleName(), "8201f513-a533-4d6f-866f-540aba3e907d", new HashMap()));
    }
}
