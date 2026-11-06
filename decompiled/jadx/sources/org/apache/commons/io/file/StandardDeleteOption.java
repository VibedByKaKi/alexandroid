package org.apache.commons.io.file;

import org.apache.commons.io.IOUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public enum StandardDeleteOption implements DeleteOption {
    OVERRIDE_READ_ONLY;

    public static boolean overrideReadOnly(DeleteOption[] deleteOptionArr) {
        if (IOUtils.length(deleteOptionArr) == 0) {
            return false;
        }
        for (DeleteOption deleteOption : deleteOptionArr) {
            if (deleteOption == OVERRIDE_READ_ONLY) {
                return true;
            }
        }
        return false;
    }
}
