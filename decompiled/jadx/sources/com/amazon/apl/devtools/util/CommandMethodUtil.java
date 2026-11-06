package com.amazon.apl.devtools.util;

import com.amazon.apl.devtools.enums.CommandMethod;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class CommandMethodUtil {
    public CommandMethod parseMethod(String str) {
        for (CommandMethod commandMethod : CommandMethod.values()) {
            if (commandMethod.toString().equals(str)) {
                return commandMethod;
            }
        }
        return CommandMethod.EMPTY;
    }
}
