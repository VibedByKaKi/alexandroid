package com.amazon.alexa.crashreporting;

import com.bugsnag.android.Event;
import java.util.Optional;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
interface GroupingHashProvider {
    Optional<String> groupingHashFor(Event event);
}
