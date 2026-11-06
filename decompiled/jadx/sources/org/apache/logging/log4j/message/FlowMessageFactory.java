package org.apache.logging.log4j.message;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface FlowMessageFactory {
    EntryMessage newEntryMessage(String str, Object... objArr);

    EntryMessage newEntryMessage(Message message);

    ExitMessage newExitMessage(Object obj, EntryMessage entryMessage);

    ExitMessage newExitMessage(Object obj, Message message);

    ExitMessage newExitMessage(String str, Object obj);

    ExitMessage newExitMessage(EntryMessage entryMessage);

    ExitMessage newExitMessage(Message message);
}
