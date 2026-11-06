package com.amazon.alexa.client.alexaservice.vad.selfbargein;

import androidx.annotation.NonNull;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class CaptionRingBuffer {
    private final int capacity;
    private final Deque<SealedCaption> entries;

    public CaptionRingBuffer(int i) {
        if (i <= 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "capacity must be > 0, got "));
            throw null;
        }
        this.capacity = i;
        this.entries = new ArrayDeque(i);
    }

    public void add(@NonNull SealedCaption sealedCaption) {
        if (this.entries.size() == this.capacity) {
            this.entries.pollFirst();
        }
        this.entries.addLast(sealedCaption);
    }

    public int capacity() {
        return this.capacity;
    }

    public void clear() {
        this.entries.clear();
    }

    public SealedCaption findByDrid(@NonNull DialogRequestIdentifier dialogRequestIdentifier) {
        for (SealedCaption sealedCaption : this.entries) {
            if (dialogRequestIdentifier.equals(sealedCaption.getDialogRequestIdentifier())) {
                return sealedCaption;
            }
        }
        return null;
    }

    public boolean isEmpty() {
        return this.entries.isEmpty();
    }

    public int size() {
        return this.entries.size();
    }

    @NonNull
    public List<SealedCaption> snapshot() {
        return new ArrayList(this.entries);
    }
}
